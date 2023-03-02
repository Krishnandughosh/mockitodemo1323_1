package mockitodemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;


public class MockAnnotation {

    @Mock
    List<String> mcList;

    @Before
    public void setUP() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMock() {
        when(mcList.get(0)).thenReturn("HI");
        Assert.assertEquals("HI",mcList.get(0));
    }

}
