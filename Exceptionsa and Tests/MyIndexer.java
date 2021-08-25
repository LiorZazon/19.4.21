package com.company;

public class MyIndexer {

    // 1
    //         create and array of 4 int elements with 1,2,3,4

    //         create a function that gets an array as input
    //            and tries to access the 5 element
    //         call this function from main
    public int getElement (int[] arr, int index)
    {
        return arr[index];
    }

    //         which exception did you get?
    //  ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4

    //         surround the function call (from main) with try-catch
    //         run the code and check that the program does not crash
    public int getElementAndThrow (int[] arr, int index)
    {
        if (index >= arr.length) {
            throw new IndexOutOfBoundsException(
                    String.format(
                            "getElementAndThrow array with %d elements and you tried to get element number %d", arr.length, index)
            );
        }
        return arr[index];
    }
    //
    //         2
    //         create a function that gets an array as input, and number
    //         of item to access i.e.
    //         printElement(int[] arr, int indexToPrint)
    //         if indexToPrint is >= length then throw the exception you got
    //         in question 1
    public int getElementAndThrowCustom (int[] arr, int index)
    {
        if (index >= arr.length) {
            throw new IndexTooBigException(
                    String.format(
                            "getElementAndThrow array with %d elements and you tried to get element number %d", arr.length, index)
            );
        }
        return arr[index];
    }
    //
    //          3
    //         create an Exception class called IndexTooBigException
    //         which extends RuntimeException
    //         in method 2 throw this exception (instead of the previous)
    //© 2021 GitHub, Inc.



}
