package api;

// extends Object 기본
public class Value {
    int Value;

    public Value(int value) {
        Value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Value other = (Value) obj;
        if (Value != other.Value)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Value [Value=" + Value + "]";
    }

}
