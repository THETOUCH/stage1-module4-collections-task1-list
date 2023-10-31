package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int c, d;
        c = Integer.parseInt(a);
        d = Integer.parseInt(b);
        return 5*c*c+3 < 5*d*d+3 ? -1 : 5*c*c+3 == 5*d*d+3 ? c > d ? 1 : -1 : 1;
    }
}
