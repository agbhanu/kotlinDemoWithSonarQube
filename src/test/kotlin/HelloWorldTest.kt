import org.junit.Test

class HelloWorldTest {

    @Test
    public fun testSumOfTwoNum(){
        assert(6==HelloWorld().sumOfTwoNum(2,4))
    }
}