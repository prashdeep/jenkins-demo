import com.nineleaps.workshop.model.Employe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private Employe employe;

    @Before
    public void setup(){
        employe = new Employe();
    }
    @Test
    public void testSum(){
            int result = employe.sum(4, 5);
            Assert.assertEquals(9, result);
    }

    @Test
    public void testSumWithNegativeValues(){
        int result = employe.sum(-4, -5);
        Assert.assertEquals(-9, result);
    }

}