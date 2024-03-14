package com.arr.cs;

import java.util.ArrayList;
import java.util.List;

public class MergeOrdered {
    public List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) == b.get(j)) {
                result.add(a.get(i));
                result.add(b.get(j));
                i++;
                j++;

                continue;
            }

            if (a.get(i) < b.get(j)) {
                result.add(a.get(i));
                i++;

                continue;
            }

            if (a.get(i) > b.get(j)) {
                result.add(b.get(j));
                j++;

                continue;
            }
        }

        if (a.size() == b.size()) {
            if (i < j) {
                result.addAll(a.subList(i, a.size()));
            }

            if (j < i) {
                result.addAll(b.subList(j, b.size()));
            }
        }

        if (a.size() > b.size()) {
            result.addAll(a.subList(i, a.size()));
        }

        if (b.size() > a.size()) {
            result.addAll(b.subList(j, b.size()));
        }

        return result;
    }
}
