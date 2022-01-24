package com.jhunter.utility;


public class Pair<U, V> {
    public U first;
    public V second;

    // Constructs a new Pair with specified values
    private Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    // Factory method for creating a Typed Pair immutable instance
    public static <U, V> Pair<U, V> of(U first, V second) {
        return new Pair<U, V>(first, second);
    }
}
