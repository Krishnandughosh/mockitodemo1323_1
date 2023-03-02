package mockitodemo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class MyServiceCalTest {
    MyServiceCal m = new MyServiceCal();
    @Test
    public void testadd(){

        int r=m.add(2,3);

        Assert.assertEquals(5,r);
    }

    @Test
    public void testMock(){
        MyServiceCal mc= mock(MyServiceCal.class);
        Mockito.when(mc.add(2,3)).thenReturn(5);

        Assert.assertEquals(5,mc.add(2,3));
        verify(mc).add(2,3);
//        verify(m.add(2,3));

    }

    @Test
    public void mockList(){
        List<String> mcList= mock(List.class);
        when(mcList.size()).thenReturn(5);
        Assert.assertEquals(5,mcList.size());
    }


}
