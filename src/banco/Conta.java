package banco;

import javax.swing.JOptionPane;

public class Conta {

    private String nome;
    private String tipoConta;
    private String senha;
    private int numConta;
    private boolean status = false;
    private double saldo = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tC) {
        this.tipoConta = tC;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String sh) {
        this.senha = sh;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int nC) {
        this.numConta = nC;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void abrirConta() {
        if (status == false) {
            this.status = true;
        } else {
            JOptionPane.showMessageDialog(null,"Ja possui uma conta","Inane error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
