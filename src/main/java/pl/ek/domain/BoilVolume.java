package pl.ek.domain;

import java.util.Objects;

public class BoilVolume {
    private int value;
    private String unit;

    private BoilVolume(Builder builder) {
        this.value = builder.value;
        this.unit = builder.unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoilVolume that = (BoilVolume) o;
        return value == that.value &&
                Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        return value + "";
    }

    public int getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public BoilVolume() {
    }


    public static final class Builder {
        private int value;
        private String unit;

        public Builder() {
        }

        public Builder value(int value) {
            this.value = value;
            return this;
        }

        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public BoilVolume build() {
            return new BoilVolume(this);
        }
    }
}
