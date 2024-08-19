package com.algaworks.csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {
    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {
        Field[] propiedades = clazz.getDeclaredFields();
        System.out.println(Arrays.stream(propiedades)
                .map(Field::getName)
                .collect(Collectors.joining(";")));

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Object cliente) {
        Field[] propiedades = cliente.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();

        try {
            for (Field propiedade : propiedades) {
                if (propiedade.isAnnotationPresent(Campo.class)){
                    Campo anotacaoCampo = propiedade.getAnnotation(Campo.class);
                    anotacaoCampo.maiusculo();
                    propiedade.setAccessible(true);
                    Object resultado = propiedade.get(cliente);
                    String resultadoString = resultado == null ? "" : resultado.toString();
                    valores.add(anotacaoCampo.maiusculo() ? resultadoString.toUpperCase() : resultadoString);
                }

            }
            System.out.println(String.join(";", valores));
        }catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }

}
