package sports.dao;

import junit.framework.TestCase;
import org.junit.Before;
import org.mockito.Mockito;
import sports.beans.Pessanger;
import org.junit.Test;
import org.mockito.Mock;
import sports.exceptions.PessangerDoesNotFoundException;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
public class PessangerDaoTest extends TestCase {

    PessangerDao pessangerDao;
    Pessanger pessanger;

    @Test
    public void testGetPessenger() {
        pessangerDao = Mockito.mock(PessangerDao.class);
        pessanger = Mockito.mock(Pessanger.class);

        pessanger.setId(3);
        System.out.println(pessanger);
        when(pessangerDao.getPessenger(3)).thenReturn(pessanger);
//        when(pessangerDao.getPessenger(6)).thenThrow(PessangerDoesNotFoundException.class);


        assertEquals(pessanger,pessangerDao.getPessenger(3));
//        assert(pessanger,pessangerDao.getPessenger(6));

//        doThrow(PessangerDoesNotFoundException.class);
//        doThrow(PessangerDoesNotFoundException.class).when(pessangerDao.getPessenger(6));

    }
}
