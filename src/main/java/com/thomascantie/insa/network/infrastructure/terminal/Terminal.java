package com.thomascantie.insa.network.infrastructure.terminal;

import java.util.Scanner;

public class Terminal {

    public void print(String message) {
        System.out.println(message);
    }

    public int readInt() {
        return getScanner().nextInt();
    }

    public void printError(String errorMessage) {
        System.err.println(errorMessage);
    }

    public String readLine() {
        return getScanner().nextLine();
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void printError(Exception exception) {
        exception.printStackTrace();
    }
}
