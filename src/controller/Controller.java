/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.SkriveniBroj;

/**
 *
 * @author vldmrk
 */
public class Controller {

    private static Controller instance;
    private List<SkriveniBroj> brojevi = new ArrayList<>();
    private List<Admin> admini = new ArrayList<>();
    private Admin user;

    public Admin getUser() {
        return user;
    }

    public void setUser(Admin user) {
        this.user = user;
    }

    private Controller() {
        Admin a1 = new Admin("pera@gmail.com", "123456", "Pera", "Peric");
        Admin a2 = new Admin("mara@gmail.com", "654321", "Mara", "Maric");

        admini.add(a1);
        admini.add(a2);
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public boolean log(Admin a) {
        for (Admin ad : admini) {
            if (a.getMail().equals(ad.getMail()) && a.getSifra().equals(ad.getSifra())) {
                user = ad;
                return true;
            }
        }
        return false;
    }

}
