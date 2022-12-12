package javaintermediateclass12DataStructure;

public class ExelReadMultiDimensionalArray {

    public static void main(String[] args) {

        int[] arr={10,20,30};//regular array

        int [][] multiArray= {{10,20,30},{100,200,300},{1000,2000,3000}};/*multi dimansional array,with
        the multidimensional method to read an exel file we do not need to oopen exel file*/

        System.out.println(multiArray[0][1]);//row with index 0,colum with index1 because we start with index 0
        System.out.println(multiArray[1][2]);//row with index 1,column with index 2


        for (int row=0;row<multiArray.length;row++){
            for (int column=0;column<multiArray[row].length;column++){
                System.out.print(multiArray[row][column]+"\t\t");
            }

            System.out.println();
        }




        }








    }







