
class HvitResept extends Resept {

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit) {
        super(legemiddel, utskrivendeLege, pasientID, reit);
    }
    
    @Override
    public String farge() {  //teste
        return "hvit";
    }

    @Override
    public double prisAaBetale() { //teste
        return hentLegemiddel().hentPris();
    }
}   