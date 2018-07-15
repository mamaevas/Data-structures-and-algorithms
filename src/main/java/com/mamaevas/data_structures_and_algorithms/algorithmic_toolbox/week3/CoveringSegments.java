package com.mamaevas.data_structures_and_algorithms.algorithmic_toolbox.week3;

import java.util.*;

public class CoveringSegments {

    public static int[] optimalPoints(Segment[] segments) {
        //write your code here
//        int[] points = new int[2 * segments.length];
//        for (int i = 0; i < segments.length; i++) {
//            points[2 * i] = segments[i].start;
//            points[2 * i + 1] = segments[i].end;
//        }
//        return points;
//
        List<Integer> list = new ArrayList<>();

        TreeSet<Segment> set = new TreeSet<>((o1, o2) -> o1.start > o2.start ? 1 : -1);
        set.addAll(Arrays.asList(segments));

        Segment first = set.pollFirst();
        while (first != null) {
            int end = first.end;
            first = set.pollFirst();
            while (first !=null && first.start <= end) {
                if (first.end < end) {
                    end = first.end;
                }
                first = set.pollFirst();
            }
            list.add(end);
        }

        return listToArray(list);
    }

    private static int[] listToArray(List<Integer> list) {
        int size = list.size();
        int result[] = new int[size];
        for (int i = 0 ; i < size; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Segment{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
