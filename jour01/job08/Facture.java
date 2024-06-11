package job08;

public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;

        double tarifHT = prix*quantite;
        double tva = 0.2;
        double tarifTTC = tarifHT + tarifHT*tva;

        System.out.println("Le montant total est : " + tarifHT + "\n" +
                           "Le montant de la taxe est : " + tarifHT*tva + "\n" +
                           "Le montant total à payer est : " + tarifTTC + "\n");
    }
}
