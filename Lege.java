
class Lege {

    private String legensnavn;

    // Har en tom konstrutor for at test resepter skal kompilere
    public Lege() {

    }

    public Lege(String legensnavn) {
        this.legensnavn = legensnavn;
    }

    public String hentNavn() {
        return legensnavn;
    }
}