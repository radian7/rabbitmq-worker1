package com.rabbitmq.cwiczenia.rabbitmqworker1.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CKK_TELEFONY database table.
 * 
 */
@Entity
@Table(name="CKK_TELEFONY")
@NamedQuery(name="CkkTelefony.findAll", query="SELECT c FROM CkkTelefony c")
@Where(clause = "TL_TL_ID_ARCHIWIZOWANY is null")
public class CkkTelefony implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TL_ID", unique=true, nullable=false, precision=10)
	private long tlId;

	@Column(name="TL_ADR_ID", precision=10)
	private BigDecimal tlAdrId;

	@Column(name="TL_AUDYT_KM", length=100)
	private String tlAudytKm;

	@Column(name="TL_AUDYT_KT", length=100)
	private String tlAudytKt;

	@Column(name="TL_AUDYT_LM")
	private BigDecimal tlAudytLm;

	@Column(name="TL_DATA_ARCHIWIZACJI", length=30)
	private String tlDataArchiwizacji;

	@Column(name="TL_DO_KOGO", length=50)
	private String tlDoKogo;

	@Column(name="TL_F_AUTORYZOWANY", length=1)
	private String tlFAutoryzowany;

	@Column(name="TL_F_DOMYSLNY", length=1)
	private String tlFDomyslny;

	@Temporal(TemporalType.DATE)
	@Column(name="TL_KIEDY_MODYFIKOWAL")
	private Date tlKiedyModyfikowal;

	@Temporal(TemporalType.DATE)
	@Column(name="TL_KIEDY_UTWORZYL", nullable=false)
	private Date tlKiedyUtworzyl;

	@Column(name="TL_KOD", precision=10)
	private BigDecimal tlKod;

	@Column(name="TL_KOMENTARZ", length=2000)
	private String tlKomentarz;

	@Column(name="TL_LP", nullable=false, precision=3)
	private BigDecimal tlLp;

	@Column(name="TL_MODYFIKOWAL", length=30)
	private String tlModyfikowal;

	@Column(name="TL_NUMER", nullable=false, length=100)
	private String tlNumer;

	@Column(name="TL_PRC_ID", precision=10)
	private BigDecimal tlPrcId;

	@Column(name="TL_RP_ID", precision=10)
	private BigDecimal tlRpId;

	@Column(name="TL_RPK_ID", precision=10)
	private BigDecimal tlRpkId;

	@Column(name="TL_TL_ID_ARCHIWIZOWANY", precision=10)
	private BigDecimal tlTlIdArchiwizowany;

	@Column(name="TL_TYP", nullable=false, length=1)
	private String tlTyp;

	@Column(name="TL_UTWORZYL", nullable=false, length=30)
	private String tlUtworzyl;

	//bi-directional many-to-one association to CkkKlienci
	@ManyToOne
	@JoinColumn(name="TL_KL_KOD")
	@JsonBackReference
	private CkkKlienci ckkKlienci;

	public CkkTelefony() {
	}

	public long getTlId() {
		return this.tlId;
	}

	public void setTlId(long tlId) {
		this.tlId = tlId;
	}

	public BigDecimal getTlAdrId() {
		return this.tlAdrId;
	}

	public void setTlAdrId(BigDecimal tlAdrId) {
		this.tlAdrId = tlAdrId;
	}

	public String getTlAudytKm() {
		return this.tlAudytKm;
	}

	public void setTlAudytKm(String tlAudytKm) {
		this.tlAudytKm = tlAudytKm;
	}

	public String getTlAudytKt() {
		return this.tlAudytKt;
	}

	public void setTlAudytKt(String tlAudytKt) {
		this.tlAudytKt = tlAudytKt;
	}

	public BigDecimal getTlAudytLm() {
		return this.tlAudytLm;
	}

	public void setTlAudytLm(BigDecimal tlAudytLm) {
		this.tlAudytLm = tlAudytLm;
	}

	public String getTlDataArchiwizacji() {
		return this.tlDataArchiwizacji;
	}

	public void setTlDataArchiwizacji(String tlDataArchiwizacji) {
		this.tlDataArchiwizacji = tlDataArchiwizacji;
	}

	public String getTlDoKogo() {
		return this.tlDoKogo;
	}

	public void setTlDoKogo(String tlDoKogo) {
		this.tlDoKogo = tlDoKogo;
	}

	public String getTlFAutoryzowany() {
		return this.tlFAutoryzowany;
	}

	public void setTlFAutoryzowany(String tlFAutoryzowany) {
		this.tlFAutoryzowany = tlFAutoryzowany;
	}

	public String getTlFDomyslny() {
		return this.tlFDomyslny;
	}

	public void setTlFDomyslny(String tlFDomyslny) {
		this.tlFDomyslny = tlFDomyslny;
	}

	public Date getTlKiedyModyfikowal() {
		return this.tlKiedyModyfikowal;
	}

	public void setTlKiedyModyfikowal(Date tlKiedyModyfikowal) {
		this.tlKiedyModyfikowal = tlKiedyModyfikowal;
	}

	public Date getTlKiedyUtworzyl() {
		return this.tlKiedyUtworzyl;
	}

	public void setTlKiedyUtworzyl(Date tlKiedyUtworzyl) {
		this.tlKiedyUtworzyl = tlKiedyUtworzyl;
	}

	public BigDecimal getTlKod() {
		return this.tlKod;
	}

	public void setTlKod(BigDecimal tlKod) {
		this.tlKod = tlKod;
	}

	public String getTlKomentarz() {
		return this.tlKomentarz;
	}

	public void setTlKomentarz(String tlKomentarz) {
		this.tlKomentarz = tlKomentarz;
	}

	public BigDecimal getTlLp() {
		return this.tlLp;
	}

	public void setTlLp(BigDecimal tlLp) {
		this.tlLp = tlLp;
	}

	public String getTlModyfikowal() {
		return this.tlModyfikowal;
	}

	public void setTlModyfikowal(String tlModyfikowal) {
		this.tlModyfikowal = tlModyfikowal;
	}

	public String getTlNumer() {
		return this.tlNumer;
	}

	public void setTlNumer(String tlNumer) {
		this.tlNumer = tlNumer;
	}

	public BigDecimal getTlPrcId() {
		return this.tlPrcId;
	}

	public void setTlPrcId(BigDecimal tlPrcId) {
		this.tlPrcId = tlPrcId;
	}

	public BigDecimal getTlRpId() {
		return this.tlRpId;
	}

	public void setTlRpId(BigDecimal tlRpId) {
		this.tlRpId = tlRpId;
	}

	public BigDecimal getTlRpkId() {
		return this.tlRpkId;
	}

	public void setTlRpkId(BigDecimal tlRpkId) {
		this.tlRpkId = tlRpkId;
	}

	public BigDecimal getTlTlIdArchiwizowany() {
		return this.tlTlIdArchiwizowany;
	}

	public void setTlTlIdArchiwizowany(BigDecimal tlTlIdArchiwizowany) {
		this.tlTlIdArchiwizowany = tlTlIdArchiwizowany;
	}

	public String getTlTyp() {
		return this.tlTyp;
	}

	public void setTlTyp(String tlTyp) {
		this.tlTyp = tlTyp;
	}

	public String getTlUtworzyl() {
		return this.tlUtworzyl;
	}

	public void setTlUtworzyl(String tlUtworzyl) {
		this.tlUtworzyl = tlUtworzyl;
	}

	public CkkKlienci getCkkKlienci() {
		return this.ckkKlienci;
	}

	public void setCkkKlienci(CkkKlienci ckkKlienci) {
		this.ckkKlienci = ckkKlienci;
	}

}