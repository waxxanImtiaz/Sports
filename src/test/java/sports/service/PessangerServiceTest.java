package sports.service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import sports.util.ArithematicUtil;

import static org.mockito.Mockito.when;
public class PessangerServiceTest extends TestCase {

    PessangerService pessangerService;
    @Mock
    ArithematicUtil arithematicUtil;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testAdd() {
        arithematicUtil = Mockito.mock(ArithematicUtil.class);

        pessangerService = new PessangerService(arithematicUtil);


        int num1 = 12;
        int num2 = 17;
        int expected = 34;

        when(arithematicUtil.add(num1, num2)).thenReturn(expected);

        int actual = pessangerService.add(12, 17);

        assertEquals(34, actual);
    }
}
