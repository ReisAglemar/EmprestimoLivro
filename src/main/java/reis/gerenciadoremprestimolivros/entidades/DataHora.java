package reis.gerenciadoremprestimolivros.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHora {

    private Date dataHora = new Date();
    private String dataFormatada = new SimpleDateFormat("dd/MM/yy").format(dataHora);
    private String horaFormatada = new SimpleDateFormat("HH:mm:ss").format(dataHora);

    public DataHora() {
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getHoraFormatada() {
        return horaFormatada;
    }

    public void setHoraFormatada(String horaFormatada) {
        this.horaFormatada = horaFormatada;
    }

    public String dataHoraFormatada() {
        String dataHoraFormatada = dataFormatada + " - " + horaFormatada;
        return dataHoraFormatada;
    }

    @Override
    public String toString() {
        return "DataHora{"
                + "dataHora=" + dataHora
                + ", dataFormatada=" + dataFormatada
                + ", horaFormatada=" + horaFormatada
                + '}';
    }

}
