import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MainTest {

    ArrayList<Integer> alist = new ArrayList<>();

    @BeforeEach
    void init() {
        alist = new ArrayList<>();
        alist.add(3);
        alist.add(2);
        alist.add(5);
    }

    @Test
    void doesContainWorkIfContains() {

        assertTrue(Main.doesContain(alist, 3), "2, 3, 5 should contain 3");

    }
    @Test
    void doesContainWorkIfDoesNotContain() {

        assertFalse(Main.doesContain(alist, 8), "2, 3, 5 should not contain 8");

    }
    @Test
    void doesContainWorkIfListIsEmpty() {
        ArrayList<Integer> blist = new ArrayList<>();

        assertFalse(Main.doesContain(blist, 3), "empty list should not contain 3");
    }

}