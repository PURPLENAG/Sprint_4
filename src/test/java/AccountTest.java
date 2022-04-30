import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    String name;
    boolean result;

    public AccountTest(String name, boolean result) {
        this.name = name;
        this.result = result;
    }

    @Test
    public void shouldValidateName() {
        var actual = new Account(name).checkNameToEmboss();
        assertEquals(result, actual);
    }


    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"Т ", false},
                {"Т Ш", true},
                {"Ти Ш", true},
                {"Тимот Шаламеевский", true},
                {"Тимоти Шаламеевский", true},
                {"Тимотей Шаламеевский", false},
                {"ТимотиШаламе", false},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"Тимоти    Шаламе", false},
                {"Chon Sa", true},
                {"천쌍 이에요", true},
                {"789 0", true},
                {"%*& -?", true},
                {"", false},
                {null, false}
        };
    }
}
