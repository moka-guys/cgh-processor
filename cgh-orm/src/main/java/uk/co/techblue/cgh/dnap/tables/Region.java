/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Region extends org.jooq.impl.TableImpl<uk.co.techblue.cgh.dnap.tables.records.RegionRecord> {

	private static final long serialVersionUID = 2192601;

	/**
	 * The singleton instance of <code>nhs-cgh.region</code>
	 */
	public static final uk.co.techblue.cgh.dnap.tables.Region REGION = new uk.co.techblue.cgh.dnap.tables.Region();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<uk.co.techblue.cgh.dnap.tables.records.RegionRecord> getRecordType() {
		return uk.co.techblue.cgh.dnap.tables.records.RegionRecord.class;
	}

	/**
	 * The column <code>nhs-cgh.region.RegionID</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionRecord, java.lang.Long> REGIONID = createField("RegionID", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>nhs-cgh.region.Chromosome</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionRecord, java.lang.String> CHROMOSOME = createField("Chromosome", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>nhs-cgh.region.StartPosition</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionRecord, java.lang.Long> STARTPOSITION = createField("StartPosition", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>nhs-cgh.region.StopPosition</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.RegionRecord, java.lang.Long> STOPPOSITION = createField("StopPosition", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>nhs-cgh.region</code> table reference
	 */
	public Region() {
		super("region", uk.co.techblue.cgh.dnap.NhsCgh.NHS_CGH);
	}

	/**
	 * Create an aliased <code>nhs-cgh.region</code> table reference
	 */
	public Region(java.lang.String alias) {
		super(alias, uk.co.techblue.cgh.dnap.NhsCgh.NHS_CGH, uk.co.techblue.cgh.dnap.tables.Region.REGION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<uk.co.techblue.cgh.dnap.tables.records.RegionRecord, java.lang.Long> getIdentity() {
		return uk.co.techblue.cgh.dnap.Keys.IDENTITY_REGION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.RegionRecord> getPrimaryKey() {
		return uk.co.techblue.cgh.dnap.Keys.KEY_REGION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.RegionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.RegionRecord>>asList(uk.co.techblue.cgh.dnap.Keys.KEY_REGION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public uk.co.techblue.cgh.dnap.tables.Region as(java.lang.String alias) {
		return new uk.co.techblue.cgh.dnap.tables.Region(alias);
	}
}
