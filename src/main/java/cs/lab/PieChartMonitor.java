package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class PieChartMonitor{

    private List<Integer> values;

    public PieChartMonitor(List<Integer> tempList){
        values = tempList;
        super("Comparisons");
        PieDataSet dataset = createData();
        JFreeChart chart = createChart(dataset, "Results");
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

    private PieDataSet createData(){
        DefaultPieDataset result = new DefaultPieDataset();
        for(int i = 0; i < values.size(); i ++){
            Dataset.setValue((char)('A' + 1), values.get(i));
        }
        return Dataset;
    }

    public void createChart(PieDataset dataset, String title){
        JFreeChart chart = ChartFactory.createPieChart3D(
            title,                  
            dataset,                
            true,                   
            true,
            false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
}