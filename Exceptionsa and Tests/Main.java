package com.company;

public class Main {



        public static void main (String[]args){
            // write your code here
          //  MyIndexer myIndexer = new MyIndexer();
            // 1
            //         create and array of 4 int elements with 1,2,3,4
            //int[] arr_elements = {1, 2, 3, 4};
            //         create a function that gets an array as input
            //            and tries to access the 5 element
            //         call this function from main
           // myIndexer.accessToArrElements(arr_elements);
            //         which exception did you get?
            //  ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4

            //         surround the function call (from main) with try-catch
            //         run the code and check that the program does not crash
            //
            //         2
            //         create a function that gets an array as input, and number
            //         of item to access i.e.
            //         printElement(int[] arr, int indexToPrint)
            //         if indexToPrint is >= length then throw the exception you got
            //         in question 1
          //  myIndexer.getElement(arr_elements, 5);
            //
            //          3
            //         create an Exception class called IndexTooBigException
            //         which extends RuntimeException
            //         in method 2 throw this exception (instead of the previous)
            //© 2021 GitHub, Inc.
            MyIndexer my_indexer = new MyIndexer();

            int[] my_arr = { 1, 2, 3, 4 };
            //               0  1  2  3
            try {
                my_indexer.getElement(my_arr, 4);
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println(ex);
            }

            try {
                int elem = my_indexer.getElementAndThrow(my_arr, 10);
                System.out.println(elem);
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println(ex);
            }

            System.out.println(my_indexer.getElementAndThrow(my_arr, 2));

            try {
                int elem = my_indexer.getElementAndThrowCustom(my_arr, 12);
                System.out.println(elem);
            }
            catch (IndexTooBigException ex) {
                System.out.println(ex);
            }

        }

        }
    /*public static void accessToArrElements(int[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("there is no 5 elements in this array");
        }

        }
    public static void getElement (int[] arr, int indexToPrint)
    {
        if (indexToPrint >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else
            System.out.println(arr[indexToPrint]);
    }

    public static int getElementAndThrowCustom (int[] arr, int index) {
        if (index >= arr.length) {
            throw new IndexTooBigException(String.format("getElementAndThrowCustom array with %d elements and you " +
                    "tried to get element number %d", arr.length, index));
        }
        return arr[index];

    }*/


