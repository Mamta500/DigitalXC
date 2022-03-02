package com.digitalxc.zitti;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Zitti {

        String name = "Zitti";
        public static void zittiReplies(){

                System.out.println("Hello, I am fine!");

        }
        public static boolean isSubString(String string, String sub){
                return string.matches(".*" + sub + ".*");
        }

        public static void hello(){
                System.out.println("Hello, I am doing great.");
        }

        public static String currentTime(){
                Date currentDate = new Date();
                //System.out.println(currentDate);
                SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm:ss");
                return (currentTime.format(currentDate));
        }

        public static void split(String string1){
                String word[] = string1.split("[ \t\n.?,!]+");
                for(int i=0; i<word.length; i++){

//                        while(word[i]== "weather"){
//                                break;
//                        }
                        switch(word[i]){
                                case "Hey":
                                        System.out.println("Hello, I am doing great.\n");
                                        break;
                                case "weather":
                                        System.out.println("It's pleasant outside. You should take a walk.\n");
                                        break;
                                case "Clean":
                                        System.out.println("Room is cleaned. It looks tidy now. Job completed at " + currentTime() + ".\n");
                                        break;
                                case "newspaper":
                                        System.out.println("Here is your newspaper.\n");
                                        break;
                                case "Read":
                                        System.out.println("You have no items in your shopping list.\n");
                                        break;
//                                case "Read":
//                                        System.out.println("You have no items in your shopping list.\n");
//                                        break;
//                                case "newspaper":
//                                        System.out.println("Here is your newspaper.\n");
//                                        break;
//                                case "Read":
//                                        System.out.println("You have no items in your shopping list.\n");
//                                        break;
//                                case "newspaper":
//                                        System.out.println("Here is your newspaper.\n");
//                                        break;
//                                case "Read":
//                                        System.out.println("You have no items in your shopping list.\n");
//                                        break;
                                default:
                                        System.out.println("Hmm.. I don't know that.\n");
                                        break;
                        }
                }
//                System.out.println("It's pleasant outside. You should take a walk.\n");
        }


        public static void main(String[] args) {
                System.out.println("This is a Zitti Challenge");
                Scanner sc = new Scanner(System.in);
                String string = sc.nextLine();
//        String sub = sc.nextLine();
                Zitti zitti = new Zitti();
                zitti.split(string);
//        System.out.println(c);
//        zitti.zittiReplies();
//        System.out.println(zitti.isSubString(string, sub));
//        zitti.isSubString(string, sub);


        }







}
