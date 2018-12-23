package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTestTwo {

    @Test
    public void testCalculator(){
        try{
            Calculator lc = new Calculator();
            lc.fields[0].setText("GitHub Inc. is a web-based hosting service for version control using Git. It is mostly used for computer code."); //текст
            lc.calculate();
            Assert.assertTrue("110".equals(lc.fields[1].getText())); //подсчет количества символов в тексте
        }
        catch(Exception e){
            Assert.fail("Проверьте правильность входных значений");
        }

    }
}