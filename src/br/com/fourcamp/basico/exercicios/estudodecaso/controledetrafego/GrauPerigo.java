package br.com.fourcamp.basico.exercicios.estudodecaso.controledetrafego;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum GrauPerigo {

	BAIXO("0", "Baixo"),
	MEDIO("1", "Medio"),
	ALTO("2", "Alto");
	

	public String key;
	public String description;

	public String getKey() {
		return key;
	}

	public String getDescription() {
		return description;
	}

	GrauPerigo(String key, String description) {
		this.key = key;
		this.description = description;
	}

	private static final Map<String, GrauPerigo> Lookup = new HashMap<String, GrauPerigo>();

	static {
		for (GrauPerigo keyValue : EnumSet.allOf(GrauPerigo.class))
			Lookup.put(keyValue.getKey(), keyValue);
	}

	public static GrauPerigo get(String key) {
		return Lookup.get(key);
	}

	public static GrauPerigo getByDescription(String description) {
		for (GrauPerigo keyValue : EnumSet.allOf(GrauPerigo.class)) {
			if (keyValue.getDescription().equals(description))
				return keyValue;
		}
		return null;
	}
}
