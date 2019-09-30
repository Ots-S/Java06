public class Wilder {

    // Attributs

    private String firstname;
    private boolean aware;

    // Constructeur

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // Getters

    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    // Setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void isAware(boolean aware) {
        this.aware = aware;
    }

    // Methode instanciée

    public String whoAmI() {
        if (this.getAware()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
        else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}

