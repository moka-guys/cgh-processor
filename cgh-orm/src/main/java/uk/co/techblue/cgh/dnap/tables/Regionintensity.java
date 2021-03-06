/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Regionintensity extends org.jooq.impl.TableImpl<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord> {

	private static final long serialVersionUID = -1255918603;

	/**
	 * The singleton instance of <code>cgh-processor.regionintensity</code>
	 */
	public static final uk.co.techblue.cgh.dnap.tables.Regionintensity REGIONINTENSITY = new uk.co.techblue.cgh.dnap.tables.Regionintensity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord> getRecordType() {
		return uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord.class;
	}

	/**
	 * The column <code>cgh-processor.regionintensity.RegionIntensityId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Long> REGIONINTENSITYID = createField("RegionIntensityId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.regionintensity.RegionId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Long> REGIONID = createField("RegionId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.regionintensity.MeanGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Double> MEANGREENSIGNAL = createField("MeanGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.regionintensity.MedianGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Double> MEDIANGREENSIGNAL = createField("MedianGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.regionintensity.MeanRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Double> MEANREDSIGNAL = createField("MeanRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.regionintensity.MedianRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Double> MEDIANREDSIGNAL = createField("MedianRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.regionintensity.MeanLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Double> MEANLOGRATIO = createField("MeanLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.regionintensity.MedianLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Double> MEDIANLOGRATIO = createField("MedianLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.regionintensity.ArrayId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Long> ARRAYID = createField("ArrayId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>cgh-processor.regionintensity</code> table reference
	 */
	public Regionintensity() {
		super("regionintensity", uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR);
	}

	/**
	 * Create an aliased <code>cgh-processor.regionintensity</code> table reference
	 */
	public Regionintensity(java.lang.String alias) {
		super(alias, uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR, uk.co.techblue.cgh.dnap.tables.Regionintensity.REGIONINTENSITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord, java.lang.Long> getIdentity() {
		return uk.co.techblue.cgh.dnap.Keys.IDENTITY_REGIONINTENSITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord> getPrimaryKey() {
		return uk.co.techblue.cgh.dnap.Keys.KEY_REGIONINTENSITY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.RegionintensityRecord>>asList(uk.co.techblue.cgh.dnap.Keys.KEY_REGIONINTENSITY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public uk.co.techblue.cgh.dnap.tables.Regionintensity as(java.lang.String alias) {
		return new uk.co.techblue.cgh.dnap.tables.Regionintensity(alias);
	}
}
