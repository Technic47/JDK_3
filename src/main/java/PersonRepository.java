import java.util.Collection;
import java.util.Optional;

public class PersonRepository implements AbstractRepository<Person, Integer> {
    @Override
    public Collection<Person> index() {
        return null;
    }

    @Override
    public Optional<Person> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Person update(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
