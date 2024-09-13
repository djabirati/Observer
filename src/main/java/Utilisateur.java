public class Utilisateur implements Observer{
    private String nom;
    public Utilisateur(String nom) {
        this.nom = nom;
    }
    @Override
    public void update(String message) {
        System.out.println(nom + " a reçu la notification : " +
                message);
    }
}
