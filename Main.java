import java.util.function.*;


class Operator {


    public static LongBinaryOperator binaryOperator = (x,y) -> {
        long sum  = 0;
        for (long i=x; i <= y; i++) {
            if (x == y) {
                sum = y;
            }
            sum *= i;
        }
        return sum;
    };
}
