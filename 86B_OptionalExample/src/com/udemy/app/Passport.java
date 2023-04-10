package com.udemy.app;

import java.util.Optional;

public class Passport {
	private Optional <Stamp> stamp;

	public Passport(Optional<Stamp> stamp) {
		this.stamp = stamp;
	}

	public Optional<Stamp> getStamp() {
		return stamp;
	}

	public void setStamp(Optional<Stamp> stamp) {
		this.stamp = stamp;
	}
}
