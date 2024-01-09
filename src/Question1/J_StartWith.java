package Question1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class J_StartWith {
    public static void main(String[] args) {
        int[] nums = {8,7,6,6};
        int start =0;
        int end = 2;

        for(int i=0;(i<start || i>end) && i<nums.length-1;i++){
            if(nums[i]>=nums[i+1])
                System.out.println("False");
        }
        System.out.println("True");

    }

}
