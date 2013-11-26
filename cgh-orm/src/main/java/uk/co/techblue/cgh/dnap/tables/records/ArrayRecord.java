/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class ArrayRecord extends org.jooq.impl.UpdatableRecordImpl<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord> implements org.jooq.Record10<java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double>, uk.co.techblue.cgh.dnap.tables.interfaces.IArray {

	private static final long serialVersionUID = 1332246817;

	/**
	 * Setter for <code>nhs-cgh.array.ArrayID</code>. 
	 */
	@Override
	public void setArrayid(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.ArrayID</code>. 
	 */
	@Override
	public java.lang.Long getArrayid() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>nhs-cgh.array.FeatureExtractor_barcode</code>. 
	 */
	@Override
	public void setFeatureextractorBarcode(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.FeatureExtractor_barcode</code>. 
	 */
	@Override
	public java.lang.String getFeatureextractorBarcode() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>nhs-cgh.array.AnyColorPrcntFeatNonUnifOL</code>. 
	 */
	@Override
	public void setAnycolorprcntfeatnonunifol(java.lang.Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.AnyColorPrcntFeatNonUnifOL</code>. 
	 */
	@Override
	public java.lang.Double getAnycolorprcntfeatnonunifol() {
		return (java.lang.Double) getValue(2);
	}

	/**
	 * Setter for <code>nhs-cgh.array.DerivativeLR_spread</code>. 
	 */
	@Override
	public void setDerivativelrSpread(java.lang.Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.DerivativeLR_spread</code>. 
	 */
	@Override
	public java.lang.Double getDerivativelrSpread() {
		return (java.lang.Double) getValue(3);
	}

	/**
	 * Setter for <code>nhs-cgh.array.g_Signal2Noise</code>. 
	 */
	@Override
	public void setGSignal2noise(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.g_Signal2Noise</code>. 
	 */
	@Override
	public java.lang.Double getGSignal2noise() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>nhs-cgh.array.g_SignalIntensity</code>. 
	 */
	@Override
	public void setGSignalintensity(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.g_SignalIntensity</code>. 
	 */
	@Override
	public java.lang.Double getGSignalintensity() {
		return (java.lang.Double) getValue(5);
	}

	/**
	 * Setter for <code>nhs-cgh.array.r_Signal2Noise</code>. 
	 */
	@Override
	public void setRSignal2noise(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.r_Signal2Noise</code>. 
	 */
	@Override
	public java.lang.Double getRSignal2noise() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>nhs-cgh.array.r_SignalIntensity</code>. 
	 */
	@Override
	public void setRSignalintensity(java.lang.Double value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.r_SignalIntensity</code>. 
	 */
	@Override
	public java.lang.Double getRSignalintensity() {
		return (java.lang.Double) getValue(7);
	}

	/**
	 * Setter for <code>nhs-cgh.array.Scan_Date</code>. 
	 */
	@Override
	public void setScanDate(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.Scan_Date</code>. 
	 */
	@Override
	public java.lang.String getScanDate() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>nhs-cgh.array.ShortArrayId</code>. 
	 */
	@Override
	public void setShortarrayid(java.lang.Double value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>nhs-cgh.array.ShortArrayId</code>. 
	 */
	@Override
	public java.lang.Double getShortarrayid() {
		return (java.lang.Double) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.ARRAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.FEATUREEXTRACTOR_BARCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field3() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.ANYCOLORPRCNTFEATNONUNIFOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field4() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.DERIVATIVELR_SPREAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.G_SIGNAL2NOISE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.G_SIGNALINTENSITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.R_SIGNAL2NOISE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field8() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.R_SIGNALINTENSITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.SCAN_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field10() {
		return uk.co.techblue.cgh.dnap.tables.Array.ARRAY.SHORTARRAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getArrayid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFeatureextractorBarcode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value3() {
		return getAnycolorprcntfeatnonunifol();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value4() {
		return getDerivativelrSpread();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getGSignal2noise();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getGSignalintensity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getRSignal2noise();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value8() {
		return getRSignalintensity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getScanDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value10() {
		return getShortarrayid();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IArray from) {
		setArrayid(from.getArrayid());
		setFeatureextractorBarcode(from.getFeatureextractorBarcode());
		setAnycolorprcntfeatnonunifol(from.getAnycolorprcntfeatnonunifol());
		setDerivativelrSpread(from.getDerivativelrSpread());
		setGSignal2noise(from.getGSignal2noise());
		setGSignalintensity(from.getGSignalintensity());
		setRSignal2noise(from.getRSignal2noise());
		setRSignalintensity(from.getRSignalintensity());
		setScanDate(from.getScanDate());
		setShortarrayid(from.getShortarrayid());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IArray> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ArrayRecord
	 */
	public ArrayRecord() {
		super(uk.co.techblue.cgh.dnap.tables.Array.ARRAY);
	}
}
