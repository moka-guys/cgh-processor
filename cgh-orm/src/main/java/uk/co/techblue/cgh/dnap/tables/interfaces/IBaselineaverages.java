/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public interface IBaselineaverages extends java.io.Serializable {

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BaselineAveragesId</code>. 
	 */
	public void setBaselineaveragesid(java.lang.Long value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BaselineAveragesId</code>. 
	 */
	public java.lang.Long getBaselineaveragesid();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.RegionId</code>. 
	 */
	public void setRegionid(java.lang.Long value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.RegionId</code>. 
	 */
	public java.lang.Long getRegionid();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.Chromosome</code>. 
	 */
	public void setChromosome(java.lang.String value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.Chromosome</code>. 
	 */
	public java.lang.String getChromosome();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.StartPosition</code>. 
	 */
	public void setStartposition(java.lang.Long value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.StartPosition</code>. 
	 */
	public java.lang.Long getStartposition();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.StopPosition</code>. 
	 */
	public void setStopposition(java.lang.Long value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.StopPosition</code>. 
	 */
	public java.lang.Long getStopposition();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMeanGreenSignal</code>. 
	 */
	public void setBmeangreensignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMeanGreenSignal</code>. 
	 */
	public java.lang.Double getBmeangreensignal();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMeanGreenSignalSD</code>. 
	 */
	public void setBmeangreensignalsd(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMeanGreenSignalSD</code>. 
	 */
	public java.lang.Double getBmeangreensignalsd();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMedianGreenSignal</code>. 
	 */
	public void setBmediangreensignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMedianGreenSignal</code>. 
	 */
	public java.lang.Double getBmediangreensignal();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMedianGreenSignalSD</code>. 
	 */
	public void setBmediangreensignalsd(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMedianGreenSignalSD</code>. 
	 */
	public java.lang.Double getBmediangreensignalsd();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMeanRedSignal</code>. 
	 */
	public void setBmeanredsignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMeanRedSignal</code>. 
	 */
	public java.lang.Double getBmeanredsignal();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMeanRedSignalSD</code>. 
	 */
	public void setBmeanredsignalsd(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMeanRedSignalSD</code>. 
	 */
	public java.lang.Double getBmeanredsignalsd();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMedianRedSignal</code>. 
	 */
	public void setBmedianredsignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMedianRedSignal</code>. 
	 */
	public java.lang.Double getBmedianredsignal();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMedianRedSignalSD</code>. 
	 */
	public void setBmedianredsignalsd(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMedianRedSignalSD</code>. 
	 */
	public java.lang.Double getBmedianredsignalsd();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMeanLogRatio</code>. 
	 */
	public void setBmeanlogratio(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMeanLogRatio</code>. 
	 */
	public java.lang.Double getBmeanlogratio();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMeanLogRatioSD</code>. 
	 */
	public void setBmeanlogratiosd(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMeanLogRatioSD</code>. 
	 */
	public java.lang.Double getBmeanlogratiosd();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMedianLogRatio</code>. 
	 */
	public void setBmedianlogratio(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMedianLogRatio</code>. 
	 */
	public java.lang.Double getBmedianlogratio();

	/**
	 * Setter for <code>nhs-cgh.baselineaverages.BMedianLogRatioSD</code>. 
	 */
	public void setBmedianlogratiosd(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.baselineaverages.BMedianLogRatioSD</code>. 
	 */
	public java.lang.Double getBmedianlogratiosd();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IBaselineaverages
	 */
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IBaselineaverages from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IBaselineaverages
	 */
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IBaselineaverages> E into(E into);
}
