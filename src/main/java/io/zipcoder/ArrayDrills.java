package io.zipcoder;

public class ArrayDrills {


    /**
     * Given an array of ints, return true if value appears as either the first or last element in the array.
     * The array will be length 1 or more.
     * example : firstLast(6, [1,2,6); // Should return true
     * firstLast(6, [1,2,3]); // Should return false
     */
    public Boolean firstLast(Integer value, Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     * example : sameFirstLast([1,2,3]); // Should return false
     * sameFirstLast([1,2,1]); // Should return true
     */
    public Boolean sameFirstLast(Integer[] input) {
        if (input[0] == input[input.length - 1])
            return true;
        else return false;
    }


    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
     * Both arrays will be length 1 or more.
     * example : commonEnd([1, 2, 3], [7, 3]); // Should return true
     * commonEnd([1, 2, 3], [7, 3, 2]); // Should return false
     */
    public Boolean commonEnd(Integer[] input1, Integer[] input2) {
        if (input1[0] == input2[0])
            return true;
        else if (input1[input1.length - 1] == input2[input2.length - 1])
            return true;
        return false;
    }

    /* true = (input1[0] == input2[0] || input1[input1.length-1]  == input2[input2.length-1] */


    /**
     * Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     * example : rotateLeft([1, 2, 3]); // Should return [2,3,1]
     * rotateLeft([5, 11, 9]); // Should return [11,9,5]
     */
    public Integer[] rotateLeft(Integer[] input) {
        Integer[] rotating = {input[1], input[2], input[0]};
        return rotating;
    }


    /**
     * Given an array of ints, figure out which is element in the array is largest,
     * and set all the other elements to be that value. Return the changed array.
     * example : maxValue([1, 2, 3]); // Should return [3,3,3]
     * maxValue([5, 11, 9]); // Should return [11,11,11]
     */
    public Integer[] maxValue(Integer[] input) {
        Integer maxValue = input[0];
            for(Integer i = 0; i< input.length; i++) {
                 if (input[i] > maxValue) {
                           maxValue = input[i]; }
               }
            Integer[]outPut = new Integer[input.length];
            for(int j=0; j<input.length; j++) {
                   outPut[j]=maxValue;
             }
          return outPut;
    }


    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing their middle elements, if length is odd.
     * If the array length is even the sum of the middle 2 elements in the array.
     * example : middleWay([1, 2, 3], [4,5,6,2]); // Should return [2,11]
     * middleWay([5, 1, 2, 9], [3, 4, 5, 5]); // Should return [3, 9]
     */
    public Integer[] middleWay(Integer[] input1, Integer[] input2) {
        Integer[] newInput = new Integer[2];
        if (input1.length % 2 == 0) {
            newInput[0] = ((input1[input1.length / 2]) + (input1[input1.length / 2 - 1]));
        } else if (input1.length % 2 != 0) {
            newInput[0] = input1[input1.length / 2];
        }
        if (input2.length % 2 == 0) {
            newInput[1] = ((input2[input2.length / 2]) + (input2[input2.length / 2 - 1]));
        } else if (input2.length % 2 != 0) {
            newInput[1] = input2[input2.length / 2];
        }
        return newInput;
    }

    /**
     * Start with 2 int arrays, a and b, each length 2.
     * Consider the sum of the values in each array.
     * Return the array which has the largest sum. In event of a tie, return a.
     */
    public Integer[] biggerTwo(Integer[] a, Integer[] b) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }

        if (sumA >= sumB) {
            return a;

        }
        return b;
    }



        /**
         * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
         * The array length will be at least 3.
         * example : midThree([1, 2, 3, 4, 5]); // Should return [2, 3, 4]
         *           midThree([8, 6, 7, 5, 3, 0, 9]); // Should return [7, 5, 3]
         */
        public Integer[] midThree (Integer[]nums){
            Integer[] halfArray = new Integer[3];
            Integer half = (nums.length) / 2;
            halfArray[0] = nums[half-1];
            halfArray[1] = nums[half];
            halfArray[2] = nums[half+1];
            return halfArray;
        }


    }
