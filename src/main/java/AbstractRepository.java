import java.util.Collection;
import java.util.Optional;

public interface AbstractRepository<T, E extends Number> {
    Collection<T> index();
    Optional<T> getById(E id);
    T update(E id);
    void deleteById(E id);
}
