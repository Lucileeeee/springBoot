package com.spring.hello.service;
import com.spring.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le titre du livre: ");
        String titre = sc.nextLine();
        System.out.println("Entrer la description du livre: ");
        String description = sc.nextLine();
        System.out.println("Entrer la date de publication du livre: ");
        String datePublication = sc.nextLine();
        Livre livre = new Livre(titre, description, datePublication);
        System.out.println(livre.toString());
    }

    public Livre getLivre(Livre livre){
        return livre;
    }
}
