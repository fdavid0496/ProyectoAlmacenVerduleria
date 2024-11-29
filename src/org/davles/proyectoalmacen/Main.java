package org.davles.proyectoalmacen;

import org.davles.proyectoalmacen.domain.*;
public class Main {
    public static void main(String[] args) {
        int varCantidadProductos = 8;
        Producto[] varObjProductos = new Producto[varCantidadProductos];

        // Crear instancias de las clases
        Producto objLacteo1 = new Lacteo("Leche de Almendras", 27000.0, 20, 125);
        Producto objLacteo2 = new Lacteo("Yogurt Griego", 10000, 12, 300);

        Producto objFruta1 = new Fruta("Manzana", 800, 0.3, "Roja");
        Producto objFruta2 = new Fruta("Papaya", 6000, 2.0, "Amarilla");

        Producto objLimpieza1 = new Limpieza("Desinfectante de Baño", 30000, "Cloro y Vinagre", 2.5);
        Producto objLimpieza2 = new Limpieza("Jabón para Platos", 23000, "Jabón concentrado", 3.0);

        Producto objNoPerecible1 = new NoPerecible("Legumbres enlatadas", 9000, 650, 120);
        Producto objNoPerecible2 = new NoPerecible("Miel", 7500, 950, 500);

        // Guardar los objetos en el arreglo
        varObjProductos[0] = objLacteo1;
        varObjProductos[1] = objLacteo2;
        varObjProductos[2] = objFruta1;
        varObjProductos[3] = objFruta2;
        varObjProductos[4] = objLimpieza1;
        varObjProductos[5] = objLimpieza2;
        varObjProductos[6] = objNoPerecible1;
        varObjProductos[7] = objNoPerecible2;

        // Recorrer el arreglo con los productos
        for (Producto objProducto : varObjProductos) {
            System.out.println("-----------------------------------------");
            System.out.println(objProducto.toString());
        }
    }
}
