/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class RegionintensityreferenceRecord extends org.jooq.impl.UpdatableRecordImpl<uk.co.techblue.cgh.dnap.tables.records.RegionintensityreferenceRecord> implements org.jooq.Record9<java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Long>, uk.co.techblue.cgh.dnap.tables.interfaces.IRegionintensityreference {

	private static final long serialVersionUID = -1590706438;

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.RegionIntensityId</code>. 
	 */
	@Override
	public void setRegionintensityid(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.RegionIntensityId</code>. 
	 */
	@Override
	public java.lang.Long getRegionintensityid() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.RegionId</code>. 
	 */
	@Override
	public void setRegionid(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.RegionId</code>. 
	 */
	@Override
	public java.lang.Long getRegionid() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.MeanGreenSignal</code>. 
	 */
	@Override
	public void setMeangreensignal(java.lang.Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.MeanGreenSignal</code>. 
	 */
	@Override
	public java.lang.Double getMeangreensignal() {
		return (java.lang.Double) getValue(2);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.MedianGreenSignal</code>. 
	 */
	@Override
	public void setMediangreensignal(java.lang.Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.MedianGreenSignal</code>. 
	 */
	@Override
	public java.lang.Double getMediangreensignal() {
		return (java.lang.Double) getValue(3);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.MeanRedSignal</code>. 
	 */
	@Override
	public void setMeanredsignal(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.MeanRedSignal</code>. 
	 */
	@Override
	public java.lang.Double getMeanredsignal() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.MedianRedSignal</code>. 
	 */
	@Override
	public void setMedianredsignal(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.MedianRedSignal</code>. 
	 */
	@Override
	public java.lang.Double getMedianredsignal() {
		return (java.lang.Double) getValue(5);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.MeanLogRatio</code>. 
	 */
	@Override
	public void setMeanlogratio(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.MeanLogRatio</code>. 
	 */
	@Override
	public java.lang.Double getMeanlogratio() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.MedianLogRatio</code>. 
	 */
	@Override
	public void setMedianlogratio(java.lang.Double value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.MedianLogRatio</code>. 
	 */
	@Override
	public java.lang.Double getMedianlogratio() {
		return (java.lang.Double) getValue(7);
	}

	/**
	 * Setter for <code>cgh-processor.regionintensityreference.ArrayId</code>. 
	 */
	@Override
	public void setArrayid(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cgh-processor.regionintensityreference.ArrayId</code>. 
	 */
	@Override
	public java.lang.Long getArrayid() {
		return (java.lang.Long) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Long> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Long> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.REGIONINTENSITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.REGIONID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field3() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.MEANGREENSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field4() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.MEDIANGREENSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.MEANREDSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.MEDIANREDSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.MEANLOGRATIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field8() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.MEDIANLOGRATIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE.ARRAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getRegionintensityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getRegionid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value3() {
		return getMeangreensignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value4() {
		return getMediangreensignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getMeanredsignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getMedianredsignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getMeanlogratio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value8() {
		return getMedianlogratio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getArrayid();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IRegionintensityreference from) {
		setRegionintensityid(from.getRegionintensityid());
		setRegionid(from.getRegionid());
		setMeangreensignal(from.getMeangreensignal());
		setMediangreensignal(from.getMediangreensignal());
		setMeanredsignal(from.getMeanredsignal());
		setMedianredsignal(from.getMedianredsignal());
		setMeanlogratio(from.getMeanlogratio());
		setMedianlogratio(from.getMedianlogratio());
		setArrayid(from.getArrayid());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IRegionintensityreference> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RegionintensityreferenceRecord
	 */
	public RegionintensityreferenceRecord() {
		super(uk.co.techblue.cgh.dnap.tables.Regionintensityreference.REGIONINTENSITYREFERENCE);
	}
}
