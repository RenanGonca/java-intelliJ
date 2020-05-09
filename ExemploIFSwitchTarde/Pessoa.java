public class Pessoa {

    private String nome;
    private String sobrenome;    
    private int idade;
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String verificarBairro() {
        return this.nome 
        + ", voce mora na " 
        + ((this.sobrenome.equalsIgnoreCase("silva")) ? "ZN!" : "ZS!");
    }
    
    public String verificarNome1() {
        if(this.nome.length() > 1) {
            return "Nome válido!";
        } else {
            return "Nome INválido!";
        }
    }
    
    public String verificarNome2() {
        return (this.nome.length() > 1) ? "Nome válido!" : "Nome INválido!";
    }
    
    public int getIdade() {
        return this.idade; 
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String verificarIdade() {
        if(this.idade >= 18) {
            return "\nMaior de idade";
        } else {
            return "\nMenor de idade";
        }
    }
    
    public String verificarJovemAdultoIdoso() {
        if(this.idade >= 60) {
            return "\nIdoso";
        } else if(this.idade >= 30) {
            return "\nAdulto";
        } else if(this.idade >= 15) {
            return "\nJovem ainda...";
        }
        return "Voce nao se enquadra em nenhuma categoria...";
    }    
    
    public String verificarIdade1() {
        if(this.idade >= 18) {
            return "\nMaior de idade";
        }
        return "\nMenor de idade";
    }    
    
    public int verificarIdade2() {
        if(this.idade >= 18) {
            return 1;
        }
        return -1;
    }
    
    public boolean verificarIdade3() {
        if(this.idade >= 18) {
            return true;
        }
        return false;
    }
    
    public boolean verificarIdadeEntrada() {
        if(this.idade > 0) {
            return true;
        }
        return false;
    }    
    
    public boolean verificarIdadeEntrada1() {
        return this.idade > 0;
    }        
    
    public String toString() {
        return "\nIdade: " + this.idade
        + "\nverificar nome: " + this.verificarNome2()
        + "\nverificar bairro: " + this.verificarBairro()
        + "\nVerificar idade: " + this.verificarIdade3();
    }
    
}