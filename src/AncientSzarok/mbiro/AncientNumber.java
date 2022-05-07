package AncientSzarok.mbiro;

import java.util.Arrays;

public enum AncientNumber {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int val;

    AncientNumber(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static AncientNumber getValue(char ch){
        return Arrays.stream(AncientNumber.values())
                .filter(ancientNumbers -> ancientNumbers.name().charAt(0) == ch)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%c is not a valid char", ch)));
    }
}
