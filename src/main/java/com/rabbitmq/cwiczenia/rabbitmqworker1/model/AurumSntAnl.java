package com.rabbitmq.cwiczenia.rabbitmqworker1.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the AURUM_SNT_ANL database table.
 * 
 */
@Entity
@Table(name = "AURUM_SNT_ANL", schema = "ODS")
@NamedQuery(name = "AurumSntAnl.findAll", query = "SELECT a FROM AurumSntAnl a")
public class AurumSntAnl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "A_BIEZ_ETAP", length = 240)
	private String aBiezEtap;

	@Column(name = "A_C_PORTF_IIIQ")
	private BigDecimal aCPortfIiiq;

	@Column(name = "A_C_PORTF_IIQ")
	private BigDecimal aCPortfIiq;

	@Column(name = "A_C_PORTF_IQ")
	private BigDecimal aCPortfIq;

	@Column(name = "A_C_PORTF_IVQ")
	private BigDecimal aCPortfIvq;

	@Temporal(TemporalType.DATE)
	@Column(name = "A_DATA_KONCA_UM")
	private Date aDataKoncaUm;

	@Temporal(TemporalType.DATE)
	@Column(name = "A_DATA_PODPISANIA_UM")
	private Date aDataPodpisaniaUm;

	@Id
	@Column(name = "A_DOK_NUMER", nullable = false, length = 14)
	private String aDokNumer;

	@Column(name = "A_DRZ_PROD_NUMER", length = 3)
	private String aDrzProdNumer;

	@Column(name = "A_MARZA_SWWR")
	private BigDecimal aMarzaSwwr;

	@Column(name = "A_OBCIAZ_KAP_C")
	private BigDecimal aObciazKapC;

	@Column(name = "A_OBCIAZ_KAP_N")
	private BigDecimal aObciazKapN;

	@Column(name = "A_OBCIAZ_KAP_P")
	private BigDecimal aObciazKapP;

	@Column(name = "A_OBCIAZ_ODS_C")
	private BigDecimal aObciazOdsC;

	@Column(name = "A_OBCIAZ_ODS_N")
	private BigDecimal aObciazOdsN;

	@Column(name = "A_OBCIAZ_ODS_P")
	private BigDecimal aObciazOdsP;

	@Column(name = "A_OBCIAZ_SUMA_C")
	private BigDecimal aObciazSumaC;

	@Column(name = "A_OBCIAZ_SUMA_N")
	private BigDecimal aObciazSumaN;

	@Column(name = "A_OBCIAZ_SUMA_P")
	private BigDecimal aObciazSumaP;

	@Column(name = "A_OKRES_UM", precision = 10)
	private BigDecimal aOkresUm;

	@Column(name = "A_P_PORTF_IIIQ")
	private BigDecimal aPPortfIiiq;

	@Column(name = "A_P_PORTF_IIQ")
	private BigDecimal aPPortfIiq;

	@Column(name = "A_P_PORTF_IQ")
	private BigDecimal aPPortfIq;

	@Column(name = "A_P_PORTF_IVQ")
	private BigDecimal aPPortfIvq;

	@Column(name = "A_PORTF_POCZ_PLN")
	private BigDecimal aPortfPoczPln;

	@Column(name = "A_PROC_SPL_PRZ")
	private BigDecimal aProcSplPrz;

	@Column(name = "A_PROC_SPL_UM")
	private BigDecimal aProcSplUm;

	@Column(name = "A_PROC_UM", length = 11)
	private String aProcUm;

	@Column(name = "A_PRZEDM_UM", length = 17)
	private String aPrzedmUm;

	@Column(name = "A_RODZ_UM", length = 18)
	private String aRodzUm;

	@Column(name = "A_SALDO_PLN")
	private BigDecimal aSaldoPln;

	@Column(name = "A_SPOLKA", length = 1)
	private String aSpolka;

	@Column(name = "A_STATUS", length = 1)
	private String aStatus;

	@Column(name = "A_TYP_RATY", length = 10)
	private String aTypRaty;

	@Column(name = "A_WAL_UM", length = 3)
	private String aWalUm;

	@Column(name = "A_WART_KONC_PROC")
	private BigDecimal aWartKoncProc;

	@Column(name = "A_WART_PRZ_PLN")
	private BigDecimal aWartPrzPln;

	@Column(name = "A_WP_WL_PROC")
	private BigDecimal aWpWlProc;

	@Column(length = 10)
	private String cif;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_KURSU")
	private Date dataKursu;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_LOAD", nullable = false)
	private Date dataLoad;

	@Column(name = "KL_KOD", nullable = false, precision = 10)
	private BigDecimal klKod;

	@Column(name = "S_BIEZ_ZAL_DNI")
	private BigDecimal sBiezZalDni;

	@Column(name = "S_BIEZ_ZAL_PLN")
	private BigDecimal sBiezZalPln;

	@Column(name = "S_C_PORTF_IIIQ")
	private BigDecimal sCPortfIiiq;

	@Column(name = "S_C_PORTF_IIQ")
	private BigDecimal sCPortfIiq;

	@Column(name = "S_C_PORTF_IQ")
	private BigDecimal sCPortfIq;

	@Column(name = "S_C_PORTF_IVQ")
	private BigDecimal sCPortfIvq;

	@Column(name = "S_KURSY_WALUT", length = 100)
	private String sKursyWalut;

	@Column(name = "S_LFPO_OBCIAZ_KAP_C")
	private BigDecimal sLfpoObciazKapC;

	@Column(name = "S_LFPO_OBCIAZ_KAP_N")
	private BigDecimal sLfpoObciazKapN;

	@Column(name = "S_LFPO_OBCIAZ_KAP_P")
	private BigDecimal sLfpoObciazKapP;

	@Column(name = "S_LFPO_OBCIAZ_ODS_C")
	private BigDecimal sLfpoObciazOdsC;

	@Column(name = "S_LFPO_OBCIAZ_ODS_N")
	private BigDecimal sLfpoObciazOdsN;

	@Column(name = "S_LFPO_OBCIAZ_ODS_P")
	private BigDecimal sLfpoObciazOdsP;

	@Column(name = "S_LFPO_OBCIAZ_SUMA_C")
	private BigDecimal sLfpoObciazSumaC;

	@Column(name = "S_LFPO_OBCIAZ_SUMA_N")
	private BigDecimal sLfpoObciazSumaN;

	@Column(name = "S_LFPO_OBCIAZ_SUMA_P")
	private BigDecimal sLfpoObciazSumaP;

	@Column(name = "S_LO_OBCIAZ_KAP_C")
	private BigDecimal sLoObciazKapC;

	@Column(name = "S_LO_OBCIAZ_KAP_N")
	private BigDecimal sLoObciazKapN;

	@Column(name = "S_LO_OBCIAZ_KAP_P")
	private BigDecimal sLoObciazKapP;

	@Column(name = "S_LO_OBCIAZ_ODS_C")
	private BigDecimal sLoObciazOdsC;

	@Column(name = "S_LO_OBCIAZ_ODS_N")
	private BigDecimal sLoObciazOdsN;

	@Column(name = "S_LO_OBCIAZ_ODS_P")
	private BigDecimal sLoObciazOdsP;

	@Column(name = "S_LO_OBCIAZ_SUMA_C")
	private BigDecimal sLoObciazSumaC;

	@Column(name = "S_LO_OBCIAZ_SUMA_N")
	private BigDecimal sLoObciazSumaN;

	@Column(name = "S_LO_OBCIAZ_SUMA_P")
	private BigDecimal sLoObciazSumaP;

	@Column(name = "S_MAX_OPOZ_RAT_DNI")
	private BigDecimal sMaxOpozRatDni;

	@Column(name = "S_MAX_OPOZ_REZERW_DNI")
	private BigDecimal sMaxOpozRezerwDni;

	@Column(name = "S_OPIEKUN_CRM", length = 50)
	private String sOpiekunCrm;

	@Column(name = "S_P_PORTF_IIIQ")
	private BigDecimal sPPortfIiiq;

	@Column(name = "S_P_PORTF_IIQ")
	private BigDecimal sPPortfIiq;

	@Column(name = "S_P_PORTF_IQ")
	private BigDecimal sPPortfIq;

	@Column(name = "S_P_PORTF_IVQ")
	private BigDecimal sPPortfIvq;

	@Column(name = "S_PORTF_POCZ_PLN", precision = 14, scale = 2)
	private BigDecimal sPortfPoczPln;

	@Column(name = "S_SALDO_PLN", precision = 14, scale = 2)
	private BigDecimal sSaldoPln;

	@Column(name = "S_SR_PROC_SPL_PRZ")
	private BigDecimal sSrProcSplPrz;

	@Column(name = "S_SR_PROC_SPL_SWWR")
	private BigDecimal sSrProcSplSwwr;

	@Column(name = "S_SR_PROC_SPL_UM")
	private BigDecimal sSrProcSplUm;

	@Column(name = "S_WART_PRZ_PLN")
	private BigDecimal sWartPrzPln;

	public AurumSntAnl() {
	}

	public String getABiezEtap() {
		return this.aBiezEtap;
	}

	public void setABiezEtap(String aBiezEtap) {
		this.aBiezEtap = aBiezEtap;
	}

	public BigDecimal getACPortfIiiq() {
		return this.aCPortfIiiq;
	}

	public void setACPortfIiiq(BigDecimal aCPortfIiiq) {
		this.aCPortfIiiq = aCPortfIiiq;
	}

	public BigDecimal getACPortfIiq() {
		return this.aCPortfIiq;
	}

	public void setACPortfIiq(BigDecimal aCPortfIiq) {
		this.aCPortfIiq = aCPortfIiq;
	}

	public BigDecimal getACPortfIq() {
		return this.aCPortfIq;
	}

	public void setACPortfIq(BigDecimal aCPortfIq) {
		this.aCPortfIq = aCPortfIq;
	}

	public BigDecimal getACPortfIvq() {
		return this.aCPortfIvq;
	}

	public void setACPortfIvq(BigDecimal aCPortfIvq) {
		this.aCPortfIvq = aCPortfIvq;
	}

	public Date getADataKoncaUm() {
		return this.aDataKoncaUm;
	}

	public void setADataKoncaUm(Date aDataKoncaUm) {
		this.aDataKoncaUm = aDataKoncaUm;
	}

	public Date getADataPodpisaniaUm() {
		return this.aDataPodpisaniaUm;
	}

	public void setADataPodpisaniaUm(Date aDataPodpisaniaUm) {
		this.aDataPodpisaniaUm = aDataPodpisaniaUm;
	}

	public String getADokNumer() {
		return this.aDokNumer;
	}

	public void setADokNumer(String aDokNumer) {
		this.aDokNumer = aDokNumer;
	}

	public String getADrzProdNumer() {
		return this.aDrzProdNumer;
	}

	public void setADrzProdNumer(String aDrzProdNumer) {
		this.aDrzProdNumer = aDrzProdNumer;
	}

	public BigDecimal getAMarzaSwwr() {
		return this.aMarzaSwwr;
	}

	public void setAMarzaSwwr(BigDecimal aMarzaSwwr) {
		this.aMarzaSwwr = aMarzaSwwr;
	}

	public BigDecimal getAObciazKapC() {
		return this.aObciazKapC;
	}

	public void setAObciazKapC(BigDecimal aObciazKapC) {
		this.aObciazKapC = aObciazKapC;
	}

	public BigDecimal getAObciazKapN() {
		return this.aObciazKapN;
	}

	public void setAObciazKapN(BigDecimal aObciazKapN) {
		this.aObciazKapN = aObciazKapN;
	}

	public BigDecimal getAObciazKapP() {
		return this.aObciazKapP;
	}

	public void setAObciazKapP(BigDecimal aObciazKapP) {
		this.aObciazKapP = aObciazKapP;
	}

	public BigDecimal getAObciazOdsC() {
		return this.aObciazOdsC;
	}

	public void setAObciazOdsC(BigDecimal aObciazOdsC) {
		this.aObciazOdsC = aObciazOdsC;
	}

	public BigDecimal getAObciazOdsN() {
		return this.aObciazOdsN;
	}

	public void setAObciazOdsN(BigDecimal aObciazOdsN) {
		this.aObciazOdsN = aObciazOdsN;
	}

	public BigDecimal getAObciazOdsP() {
		return this.aObciazOdsP;
	}

	public void setAObciazOdsP(BigDecimal aObciazOdsP) {
		this.aObciazOdsP = aObciazOdsP;
	}

	public BigDecimal getAObciazSumaC() {
		return this.aObciazSumaC;
	}

	public void setAObciazSumaC(BigDecimal aObciazSumaC) {
		this.aObciazSumaC = aObciazSumaC;
	}

	public BigDecimal getAObciazSumaN() {
		return this.aObciazSumaN;
	}

	public void setAObciazSumaN(BigDecimal aObciazSumaN) {
		this.aObciazSumaN = aObciazSumaN;
	}

	public BigDecimal getAObciazSumaP() {
		return this.aObciazSumaP;
	}

	public void setAObciazSumaP(BigDecimal aObciazSumaP) {
		this.aObciazSumaP = aObciazSumaP;
	}

	public BigDecimal getAOkresUm() {
		return this.aOkresUm;
	}

	public void setAOkresUm(BigDecimal aOkresUm) {
		this.aOkresUm = aOkresUm;
	}

	public BigDecimal getAPPortfIiiq() {
		return this.aPPortfIiiq;
	}

	public void setAPPortfIiiq(BigDecimal aPPortfIiiq) {
		this.aPPortfIiiq = aPPortfIiiq;
	}

	public BigDecimal getAPPortfIiq() {
		return this.aPPortfIiq;
	}

	public void setAPPortfIiq(BigDecimal aPPortfIiq) {
		this.aPPortfIiq = aPPortfIiq;
	}

	public BigDecimal getAPPortfIq() {
		return this.aPPortfIq;
	}

	public void setAPPortfIq(BigDecimal aPPortfIq) {
		this.aPPortfIq = aPPortfIq;
	}

	public BigDecimal getAPPortfIvq() {
		return this.aPPortfIvq;
	}

	public void setAPPortfIvq(BigDecimal aPPortfIvq) {
		this.aPPortfIvq = aPPortfIvq;
	}

	public BigDecimal getAPortfPoczPln() {
		return this.aPortfPoczPln;
	}

	public void setAPortfPoczPln(BigDecimal aPortfPoczPln) {
		this.aPortfPoczPln = aPortfPoczPln;
	}

	public BigDecimal getAProcSplPrz() {
		return this.aProcSplPrz;
	}

	public void setAProcSplPrz(BigDecimal aProcSplPrz) {
		this.aProcSplPrz = aProcSplPrz;
	}

	public BigDecimal getAProcSplUm() {
		return this.aProcSplUm;
	}

	public void setAProcSplUm(BigDecimal aProcSplUm) {
		this.aProcSplUm = aProcSplUm;
	}

	public String getAProcUm() {
		return this.aProcUm;
	}

	public void setAProcUm(String aProcUm) {
		this.aProcUm = aProcUm;
	}

	public String getAPrzedmUm() {
		return this.aPrzedmUm;
	}

	public void setAPrzedmUm(String aPrzedmUm) {
		this.aPrzedmUm = aPrzedmUm;
	}

	public String getARodzUm() {
		return this.aRodzUm;
	}

	public void setARodzUm(String aRodzUm) {
		this.aRodzUm = aRodzUm;
	}

	public BigDecimal getASaldoPln() {
		return this.aSaldoPln;
	}

	public void setASaldoPln(BigDecimal aSaldoPln) {
		this.aSaldoPln = aSaldoPln;
	}

	public String getASpolka() {
		return this.aSpolka;
	}

	public void setASpolka(String aSpolka) {
		this.aSpolka = aSpolka;
	}

	public String getAStatus() {
		return this.aStatus;
	}

	public void setAStatus(String aStatus) {
		this.aStatus = aStatus;
	}

	public String getATypRaty() {
		return this.aTypRaty;
	}

	public void setATypRaty(String aTypRaty) {
		this.aTypRaty = aTypRaty;
	}

	public String getAWalUm() {
		return this.aWalUm;
	}

	public void setAWalUm(String aWalUm) {
		this.aWalUm = aWalUm;
	}

	public BigDecimal getAWartKoncProc() {
		return this.aWartKoncProc;
	}

	public void setAWartKoncProc(BigDecimal aWartKoncProc) {
		this.aWartKoncProc = aWartKoncProc;
	}

	public BigDecimal getAWartPrzPln() {
		return this.aWartPrzPln;
	}

	public void setAWartPrzPln(BigDecimal aWartPrzPln) {
		this.aWartPrzPln = aWartPrzPln;
	}

	public BigDecimal getAWpWlProc() {
		return this.aWpWlProc;
	}

	public void setAWpWlProc(BigDecimal aWpWlProc) {
		this.aWpWlProc = aWpWlProc;
	}

	public String getCif() {
		return this.cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Date getDataKursu() {
		return this.dataKursu;
	}

	public void setDataKursu(Date dataKursu) {
		this.dataKursu = dataKursu;
	}

	public Date getDataLoad() {
		return this.dataLoad;
	}

	public void setDataLoad(Date dataLoad) {
		this.dataLoad = dataLoad;
	}

	public BigDecimal getKlKod() {
		return this.klKod;
	}

	public void setKlKod(BigDecimal klKod) {
		this.klKod = klKod;
	}

	public BigDecimal getSBiezZalDni() {
		return this.sBiezZalDni;
	}

	public void setSBiezZalDni(BigDecimal sBiezZalDni) {
		this.sBiezZalDni = sBiezZalDni;
	}

	public BigDecimal getSBiezZalPln() {
		return this.sBiezZalPln;
	}

	public void setSBiezZalPln(BigDecimal sBiezZalPln) {
		this.sBiezZalPln = sBiezZalPln;
	}

	public BigDecimal getSCPortfIiiq() {
		return this.sCPortfIiiq;
	}

	public void setSCPortfIiiq(BigDecimal sCPortfIiiq) {
		this.sCPortfIiiq = sCPortfIiiq;
	}

	public BigDecimal getSCPortfIiq() {
		return this.sCPortfIiq;
	}

	public void setSCPortfIiq(BigDecimal sCPortfIiq) {
		this.sCPortfIiq = sCPortfIiq;
	}

	public BigDecimal getSCPortfIq() {
		return this.sCPortfIq;
	}

	public void setSCPortfIq(BigDecimal sCPortfIq) {
		this.sCPortfIq = sCPortfIq;
	}

	public BigDecimal getSCPortfIvq() {
		return this.sCPortfIvq;
	}

	public void setSCPortfIvq(BigDecimal sCPortfIvq) {
		this.sCPortfIvq = sCPortfIvq;
	}

	public String getSKursyWalut() {
		return this.sKursyWalut;
	}

	public void setSKursyWalut(String sKursyWalut) {
		this.sKursyWalut = sKursyWalut;
	}

	public BigDecimal getSLfpoObciazKapC() {
		return this.sLfpoObciazKapC;
	}

	public void setSLfpoObciazKapC(BigDecimal sLfpoObciazKapC) {
		this.sLfpoObciazKapC = sLfpoObciazKapC;
	}

	public BigDecimal getSLfpoObciazKapN() {
		return this.sLfpoObciazKapN;
	}

	public void setSLfpoObciazKapN(BigDecimal sLfpoObciazKapN) {
		this.sLfpoObciazKapN = sLfpoObciazKapN;
	}

	public BigDecimal getSLfpoObciazKapP() {
		return this.sLfpoObciazKapP;
	}

	public void setSLfpoObciazKapP(BigDecimal sLfpoObciazKapP) {
		this.sLfpoObciazKapP = sLfpoObciazKapP;
	}

	public BigDecimal getSLfpoObciazOdsC() {
		return this.sLfpoObciazOdsC;
	}

	public void setSLfpoObciazOdsC(BigDecimal sLfpoObciazOdsC) {
		this.sLfpoObciazOdsC = sLfpoObciazOdsC;
	}

	public BigDecimal getSLfpoObciazOdsN() {
		return this.sLfpoObciazOdsN;
	}

	public void setSLfpoObciazOdsN(BigDecimal sLfpoObciazOdsN) {
		this.sLfpoObciazOdsN = sLfpoObciazOdsN;
	}

	public BigDecimal getSLfpoObciazOdsP() {
		return this.sLfpoObciazOdsP;
	}

	public void setSLfpoObciazOdsP(BigDecimal sLfpoObciazOdsP) {
		this.sLfpoObciazOdsP = sLfpoObciazOdsP;
	}

	public BigDecimal getSLfpoObciazSumaC() {
		return this.sLfpoObciazSumaC;
	}

	public void setSLfpoObciazSumaC(BigDecimal sLfpoObciazSumaC) {
		this.sLfpoObciazSumaC = sLfpoObciazSumaC;
	}

	public BigDecimal getSLfpoObciazSumaN() {
		return this.sLfpoObciazSumaN;
	}

	public void setSLfpoObciazSumaN(BigDecimal sLfpoObciazSumaN) {
		this.sLfpoObciazSumaN = sLfpoObciazSumaN;
	}

	public BigDecimal getSLfpoObciazSumaP() {
		return this.sLfpoObciazSumaP;
	}

	public void setSLfpoObciazSumaP(BigDecimal sLfpoObciazSumaP) {
		this.sLfpoObciazSumaP = sLfpoObciazSumaP;
	}

	public BigDecimal getSLoObciazKapC() {
		return this.sLoObciazKapC;
	}

	public void setSLoObciazKapC(BigDecimal sLoObciazKapC) {
		this.sLoObciazKapC = sLoObciazKapC;
	}

	public BigDecimal getSLoObciazKapN() {
		return this.sLoObciazKapN;
	}

	public void setSLoObciazKapN(BigDecimal sLoObciazKapN) {
		this.sLoObciazKapN = sLoObciazKapN;
	}

	public BigDecimal getSLoObciazKapP() {
		return this.sLoObciazKapP;
	}

	public void setSLoObciazKapP(BigDecimal sLoObciazKapP) {
		this.sLoObciazKapP = sLoObciazKapP;
	}

	public BigDecimal getSLoObciazOdsC() {
		return this.sLoObciazOdsC;
	}

	public void setSLoObciazOdsC(BigDecimal sLoObciazOdsC) {
		this.sLoObciazOdsC = sLoObciazOdsC;
	}

	public BigDecimal getSLoObciazOdsN() {
		return this.sLoObciazOdsN;
	}

	public void setSLoObciazOdsN(BigDecimal sLoObciazOdsN) {
		this.sLoObciazOdsN = sLoObciazOdsN;
	}

	public BigDecimal getSLoObciazOdsP() {
		return this.sLoObciazOdsP;
	}

	public void setSLoObciazOdsP(BigDecimal sLoObciazOdsP) {
		this.sLoObciazOdsP = sLoObciazOdsP;
	}

	public BigDecimal getSLoObciazSumaC() {
		return this.sLoObciazSumaC;
	}

	public void setSLoObciazSumaC(BigDecimal sLoObciazSumaC) {
		this.sLoObciazSumaC = sLoObciazSumaC;
	}

	public BigDecimal getSLoObciazSumaN() {
		return this.sLoObciazSumaN;
	}

	public void setSLoObciazSumaN(BigDecimal sLoObciazSumaN) {
		this.sLoObciazSumaN = sLoObciazSumaN;
	}

	public BigDecimal getSLoObciazSumaP() {
		return this.sLoObciazSumaP;
	}

	public void setSLoObciazSumaP(BigDecimal sLoObciazSumaP) {
		this.sLoObciazSumaP = sLoObciazSumaP;
	}

	public BigDecimal getSMaxOpozRatDni() {
		return this.sMaxOpozRatDni;
	}

	public void setSMaxOpozRatDni(BigDecimal sMaxOpozRatDni) {
		this.sMaxOpozRatDni = sMaxOpozRatDni;
	}

	public BigDecimal getSMaxOpozRezerwDni() {
		return this.sMaxOpozRezerwDni;
	}

	public void setSMaxOpozRezerwDni(BigDecimal sMaxOpozRezerwDni) {
		this.sMaxOpozRezerwDni = sMaxOpozRezerwDni;
	}

	public String getSOpiekunCrm() {
		return this.sOpiekunCrm;
	}

	public void setSOpiekunCrm(String sOpiekunCrm) {
		this.sOpiekunCrm = sOpiekunCrm;
	}

	public BigDecimal getSPPortfIiiq() {
		return this.sPPortfIiiq;
	}

	public void setSPPortfIiiq(BigDecimal sPPortfIiiq) {
		this.sPPortfIiiq = sPPortfIiiq;
	}

	public BigDecimal getSPPortfIiq() {
		return this.sPPortfIiq;
	}

	public void setSPPortfIiq(BigDecimal sPPortfIiq) {
		this.sPPortfIiq = sPPortfIiq;
	}

	public BigDecimal getSPPortfIq() {
		return this.sPPortfIq;
	}

	public void setSPPortfIq(BigDecimal sPPortfIq) {
		this.sPPortfIq = sPPortfIq;
	}

	public BigDecimal getSPPortfIvq() {
		return this.sPPortfIvq;
	}

	public void setSPPortfIvq(BigDecimal sPPortfIvq) {
		this.sPPortfIvq = sPPortfIvq;
	}

	public BigDecimal getSPortfPoczPln() {
		return this.sPortfPoczPln;
	}

	public void setSPortfPoczPln(BigDecimal sPortfPoczPln) {
		this.sPortfPoczPln = sPortfPoczPln;
	}

	public BigDecimal getSSaldoPln() {
		return this.sSaldoPln;
	}

	public void setSSaldoPln(BigDecimal sSaldoPln) {
		this.sSaldoPln = sSaldoPln;
	}

	public BigDecimal getSSrProcSplPrz() {
		return this.sSrProcSplPrz;
	}

	public void setSSrProcSplPrz(BigDecimal sSrProcSplPrz) {
		this.sSrProcSplPrz = sSrProcSplPrz;
	}

	public BigDecimal getSSrProcSplSwwr() {
		return this.sSrProcSplSwwr;
	}

	public void setSSrProcSplSwwr(BigDecimal sSrProcSplSwwr) {
		this.sSrProcSplSwwr = sSrProcSplSwwr;
	}

	public BigDecimal getSSrProcSplUm() {
		return this.sSrProcSplUm;
	}

	public void setSSrProcSplUm(BigDecimal sSrProcSplUm) {
		this.sSrProcSplUm = sSrProcSplUm;
	}

	public BigDecimal getSWartPrzPln() {
		return this.sWartPrzPln;
	}

	public void setSWartPrzPln(BigDecimal sWartPrzPln) {
		this.sWartPrzPln = sWartPrzPln;
	}

}