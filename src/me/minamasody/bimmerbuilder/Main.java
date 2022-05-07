package me.minamasody.bimmerbuilder;

import me.minamasody.bimmerbuilder.cars.CarBuild;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceManager;

import java.util.Scanner;

public class Main {

    private static CarBuild build;

    public static CarBuild getBuild() {
        return build;
    }

    public static void main(String[] args){
        PerformanceManager.loadMods();
        boolean running = false;
        while(true){
            if(!running){
                printMainScreen();
                running = true;
            }
            Scanner scanner = new Scanner(System.in);

            if(!scanner.nextLine().equalsIgnoreCase("start")) {
                System.out.println("Please input 'start' to start!");
                printMainScreen();
            }
            else{
                System.out.println("Welcome.");
            }
        }
    }

    public static void printMainScreen(){
        System.out.println("*******************************************");
        System.out.println("Welcome to BimmerBuilder!");
        System.out.println(" ");
        System.out.println("Build your dream BMW race car!");
        System.out.println(" ");
        System.out.println("Enter 'start' to start the build!");
        System.out.println("*******************************************");
    }

}
