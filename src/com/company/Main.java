package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Esen";
        int a = (int) (Math.random()*107);
        int age = a;
        System.out.println("Возраст равен: " +age);
        int temperature = 26;

        if (age > 20 && age < 45) {
            if (temperature <= 30 && temperature >= 20)
            {
                System.out.println(" Не идет гулять");
            }

            else System.out.println(" Идет в гости к другу");
        }

        else if (age <= 20) // Возраст меньше 20
        {
            if (temperature >= 0 && temperature <= 28)
            {
                System.out.println("Не идет гулять");
            }

            else System.out.println(" Идет в гости к другу");
        }

        else if (age >= 45) //Возраст больше 45
        {
            if (temperature >= -10 && temperature <= 25)
            {
                System.out.println(" Не идет гулять");
            }

            else System.out.println(" Идет в гости к другу");

        }



  }

}

