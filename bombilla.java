public class bombilla {
    private boolean encendida;
    private boolean explotada;
    private int intensidad;

    public bombilla() {
        this.encendida = false;
        this.explotada = false;
        this.intensidad = 0;
    }

    public void encender() {
        this.encendida = true;
        this.explotada = false;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public boolean isExplotada() {
        return explotada;
    }

    public int getIntensidad() {
        return intensidad;
    }
}