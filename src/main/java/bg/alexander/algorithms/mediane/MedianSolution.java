package bg.alexander.algorithms.mediane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianSolution {
    public static void main(String[] args) {
        MedianSolution medianSolution = new MedianSolution();
        medianSolution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List l1 = Arrays.asList(nums1);
        List l2 = Arrays.asList(nums2);

        List<Double> result = new ArrayList<>();
        result.addAll(l1);
        result.addAll(l2);

        Collections.sort(result);

        double median;

        if (result.size() % 2 == 0) {
            double a = result.get(result.size() / 2);
            double b = result.get((result.size() - 1) / 2);
            median = (a + b) / 2;
        } else {
            median = result.get((result.size() - 1) / 2);
        }
        return median;
    }
}