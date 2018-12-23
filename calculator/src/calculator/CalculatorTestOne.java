package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTestOne {

    @Test
    public void testCalculator(){
        try{
            Calculator lc = new Calculator();
            lc.fields[0].setText("QWERTYASDFGHZXCVBN 1234567890"); //текст
            lc.calculate();
            Assert.assertTrue("29".equals(lc.fields[1].getText())); //подсчет количества символов в тексте
        }
        catch(Exception e){
            Assert.fail("Проверьте правильность входных значений");
        }

    }
}