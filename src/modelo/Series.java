/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import graficarfreechart.GraficarFreeChart;
import graficarfreechart.LineChartSample;
import javafx.scene.chart.XYChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Daniel
 */
public class Series {

    GraficarFreeChart chart;

    public Series() {
        chart = new GraficarFreeChart("Browser Usage Statistics", "Which Browser are you using?");

    }

    public void mostrar() {
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
    final XYSeriesCollection dataset = new XYSeriesCollection();

    public void addSerie(double x1,double y1,double x2,double y2,String Restriccion) {
        final XYSeries serie = new XYSeries(Restriccion);
        serie.add(y2, x2);
        serie.add(y1,x1);
       
        chart.anadirserie(serie);
    }
}
