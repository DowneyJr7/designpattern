package com.donny.templatemethod8.coffeetea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 咖啡因吊钩
 */


public class CoffeeWithHook extends CaffeineBeverageithHook {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * 使用钩子
     * @return
     */
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error trying to rea your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
