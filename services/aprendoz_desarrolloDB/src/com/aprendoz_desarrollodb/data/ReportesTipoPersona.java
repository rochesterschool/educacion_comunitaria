
package com.aprendoz_desarrollodb.data;



/**
 *  aprendoz_desarrolloDB.ReportesTipoPersona
 *  02/04/2014 12:37:42
 * 
 */
public class ReportesTipoPersona {

    private Integer idreportestipopersona;
    private Reportes reportes;
    private TipoPersona tipoPersona;

    public Integer getIdreportestipopersona() {
        return idreportestipopersona;
    }

    public void setIdreportestipopersona(Integer idreportestipopersona) {
        this.idreportestipopersona = idreportestipopersona;
    }

    public Reportes getReportes() {
        return reportes;
    }

    public void setReportes(Reportes reportes) {
        this.reportes = reportes;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

}