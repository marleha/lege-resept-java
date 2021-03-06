class Presept extends HvitResept {
    static private double prabatt = 116; //statisk
    
    public Presept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit) {
        super(legemiddel, utskrivendeLege, pasientID, reit = 3);
    }

    @Override
    public double prisAaBetale() { //teste
        double nypris = this.hentLegemiddel().hentPris() - prabatt;
        if (nypris >= 0) {
            return nypris;
        } else {
            return 0;
        }
    }
}