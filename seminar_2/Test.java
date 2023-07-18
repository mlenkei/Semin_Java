package seminar_2;

public class Test implements INumeric {
    int start;
    int val;

    public Test() {
        start = 0;
        val = 0;
    }

    @Override
    public void reset() {
        val = 0;
        start = 0;
    }

    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}


