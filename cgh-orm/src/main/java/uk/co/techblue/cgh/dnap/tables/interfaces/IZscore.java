/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public interface IZscore extends java.io.Serializable {

	/**
	 * Setter for <code>nhs-cgh.zscore.ZScoreId</code>. 
	 */
	public void setZscoreid(java.lang.Long value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZScoreId</code>. 
	 */
	public java.lang.Long getZscoreid();

	/**
	 * Setter for <code>nhs-cgh.zscore.RegionIntensityId</code>. 
	 */
	public void setRegionintensityid(java.lang.Long value);

	/**
	 * Getter for <code>nhs-cgh.zscore.RegionIntensityId</code>. 
	 */
	public java.lang.Long getRegionintensityid();

	/**
	 * Setter for <code>nhs-cgh.zscore.ZMeanGreenSignal</code>. 
	 */
	public void setZmeangreensignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZMeanGreenSignal</code>. 
	 */
	public java.lang.Double getZmeangreensignal();

	/**
	 * Setter for <code>nhs-cgh.zscore.ZMedianGreenSignal</code>. 
	 */
	public void setZmediangreensignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZMedianGreenSignal</code>. 
	 */
	public java.lang.Double getZmediangreensignal();

	/**
	 * Setter for <code>nhs-cgh.zscore.ZMeanRedSignal</code>. 
	 */
	public void setZmeanredsignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZMeanRedSignal</code>. 
	 */
	public java.lang.Double getZmeanredsignal();

	/**
	 * Setter for <code>nhs-cgh.zscore.ZMedianRedSignal</code>. 
	 */
	public void setZmedianredsignal(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZMedianRedSignal</code>. 
	 */
	public java.lang.Double getZmedianredsignal();

	/**
	 * Setter for <code>nhs-cgh.zscore.ZMeanLogRatio</code>. 
	 */
	public void setZmeanlogratio(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZMeanLogRatio</code>. 
	 */
	public java.lang.Double getZmeanlogratio();

	/**
	 * Setter for <code>nhs-cgh.zscore.ZMedianLogRatio</code>. 
	 */
	public void setZmedianlogratio(java.lang.Double value);

	/**
	 * Getter for <code>nhs-cgh.zscore.ZMedianLogRatio</code>. 
	 */
	public java.lang.Double getZmedianlogratio();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IZscore
	 */
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IZscore from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IZscore
	 */
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IZscore> E into(E into);
}
