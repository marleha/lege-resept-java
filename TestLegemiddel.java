
class TestLegemiddel {
    public static void main(String[] args) {
        LegemiddelA ibux = new LegemiddelA("Ibux", 100, 200, 5);
        LegemiddelB paracet = new LegemiddelB("Paracet", 150, 400, 9);
        LegemiddelC ibutemin = new LegemiddelC("Ibutemin", 129, 50);
    
    
        // Test Legemiddel.hentPris()
        if (ibux.hentPris() == 100) {
            System.out.println("Riktig pris paa ibux.");
        } else {
            System.out.println("Feil pris paa ibux.");
        }
        
        if (paracet.hentPris() == 150) {
            System.out.println("Riktig pris paa paracet.");
        } else {
            System.out.println("Feil pris paa paracet.");
        }

        if (ibutemin.hentPris() == 129) {
            System.out.println("Riktig pris paa ibutemin.");
        } else {
            System.out.println("Feil pris paa ibutemin.");
        }

        // Sjekke riktig virkestoff hentVirkestoff
        if (ibux.hentVirkestoff() == 200) {
            System.out.println("Riktig virkestoff paa ibux.");
        } else {
            System.out.println("Feil virkestoff paa ibux.");
        }
        
        if (paracet.hentVirkestoff() == 400) {
            System.out.println("Riktig virkestoff paa paracet.");
        } else {
            System.out.println("Feil virkestoff paa paracet.");
        }

        if (ibutemin.hentVirkestoff() == 50) {
            System.out.println("Riktig virkestoff paa ibutemin.");
        } else {
            System.out.println("Feil virkestoff paa ibutemin.");

        }

        // Sjekke riktig styrke hentNarkotiskStyrke()
        if (ibux.hentNarkotiskStyrke() == 5) {
            System.out.println("Riktig narkotisk styrke paa ibux.");
        } else {
            System.out.println("Feil narkotisk styrke paa ibux.");
        }
        
        if (paracet.hentVanedannendeStyrke() == 9) {
            System.out.println("Riktig vanedannende styrke paa paracet.");
        } else {
            System.out.println("Feil vanedannende styrke paa paracet.");
        }
    }
}

