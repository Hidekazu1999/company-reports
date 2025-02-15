package br.edu.ifpb.report.controller;

/**
 * @author takayama
 *
 */
public abstract class ReportTemplate {

	public void generate() {
		createDatabaseConnection();
		executeQuery();
		convert();
	}

	public abstract void createDatabaseConnection();

	public abstract void executeQuery();

	public abstract void convert();
	
}
