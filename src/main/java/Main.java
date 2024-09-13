public class Main {
    public static void main(String[] args) {
        // Création de la bibliothèque (le sujet)
        Bibliotheque bibliotheque = new Bibliotheque();
        // Création des utilisateurs (observateurs)
        Utilisateur user1 = new Utilisateur("Alice");
        Utilisateur user2 = new Utilisateur("Bob");
        // Les utilisateurs s'abonnent aux notifications de la bibliothèque
        bibliotheque.subscribe(user1);
        bibliotheque.subscribe(user2);
        // Ajout d'un nouveau livre
        bibliotheque.ajouterLivre("Design Patterns en Java");
        // Désabonnement d'un utilisateur
        bibliotheque.unsubscribe(user1);
        // Ajout d'un autre livre
        bibliotheque.ajouterLivre("Introduction à Spring Boot");
    }
}
