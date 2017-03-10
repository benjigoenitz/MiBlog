
package org.benji.rest.dao;

import java.util.ArrayList;
import java.util.List;
import org.benji.rest.modelo.Articulo;

/**
 *
 * @author dbarboza
 */
public final class BaseDeDatos {
    private final static BaseDeDatos baseDeDatos= new BaseDeDatos();
    private final List<Articulo> listado = new ArrayList<>();
    
    
    private BaseDeDatos(){
        Articulo art1 = new Articulo(1,"Primer artículo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque dui lacus, tristique id posuere iaculis, pretium sed magna. Maecenas facilisis ut sapien eget congue. Phasellus lacus orci, congue a nulla quis, vulputate euismod nibh. Pellentesque fermentum sollicitudin mi, quis porttitor tortor sagittis quis. Etiam ut risus scelerisque, pretium est a, aliquam felis. Nunc ac leo at justo facilisis placerat eu eu lectus. Pellentesque semper, magna a ornare viverra, nunc diam mattis ligula, et luctus est urna ut magna. Sed arcu massa, vestibulum dapibus hendrerit vitae, finibus eu mi. Integer dignissim dignissim velit, non efficitur sapien malesuada nec. Mauris sit amet nisl aliquam, bibendum ligula non, fringilla purus.", "Benji Goenitz");
        Articulo art2 = new Articulo(2,"Segundo artículo", "Suspendisse potenti. Duis sed commodo nisl, in mollis orci. Cras ornare libero diam, sit amet posuere sapien rutrum ut. Aenean et eleifend sapien. Pellentesque sodales massa tellus, vel tincidunt sapien sodales non. Nam fringilla velit lacus, vitae posuere turpis commodo nec. Duis sodales aliquam elementum. Fusce quis fermentum mauris. Vivamus vel bibendum lectus. Morbi semper, odio id interdum porta, lacus erat pulvinar ante, id scelerisque nulla tortor in urna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent sit amet urna enim. Nunc at feugiat orci. Vestibulum sed dapibus ligula, consectetur congue quam. Nam quis libero eget dui faucibus interdum a rutrum purus. Etiam maximus nisl imperdiet tortor viverra sodales semper gravida felis.", "Benji Goenitz");
        Articulo art3 = new Articulo(3,"Tercer artículo","Fusce consequat enim a nulla tristique hendrerit sit amet vitae elit. Cras mattis felis ultrices ex molestie, id posuere libero tempor. Nunc erat magna, gravida non ultricies ac, vestibulum in libero. Nulla lacinia laoreet eleifend. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam nec quam sed nibh bibendum rutrum. Morbi rhoncus ligula id augue vehicula, quis semper turpis mollis. Etiam quis magna quis metus varius posuere. Aenean pharetra lectus massa, eget mattis elit tincidunt in. Nunc aliquet, tellus ac iaculis placerat, purus leo tristique ex, sit amet efficitur ipsum leo in velit. Maecenas leo ipsum, tempor a iaculis at, viverra vitae diam. Sed et mauris quis ligula sollicitudin maximus iaculis ac odio. Praesent mi est, ornare vitae pulvinar at, ultrices sed libero. Sed dictum rutrum magna et bibendum. Donec at risus ligula. Nunc vel risus vel eros dictum semper.","Benji Goenitz");
        listado.add(art1);
        listado.add(art2);
        listado.add(art3);
    }
    
    public static BaseDeDatos getInstancia(){
        return baseDeDatos;
    }
    
    public List<Articulo> getListado(){
        return listado;
    }
}
