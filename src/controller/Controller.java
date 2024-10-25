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

    private Controller() {

    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

}
