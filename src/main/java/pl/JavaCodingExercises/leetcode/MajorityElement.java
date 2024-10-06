package pl.JavaCodingExercises.leetcode;

import java.util.Arrays;

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {

        //majority element occurs in nums more than [n/2] times.
        //czyli wystąpienie danego elementu to ponad połowa elementów tablicy.
        //zapytać czy zawsze ułożonie elementów w tablicy jest symetryczne.

        //rozbić zbiór na pół i sprawdzić czy w tym podzbiorze jakaś wartość spełnia to założenie. ale wtedy wystarczy, że będzie = n / 2.
        //no ale wtedy zakąłdam, że dopiero element z tej drugiej połowy dopełni ten zbiór i spełni warunek > n / 2. Czyli sprawdzić pierwszą połowę,
        // a później drugą. No ale rozpatrzyć przypadek kiedy jest nieparzysta liczba elementów w tablicy.
        //można też posortować tabelę i wtedy są obok siebie elementy, można je zliczyć obok siebie.

        //posortuje sobie tablice nums i wtedy po kolej sprawdzam sąsiednie wartości dopóki wystąpienie którejś nie przekroczy n / 2.
        //co jesli zbior jest 1 elementowy?
        //wtedy ok jest nums[0]
        Arrays.sort(nums);
        int n = nums.length;
        int occurrences = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i == n-1) {
                return nums[i];
            } else if (nums[i] == nums[i+1]) {
                occurrences++;
            } else {
                occurrences++;
                if(occurrences > (n/2)) {
                    return nums[i];
                } else {
                    occurrences = 0;
                }
            }
        }
        return 1; //assumption that majority element always exists in nums array.

        /*Arrays.sort(nums); //szukam rozwiązania w połowie posortowanej tablicy.
        int n = nums.length-1;
        int target = n/2 ;
        if(nums[0]==nums[target])
            return nums[0];
        else
            return nums[target];*/
    }
}
