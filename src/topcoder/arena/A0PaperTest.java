package topcoder.arena;

import static org.junit.jupiter.api.Assertions.*;

class A0PaperTest {

    @org.junit.jupiter.api.Test
    void canBuild() {
        assertEquals("Possible", A0Paper.canBuild(new int[]{0, 2}));
    }

    @org.junit.jupiter.api.Test
    void canBuildImpossible(){
        assertEquals("Impossible", A0Paper.canBuild(new int[]{0,0,0,0,15}));
    }

}