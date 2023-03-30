package schueler;

public class SchuelerImpl implements Schueler {

    private final String name;
    private final String lastName;


    public SchuelerImpl(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
