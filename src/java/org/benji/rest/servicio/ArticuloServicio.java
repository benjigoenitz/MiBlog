
package org.benji.rest.servicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.benji.rest.dao.BaseDeDatos;
import org.benji.rest.modelo.Articulo;

/**
 *
 * @author dbarboza
 */
public class ArticuloServicio {

    private final List<Articulo> listado = BaseDeDatos.getInstancia().getListado();

    public List<Articulo> getArticulos() {
        return listado;
    }

    public List<Articulo> getArticulosByAutor(String autor) {
        List<Articulo> resultado = new ArrayList<>();
        for (Articulo articulo : listado) {
            if (articulo.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(articulo);
            }
        }
        return resultado;
    }

    public List<Articulo> getArticuloByDate(int year, int month) {
        List<Articulo> resultado = new ArrayList<>();
        Calendar date = new GregorianCalendar();
        for (Articulo articulo : listado) {
            date.setTime(articulo.getCreado().getTime());
            if (date.get(Calendar.YEAR)== year 
                    && date.get(Calendar.MONTH)== month -1) {
                resultado.add(articulo);
            }
        }
        return resultado;
    }

    public Articulo getArticulo(int id) {
        for (Articulo articulo : listado) {
            if (articulo.getId() == id) {
                return articulo;
            }
        }
        return null;
    }

    public Articulo addArticulo(Articulo articulo) {
        articulo.setId(getMaximo());
        articulo.setCreado(new GregorianCalendar());
        listado.add(articulo);
        return articulo;
    }

    public Articulo updateArticulo(Articulo articulo) {
        int posicion = getPosicion(articulo.getId());
        try {
            listado.set(posicion, articulo);
        } catch (IndexOutOfBoundsException ioobe) {
            return null;
        }
        return articulo;
    }

    public void deleteArticulo(int id) {
        int posicion = getPosicion(id);
        listado.remove(posicion);
    }

    private int getPosicion(int id) {
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private int getMaximo() {
        int size = listado.size();
        if (size > 0) {
            return listado.get(size - 1).getId() + 1;
        } else {
            return 1;
        }
    }
}
