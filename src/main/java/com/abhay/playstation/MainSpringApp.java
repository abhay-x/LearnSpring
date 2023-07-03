package com.abhay.playstation;

import com.abhay.playstation.games.GameConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GameConsole.class).up();
        context.getBean(GameSelctorAndRunner.class).run();
    }
}
