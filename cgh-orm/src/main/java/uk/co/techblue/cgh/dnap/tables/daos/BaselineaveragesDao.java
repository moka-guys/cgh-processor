/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class BaselineaveragesDao extends org.jooq.impl.DAOImpl<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages, java.lang.Long> {

	/**
	 * Create a new BaselineaveragesDao without any configuration
	 */
	public BaselineaveragesDao() {
		super(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES, uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages.class);
	}

	/**
	 * Create a new BaselineaveragesDao with an attached configuration
	 */
	public BaselineaveragesDao(org.jooq.Configuration configuration) {
		super(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES, uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages object) {
		return object.getBaselineaveragesid();
	}

	/**
	 * Fetch records that have <code>BaselineAveragesId IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBaselineaveragesid(java.lang.Long... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BASELINEAVERAGESID, values);
	}

	/**
	 * Fetch a unique record that has <code>BaselineAveragesId = value</code>
	 */
	public uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages fetchOneByBaselineaveragesid(java.lang.Long value) {
		return fetchOne(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BASELINEAVERAGESID, value);
	}

	/**
	 * Fetch records that have <code>RegionId IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByRegionid(java.lang.Long... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.REGIONID, values);
	}

	/**
	 * Fetch records that have <code>BMeanGreenSignal IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeangreensignal(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANGREENSIGNAL, values);
	}

	/**
	 * Fetch records that have <code>BMeanGreenSignalSD IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeangreensignalsd(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANGREENSIGNALSD, values);
	}

	/**
	 * Fetch records that have <code>BMedianGreenSignal IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmediangreensignal(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANGREENSIGNAL, values);
	}

	/**
	 * Fetch records that have <code>BMedianGreenSignalSD IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmediangreensignalsd(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANGREENSIGNALSD, values);
	}

	/**
	 * Fetch records that have <code>BMeanRedSignal IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanredsignal(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANREDSIGNAL, values);
	}

	/**
	 * Fetch records that have <code>BMeanRedSignalSD IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanredsignalsd(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANREDSIGNALSD, values);
	}

	/**
	 * Fetch records that have <code>BMedianRedSignal IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianredsignal(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANREDSIGNAL, values);
	}

	/**
	 * Fetch records that have <code>BMedianRedSignalSD IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianredsignalsd(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANREDSIGNALSD, values);
	}

	/**
	 * Fetch records that have <code>BMeanLogRatio IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanlogratio(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANLOGRATIO, values);
	}

	/**
	 * Fetch records that have <code>BMeanLogRatioSD IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanlogratiosd(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANLOGRATIOSD, values);
	}

	/**
	 * Fetch records that have <code>BMedianLogRatio IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianlogratio(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANLOGRATIO, values);
	}

	/**
	 * Fetch records that have <code>BMedianLogRatioSD IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianlogratiosd(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANLOGRATIOSD, values);
	}

	/**
	 * Fetch records that have <code>BMeanGreenSignal_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeangreensignalM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANGREENSIGNAL_M, values);
	}

	/**
	 * Fetch records that have <code>BMeanGreenSignalSD_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeangreensignalsdM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANGREENSIGNALSD_M, values);
	}

	/**
	 * Fetch records that have <code>BMedianGreenSignal_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmediangreensignalM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANGREENSIGNAL_M, values);
	}

	/**
	 * Fetch records that have <code>BMedianGreenSignalSD_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmediangreensignalsdM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANGREENSIGNALSD_M, values);
	}

	/**
	 * Fetch records that have <code>BMeanRedSignal_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanredsignalM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANREDSIGNAL_M, values);
	}

	/**
	 * Fetch records that have <code>BMeanRedSignalSD_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanredsignalsdM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANREDSIGNALSD_M, values);
	}

	/**
	 * Fetch records that have <code>BMedianRedSignal_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianredsignalM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANREDSIGNAL_M, values);
	}

	/**
	 * Fetch records that have <code>BMedianRedSignalSD_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianredsignalsdM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANREDSIGNALSD_M, values);
	}

	/**
	 * Fetch records that have <code>BMeanLogRatio_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanlogratioM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANLOGRATIO_M, values);
	}

	/**
	 * Fetch records that have <code>BMeanLogRatioSD_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmeanlogratiosdM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEANLOGRATIOSD_M, values);
	}

	/**
	 * Fetch records that have <code>BMedianLogRatio_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianlogratioM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANLOGRATIO_M, values);
	}

	/**
	 * Fetch records that have <code>BMedianLogRatioSD_M IN (values)</code>
	 */
	public java.util.List<uk.co.techblue.cgh.dnap.tables.pojos.Baselineaverages> fetchByBmedianlogratiosdM(java.lang.Double... values) {
		return fetch(uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES.BMEDIANLOGRATIOSD_M, values);
	}
}
