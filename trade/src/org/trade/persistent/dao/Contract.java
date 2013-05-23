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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.trade.core.dao.Aspect;

/**
 * Contract generated by hbm2java
 * 
 * @author Simon Allen
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "contract")
public class Contract extends Aspect implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5691902477608387034L;
	private String currency;
	private String category;
	private String description;
	private String exchange;
	private Date expiry;
	private Integer idContractIB;
	private String industry;
	private BigDecimal lastAskPrice = new BigDecimal(0);
	private BigDecimal lastBidPrice = new BigDecimal(0);
	private BigDecimal lastPrice = new BigDecimal(0);
	private String localSymbol;
	private BigDecimal minTick;
	private BigDecimal priceMagnifier;
	private BigDecimal priceMultiplier;
	private String primaryExchange;
	private String symbol;
	private String secType;
	private String secTypeId;
	private String subCategory;
	private String tradingClass;
	private List<Tradestrategy> tradestrategies = Collections
			.synchronizedList(new ArrayList<Tradestrategy>(0));
	private List<TradePosition> tradePositions = new ArrayList<TradePosition>(0);
	private List<Candle> candles = new ArrayList<Candle>(0);

	public Contract() {
	}

	/**
	 * Constructor for Contract.
	 * 
	 * @param secType
	 *            String
	 * @param symbol
	 *            String
	 * @param exchange
	 *            String
	 * @param currency
	 *            String
	 * @param expiry
	 *            Date
	 */
	public Contract(String secType, String symbol, String exchange,
			String currency, Date expiry, BigDecimal priceMultiplier) {
		this.currency = currency;
		this.exchange = exchange;
		this.symbol = symbol;
		this.secType = secType;
		this.expiry = expiry;
		this.priceMultiplier = priceMultiplier;
	}

	/**
	 * Constructor for Contract.
	 * 
	 * @param currency
	 *            String
	 * @param description
	 *            String
	 * @param exchange
	 *            String
	 * @param expiry
	 *            Date
	 * @param localSymbol
	 *            String
	 * @param primaryExchange
	 *            String
	 * @param symbol
	 *            String
	 * @param secType
	 *            String
	 * @param secTypeId
	 *            String
	 * @param idContractIB
	 *            Integer
	 * @param category
	 *            String
	 * @param industry
	 *            String
	 * @param subCategory
	 *            String
	 * @param tradingClass
	 *            String
	 * @param minTick
	 *            BigDecimal
	 * @param priceMagnifier
	 *            BigDecimal
	 * @param tradestrategies
	 *            List<Tradestrategy>
	 * @param candles
	 *            List<Candle>
	 */
	public Contract(String currency, String description, String exchange,
			Date expiry, String localSymbol, String primaryExchange,
			String symbol, String secType, String secTypeId,
			Integer idContractIB, String category, String industry,
			String subCategory, String tradingClass, BigDecimal minTick,
			BigDecimal priceMagnifier, List<Tradestrategy> tradestrategies,
			List<Candle> candles) {
		this.category = category;
		this.currency = currency;
		this.description = description;
		this.exchange = exchange;
		this.expiry = expiry;
		this.idContractIB = idContractIB;
		this.industry = industry;
		this.localSymbol = localSymbol;
		this.minTick = minTick;
		this.priceMagnifier = priceMagnifier;
		this.primaryExchange = primaryExchange;
		this.symbol = symbol;
		this.secType = secType;
		this.secTypeId = secTypeId;
		this.subCategory = subCategory;
		this.tradingClass = tradingClass;
		this.tradestrategies = tradestrategies;
		this.candles = candles;

	}

	/**
	 * Method getIdContract.
	 * 
	 * @return Integer
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idContract", unique = true, nullable = false)
	public Integer getIdContract() {
		return this.id;
	}

	/**
	 * Method setIdContract.
	 * 
	 * @param idContract
	 *            Integer
	 */
	public void setIdContract(Integer idContract) {
		this.id = idContract;
	}

	/**
	 * Method getCategory.
	 * 
	 * @return String
	 */
	@Column(name = "category", length = 80)
	public String getCategory() {
		return this.category;
	}

	/**
	 * Method setCategory.
	 * 
	 * @param category
	 *            String
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Method getCurrency.
	 * 
	 * @return String
	 */
	@Column(name = "currency", nullable = false, length = 3)
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * Method setCurrency.
	 * 
	 * @param currency
	 *            String
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Method getDescription.
	 * 
	 * @return String
	 */
	@Column(name = "description", length = 80)
	public String getDescription() {
		return this.description;
	}

	/**
	 * Method setDescription.
	 * 
	 * @param description
	 *            String
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Method getExchange.
	 * 
	 * @return String
	 */
	@Column(name = "exchange", nullable = false, length = 30)
	public String getExchange() {
		return this.exchange;
	}

	/**
	 * Method setExchange.
	 * 
	 * @param exchange
	 *            String
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * Method getExpiry.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiry", unique = true, nullable = false, length = 19)
	public Date getExpiry() {
		return this.expiry;
	}

	/**
	 * Method setExpiry.
	 * 
	 * @param expiry
	 *            Date
	 */
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	/**
	 * Method getIdContractIB.
	 * 
	 * @return Integer
	 */
	@Column(name = "idContractIB")
	public Integer getIdContractIB() {
		return this.idContractIB;
	}

	/**
	 * Method setIdContractIB.
	 * 
	 * @param idContractIB
	 *            Integer
	 */
	public void setIdContractIB(Integer idContractIB) {
		this.idContractIB = idContractIB;
	}

	/**
	 * Method getIndustry.
	 * 
	 * @return String
	 */
	@Column(name = "industry", length = 80)
	public String getIndustry() {
		return this.industry;
	}

	/**
	 * Method setIndustry.
	 * 
	 * @param industry
	 *            String
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * Method getLastPrice.
	 * 
	 * @return BigDecimal
	 */
	@Transient
	public BigDecimal getLastPrice() {
		return this.lastPrice;
	}

	/**
	 * Method setLastPrice.
	 * 
	 * @param lastPrice
	 *            BigDecimal
	 */
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}

	/**
	 * Method getLastAskPrice.
	 * 
	 * @return BigDecimal
	 */
	@Transient
	public BigDecimal getLastAskPrice() {
		return this.lastAskPrice;
	}

	/**
	 * Method setLastAskPrice.
	 * 
	 * @param lastAskPrice
	 *            BigDecimal
	 */
	public void setLastAskPrice(BigDecimal lastAskPrice) {
		this.lastAskPrice = lastAskPrice;
	}

	/**
	 * Method getLastBidPrice.
	 * 
	 * @return BigDecimal
	 */
	@Transient
	public BigDecimal getLastBidPrice() {
		return this.lastBidPrice;
	}

	/**
	 * Method setLastBidPrice.
	 * 
	 * @param lastBidPrice
	 *            BigDecimal
	 */
	public void setLastBidPrice(BigDecimal lastBidPrice) {
		this.lastBidPrice = lastBidPrice;
	}

	/**
	 * Method getLocalSymbol.
	 * 
	 * @return String
	 */
	@Column(name = "localSymbol", length = 10)
	public String getLocalSymbol() {
		return this.localSymbol;
	}

	/**
	 * Method setLocalSymbol.
	 * 
	 * @param localSymbol
	 *            String
	 */
	public void setLocalSymbol(String localSymbol) {
		this.localSymbol = localSymbol;
	}

	/**
	 * Method getMinTick.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "minTick", precision = 10)
	public BigDecimal getMinTick() {
		return this.minTick;
	}

	/**
	 * Method setMinTick.
	 * 
	 * @param minTick
	 *            BigDecimal
	 */
	public void setMinTick(BigDecimal minTick) {
		this.minTick = minTick;
	}

	/**
	 * Method getPriceMagnifier.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "priceMagnifier", precision = 10)
	public BigDecimal getPriceMagnifier() {
		return this.priceMagnifier;
	}

	/**
	 * Method setPriceMagnifier.
	 * 
	 * @param priceMagnifier
	 *            BigDecimal
	 */
	public void setPriceMagnifier(BigDecimal priceMagnifier) {
		this.priceMagnifier = priceMagnifier;
	}

	/**
	 * Method getPriceMultiplier.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "priceMultiplier", precision = 10)
	public BigDecimal getPriceMultiplier() {
		return this.priceMultiplier;
	}

	/**
	 * Method setPriceMultiplier.
	 * 
	 * @param priceMultiplier
	 *            BigDecimal
	 */
	public void setPriceMultiplier(BigDecimal priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	/**
	 * Method getPrimaryExchange.
	 * 
	 * @return String
	 */
	@Column(name = "primaryExchange", length = 10)
	public String getPrimaryExchange() {
		return this.primaryExchange;
	}

	/**
	 * Method setPrimaryExchange.
	 * 
	 * @param primaryExchange
	 *            String
	 */
	public void setPrimaryExchange(String primaryExchange) {
		this.primaryExchange = primaryExchange;
	}

	/**
	 * Method getSymbol.
	 * 
	 * @return String
	 */
	@Column(name = "symbol", unique = true, nullable = false, length = 10)
	public String getSymbol() {
		return this.symbol;
	}

	/**
	 * Method setSymbol.
	 * 
	 * @param symbol
	 *            String
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * Method getSecType.
	 * 
	 * @return String
	 */
	@Column(name = "secType", nullable = false, length = 4)
	public String getSecType() {
		return this.secType;
	}

	/**
	 * Method setSecType.
	 * 
	 * @param secType
	 *            String
	 */
	public void setSecType(String secType) {
		this.secType = secType;
	}

	/**
	 * Method getSecTypeId.
	 * 
	 * @return String
	 */
	@Column(name = "secTypeId", length = 5)
	public String getSecTypeId() {
		return this.secTypeId;
	}

	/**
	 * Method setSecTypeId.
	 * 
	 * @param secTypeId
	 *            String
	 */
	public void setSecTypeId(String secTypeId) {
		this.secTypeId = secTypeId;
	}

	/**
	 * Method getSubCategory.
	 * 
	 * @return String
	 */
	@Column(name = "subCategory", length = 80)
	public String getSubCategory() {
		return this.subCategory;
	}

	/**
	 * Method setSubCategory.
	 * 
	 * @param subCategory
	 *            String
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * Method getTradingClass.
	 * 
	 * @return String
	 */
	@Column(name = "tradingClass", length = 80)
	public String getTradingClass() {
		return this.tradingClass;
	}

	/**
	 * Method setTradingClass.
	 * 
	 * @param tradingClass
	 *            String
	 */
	public void setTradingClass(String tradingClass) {
		this.tradingClass = tradingClass;
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
	 * Method addTradestrategy.
	 * 
	 * @param tradestrategy
	 *            Tradestrategy
	 */
	public void addTradestrategy(Tradestrategy tradestrategy) {
		this.tradestrategies.add(tradestrategy);
	}

	/**
	 * Method removeTradestrategies.
	 * 
	 * @param tradestrategy
	 *            Tradestrategy
	 */
	public boolean removeTradestrategy(Tradestrategy tradestrategy) {
		for (ListIterator<Tradestrategy> itemIter = this.tradestrategies
				.listIterator(); itemIter.hasNext();) {
			Tradestrategy item = itemIter.next();
			if (item.equals(tradestrategy)) {
				itemIter.remove();
				return true;
			}
		}
		return false;
	}

	/**
	 * Method getTradestrategies.
	 * 
	 * @return List<Tradestrategy>
	 */
	// @OneToMany(mappedBy = "contract", fetch = FetchType.LAZY)
	@Transient
	public List<Tradestrategy> getTradestrategies() {
		return this.tradestrategies;
	}

	/**
	 * Method setTradestrategies.
	 * 
	 * @param tradestrategies
	 *            List<Tradestrategy>
	 */
	public void setTradestrategies(List<Tradestrategy> tradestrategies) {
		this.tradestrategies = tradestrategies;
	}

	/**
	 * Method getTradePositions.
	 * 
	 * @return List<TradePosition>
	 */
	@OneToMany(mappedBy = "contract", fetch = FetchType.LAZY)
	public List<TradePosition> getTradePositions() {
		return this.tradePositions;
	}

	/**
	 * Method setTradePositions.
	 * 
	 * @param tradePositions
	 *            List<TradePosition>
	 */
	public void setTradePositions(List<TradePosition> tradePositions) {
		this.tradePositions = tradePositions;
	}

	/**
	 * Method getCandles.
	 * 
	 * @return List<Candle>
	 */
	@OneToMany(mappedBy = "contract", fetch = FetchType.LAZY, cascade = {
			CascadeType.REFRESH, CascadeType.REMOVE })
	public List<Candle> getCandles() {
		return this.candles;
	}

	/**
	 * Method setCandles.
	 * 
	 * @param candles
	 *            List<Candle>
	 */
	public void setCandles(List<Candle> candles) {
		this.candles = candles;
	}

	/**
	 * Method addTradePosition.
	 * 
	 * @param tradePosition
	 *            TradePosition
	 */
	public void addTradePosition(TradePosition tradePosition) {
		int index = 0;
		for (TradePosition currTradePosition : this.tradePositions) {
			if (currTradePosition.getIdTradePosition().equals(
					tradePosition.getIdTradePosition())) {
				index = this.tradePositions.indexOf(currTradePosition);
				break;
			}
		}
		if (index > 0)
			this.tradePositions.remove(index);

		this.tradePositions.add(tradePosition);
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

		if (objectToCompare instanceof Contract) {
			Contract contract = (Contract) objectToCompare;
			if (this.getSymbol().equals(contract.getSymbol())) {
				if (this.getSecType().equals(contract.getSecType())) {
					if (this.getExchange().equals(contract.getExchange())) {
						if (this.getCurrency().equals(contract.getCurrency())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Method clone.
	 * 
	 * @return Object
	 * @throws CloneNotSupportedException
	 */
	public Object clone() throws CloneNotSupportedException {

		Contract contract = (Contract) super.clone();
		List<Tradestrategy> tradestrategies = new ArrayList<Tradestrategy>(0);
		contract.setTradestrategies(tradestrategies);
		List<TradePosition> tradePositions = new ArrayList<TradePosition>(0);
		contract.setTradePositions(tradePositions);
		return contract;
	}

	/**
	 * Method toString.
	 * 
	 * @return String
	 */
	public String toString() {
		return getSymbol().toUpperCase();
	}
}
