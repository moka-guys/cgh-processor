/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Baselineaverages extends org.jooq.impl.TableImpl<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord> {

	private static final long serialVersionUID = -1515922482;

	/**
	 * The singleton instance of <code>nhs-cgh.baselineaverages</code>
	 */
	public static final uk.co.techblue.cgh.dnap.tables.Baselineaverages BASELINEAVERAGES = new uk.co.techblue.cgh.dnap.tables.Baselineaverages();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord> getRecordType() {
		return uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord.class;
	}

	/**
	 * The column <code>nhs-cgh.baselineaverages.BaselineAveragesId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> BASELINEAVERAGESID = createField("BaselineAveragesId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.RegionId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> REGIONID = createField("RegionId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.Chromosome</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.String> CHROMOSOME = createField("Chromosome", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.StartPosition</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> STARTPOSITION = createField("StartPosition", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.StopPosition</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> STOPPOSITION = createField("StopPosition", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMeanGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANGREENSIGNAL = createField("BMeanGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMeanGreenSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANGREENSIGNALSD = createField("BMeanGreenSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMedianGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANGREENSIGNAL = createField("BMedianGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMedianGreenSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANGREENSIGNALSD = createField("BMedianGreenSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMeanRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANREDSIGNAL = createField("BMeanRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMeanRedSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANREDSIGNALSD = createField("BMeanRedSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMedianRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANREDSIGNAL = createField("BMedianRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMedianRedSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANREDSIGNALSD = createField("BMedianRedSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMeanLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANLOGRATIO = createField("BMeanLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMeanLogRatioSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANLOGRATIOSD = createField("BMeanLogRatioSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMedianLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANLOGRATIO = createField("BMedianLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>nhs-cgh.baselineaverages.BMedianLogRatioSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANLOGRATIOSD = createField("BMedianLogRatioSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>nhs-cgh.baselineaverages</code> table reference
	 */
	public Baselineaverages() {
		super("baselineaverages", uk.co.techblue.cgh.dnap.NhsCgh.NHS_CGH);
	}

	/**
	 * Create an aliased <code>nhs-cgh.baselineaverages</code> table reference
	 */
	public Baselineaverages(java.lang.String alias) {
		super(alias, uk.co.techblue.cgh.dnap.NhsCgh.NHS_CGH, uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> getIdentity() {
		return uk.co.techblue.cgh.dnap.Keys.IDENTITY_BASELINEAVERAGES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord> getPrimaryKey() {
		return uk.co.techblue.cgh.dnap.Keys.KEY_BASELINEAVERAGES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord>>asList(uk.co.techblue.cgh.dnap.Keys.KEY_BASELINEAVERAGES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public uk.co.techblue.cgh.dnap.tables.Baselineaverages as(java.lang.String alias) {
		return new uk.co.techblue.cgh.dnap.tables.Baselineaverages(alias);
	}
}
