package org.example;

public class Print {

    public  void yazdir(String printedText, int[] printList){

        System.out.println(printedText);
        for ( int i =0; i< printList.length; i++) {
            System.out.print(printList[i] +  "  ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

}
