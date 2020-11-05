package cs.lab;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import java.util.ArrayList;
import java.util.List;

public class BarCharMonitor{

    private List<Integer> values;
    private static final long serialVersionUID = 1L;

    public BarCharMonitor(List<Integer> tempList){
        values = tempList;
        var dataset = createData();
        JFreeChart histogram = ChartFactory.createHistogram("Normal distribution","y values", "x values", dataset);
        ChartUtils.saveChartAsPNG(new File("histogram.png"), histogram, 450, 400);
    }

    private var createData(){
        var Dataset = new HistogramDataSet();
        for(int i = 0; i < values.size(); i ++){
            Dataset.setValue((char)('A' + 1), values, values.size());
        }
        return Dataset;
    }

}