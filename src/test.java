////JAKABOS ÁBEL , 2023.05.11, SZ/I/n
import static org.junit.Assert.assertEquals;



import org.junit.Test;



public class test {
    @Test 
    public void tesztellenor(){
        assertEquals(true , ellenor.szame("12"));
    }

    @Test
    public void tesztszamol(){
        assertEquals(20, 0 ,szamol.szamol(5, 4, 1));
    }
}
