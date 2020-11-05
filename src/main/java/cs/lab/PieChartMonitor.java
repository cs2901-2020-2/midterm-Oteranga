package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class PieChartMonitor{

    private List<Integer> values;

    public PieChartMonitor(List<Integer> tempList){
        values = tempList;
        createData();
    }

    private PieDataSet createData(){
        DefaultPieDataset result = new DefaultPieDataset();
        for(int i = 0; i < values.size(); i ++){
            Dataset.setValue((char)('A' + 1), values.get(i));
        }
        return Dataset;
    }

    public void display(){

    }
}