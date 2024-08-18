package creational.prototype;

class Foguete implements Prototype{

    private String nome;
    private int combustivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(int comb) {
        this.combustivel = comb;
    }

    public String toString(){
        return getNome() + getCombustivel();
    }

    @Override
    public Prototype clone() {
        Foguete foguete = new Foguete();
        foguete.setCombustivel(getCombustivel());
        foguete.setNome(getNome());
        return foguete;
    }
}
