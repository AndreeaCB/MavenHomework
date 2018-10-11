import org.junit.*;

public class TestBasic{
    static Basic basic;

    static public void printMes(String mes){
        System.out.println(mes);
    }

    @BeforeClass
     static public void setUp(){
        basic= new Basic();
        printMes("Setup");
    }

    @Before
     public void setUpTest(){
        printMes("SetupForEachTest");
    }

//    @Test
//    public void addDouble(){
//
//        Double result= basic.add(2.5,2.5);
//        //Object obj= null;
//
//        Assert.assertEquals("message in case of failure for Double: ",(Double)5.1, result);
//        //Assert.assertNotNull("mesaj not null", obj);
//        //Assert.assertNotNull(basic);
//    }
//
//    @Test
//    public void testAddMaxInts(){
//        Integer result= basic.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
//        Assert.fail();
//
//    }

    @Test
    public void testAddSingleValue(){
        Integer result=basic.add();
        Assert.assertNotEquals((Integer)1, result);

    }

    //tema
//    @Test
//    public void addInt(){
//
//        Integer result= basic.add(2,3);
//        Assert.assertTrue("message for failure: ", basic.add(2,3) == 7);//failed test
//    }
    @Test
    public void addIntFail(){

        Integer result= basic.add(2,3);
        Assert.assertEquals("message in case of failure for Integer: ",(Integer)5, result);//passed test
    }

//    @Test
//    public void addLong(){
//
//        long result= basic.add(123343,3321312);
//        Assert.assertFalse("message for failure: ", basic.add(2,3) == 5);//failed test
//    }
    @Test
    public void addLongFail(){

        long result= basic.add(123343,332131);
        Assert.assertEquals("message in case of failure for Integer: ",(long)455474, result);//passed test
    }

    @Test
    public void substractInt(){
        Integer result = basic.subst(123, 52);
        Assert.assertEquals((Integer)71, result);//passed test
    }
//    @Test
//    public void substractIntFail(){
//        Integer result = basic.subst(123, 52);//failed test
//        Assert.assertNull(basic);
//    }
//
//    @Test
//    public void substractDoubleFail(){
//        Double result = basic.subst(123.96, 52.12);
//        Assert.assertEquals((Double)7.4, result);//fail test
//    }
    @Test
    public void substractDouble(){
        Double result = basic.subst(123.96, 52.12);
        Assert.assertFalse(result == 3.2);//passed test
    }
    @Test
    public void substractLong(){
        long result = basic.subst(123458, 128);
        Assert.assertEquals((long)123330, result);//passed test
    }
//    @Test
//    public void substractLongFail(){
//        long result = basic.subst(123458, 128);
//        Object obj= null;
//        Assert.assertNotNull(obj);//fail test
//    }

    @Test
    public void multiplyInt(){
        Integer result = basic.multpl(2, 6);
        Assert.assertEquals((Integer)12, result);//passed test
    }
//    @Test
//    public void multiplyIntFail(){
//        Integer result = basic.multpl(2, 23);
//        Assert.assertNotEquals((Integer)46, result);//failed test
//    }
//    @Test
//    public void multiplyDouble(){
//        Double result = basic.multpl(2.1, 3.2);
//        Assert.assertEquals((Double)6.72, result);//failed test
//    }
    @Test
    public void multiplyDoubleFail(){
        Double result = basic.multpl(2.1, 3.2);
        Object obj= null;
        Assert.assertNull(obj);//passed test
    }

    @Test
    public void multiplyLong(){
        long result = basic.multpl(234783, 1000);
        Assert.assertEquals((long)234783000, result);//passed test
    }
//    @Test
//    public void multiplyLongFail(){
//        long result = basic.multpl(234783, 1000);
//        Assert.assertTrue(result == 515645156);//failed test
//    }

    @Test
    public void divideInt(){
        Integer result = basic.divide(187, 11);
        Assert.assertEquals((Integer)17, result);//passed test
    }
//    @Test
//    public void divideIntFail(){
//        Integer result = basic.divide(187, 11);
//        Assert.assertFalse(result == 17);//failed test
//    }
//
//    @Test
//    public void divideDoubleFail(){
//        Double result = basic.divide(15.3, 2.1);
//        Assert.assertEquals((Double)7.285, result);//failed test
//    }
    @Test
    public void divideDouble(){
        Double result = basic.divide(15.3, 2.1);
        Assert.assertNotNull(basic);//passed test
    }
    @Test
    public void divideLong(){
        long result = basic.divide(2578945, 5);
        Assert.assertEquals((long)515789, result);//passed test
    }
//    @Test
//    public void divideLongFail(){
//        long result = basic.divide(2578945, 5);
//        Assert.assertEquals((long)5789, result);//failed test
//    }

}
