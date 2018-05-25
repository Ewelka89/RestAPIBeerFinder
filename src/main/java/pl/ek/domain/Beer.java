package pl.ek.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Beer {
    private int id;
    private String name;
    private Double abv;
    private int ibu;
    private int ebc;
    private int srm;
    private double ph;

    @JsonProperty("attenuation_level")
    private int attenuationLevel;

    private Volume volume;
    @JsonProperty("boil_volume")
    private BoilVolume boilVolume;

    private Ingredients ingredients;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return id == beer.id &&
                ibu == beer.ibu &&
                ebc == beer.ebc &&
                srm == beer.srm &&
                Double.compare(beer.ph, ph) == 0 &&
                attenuationLevel == beer.attenuationLevel &&
                Objects.equals(name, beer.name) &&
                Objects.equals(abv, beer.abv) &&
                Objects.equals(volume, beer.volume) &&
                Objects.equals(boilVolume, beer.boilVolume) &&
                Objects.equals(ingredients, beer.ingredients);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, abv, ibu, ebc, srm, ph, attenuationLevel, volume, boilVolume, ingredients);
    }

    @Override
    public String toString() {
        return "Beer: " +
                " name='" + name +
                ", alcohol by volume=" + abv +
                ", attenuationLevel=" + attenuationLevel +
                ", volume=" + volume +
                ", boilVolume=" + boilVolume +
                ", ingredients=" + ingredients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Beer() {
    }

    private Beer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.abv = builder.abv;
        this.ibu = builder.ibu;
        this.ebc = builder.ebc;
        this.srm = builder.srm;
        this.ph = builder.ph;
        this.attenuationLevel = builder.attenuationLevel;
        this.volume = builder.volume;
        this.boilVolume = builder.boilVolume;
        this.ingredients = builder.ingredients;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAbv() {
        return abv;
    }

    public int getIbu() {
        return ibu;
    }

    public int getEbc() {
        return ebc;
    }

    public int getSrm() {
        return srm;
    }

    public double getPh() {
        return ph;
    }

    public int getAttenuationLevel() {
        return attenuationLevel;
    }

    public Volume getVolume() {
        return volume;
    }

    public BoilVolume getBoilVolume() {
        return boilVolume;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public static final class Builder {
        private int id;
        private String name;
        private Double abv;
        private int ibu;
        private int ebc;
        private int srm;
        private double ph;
        private int attenuationLevel;
        private Volume volume;
        private BoilVolume boilVolume;
        private Ingredients ingredients;


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder abv(Double abv) {
            this.abv = abv;
            return this;
        }

        public Builder ibu(int ibu) {
            this.ibu = ibu;
            return this;
        }

        public Builder ebc(int ebc) {
            this.ebc = ebc;
            return this;
        }

        public Builder srm(int srm) {
            this.srm = srm;
            return this;
        }

        public Builder ph(double ph) {
            this.ph = ph;
            return this;
        }

        public Builder attenuationLevel(int attenuationLevel) {
            this.attenuationLevel = attenuationLevel;
            return this;
        }

        public Builder volume(Volume volume) {
            this.volume = volume;
            return this;
        }

        public Builder boilVolume(BoilVolume boilVolume) {
            this.boilVolume = boilVolume;
            return this;
        }

        public Builder ingredients(Ingredients ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Beer build() {
            return new Beer(this);
        }
    }
}
