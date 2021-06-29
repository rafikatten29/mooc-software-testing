package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class MirrorTest {

    private Mirror mirror;

    @BeforeEach
    public void initialise() {

        this.mirror = new Mirror();
    }

    @ParameterizedTest(name = "String = {0}")
    @CsvSource({ "asdfghja,a", "abhdwuhdba,ab", "abcyhdgcba,abc","aa,aa" })
    public void evenLength (String s, String pattern) {
        Assertions.assertEquals(pattern, this.mirror.mirrorEnds(s));
    }

    @ParameterizedTest(name = "String = {0}")
    @CsvSource({ "asdfhja,a", "abhduhdba,ab", "abcydgcba,abc","a,a","aba,aba" })
    public void oddLength (String s, String pattern) {
        Assertions.assertEquals(pattern, this.mirror.mirrorEnds(s));
    }
}
