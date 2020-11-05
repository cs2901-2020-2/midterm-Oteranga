package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class BarCharMonitor{

    private List<Integer> values;

    public BarCharMonitor(List<Integer> tempList){
        values = tempList;
        createData();
    }

    private PieDataSet createData(){
        var Dataset = new HistogramDataSet();
        for(int i = 0; i < values.size(); i ++){
            Dataset.setValue((char)('A' + 1), values, values.size());
        }
        return Dataset;
    }

    
    public void display(){
        
    }
}