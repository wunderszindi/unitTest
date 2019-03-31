import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MainTest {

    @Test
    void doesContainWork() {
        //Main main = new Main();
        ArrayList<Integer> blist = new ArrayList<>();
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(3);
        alist.add(2);
        alist.add(5);

        assertTrue(Main.doesContain(alist, 3), "2, 3, 5 should contain 3");
        assertFalse(Main.doesContain(alist, 8), "2, 3, 5 should not contain 8");
        assertFalse(Main.doesContain(blist, 3), "empty list should not contain 3");

    }

}