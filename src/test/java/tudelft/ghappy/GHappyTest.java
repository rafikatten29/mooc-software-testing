package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.roman.RomanNumeral;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initialise() {
        this.gHappy = new GHappy();
    }

    @Test
    public void noG() {
        Assertions.assertTrue(this.gHappy.gHappy("hsdoesc"));
    }

    @ParameterizedTest(name = "String = {0}")
    @CsvSource({ "ghtydfs", "serdgrisk", "hdjkddkg" })
    public void oneG (String s) {
        Assertions.assertFalse(this.gHappy.gHappy(s));
    }

    @ParameterizedTest(name = "String = {0}")
    @CsvSource({ "gghtydfs", "serdggrisk", "hdjkddkgg" })
    public void twoG (String s) {
        Assertions.assertTrue(this.gHappy.gHappy(s));
    }

    @ParameterizedTest(name = "String = {0}")
    @CsvSource({ "ggghtydfs", "serdgggrisk", "hdjkddkggg" })
    public void threeG (String s) {
        Assertions.assertTrue(this.gHappy.gHappy(s));
    }

    @ParameterizedTest(name = "String = {0}")
    @CsvSource({ "ggyetssdgg,True", "ggyetssdg,False","gyetssdgg,False","ggyeggtssdgg,True","gyeggtssdgg,False","ggyegtssdgg,False","ggyeggtssdg,False" })
    public void gapG (String s, boolean result) {
        Assertions.assertEquals(result, this.gHappy.gHappy(s));
    }
}
