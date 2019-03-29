package com.serli.tp9;

public interface Printable {

	default void print() {
		System.out.println(this);
	}
}
