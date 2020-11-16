package com.example.SampleApplication.Entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The persistent class for the "Appointlet_Info" database table.
 * 
 */
@Entity
@Table(name = "invest_company_master", schema = "test")
@AllArgsConstructor
@Data
public class InvestCompanyMaster  {
	
  
  @Column(name = "ric_ticker")
  private String ricTicker;

  @Column(name = "cortex_ticker")
  private String cortexTicker;
 
  @Column(name = "company_name")
  private String companyName;

  @Column(name = "company_market_cap")
  private Integer companyMarketCap;

  @Column(name = "country")
  private String country;
  
  
  @Column(name = "instrument_type")
  private String instrumentType;

  @Column(name = "exchange_name")
  private String exchangeName;
 
  @Column(name = "bw_sectors")
  private String bwSectors;

  @Column(name = "bw_industry_group")
  private String bwIndustryGroup;

  @Column(name = "currency_code")
  private String currencyCode;
  
  @Column(name = "currency_name")
  private String currencyName;

  @Column(name = "GICS_industry_group")
  private String gicsIndstryGroup;
 
  @Column(name = "market_index")
  private String marketIndex;
  
  @Column(name = "GICS_sectors")
  private String gicsSectors;

  @Column(name = "sector_code")
  private String sectorCode;

  @Column(name = "universe_id")
  private Integer universeId;
  
  @Id
  @Column(name = "company_id")
  private Integer companyId;

  @Column(name = "active_flag")
  private Boolean activeFlag;
  
  
  
  public InvestCompanyMaster() {
	  
  }

  
}
