package ru.mirea.lab1.Homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework14_8 {
    public static void main(String[] args) {


        List <Letters> letters = new ArrayList<>();
        double count=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String text ="";
        text= input.nextLine();
        text=text.toLowerCase();

        for(int i=0; i<text.length(); i++)
        {
            if ((text.charAt(i)==' ')||(text.charAt(i)==',')||(text.charAt(i)=='.')||(text.charAt(i)=='-')||(text.charAt(i)==':'))
                continue;


          for (int j=0;j< letters.size(); j++)
          {
              count++;
              if (letters.get(j).getName()==text.charAt(i))
              {
                  letters.get(j).setCount();
                  j= letters.size();
              }

              if (j==letters.size()-1)
              {
                  letters.add(new Letters(text.charAt(i),1));
                  j++;
              }

          }
          if (letters.size()==0)
              letters.add(new Letters(text.charAt(i),1));

        }
        


        for(Letters let:letters)
        {
            System.out.println("Буква '" + let.getName()+"' частотность %: "+ (let.getCount()/count)*100);
        }


    }



}
