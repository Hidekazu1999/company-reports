
package br.edu.ifpb.report.service;

/**
 * @author takayama
 *
 */
public abstract class ReportService {
	
	abstract protected Report makeReport();
	
	public void takeReport() {
		Report report = this.makeReport();
		report.generateReport();
	}

}

