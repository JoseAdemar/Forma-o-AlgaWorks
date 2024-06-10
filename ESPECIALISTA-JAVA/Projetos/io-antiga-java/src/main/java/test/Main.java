package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String recorrencia = "aAbCBa";
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < recorrencia.length(); i++) {
            String result = String.valueOf(recorrencia.charAt(i));
            strings.add(result);
        }

        Iterator iterator = strings.listIterator();
        List<String> s = new ArrayList<>();
        while (iterator.hasNext()) {
            Object next = iterator.next().toString().toLowerCase();
            s.toString().toLowerCase();
            if (s.contains(next.toString())) {
                System.out.println(next);
                break;
            } else {
                s.add((String) next);
            }
        }
    }
}

