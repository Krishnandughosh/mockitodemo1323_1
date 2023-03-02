package mockitodemo;
  import org.junit.Assert;
  import org.junit.Before;
  import org.junit.Test;
  import org.mockito.InjectMocks;
  import org.mockito.Mock;
  import org.mockito.MockitoAnnotations;

  import java.util.List;

  import static org.mockito.Mockito.*;

public class InjectMockTest {

  @Mock
  List<String> mcList;

  @InjectMocks
  Employee mEmp;

  @Before
  public void setUp(){
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testMcEmp(){
    when(mcList.get(0)).thenReturn("Tom");
    when(mcList.size()).thenReturn(1);

    Assert.assertEquals(1,mcList.size());
    Assert.assertEquals("Tom",mcList.get(0));
    System.out.println(mcList.get(0));
    Assert.assertEquals("Tom",mEmp.getEmpName().get(0));
    System.out.println(mEmp.getEmpName().get(0));
  }

}
class Employee{
  public List<String> getEmpName() {
    return empName;
  }

  public void setEmpName(List<String> empName) {
    this.empName = empName;
  }

  List<String> empName;


}
