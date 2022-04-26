package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);  
    ArrayList list = new ArrayList();

    System.out.println("Please enter your name");
    Object name = input.nextLine();

    System.out.println("Please enter your hometown");
    Object hometown = input.nextLine();

    System.out.println("Please enter your parents name");
    Object pName = input.nextLine();

    System.out.println("Please enter your age");
    Object age = input.nextInt();
    
    

    list.add(name);
    list.add(age);
    list.add(hometown);
    list.add(pName);


    
    System.out.println("You choose number what you see them");
    System.out.println("1-All them\n" + "2-Just Name\n" + "3-Just hometown\n" + "4-Just parents name\n");
    int choosing = input.nextInt();

    if(choosing == 1){
        for(Object i : list){
            System.out.println(i);
        }
    }

    else if(choosing == 2){
        System.out.print("Name:"+ " ");
        System.out.println(name);
    }

    else if(choosing == 3){
        System.out.print("Hometown:"+ " ");
        System.out.println(name);
    }

    else if(choosing == 4){
        System.out.print("Parents name:"+ " ");
        System.out.println(pName);
    }

}
}