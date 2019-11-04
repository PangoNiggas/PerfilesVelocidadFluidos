/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptoño;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 


//import java.awt.Dimension;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.xy.XYDataset;
//import org.jfree.data.xy.XYSeries;
//import org.jfree.data.xy.XYSeriesCollection;

public class ChartTest extends javax.swing.JFrame {

    public ChartTest(float x1, float x2, float x3, float x4){
        super("Grafica");   
        setLocationRelativeTo(null);
        JFreeChart barChart = ChartFactory.createBarChart(
         "Perfil de velocidad en rampa",           
         "Vuelta",            
         "X",            
         createDataset(x1, x2, x3, x4),          
         PlotOrientation.HORIZONTAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      add(chartPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack(); 
    }
    private CategoryDataset createDataset(float x1, float x2, float x3, float x4) {
      final String v1 = "Vuelta #1";        
      final String v2 = "Vuelta #2";        
      final String v3 = "Vuelta #3";
      final String v4 = "Vuelta #4";     
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( x1 , v1 , v1);                  

      dataset.addValue( x2 , v2 , v2);        

      dataset.addValue( x3 , v3 , v3);        
            
      dataset.addValue( x4 , v4 , v4); 
      
      return dataset; 
   }
    
//    public ChartTest() {
//        XYSeries Goals = new XYSeries("Goals Scored");
//        Goals.add(1, 1.0);
//        Goals.add(2, 3.0);
//        Goals.add(3, 2.0);
//        Goals.add(4, 0.0);
//        Goals.add(5, 3.0);
//        XYDataset xyDataset = new XYSeriesCollection(Goals);
//        JFreeChart chart = ChartFactory.createXYLineChart(
//            "Goals Scored Over Time", "Fixture Number", "Goals",
//            xyDataset, PlotOrientation.VERTICAL, true, true, false);
//        ChartPanel cp = new ChartPanel(chart) {
//
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(320, 240);
//            }
//        };
//        add(cp);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        pack();
//    }
}