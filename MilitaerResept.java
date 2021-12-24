
class MilitaerResept extends HvitResept {

    public MilitaerResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit) {
        super(legemiddel, utskrivendeLege, pasientID, reit);
    }

    @Override
    public double prisAaBetale() { //teste
        // return hentLegemiddel().hentPris() * 0;
        return 0;
    }
}