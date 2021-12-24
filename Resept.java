
abstract class Resept {

    private int reseptID;
    private Lege lege;
    private Legemiddel legemiddel;
    private Pasient pasient;
    private int reit; //hvor mye man har igjen paa resepten
    private static int lopenummer = 0;

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit) {
        this.lege = utskrivendeLege;
        this.legemiddel = legemiddel;
        this.pasient = p;
        this.reit = reit;
        this.reseptID = lopenummer++;
    }

    public int hentId() {
        return reseptID;
    }

    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }

    public Lege hentLege() {
        return lege;
    }

    public int hentPasientId() {
        return pasientID;
    }

    public int hentReit() {
        return reit;
    }

    public boolean bruk() {
        if (reit > 0) {
            return true;
        } else {
            return false;
        }
    }

    abstract public String farge();

    abstract public double prisAaBetale();

    public void printInfo() {
        System.out.println("------------------------");
        System.out.println("Dette er en resept paa " + legemiddel.hentNavn());
        System.out.println("Resept id: " + reseptID);
        System.out.println("Pasient id:" + pasientID);
        System.out.println("Reit:" + reit);
        System.out.println("Utskrivende lege: " + lege.hentNavn());
        System.out.println("Farge: " + farge());
        System.out.println("Pris aa betale: " + String.valueOf(prisAaBetale()));
    }
}
