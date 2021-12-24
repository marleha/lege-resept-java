class TestResepter {

    /**
     * Her skriver vi testene for HvitResept
     */
    private static void testHvitResept(HvitResept hvitresept) {
        System.out.println("Tester hvit resept:");
        if (hvitresept.farge() == "hvit") {
            System.out.println("Det er riktig farge.");
        } else {
            System.out.println("Det er feil farge.");
        }

        if (hvitresept.prisAaBetale() == 100) {
            System.out.println("Det er riktig pris.");
        } else {
            System.out.println("Det er feil pris.");
        }
    }

    /**
     * Her skriver vi testene for BlaResept
     */
     private static void testBlaResept(BlaResept blaresept) {
        System.out.println("Tester blaa resept:");
        if (blaresept.farge() == "blaa") {
            System.out.println("Det er riktig farge.");
        } else {
            System.out.println("Det er feil farge.");
        }

        if (blaresept.prisAaBetale() == 87.50) {
            System.out.println("Det er riktig pris.");
        } else {
            System.out.println("Det er feil pris.");
        }
    }

    /**
     * Her skriver vi testene for MilitaerResept
     */
    private static void testMilitaerResept(MilitaerResept militaerresept) {
        System.out.println("Tester militaer resept:");
        if (militaerresept.prisAaBetale() == 0) {
            System.out.println("Det er riktig pris.");
        } else {
            System.out.println("Det er feil pris.");
        }
    }

    /**
     * Her skriver vi testene for Presept
     */
    private static void testPresept(Presept presept) {
        System.out.println("Tester p-resept:");
        if (presept.prisAaBetale() == 234) {
            System.out.println("Det er riktig pris.");
        } else {
            System.out.println("Det er feil pris.");
        }
     }

    public static void main(String[] args) {
        Lege tomLege = new Lege();
        LegemiddelA legemiddelA = new LegemiddelA("Ibux", 100, 0.5, 400);
        LegemiddelB legemiddelB = new LegemiddelB("Ritalin", 350, 400, 10);

        HvitResept hvitresept = new HvitResept(legemiddelA, tomLege, 12345, 3);
        BlaResept blaresept = new BlaResept(legemiddelB, tomLege, 12345, 3);
        MilitaerResept militaerresept = new MilitaerResept(legemiddelA, tomLege, 12345, 3);
        Presept presept = new Presept(legemiddelB, tomLege, 12345, 3);        

        testHvitResept(hvitresept);
        testBlaResept(blaresept);
        testPresept(presept);
        testMilitaerResept(militaerresept);
    }
}

