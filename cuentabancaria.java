public class cuentabancaria {
    private int userid;
    private String titular;
    private String numerodecuotas;
    private double saldo;

    public cuentabancaria(int userid, String titular, String numerodecuotas, double saldo) {
        this.userid = userid;
        this.titular = titular;
        this.numerodecuotas = numerodecuotas;
        this.saldo = saldo;
    }

    public String gettitular() {
        return titular;
    }

    public String getnumerodecuotas() {
        return numerodecuotas;
    }

    public double getsaldo() {
        return saldo;
    }

    public int getuserid() {
        return userid;
    }
}
