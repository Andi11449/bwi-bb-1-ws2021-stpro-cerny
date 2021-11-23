package review_class10.schuhshop;

import java.util.Scanner;

public class Schuhshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Schuhmodell[] produktkatalog = new Schuhmodell[100];
        Kunde[] kundenkartei = new Kunde[100];
        Schuhmodell[] verkaufteSchuhe = new Schuhmodell[100];

        System.out.println("Willkommen im Schuhshop!");
        while (true) {
            System.out.println("Operationscodes: \n"
                    + "1 Neues Modell hinzufügen \n"
                    + "2 Neuen Kunden hinzufügen \n"
                    + "3 Produktkatalog anzeigen \n"
                    + "4 Kundenkartei anzeigen \n"
                    + "5 Schuh verkaufen \n"
                    + "6 Bisherige Tageseinnahmen \n"
                    + "7 Besten Kunden anzeigen \n"
                    + "0 Programm beenden");
            int operation = Integer.parseInt(sc.nextLine());
            switch (operation) {
                case 1:
                    System.out.println("Modell hinzufügen");
                    System.out.println("Modellname:");
                    String modellname = sc.nextLine();
                    System.out.println("Hersteller:");
                    String hersteller = sc.nextLine();
                    System.out.println("Preis:");
                    float preis = Float.parseFloat(sc.nextLine());
                    modellHinzufuegen(produktkatalog, modellname,
                            hersteller, preis);
                    break;
                case 0:
                    sc.close();
                    return;
            }
        }

        /*Schuhmodell[] produktkatalog = new Schuhmodell[100];
        Kunde[] kundenkartei = new Kunde[100];
        Schuhmodell[] verkaufteSchuhe = new Schuhmodell[100];

        produktkatalog[0] = createSchuhmodell("AirMax", "Nike", 95.90f);
        produktkatalog[1] = createSchuhmodell("C123", "Converse", 50f);

        kundenkartei[0] = new Kunde();
        kundenkartei[0].name = "Andreas";
        kundenkartei[0].gekaufteSchuhe[0] = produktkatalog[0];
        kundenkartei[0].gekaufteSchuhe[1] = produktkatalog[1];

        print(kundenkartei[0]);*/
    }

    private static void modellHinzufuegen(Schuhmodell[] produktkatalog, String modellname, String hersteller, float preis) {
        for(int i=0; i<produktkatalog.length; i++){
            if(produktkatalog[i] == null) {
                produktkatalog[i] = createSchuhmodell(modellname, hersteller, preis);
                break;
            }
        }
    }

    private static Schuhmodell createSchuhmodell(String modell, String hersteller, float preis) {
        Schuhmodell schuh = new Schuhmodell();
        schuh.modell = modell;
        schuh.herstellermarke = hersteller;
        schuh.preis = preis;
        return schuh;
    }

    private static void print(Kunde k1) {
        float summe = 0;
        for(Schuhmodell s : k1.gekaufteSchuhe) {
            if(s == null)
                break;
            summe += s.preis;
            //System.out.printf(", [%s, %s, %.2f]", s.modell, s.herstellermarke, s.preis);
        }

        System.out.printf("%s, %.2f€", k1.name, summe);

    }
}
