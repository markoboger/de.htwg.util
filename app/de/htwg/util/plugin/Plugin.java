package de.htwg.util.plugin;

public interface Plugin {
	
	public String getMenuEntry();
	
	// Use a single character string for the key
	public String getMenuKey();
	
	public void printTUI();
	
	public boolean processInputLine(String line);

}
