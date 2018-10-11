import org.junit.Assert;
import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;

public class ExpertTest {
     public Expert exp= new Expert();

//    @Test
//    public void expressionAddTest(){
//        Integer res = exp.add((Integer)2);
//        Assert.assertEquals((Integer)3, res);
//        Assert.assertTrue(Boolean.FALSE);
//    }

    @Test
    public void expressionPowTestInt(){
        Integer res = exp.powerInt((Integer)2,(Integer)10);
        Assert.assertEquals((Integer)1024, res);//passed test
    }

    //tema

//    @Test
//    public void expressionPowTestIntFail(){
//        Integer res = exp.powerInt((Integer)2,(Integer)10);
//        Assert.assertNotEquals((Integer)1024, res);//failed test
//    }
//
//    @Test
//    public void expressionPowTestDoubleFail(){
//        Double res = exp.powerDouble((Double)5.6,(Double)2.0);
//        Assert.assertEquals((Double)1024.3, res);//failed test
//    }
    @Test
    public void expressionPowTestDouble(){
        Double res = exp.powerDouble((Double)2.7,(Double)2.0);
        Assert.assertTrue(res == 7.290000000000001);//passed test
    }
    @Test
    public void expressionPowTestLong(){
        long res = exp.powerLong((long) 147,(long)4);
        Assert.assertEquals((long)466948881, res);//passed test
    }
//    @Test
//    public void expressionPowTestLongFailed(){
//        long res = exp.powerLong((long) 147,(long)4);
//        Assert.assertFalse(res == 466948881);//failed test
//    }
//    @Test
//    public void rootTestFailed(){
//       float res = exp.root(255);
//       Assert.assertNull(exp);//failed
//    }
    @Test
    public void rootTest(){
        float res = exp.root((Integer)169);
        Assert.assertFalse( res == 169);//passed
    }
//    @Test
//    public void factTestFail(){
//        Integer res = exp.factorial((Integer)12);
//        Assert.assertEquals((Integer)res, (Integer) 12);//failed
//    }
    @Test
    public void factTest(){
        Integer res = exp.factorial((Integer)5);
        Assert.assertTrue(res == 120);//passed
    }

}
