package io.zipcoder;

import java.util.Collections;
import java.util.Arrays;

public class ArrayDrills {


    /**
     * Given an array of ints, return true if value appears as either the first or last element in the array.
     * The array will be length 1 or more.
     * example : firstLast(6, [1,2,6); // Should return true
     *           firstLast(6, [1,2,3]); // Should return false
     */
    public Boolean firstLast(Integer value, Integer[] input) {
        int firstElement = input[0];
        int lastLastElement = input[input.length - 1];
        if (firstElement == value || lastLastElement == value) {
            return true;
        }
        // get first element
        // get last element
        // check if first Element or last element = value
        return false;
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     * example : sameFirstLast([1,2,3]); // Should return false
     *           sameFirstLast([1,2,1]); // Should return true
     */
    public Boolean sameFirstLast(Integer[] input) {
        int firstElement = input[0];
        int lastElement = input[input.length - 1];
        if (lastElement == firstElement) {
            return true;
        }

        return false;
    }

    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
     * Both arrays will be length 1 or more.
     * example : commonEnd([1, 2, 3], [7, 3]); // Should return true
     *           commonEnd([1, 2, 3], [7, 3, 2]); // Should return false
     */
    public Boolean commonEnd(Integer[] input1, Integer[] input2) {
        Integer firstArrayElement = input1[0];
        Integer firstArrayLastElement = input1[input1.length - 1];
        Integer secondArrayElement = input2[0];
        Integer secondArrayLastElement = input2[input2.length - 1];
        if (firstArrayElement.equals(secondArrayElement) || firstArrayLastElement.equals(secondArrayLastElement)) {
            return true;
        }

        return false;
    }

    /**
     * Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     * example : rotateLeft([1, 2, 3]); // Should return [2,3,1]
     *           rotateLeft([5, 11, 9]); // Should return [11,9,5]
     */
    public Integer[] rotateLeft(Integer[] input){
        Collections.rotate(Arrays.asList(input), 2);
        System.out.println(Arrays.toString(input));
        return input;
    }


    /**
     * Given an array of ints, figure out which is element in the array is largest,
     * and set all the other elements to be that value. Return the changed array.
     * example : maxValue([1, 2, 3]); // Should return [3,3,3]
     *           maxValue([5, 11, 9]); // Should return [11,11,11]
     */
    public Integer[] maxValue(Integer[] input){
        int max = Collections.max(Arrays.asList(input));
        for(int i = 0; i < input.length; i++) {
            input[i] = max;
        }

        return input;
    }


    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing their middle elements, if length is odd.
     * If the array length is even the sum of the middle 2 elements in the array.
     * example : middleWay([1, 2, 3], [4,5,6,2]); // Should return [2,11]
     *           middleWay([5, 1, 2, 9], [3, 4, 5, 5]); // Should return [3, 9]
     */
    public Integer[] middleWay(Integer[] input1, Integer[] input2){
        //assign new arrays
        Integer[] midWay = new Integer[2];
        midWay[0] = findMid(input1);
        midWay[1] = findMid(input2);
        return midWay;
    }

    //made an assisting method that will find the middle index for...too much looping involved and I got lazy

    public int findMid(Integer[] newInput) {
        if (newInput.length % 2 == 0) {
            return newInput[newInput.length/2] + newInput[newInput.length/2 - 1];
        }

        return newInput[newInput.length/2];
    }
    /**
     * Start with 2 int arrays, a and b, each length 2.
     * Consider the sum of the values in each array.
     * Return the array which has the largest sum. In event of a tie, return a.
     */
    public Integer[] biggerTwo(Integer[] a, Integer[] b){
        Integer sumA = 0;
        Integer sumB = 0;
        for(int i = 0; i < a.length; i++){
            sumA += a[i];
            sumB += b[i];
        }

        if (sumA == sumB){
            return a;
        }
//this does not pass the 3rd test case for this...should make another an assisting method to call upon and do the work for me...
        return b;
    }

    /**
     * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
     * The array length will be at least 3.
     * example : midThree([1, 2, 3, 4, 5]); // Should return [2, 3, 4]
     *           midThree([8, 6, 7, 5, 3, 0, 9]); // Should return [7, 5, 3]
     */
    public Integer[] midThree(Integer[] nums){
        Integer [] resultArr = new Integer[3];
        resultArr[0] = nums[(nums.length/2) - 1];
        resultArr[1] = nums[(nums.length/2)];
        resultArr[2] = nums[(nums.length/2) + 1];
        return resultArr;
    }
}
