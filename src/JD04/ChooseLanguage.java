package JD04;

import javax.swing.*;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection=3;
        if (selection == 1) {
            System.out.println("Hallo,thank you for your call" );
        }else if(selection==2){
            System.out.println("Hola, gracias por Ilamar" );
        }else if(selection==3){
            System.out.println("Merhaba, aradiginiz icin tesekkürler" );
        }else if(selection==4) {
            System.out.println("Привет, спасибо за ваш звонок");
        }else if (selection==5) {
            System.out.println("Merci, pour votre appel");
        }

    }

}
