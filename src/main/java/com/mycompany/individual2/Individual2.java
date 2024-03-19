/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.individual2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Z-V
 */
public class Individual2 {

    public static void main(String[] args) {
        System.out.println("Задание 2. Вариант 2. Ремизова М.А.");
        
        ArrayList<Telephone> telephons = new ArrayList<>();
        telephons.add(new Telephone("IPhone 13", "30112022M", "pink",true));
        telephons.add(new Telephone("IPhone 14 ProMax", "28092023M", "deep purple",true));
        telephons.add(new Telephone("IPhone 10", "2020Pank", "black",true));
        
        int Flag=0;
        int Continue=0;
        Scanner scan = new Scanner(System.in);
        while (Continue==0){
            System.out.println("Введите 1, если хотите добавить телефон в список");
            System.out.println("Введите 2, если хотите удалить телефон из списока");
            System.out.println("Введите 3, если хотите удалить список");
            int choice =scan.nextInt();
            switch(choice){
            case 1:
                System.out.println("Введите модель");
                String model =scan.next();
                System.out.println("Введите номер");
                String number =scan.next();
                for (Telephone tel: telephons ){
                    if (tel.getNumber().equals(number)){
                        System.out.println("Такой серийный номер уже есть");
                        Flag=1;
                    }else{
                        Flag=0;
                    }
                }
                System.out.println("Введите цвет");
                String colour =scan.next();
                System.out.println("Мобильный телефон? Введите true, если да. Введите false, если нет.");
                Boolean cell =scan.nextBoolean();
                if (Flag==0){
                    telephons.add(new Telephone(model,number,colour,cell));
                }
                break;
            case 2:
                System.out.println("Введите серийный номер телефона, который хотите удалить из списка");
                String deletNumber = scan.next();
                Iterator<Telephone> iter = telephons.iterator();
                while (iter.hasNext()){
                    Telephone tel = iter.next();
                    if (tel.getNumber().equals(deletNumber)){
                        iter.remove();
                    }
                }
                break;
            case 3:
                telephons.clear();
                break;
            default:
                System.out.println("какая-то ошибка");
            }

            for (Telephone tel: telephons ){
                System.out.println(tel.toString());
            }
            System.out.println("Хотите продожить? Введите 0, если да. Введите 1, если нет.");
            int prodol =scan.nextInt();
            Continue=prodol;
        }
    }
}
