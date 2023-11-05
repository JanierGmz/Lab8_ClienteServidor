/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.products;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 *
 * @author Janier Gomez
 */
/**
 * Clase que indice el Path base desde el cual estará respondiendo la API Rest.
 * Este path corresponde a la URL a partir de la cual se expondrá nuestros
 * servicios. Para lograr esto, será necesario crear una clase que extienda de
 * “Application”, esta clase puede llamarse como sea y puede colocarse en
 * cualquier paquete.
 *
 * @author Libardo, Julio
 */
@ApplicationPath("product-service")
public class AppConfiguration extends Application {
    
}
