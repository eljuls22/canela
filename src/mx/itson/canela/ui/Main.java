/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.enumeradores.Dificultad;

/**
 *
 * @author julio
 */
public class Main {

    public static void main(String[] args) {

        Receta receta = new Receta();
        receta.setNombre("Flan napolitano");
        receta.setDescripcion("Aprende a preparar un clásico de los postres: ¡FLAN NAPOLITANO! Hecho con CARNATION® CLAVEL® y LA LECHERA®. Un postre que no puede faltar en tu recetario.");
        receta.setNumeroPorciones(12);
        receta.setTiempo(162);

        List<Ingrediente> ingrediente = new ArrayList<>();

        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("3/4 De taza de azúcar refinada");
        ingrediente.add(ingrediente1);
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("1 Lata de Leche Condensada LA LECHERA®");
        ingrediente.add(ingrediente2);
        
        receta.setIngredientes(ingrediente);
        
        Paso paso1 = new Paso();
        paso1.setOrden(1);
        paso1.setDescipcion("Horno precalentado a 180 °C.");
        Paso paso2 = new Paso();
        paso2.setOrden(2);
        paso2.setDescipcion("Vierte el azúcar en una flanera y calienta a fuego medio para que se forme el caramelo; ladea con cuidado el molde para cubrir la superficie y las paredes.");
        Paso paso3 = new Paso();
        paso3.setOrden(3);
        paso3.setDescipcion("Licúa la Leche Condensada LA LECHERA® con la Leche Evaporada CARNATION® CLAVEL®, el queso crema, los huevos y la esencia de vainilla. Vierte la preparación en la flanera y tapa con papel aluminio sellando las orillas. Coloca en un recipiente y cocina a baño María en el horno a 180 °C durante 1 1/2 horas.");
        Paso paso4 = new Paso();
        paso4.setOrden(4);
        paso4.setDescipcion("Retira del fuego y deja enfriar por completo; desmolda y sirve.");
        
        receta.setDificultad(Dificultad.FACIL);
        
    }
}
