package com.proghub.covid;

public enum Region {
	// enum instances
	STEREA_ELLADA("Στερεά Ελλάδα"),
	MACEDONIA("Μακεδονία"),
	THRAKI("Θράκη"),
	IPIROS("Ήπειρος"),
	THESSALIA("Θεσσαλία"),
	IONIO("Ιόνιο"),
	AIGAIO("Αιγαίο"),
	PELOPPONISOS("Πελοππόνησος"),
	KRITI("Κρήτη");
	
	// instance field
	private String name; // region name
	
	// Constructor
	private Region(String name) {
		this.name = name;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}
}
