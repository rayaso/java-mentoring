package javaintermediateclass12DataStructure;

public class SortingClass {
    public static void main(String[] args) {
        int[] soraya = {55, 89, 69, 75, 2, 41, 14, 3};

        for (int a = 0/*this mean start by index0*/; a < soraya.length/*this means go until the end*/; a++) {
            /*this 1st for loop take 2 numbers and compare*/

            for (int b = a + 1; b < soraya.length; b++) {/*skip 1 go to 69 because in 1st for loop il a deja comparee
             55 et 89*/

                int sonia;

               /* if(soraya[a]<soraya[b]){
                    sonia=soraya[a]
                }*/

                if (soraya[b] < soraya[a]) {//si on 2<55 store or take  2 in sonia variable
                    sonia = soraya[a];

                    soraya[a] = soraya[b];//si 55=89
                    soraya[b] = sonia;
                }
            }

            /* System.out.println(a);shows ass all the indexes we have*/

            System.out.println(soraya[a]);


        }


    }
}
