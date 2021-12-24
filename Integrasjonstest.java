
/**
 * Integrasjonstest
 */
public class Integrasjonstest {
    
    public static void main(String[] args) {

        //Legemidler:
        LegemiddelA ibux = new LegemiddelA("Ibux", 100, 200, 5);
        LegemiddelB paracet = new LegemiddelB("Paracet", 150, 400, 9);
        LegemiddelC ibutemin = new LegemiddelC("Ibutemin", 129, 50);

        //Leger:
        Lege lege = new Lege("Erik");
        Fastlege fastlege = new Fastlege("Bjorn", 1337);

        // Resepter:
        HvitResept hvitresept = new HvitResept(ibux, lege, 12345, 3);
        BlaResept blaresept = new BlaResept(paracet, fastlege, 12345, 3);
        MilitaerResept militaerresept = new MilitaerResept(ibutemin, lege, 12345, 3);
        Presept presept = new Presept(paracet, fastlege, 12345, 3);

        // Skriver ut info om legemidler:
        ibux.printInfo();
        System.out.println("Narkotisk styrke:" + Integer.toString(ibux.hentNarkotiskStyrke()));
        paracet.printInfo();
        System.out.println("Vanedannende styrke:" + Integer.toString(paracet.hentVanedannendeStyrke()));
        ibutemin.printInfo();

        // Skriver ut info om resepter:
        hvitresept.printInfo();
        blaresept.printInfo();
        militaerresept.printInfo();
        presept.printInfo();

        // Skriver ut info om leger:
        System.out.println("------------------------");
        System.out.println("Legens navn:" + lege.hentNavn());
        System.out.println("------------------------");
		System.out.println("Fastlegens navn: " + fastlege.hentNavn());
		System.out.println("Kommunenr:" + String.valueOf(fastlege.hentAvtalenummer()));


    }
}