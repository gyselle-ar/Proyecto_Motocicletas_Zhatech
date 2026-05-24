
package datos.interfaces;

import java.util.List;


public interface CrudSimpleInterface<T> {
    public List<T> listar();
    public boolean guardar(T obj);
    public boolean eliminar(int id);
    public T buscarPorId(int id);
}
