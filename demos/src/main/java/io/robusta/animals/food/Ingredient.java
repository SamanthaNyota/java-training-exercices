package io.robusta.animals.food;

import io.robusta.HasPrice;

public interface Ingredient extends Nutriment, HasPrice {

    @Override
    default public int compareTo(HasPrice other){
        return Integer.valueOf(this.getPrice()).compareTo(other.getPrice());

    }
}
