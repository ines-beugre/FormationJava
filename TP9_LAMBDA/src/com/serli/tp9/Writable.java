package com.serli.tp9;

public interface Writable {

	default void print() {
		System.out.println(this);
	}

}
