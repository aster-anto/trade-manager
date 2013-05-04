/* ===========================================================
 * TradeManager : a application to trade strategies for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Project Info:  org.trade
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Oracle, Inc.
 * in the United States and other countries.]
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Original Author:  Simon Allen;
 * Contributor(s):   -;
 *
 * Changes
 * -------
 *
 */
package org.trade.persistent.dao;

// Generated Feb 21, 2011 12:43:33 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.jfree.data.time.RegularTimePeriod;
import org.trade.core.dao.Aspect;

/**
 * Candle generated by hbm2java
 * 
 * @author Simon Allen
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "candle")
public class Candle extends Aspect implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7644763985378994305L;
	private Tradingday tradingday;
	private Contract contract;
	private BigDecimal close;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal open;
	private String period;
	private Date endPeriod;
	private Date startPeriod;
	private Integer tradeCount;
	private Long volume;
	private BigDecimal vwap;
	private Integer barSize;
	private Date lastUpdateDate;

	public Candle() {
	}

	/**
	 * Constructor for Candle.
	 * 
	 * @param tradingday
	 *            Tradingday
	 * @param contract
	 *            Contract
	 */
	public Candle(Contract contract, Tradingday tradingday,
			RegularTimePeriod period) {
		this.setTradingday(tradingday);
		this.setContract(contract);
		this.setPeriod(period.toString());
		this.setStartPeriod(period.getStart());
		this.setEndPeriod(period.getEnd());
		int barSize = (int) ((period.getEnd().getTime() - period.getStart()
				.getTime()) / 1000);
		this.setBarSize(barSize);
	}

	/**
	 * Constructor for Candle.
	 * 
	 * @param contract
	 *            Contract
	 * @param open
	 *            double
	 * @param high
	 *            double
	 * @param low
	 *            double
	 * @param close
	 *            double
	 * @param lastUpdateDate
	 *            Date
	 */
	public Candle(Contract contract, RegularTimePeriod period, double open,
			double high, double low, double close, Date lastUpdateDate) {
		this.setContract(contract);
		this.setPeriod(period.toString());
		this.setStartPeriod(period.getStart());
		this.setEndPeriod(period.getEnd());
		int barSize = (int) ((period.getEnd().getTime() - period.getStart()
				.getTime()) / 1000);
		this.setBarSize(barSize);
		this.setOpen(new BigDecimal(open));
		this.setClose(new BigDecimal(close));
		this.setHigh(new BigDecimal(high));
		this.setLow(new BigDecimal(low));
		this.setLastUpdateDate(lastUpdateDate);
	}

	/**
	 * Constructor for Candle.
	 * 
	 * @param contract
	 *            Contract
	 * @param open
	 *            double
	 * @param high
	 *            double
	 * @param low
	 *            double
	 * @param close
	 *            double
	 * @param volume
	 *            long
	 * @param vwap
	 *            double
	 * @param tradeCount
	 *            int
	 * @param lastUpdateDate
	 *            Date
	 */
	public Candle(Contract contract, RegularTimePeriod period, double open,
			double high, double low, double close, long volume, double vwap,
			int tradeCount, Date lastUpdateDate) {
		this.setContract(contract);
		this.setPeriod(period.toString());
		this.setStartPeriod(period.getStart());
		this.setEndPeriod(period.getEnd());
		int barSize = (int) ((period.getEnd().getTime() - period.getStart()
				.getTime()) / 1000);
		this.setBarSize(barSize);
		this.setOpen(new BigDecimal(open));
		this.setClose(new BigDecimal(close));
		this.setHigh(new BigDecimal(high));
		this.setLow(new BigDecimal(low));
		this.setVolume(new Long(volume));
		this.setVwap(new BigDecimal(vwap));
		this.setTradeCount(new Integer(tradeCount));
		this.setLastUpdateDate(lastUpdateDate);
	}

	/**
	 * Constructor for Candle.
	 * 
	 * @param contract
	 *            Contract
	 * @param period
	 *            RegularTimePeriod
	 * @param open
	 *            double
	 * @param high
	 *            double
	 * @param low
	 *            double
	 * @param close
	 *            double
	 * @param volume
	 *            long
	 * @param vwap
	 *            double
	 * @param tradeCount
	 *            int
	 * @param lastUpdateDate
	 *            Date
	 */
	public Candle(Contract contract, Tradingday tradingday,
			RegularTimePeriod period, double open, double high, double low,
			double close, long volume, double vwap, int tradeCount,
			Date lastUpdateDate) {
		this.setTradingday(tradingday);
		this.setContract(contract);
		this.setPeriod(period.toString());
		int barSize = (int) ((period.getEnd().getTime() - period.getStart()
				.getTime()) / 1000);
		this.setBarSize(barSize);
		this.setStartPeriod(period.getStart());
		this.setEndPeriod(period.getEnd());
		this.setOpen(new BigDecimal(open));
		this.setClose(new BigDecimal(close));
		this.setHigh(new BigDecimal(high));
		this.setLow(new BigDecimal(low));
		this.setVolume(new Long(volume));
		this.setVwap(new BigDecimal(vwap));
		this.setTradeCount(new Integer(tradeCount));
		this.setLastUpdateDate(lastUpdateDate);
	}

	/**
	 * Constructor for Candle.
	 * 
	 * @param tradingday
	 *            Tradingday
	 * @param contract
	 *            Contract
	 * @param open
	 *            BigDecimal
	 * @param high
	 *            BigDecimal
	 * @param low
	 *            BigDecimal
	 * @param close
	 *            BigDecimal
	 * @param period
	 *            String
	 * @param endPeriod
	 *            Date
	 * @param startPeriod
	 *            Date
	 * @param tradeCount
	 *            Integer
	 * @param volume
	 *            Long
	 * @param vwap
	 *            BigDecimal
	 */
	public Candle(Contract contract, Tradingday tradingday,
			RegularTimePeriod period, BigDecimal open, BigDecimal high,
			BigDecimal low, BigDecimal close, Date endPeriod, Date startPeriod,
			Integer tradeCount, Long volume, BigDecimal vwap,
			Date lastUpdateDate) {
		this.setTradingday(tradingday);
		this.setContract(contract);
		this.setPeriod(period.toString());
		this.setStartPeriod(period.getStart());
		this.setEndPeriod(period.getEnd());
		int barSize = (int) ((period.getEnd().getTime() - period.getStart()
				.getTime()) / 1000);
		this.setBarSize(barSize);
		this.setOpen(open);
		this.setClose(close);
		this.setHigh(high);
		this.setLow(low);
		this.setVolume(new Long(volume));
		this.setVwap(vwap);
		this.setTradeCount(new Integer(tradeCount));
		this.setLastUpdateDate(lastUpdateDate);

	}

	/**
	 * Method getIdCandle.
	 * 
	 * @return Integer
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idCandle", unique = true, nullable = false)
	public Integer getIdCandle() {
		return this.id;
	}

	/**
	 * Method setIdCandle.
	 * 
	 * @param idCandle
	 *            Integer
	 */
	public void setIdCandle(Integer idCandle) {
		this.id = idCandle;
	}

	/**
	 * Method getTradingday.
	 * 
	 * @return Tradingday
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTradingday", nullable = false)
	public Tradingday getTradingday() {
		return this.tradingday;
	}

	/**
	 * Method setTradingday.
	 * 
	 * @param tradingday
	 *            Tradingday
	 */
	public void setTradingday(Tradingday tradingday) {
		this.tradingday = tradingday;
	}

	/**
	 * Method getContract.
	 * 
	 * @return Contract
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idContract", nullable = false)
	public Contract getContract() {
		return this.contract;
	}

	/**
	 * Method setContract.
	 * 
	 * @param contract
	 *            Contract
	 */
	public void setContract(Contract contract) {
		this.contract = contract;
	}

	/**
	 * Method getClose.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "close", precision = 10)
	public BigDecimal getClose() {
		return this.close;
	}

	/**
	 * Method setClose.
	 * 
	 * @param close
	 *            BigDecimal
	 */
	public void setClose(BigDecimal close) {
		this.close = close;
	}

	/**
	 * Method getHigh.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "high", precision = 10)
	public BigDecimal getHigh() {
		return this.high;
	}

	/**
	 * Method setHigh.
	 * 
	 * @param high
	 *            BigDecimal
	 */
	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	/**
	 * Method getLow.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "low", precision = 10)
	public BigDecimal getLow() {
		return this.low;
	}

	/**
	 * Method setLow.
	 * 
	 * @param low
	 *            BigDecimal
	 */
	public void setLow(BigDecimal low) {
		this.low = low;
	}

	/**
	 * Method getOpen.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "open", precision = 10)
	public BigDecimal getOpen() {
		return this.open;
	}

	/**
	 * Method setOpen.
	 * 
	 * @param open
	 *            BigDecimal
	 */
	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	/**
	 * Method getPeriod.
	 * 
	 * @return String
	 */
	@Column(name = "period", length = 45)
	public String getPeriod() {
		return this.period;
	}

	/**
	 * Method setPeriod.
	 * 
	 * @param period
	 *            String
	 */
	public void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * Method getEndPeriod.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "endPeriod", length = 19)
	public Date getEndPeriod() {
		return this.endPeriod;
	}

	/**
	 * Method setEndPeriod.
	 * 
	 * @param endPeriod
	 *            Date
	 */
	public void setEndPeriod(Date endPeriod) {
		this.endPeriod = endPeriod;
	}

	/**
	 * Method getStartPeriod.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startPeriod", length = 19)
	public Date getStartPeriod() {
		return this.startPeriod;
	}

	/**
	 * Method setStartPeriod.
	 * 
	 * @param startPeriod
	 *            Date
	 */
	public void setStartPeriod(Date startPeriod) {
		this.startPeriod = startPeriod;
	}

	/**
	 * Method getTradeCount.
	 * 
	 * @return Integer
	 */
	@Column(name = "tradeCount")
	public Integer getTradeCount() {
		return this.tradeCount;
	}

	/**
	 * Method setTradeCount.
	 * 
	 * @param tradeCount
	 *            Integer
	 */
	public void setTradeCount(Integer tradeCount) {
		this.tradeCount = tradeCount;
	}

	/**
	 * Method getVolume.
	 * 
	 * @return Long
	 */
	@Column(name = "volume")
	public Long getVolume() {
		return this.volume;
	}

	/**
	 * Method setVolume.
	 * 
	 * @param volume
	 *            Long
	 */
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	/**
	 * Method getVwap.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "vwap", precision = 10)
	public BigDecimal getVwap() {
		return this.vwap;
	}

	/**
	 * Method setVwap.
	 * 
	 * @param vwap
	 *            BigDecimal
	 */
	public void setVwap(BigDecimal vwap) {
		this.vwap = vwap;
	}

	/**
	 * Method getBarSize.
	 * 
	 * @return Integer
	 */
	@Column(name = "barSize")
	public Integer getBarSize() {
		if (null == this.barSize) {
			this.barSize = (int) ((getEndPeriod().getTime() - getStartPeriod()
					.getTime()) / 1000 + 1);
		}
		return this.barSize;
	}

	/**
	 * Method setBarSize.
	 * 
	 * @param barSize
	 *            Integer
	 */
	public void setBarSize(Integer barSize) {
		this.barSize = barSize;
	}

	/**
	 * Method getLastUpdateDate.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastUpdateDate", length = 19)
	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	/**
	 * Method setLastUpdateDate.
	 * 
	 * @param lastUpdateDate
	 *            Date
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * Method getVersion.
	 * 
	 * @return Integer
	 */
	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Method setVersion.
	 * 
	 * @param version
	 *            Integer
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * Method equals.
	 * 
	 * @param objectToCompare
	 *            Object
	 * @return boolean
	 */
	public boolean equals(Object objectToCompare) {

		if (super.equals(objectToCompare))
			return true;

		if (objectToCompare instanceof Candle) {
			Candle candle = (Candle) objectToCompare;
			if (this.getTradingday().equals(candle.getTradingday())) {
				if (this.getContract().equals(candle.getContract())) {
					if (this.getStartPeriod().equals(candle.getStartPeriod())) {
						if (this.getEndPeriod().equals(candle.getEndPeriod())) {
							if (this.getHigh().equals(candle.getHigh())) {
								if (this.getLow().equals(candle.getLow())) {
									if (this.getOpen().equals(candle.getOpen())) {
										if (this.getClose().equals(
												candle.getClose())) {
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
}
