/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package femax.trabajo.pkgfinal;

import views.InicioSesion;

/**
 *
 * @author j-aco
 */
public class FemaxTrabajoFinal {

    public static void main(String[] args) {
        System.out.println("Bienvenido a FEMAX!");
        InicioSesion login = new InicioSesion();
        login.setVisible(true);
    }
}
