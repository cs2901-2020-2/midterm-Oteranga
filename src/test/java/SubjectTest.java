import cs.lab.Subject;
import cs.lab.BarCharMonitor;
import cs.lab.PieChartMonitor;
import org.testng.annotations.Test;

@Test
public class SubjectTest {
    
    @Test
    public void Test1() {
        Subject datasSubject = new Subject();
        datasSubject.Add(6);
        datasSubject.Add(3);
        Assert.equals(datasSubject.getSize(), 2);
    }

    /*
    @Test
    public void testBoil() throws Exception{
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        if(chocolateBoiler.isEmpty() && !chocolateBoiler.isBoiled()){
            throw new Exception("Error");
        }
    }

    @Test
    public void testDrain() throws Exception{
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        if(!chocolateBoiler.isEmpty() && chocolateBoiler.isBoiled()){
            throw new Exception("Error");
        }
    }

     */
}
