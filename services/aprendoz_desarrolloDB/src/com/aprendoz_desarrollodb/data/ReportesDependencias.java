
package com.aprendoz_desarrollodb.data;



/**
 *  aprendoz_desarrolloDB.ReportesDependencias
 *  02/19/2014 10:16:55
 * 
 */
public class ReportesDependencias {

    private Integer idReporteDependencia;
    private TipoDependencia tipoDependencia;
    private Reportes reportes;

    public Integer getIdReporteDependencia() {
        return idReporteDependencia;
    }

    public void setIdReporteDependencia(Integer idReporteDependencia) {
        this.idReporteDependencia = idReporteDependencia;
    }

    public TipoDependencia getTipoDependencia() {
        return tipoDependencia;
    }

    public void setTipoDependencia(TipoDependencia tipoDependencia) {
        this.tipoDependencia = tipoDependencia;
    }

    public Reportes getReportes() {
        return reportes;
    }

    public void setReportes(Reportes reportes) {
        this.reportes = reportes;
    }

}
