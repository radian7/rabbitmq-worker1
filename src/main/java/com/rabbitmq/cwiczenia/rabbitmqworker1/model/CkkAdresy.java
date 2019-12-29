package com.rabbitmq.cwiczenia.rabbitmqworker1.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CKK_ADRESY database table.
 * 
 */
@Entity
@Table(name="CKK_ADRESY", schema = "egadm1")
@NamedQuery(name="CkkAdresy.findAll", query="SELECT c FROM CkkAdresy c")
@Where(clause = "ADR_F_AKTUALNE = 'T'")
public class CkkAdresy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADR_ID", unique=true, nullable=false, precision=10)
	private long adrId;

	@Column(name="ADR_ADRESAT", length=240)
	private String adrAdresat;

	@Column(name="ADR_ADRESAT2", length=240)
	private String adrAdresat2;

	@Column(name="ADR_ADRESAT3", length=240)
	private String adrAdresat3;

	@Column(name="ADR_ADRESAT4", length=240)
	private String adrAdresat4;

	@Column(name="ADR_ADRESAT5", length=240)
	private String adrAdresat5;

	@Column(name="ADR_ADRESAT6", length=240)
	private String adrAdresat6;

	@Column(name="ADR_ADRESAT7", length=240)
	private String adrAdresat7;

	@Column(name="ADR_ADRESAT8", length=240)
	private String adrAdresat8;

	@Column(name="ADR_ADRESAT9", length=240)
	private String adrAdresat9;

	@Column(name="ADR_AUDYT_KM", length=100)
	private String adrAudytKm;

	@Column(name="ADR_AUDYT_KT", length=100)
	private String adrAudytKt;

	@Column(name="ADR_AUDYT_LM")
	private BigDecimal adrAudytLm;

	@Column(name="ADR_CZR_ID", precision=10)
	private BigDecimal adrCzrId;

	@Column(name="ADR_DEF0", length=240)
	private String adrDef0;

	@Column(name="ADR_DEF1", length=240)
	private String adrDef1;

	@Column(name="ADR_DEF2", length=240)
	private String adrDef2;

	@Column(name="ADR_DEF3", length=240)
	private String adrDef3;

	@Column(name="ADR_DZ_ID", precision=10)
	private BigDecimal adrDzId;

	@Column(name="ADR_DZIELNICA", length=50)
	private String adrDzielnica;

	@Column(name="ADR_DZIELNICA2", length=50)
	private String adrDzielnica2;

	@Column(name="ADR_DZIELNICA3", length=50)
	private String adrDzielnica3;

	@Column(name="ADR_DZIELNICA4", length=50)
	private String adrDzielnica4;

	@Column(name="ADR_DZIELNICA5", length=50)
	private String adrDzielnica5;

	@Column(name="ADR_DZIELNICA6", length=50)
	private String adrDzielnica6;

	@Column(name="ADR_DZIELNICA7", length=50)
	private String adrDzielnica7;

	@Column(name="ADR_DZIELNICA8", length=50)
	private String adrDzielnica8;

	@Column(name="ADR_DZIELNICA9", length=50)
	private String adrDzielnica9;

	@Column(name="ADR_EMAIL_DO", length=120)
	private String adrEmailDo;

	@Column(name="ADR_EMAIL_DW", length=240)
	private String adrEmailDw;

	@Column(name="ADR_F_AKTUALNE", nullable=false, length=1)
	private String adrFAktualne;

	@Column(name="ADR_GM_ID", precision=10)
	private BigDecimal adrGmId;

	@Column(name="ADR_GMINA", length=50)
	private String adrGmina;

	@Column(name="ADR_GMINA2", length=50)
	private String adrGmina2;

	@Column(name="ADR_GMINA3", length=50)
	private String adrGmina3;

	@Column(name="ADR_GMINA4", length=50)
	private String adrGmina4;

	@Column(name="ADR_GMINA5", length=50)
	private String adrGmina5;

	@Column(name="ADR_GMINA6", length=50)
	private String adrGmina6;

	@Column(name="ADR_GMINA7", length=50)
	private String adrGmina7;

	@Column(name="ADR_GMINA8", length=50)
	private String adrGmina8;

	@Column(name="ADR_GMINA9", length=50)
	private String adrGmina9;

	@Column(name="ADR_JBNK_ID", precision=10)
	private BigDecimal adrJbnkId;

	@Column(name="ADR_KA_ID", precision=10)
	private BigDecimal adrKaId;

	@Temporal(TemporalType.DATE)
	@Column(name="ADR_KIEDY_MODYFIKOWAL")
	private Date adrKiedyModyfikowal;

	@Temporal(TemporalType.DATE)
	@Column(name="ADR_KIEDY_UTWORZYL", nullable=false)
	private Date adrKiedyUtworzyl;

	@Column(name="ADR_KOD", precision=10)
	private BigDecimal adrKod;

	@Column(name="ADR_KOD_GUS_GMINY", length=7)
	private String adrKodGusGminy;

	@Column(name="ADR_KOD_POCZTOWY", length=10)
	private String adrKodPocztowy;

	@Column(name="ADR_KOMENTARZ", length=2000)
	private String adrKomentarz;

	@Column(name="ADR_KOMENTARZ2", length=2000)
	private String adrKomentarz2;

	@Column(name="ADR_KOMENTARZ3", length=2000)
	private String adrKomentarz3;

	@Column(name="ADR_KOMENTARZ4", length=2000)
	private String adrKomentarz4;

	@Column(name="ADR_KOMENTARZ5", length=2000)
	private String adrKomentarz5;

	@Column(name="ADR_KOMENTARZ6", length=2000)
	private String adrKomentarz6;

	@Column(name="ADR_KOMENTARZ7", length=2000)
	private String adrKomentarz7;

	@Column(name="ADR_KOMENTARZ8", length=2000)
	private String adrKomentarz8;

	@Column(name="ADR_KOMENTARZ9", length=2000)
	private String adrKomentarz9;

	@Column(name="ADR_KR_ID", nullable=false, precision=10)
	private BigDecimal adrKrId;

	@Column(name="ADR_LP", nullable=false, precision=5)
	private BigDecimal adrLp;

	@Column(name="ADR_MAIL", length=240)
	private String adrMail;

	@Column(name="ADR_MIEJSCOWOSC", nullable=false, length=50)
	private String adrMiejscowosc;

	@Column(name="ADR_MIEJSCOWOSC2", length=50)
	private String adrMiejscowosc2;

	@Column(name="ADR_MIEJSCOWOSC3", length=50)
	private String adrMiejscowosc3;

	@Column(name="ADR_MIEJSCOWOSC4", length=50)
	private String adrMiejscowosc4;

	@Column(name="ADR_MIEJSCOWOSC5", length=50)
	private String adrMiejscowosc5;

	@Column(name="ADR_MIEJSCOWOSC6", length=50)
	private String adrMiejscowosc6;

	@Column(name="ADR_MIEJSCOWOSC7", length=50)
	private String adrMiejscowosc7;

	@Column(name="ADR_MIEJSCOWOSC8", length=50)
	private String adrMiejscowosc8;

	@Column(name="ADR_MIEJSCOWOSC9", length=50)
	private String adrMiejscowosc9;

	@Column(name="ADR_MODYFIKOWAL", length=30)
	private String adrModyfikowal;

	@Column(name="ADR_MS_ID", precision=10)
	private BigDecimal adrMsId;

	@Column(name="ADR_NIP", length=25)
	private String adrNip;

	@Column(name="ADR_NIP_DANE", length=22)
	private String adrNipDane;

	@Column(name="ADR_NIP_PREFIKS", length=3)
	private String adrNipPrefiks;

	@Column(name="ADR_NUMER_DOMU", length=40)
	private String adrNumerDomu;

	@Column(name="ADR_NUMER_DOMU2", length=40)
	private String adrNumerDomu2;

	@Column(name="ADR_NUMER_DOMU3", length=40)
	private String adrNumerDomu3;

	@Column(name="ADR_NUMER_DOMU4", length=40)
	private String adrNumerDomu4;

	@Column(name="ADR_NUMER_DOMU5", length=40)
	private String adrNumerDomu5;

	@Column(name="ADR_NUMER_DOMU6", length=40)
	private String adrNumerDomu6;

	@Column(name="ADR_NUMER_DOMU7", length=40)
	private String adrNumerDomu7;

	@Column(name="ADR_NUMER_DOMU8", length=40)
	private String adrNumerDomu8;

	@Column(name="ADR_NUMER_DOMU9", length=40)
	private String adrNumerDomu9;

	@Column(name="ADR_NUMER_LOKALU", length=40)
	private String adrNumerLokalu;

	@Column(name="ADR_OB_ID", precision=10)
	private BigDecimal adrObId;

	@Column(name="ADR_POCZTA", length=50)
	private String adrPoczta;

	@Column(name="ADR_POCZTA2", length=50)
	private String adrPoczta2;

	@Column(name="ADR_POCZTA3", length=50)
	private String adrPoczta3;

	@Column(name="ADR_POCZTA4", length=50)
	private String adrPoczta4;

	@Column(name="ADR_POCZTA5", length=50)
	private String adrPoczta5;

	@Column(name="ADR_POCZTA6", length=50)
	private String adrPoczta6;

	@Column(name="ADR_POCZTA7", length=50)
	private String adrPoczta7;

	@Column(name="ADR_POCZTA8", length=50)
	private String adrPoczta8;

	@Column(name="ADR_POCZTA9", length=50)
	private String adrPoczta9;

	@Column(name="ADR_POLOZENIE_X")
	private BigDecimal adrPolozenieX;

	@Column(name="ADR_POLOZENIE_Y")
	private BigDecimal adrPolozenieY;

	@Column(name="ADR_POW_ID", precision=10)
	private BigDecimal adrPowId;

	@Column(name="ADR_POWIAT", length=30)
	private String adrPowiat;

	@Column(name="ADR_POWIAT2", length=30)
	private String adrPowiat2;

	@Column(name="ADR_POWIAT3", length=30)
	private String adrPowiat3;

	@Column(name="ADR_POWIAT4", length=30)
	private String adrPowiat4;

	@Column(name="ADR_POWIAT5", length=30)
	private String adrPowiat5;

	@Column(name="ADR_POWIAT6", length=30)
	private String adrPowiat6;

	@Column(name="ADR_POWIAT7", length=30)
	private String adrPowiat7;

	@Column(name="ADR_POWIAT8", length=30)
	private String adrPowiat8;

	@Column(name="ADR_POWIAT9", length=30)
	private String adrPowiat9;

	@Column(name="ADR_POWOD_MODYFIKACJI", length=2000)
	private String adrPowodModyfikacji;

	@Column(name="ADR_PRC_ID", precision=10)
	private BigDecimal adrPrcId;

	@Column(name="ADR_REGON", length=5)
	private String adrRegon;

	@Column(name="ADR_RP_ID", precision=10)
	private BigDecimal adrRpId;

	@Column(name="ADR_SKRYTKA_POCZTOWA", length=5)
	private String adrSkrytkaPocztowa;

	@Column(name="ADR_STAN", length=10)
	private String adrStan;

	@Column(name="ADR_TYP", nullable=false, length=1)
	private String adrTyp;

	@Column(name="ADR_TYP_MIEJSCOWOSCI", length=1)
	private String adrTypMiejscowosci;

	@Column(name="ADR_TYP_ULICY", length=2)
	private String adrTypUlicy;

	@Column(name="ADR_UL_ID", precision=10)
	private BigDecimal adrUlId;

	@Column(name="ADR_ULICA", length=100)
	private String adrUlica;

	@Column(name="ADR_ULICA2", length=100)
	private String adrUlica2;

	@Column(name="ADR_ULICA3", length=100)
	private String adrUlica3;

	@Column(name="ADR_ULICA4", length=100)
	private String adrUlica4;

	@Column(name="ADR_ULICA5", length=100)
	private String adrUlica5;

	@Column(name="ADR_ULICA6", length=100)
	private String adrUlica6;

	@Column(name="ADR_ULICA7", length=100)
	private String adrUlica7;

	@Column(name="ADR_ULICA8", length=100)
	private String adrUlica8;

	@Column(name="ADR_ULICA9", length=100)
	private String adrUlica9;

	@Column(name="ADR_UTWORZYL", nullable=false, length=30)
	private String adrUtworzyl;

	@Column(name="ADR_WOJ_ID", precision=10)
	private BigDecimal adrWojId;

	@Column(name="ADR_ZATWIERDZONY", nullable=false, length=1)
	private String adrZatwierdzony;

	//bi-directional many-to-one association to CkkKlienci
	@ManyToOne
	@JoinColumn(name="ADR_KL_KOD")
	@JsonBackReference
	private CkkKlienci ckkKlienci;
	public CkkAdresy() {
	}

	public long getAdrId() {
		return this.adrId;
	}

	public void setAdrId(long adrId) {
		this.adrId = adrId;
	}

	public String getAdrAdresat() {
		return this.adrAdresat;
	}

	public void setAdrAdresat(String adrAdresat) {
		this.adrAdresat = adrAdresat;
	}

	public String getAdrAdresat2() {
		return this.adrAdresat2;
	}

	public void setAdrAdresat2(String adrAdresat2) {
		this.adrAdresat2 = adrAdresat2;
	}

	public String getAdrAdresat3() {
		return this.adrAdresat3;
	}

	public void setAdrAdresat3(String adrAdresat3) {
		this.adrAdresat3 = adrAdresat3;
	}

	public String getAdrAdresat4() {
		return this.adrAdresat4;
	}

	public void setAdrAdresat4(String adrAdresat4) {
		this.adrAdresat4 = adrAdresat4;
	}

	public String getAdrAdresat5() {
		return this.adrAdresat5;
	}

	public void setAdrAdresat5(String adrAdresat5) {
		this.adrAdresat5 = adrAdresat5;
	}

	public String getAdrAdresat6() {
		return this.adrAdresat6;
	}

	public void setAdrAdresat6(String adrAdresat6) {
		this.adrAdresat6 = adrAdresat6;
	}

	public String getAdrAdresat7() {
		return this.adrAdresat7;
	}

	public void setAdrAdresat7(String adrAdresat7) {
		this.adrAdresat7 = adrAdresat7;
	}

	public String getAdrAdresat8() {
		return this.adrAdresat8;
	}

	public void setAdrAdresat8(String adrAdresat8) {
		this.adrAdresat8 = adrAdresat8;
	}

	public String getAdrAdresat9() {
		return this.adrAdresat9;
	}

	public void setAdrAdresat9(String adrAdresat9) {
		this.adrAdresat9 = adrAdresat9;
	}

	public String getAdrAudytKm() {
		return this.adrAudytKm;
	}

	public void setAdrAudytKm(String adrAudytKm) {
		this.adrAudytKm = adrAudytKm;
	}

	public String getAdrAudytKt() {
		return this.adrAudytKt;
	}

	public void setAdrAudytKt(String adrAudytKt) {
		this.adrAudytKt = adrAudytKt;
	}

	public BigDecimal getAdrAudytLm() {
		return this.adrAudytLm;
	}

	public void setAdrAudytLm(BigDecimal adrAudytLm) {
		this.adrAudytLm = adrAudytLm;
	}

	public BigDecimal getAdrCzrId() {
		return this.adrCzrId;
	}

	public void setAdrCzrId(BigDecimal adrCzrId) {
		this.adrCzrId = adrCzrId;
	}

	public String getAdrDef0() {
		return this.adrDef0;
	}

	public void setAdrDef0(String adrDef0) {
		this.adrDef0 = adrDef0;
	}

	public String getAdrDef1() {
		return this.adrDef1;
	}

	public void setAdrDef1(String adrDef1) {
		this.adrDef1 = adrDef1;
	}

	public String getAdrDef2() {
		return this.adrDef2;
	}

	public void setAdrDef2(String adrDef2) {
		this.adrDef2 = adrDef2;
	}

	public String getAdrDef3() {
		return this.adrDef3;
	}

	public void setAdrDef3(String adrDef3) {
		this.adrDef3 = adrDef3;
	}

	public BigDecimal getAdrDzId() {
		return this.adrDzId;
	}

	public void setAdrDzId(BigDecimal adrDzId) {
		this.adrDzId = adrDzId;
	}

	public String getAdrDzielnica() {
		return this.adrDzielnica;
	}

	public void setAdrDzielnica(String adrDzielnica) {
		this.adrDzielnica = adrDzielnica;
	}

	public String getAdrDzielnica2() {
		return this.adrDzielnica2;
	}

	public void setAdrDzielnica2(String adrDzielnica2) {
		this.adrDzielnica2 = adrDzielnica2;
	}

	public String getAdrDzielnica3() {
		return this.adrDzielnica3;
	}

	public void setAdrDzielnica3(String adrDzielnica3) {
		this.adrDzielnica3 = adrDzielnica3;
	}

	public String getAdrDzielnica4() {
		return this.adrDzielnica4;
	}

	public void setAdrDzielnica4(String adrDzielnica4) {
		this.adrDzielnica4 = adrDzielnica4;
	}

	public String getAdrDzielnica5() {
		return this.adrDzielnica5;
	}

	public void setAdrDzielnica5(String adrDzielnica5) {
		this.adrDzielnica5 = adrDzielnica5;
	}

	public String getAdrDzielnica6() {
		return this.adrDzielnica6;
	}

	public void setAdrDzielnica6(String adrDzielnica6) {
		this.adrDzielnica6 = adrDzielnica6;
	}

	public String getAdrDzielnica7() {
		return this.adrDzielnica7;
	}

	public void setAdrDzielnica7(String adrDzielnica7) {
		this.adrDzielnica7 = adrDzielnica7;
	}

	public String getAdrDzielnica8() {
		return this.adrDzielnica8;
	}

	public void setAdrDzielnica8(String adrDzielnica8) {
		this.adrDzielnica8 = adrDzielnica8;
	}

	public String getAdrDzielnica9() {
		return this.adrDzielnica9;
	}

	public void setAdrDzielnica9(String adrDzielnica9) {
		this.adrDzielnica9 = adrDzielnica9;
	}

	public String getAdrEmailDo() {
		return this.adrEmailDo;
	}

	public void setAdrEmailDo(String adrEmailDo) {
		this.adrEmailDo = adrEmailDo;
	}

	public String getAdrEmailDw() {
		return this.adrEmailDw;
	}

	public void setAdrEmailDw(String adrEmailDw) {
		this.adrEmailDw = adrEmailDw;
	}

	public String getAdrFAktualne() {
		return this.adrFAktualne;
	}

	public void setAdrFAktualne(String adrFAktualne) {
		this.adrFAktualne = adrFAktualne;
	}

	public BigDecimal getAdrGmId() {
		return this.adrGmId;
	}

	public void setAdrGmId(BigDecimal adrGmId) {
		this.adrGmId = adrGmId;
	}

	public String getAdrGmina() {
		return this.adrGmina;
	}

	public void setAdrGmina(String adrGmina) {
		this.adrGmina = adrGmina;
	}

	public String getAdrGmina2() {
		return this.adrGmina2;
	}

	public void setAdrGmina2(String adrGmina2) {
		this.adrGmina2 = adrGmina2;
	}

	public String getAdrGmina3() {
		return this.adrGmina3;
	}

	public void setAdrGmina3(String adrGmina3) {
		this.adrGmina3 = adrGmina3;
	}

	public String getAdrGmina4() {
		return this.adrGmina4;
	}

	public void setAdrGmina4(String adrGmina4) {
		this.adrGmina4 = adrGmina4;
	}

	public String getAdrGmina5() {
		return this.adrGmina5;
	}

	public void setAdrGmina5(String adrGmina5) {
		this.adrGmina5 = adrGmina5;
	}

	public String getAdrGmina6() {
		return this.adrGmina6;
	}

	public void setAdrGmina6(String adrGmina6) {
		this.adrGmina6 = adrGmina6;
	}

	public String getAdrGmina7() {
		return this.adrGmina7;
	}

	public void setAdrGmina7(String adrGmina7) {
		this.adrGmina7 = adrGmina7;
	}

	public String getAdrGmina8() {
		return this.adrGmina8;
	}

	public void setAdrGmina8(String adrGmina8) {
		this.adrGmina8 = adrGmina8;
	}

	public String getAdrGmina9() {
		return this.adrGmina9;
	}

	public void setAdrGmina9(String adrGmina9) {
		this.adrGmina9 = adrGmina9;
	}

	public BigDecimal getAdrJbnkId() {
		return this.adrJbnkId;
	}

	public void setAdrJbnkId(BigDecimal adrJbnkId) {
		this.adrJbnkId = adrJbnkId;
	}

	public BigDecimal getAdrKaId() {
		return this.adrKaId;
	}

	public void setAdrKaId(BigDecimal adrKaId) {
		this.adrKaId = adrKaId;
	}

	public Date getAdrKiedyModyfikowal() {
		return this.adrKiedyModyfikowal;
	}

	public void setAdrKiedyModyfikowal(Date adrKiedyModyfikowal) {
		this.adrKiedyModyfikowal = adrKiedyModyfikowal;
	}

	public Date getAdrKiedyUtworzyl() {
		return this.adrKiedyUtworzyl;
	}

	public void setAdrKiedyUtworzyl(Date adrKiedyUtworzyl) {
		this.adrKiedyUtworzyl = adrKiedyUtworzyl;
	}

	public BigDecimal getAdrKod() {
		return this.adrKod;
	}

	public void setAdrKod(BigDecimal adrKod) {
		this.adrKod = adrKod;
	}

	public String getAdrKodGusGminy() {
		return this.adrKodGusGminy;
	}

	public void setAdrKodGusGminy(String adrKodGusGminy) {
		this.adrKodGusGminy = adrKodGusGminy;
	}

	public String getAdrKodPocztowy() {
		return this.adrKodPocztowy;
	}

	public void setAdrKodPocztowy(String adrKodPocztowy) {
		this.adrKodPocztowy = adrKodPocztowy;
	}

	public String getAdrKomentarz() {
		return this.adrKomentarz;
	}

	public void setAdrKomentarz(String adrKomentarz) {
		this.adrKomentarz = adrKomentarz;
	}

	public String getAdrKomentarz2() {
		return this.adrKomentarz2;
	}

	public void setAdrKomentarz2(String adrKomentarz2) {
		this.adrKomentarz2 = adrKomentarz2;
	}

	public String getAdrKomentarz3() {
		return this.adrKomentarz3;
	}

	public void setAdrKomentarz3(String adrKomentarz3) {
		this.adrKomentarz3 = adrKomentarz3;
	}

	public String getAdrKomentarz4() {
		return this.adrKomentarz4;
	}

	public void setAdrKomentarz4(String adrKomentarz4) {
		this.adrKomentarz4 = adrKomentarz4;
	}

	public String getAdrKomentarz5() {
		return this.adrKomentarz5;
	}

	public void setAdrKomentarz5(String adrKomentarz5) {
		this.adrKomentarz5 = adrKomentarz5;
	}

	public String getAdrKomentarz6() {
		return this.adrKomentarz6;
	}

	public void setAdrKomentarz6(String adrKomentarz6) {
		this.adrKomentarz6 = adrKomentarz6;
	}

	public String getAdrKomentarz7() {
		return this.adrKomentarz7;
	}

	public void setAdrKomentarz7(String adrKomentarz7) {
		this.adrKomentarz7 = adrKomentarz7;
	}

	public String getAdrKomentarz8() {
		return this.adrKomentarz8;
	}

	public void setAdrKomentarz8(String adrKomentarz8) {
		this.adrKomentarz8 = adrKomentarz8;
	}

	public String getAdrKomentarz9() {
		return this.adrKomentarz9;
	}

	public void setAdrKomentarz9(String adrKomentarz9) {
		this.adrKomentarz9 = adrKomentarz9;
	}

	public BigDecimal getAdrKrId() {
		return this.adrKrId;
	}

	public void setAdrKrId(BigDecimal adrKrId) {
		this.adrKrId = adrKrId;
	}

	public BigDecimal getAdrLp() {
		return this.adrLp;
	}

	public void setAdrLp(BigDecimal adrLp) {
		this.adrLp = adrLp;
	}

	public String getAdrMail() {
		return this.adrMail;
	}

	public void setAdrMail(String adrMail) {
		this.adrMail = adrMail;
	}

	public String getAdrMiejscowosc() {
		return this.adrMiejscowosc;
	}

	public void setAdrMiejscowosc(String adrMiejscowosc) {
		this.adrMiejscowosc = adrMiejscowosc;
	}

	public String getAdrMiejscowosc2() {
		return this.adrMiejscowosc2;
	}

	public void setAdrMiejscowosc2(String adrMiejscowosc2) {
		this.adrMiejscowosc2 = adrMiejscowosc2;
	}

	public String getAdrMiejscowosc3() {
		return this.adrMiejscowosc3;
	}

	public void setAdrMiejscowosc3(String adrMiejscowosc3) {
		this.adrMiejscowosc3 = adrMiejscowosc3;
	}

	public String getAdrMiejscowosc4() {
		return this.adrMiejscowosc4;
	}

	public void setAdrMiejscowosc4(String adrMiejscowosc4) {
		this.adrMiejscowosc4 = adrMiejscowosc4;
	}

	public String getAdrMiejscowosc5() {
		return this.adrMiejscowosc5;
	}

	public void setAdrMiejscowosc5(String adrMiejscowosc5) {
		this.adrMiejscowosc5 = adrMiejscowosc5;
	}

	public String getAdrMiejscowosc6() {
		return this.adrMiejscowosc6;
	}

	public void setAdrMiejscowosc6(String adrMiejscowosc6) {
		this.adrMiejscowosc6 = adrMiejscowosc6;
	}

	public String getAdrMiejscowosc7() {
		return this.adrMiejscowosc7;
	}

	public void setAdrMiejscowosc7(String adrMiejscowosc7) {
		this.adrMiejscowosc7 = adrMiejscowosc7;
	}

	public String getAdrMiejscowosc8() {
		return this.adrMiejscowosc8;
	}

	public void setAdrMiejscowosc8(String adrMiejscowosc8) {
		this.adrMiejscowosc8 = adrMiejscowosc8;
	}

	public String getAdrMiejscowosc9() {
		return this.adrMiejscowosc9;
	}

	public void setAdrMiejscowosc9(String adrMiejscowosc9) {
		this.adrMiejscowosc9 = adrMiejscowosc9;
	}

	public String getAdrModyfikowal() {
		return this.adrModyfikowal;
	}

	public void setAdrModyfikowal(String adrModyfikowal) {
		this.adrModyfikowal = adrModyfikowal;
	}

	public BigDecimal getAdrMsId() {
		return this.adrMsId;
	}

	public void setAdrMsId(BigDecimal adrMsId) {
		this.adrMsId = adrMsId;
	}

	public String getAdrNip() {
		return this.adrNip;
	}

	public void setAdrNip(String adrNip) {
		this.adrNip = adrNip;
	}

	public String getAdrNipDane() {
		return this.adrNipDane;
	}

	public void setAdrNipDane(String adrNipDane) {
		this.adrNipDane = adrNipDane;
	}

	public String getAdrNipPrefiks() {
		return this.adrNipPrefiks;
	}

	public void setAdrNipPrefiks(String adrNipPrefiks) {
		this.adrNipPrefiks = adrNipPrefiks;
	}

	public String getAdrNumerDomu() {
		return this.adrNumerDomu;
	}

	public void setAdrNumerDomu(String adrNumerDomu) {
		this.adrNumerDomu = adrNumerDomu;
	}

	public String getAdrNumerDomu2() {
		return this.adrNumerDomu2;
	}

	public void setAdrNumerDomu2(String adrNumerDomu2) {
		this.adrNumerDomu2 = adrNumerDomu2;
	}

	public String getAdrNumerDomu3() {
		return this.adrNumerDomu3;
	}

	public void setAdrNumerDomu3(String adrNumerDomu3) {
		this.adrNumerDomu3 = adrNumerDomu3;
	}

	public String getAdrNumerDomu4() {
		return this.adrNumerDomu4;
	}

	public void setAdrNumerDomu4(String adrNumerDomu4) {
		this.adrNumerDomu4 = adrNumerDomu4;
	}

	public String getAdrNumerDomu5() {
		return this.adrNumerDomu5;
	}

	public void setAdrNumerDomu5(String adrNumerDomu5) {
		this.adrNumerDomu5 = adrNumerDomu5;
	}

	public String getAdrNumerDomu6() {
		return this.adrNumerDomu6;
	}

	public void setAdrNumerDomu6(String adrNumerDomu6) {
		this.adrNumerDomu6 = adrNumerDomu6;
	}

	public String getAdrNumerDomu7() {
		return this.adrNumerDomu7;
	}

	public void setAdrNumerDomu7(String adrNumerDomu7) {
		this.adrNumerDomu7 = adrNumerDomu7;
	}

	public String getAdrNumerDomu8() {
		return this.adrNumerDomu8;
	}

	public void setAdrNumerDomu8(String adrNumerDomu8) {
		this.adrNumerDomu8 = adrNumerDomu8;
	}

	public String getAdrNumerDomu9() {
		return this.adrNumerDomu9;
	}

	public void setAdrNumerDomu9(String adrNumerDomu9) {
		this.adrNumerDomu9 = adrNumerDomu9;
	}

	public String getAdrNumerLokalu() {
		return this.adrNumerLokalu;
	}

	public void setAdrNumerLokalu(String adrNumerLokalu) {
		this.adrNumerLokalu = adrNumerLokalu;
	}

	public BigDecimal getAdrObId() {
		return this.adrObId;
	}

	public void setAdrObId(BigDecimal adrObId) {
		this.adrObId = adrObId;
	}

	public String getAdrPoczta() {
		return this.adrPoczta;
	}

	public void setAdrPoczta(String adrPoczta) {
		this.adrPoczta = adrPoczta;
	}

	public String getAdrPoczta2() {
		return this.adrPoczta2;
	}

	public void setAdrPoczta2(String adrPoczta2) {
		this.adrPoczta2 = adrPoczta2;
	}

	public String getAdrPoczta3() {
		return this.adrPoczta3;
	}

	public void setAdrPoczta3(String adrPoczta3) {
		this.adrPoczta3 = adrPoczta3;
	}

	public String getAdrPoczta4() {
		return this.adrPoczta4;
	}

	public void setAdrPoczta4(String adrPoczta4) {
		this.adrPoczta4 = adrPoczta4;
	}

	public String getAdrPoczta5() {
		return this.adrPoczta5;
	}

	public void setAdrPoczta5(String adrPoczta5) {
		this.adrPoczta5 = adrPoczta5;
	}

	public String getAdrPoczta6() {
		return this.adrPoczta6;
	}

	public void setAdrPoczta6(String adrPoczta6) {
		this.adrPoczta6 = adrPoczta6;
	}

	public String getAdrPoczta7() {
		return this.adrPoczta7;
	}

	public void setAdrPoczta7(String adrPoczta7) {
		this.adrPoczta7 = adrPoczta7;
	}

	public String getAdrPoczta8() {
		return this.adrPoczta8;
	}

	public void setAdrPoczta8(String adrPoczta8) {
		this.adrPoczta8 = adrPoczta8;
	}

	public String getAdrPoczta9() {
		return this.adrPoczta9;
	}

	public void setAdrPoczta9(String adrPoczta9) {
		this.adrPoczta9 = adrPoczta9;
	}

	public BigDecimal getAdrPolozenieX() {
		return this.adrPolozenieX;
	}

	public void setAdrPolozenieX(BigDecimal adrPolozenieX) {
		this.adrPolozenieX = adrPolozenieX;
	}

	public BigDecimal getAdrPolozenieY() {
		return this.adrPolozenieY;
	}

	public void setAdrPolozenieY(BigDecimal adrPolozenieY) {
		this.adrPolozenieY = adrPolozenieY;
	}

	public BigDecimal getAdrPowId() {
		return this.adrPowId;
	}

	public void setAdrPowId(BigDecimal adrPowId) {
		this.adrPowId = adrPowId;
	}

	public String getAdrPowiat() {
		return this.adrPowiat;
	}

	public void setAdrPowiat(String adrPowiat) {
		this.adrPowiat = adrPowiat;
	}

	public String getAdrPowiat2() {
		return this.adrPowiat2;
	}

	public void setAdrPowiat2(String adrPowiat2) {
		this.adrPowiat2 = adrPowiat2;
	}

	public String getAdrPowiat3() {
		return this.adrPowiat3;
	}

	public void setAdrPowiat3(String adrPowiat3) {
		this.adrPowiat3 = adrPowiat3;
	}

	public String getAdrPowiat4() {
		return this.adrPowiat4;
	}

	public void setAdrPowiat4(String adrPowiat4) {
		this.adrPowiat4 = adrPowiat4;
	}

	public String getAdrPowiat5() {
		return this.adrPowiat5;
	}

	public void setAdrPowiat5(String adrPowiat5) {
		this.adrPowiat5 = adrPowiat5;
	}

	public String getAdrPowiat6() {
		return this.adrPowiat6;
	}

	public void setAdrPowiat6(String adrPowiat6) {
		this.adrPowiat6 = adrPowiat6;
	}

	public String getAdrPowiat7() {
		return this.adrPowiat7;
	}

	public void setAdrPowiat7(String adrPowiat7) {
		this.adrPowiat7 = adrPowiat7;
	}

	public String getAdrPowiat8() {
		return this.adrPowiat8;
	}

	public void setAdrPowiat8(String adrPowiat8) {
		this.adrPowiat8 = adrPowiat8;
	}

	public String getAdrPowiat9() {
		return this.adrPowiat9;
	}

	public void setAdrPowiat9(String adrPowiat9) {
		this.adrPowiat9 = adrPowiat9;
	}

	public String getAdrPowodModyfikacji() {
		return this.adrPowodModyfikacji;
	}

	public void setAdrPowodModyfikacji(String adrPowodModyfikacji) {
		this.adrPowodModyfikacji = adrPowodModyfikacji;
	}

	public BigDecimal getAdrPrcId() {
		return this.adrPrcId;
	}

	public void setAdrPrcId(BigDecimal adrPrcId) {
		this.adrPrcId = adrPrcId;
	}

	public String getAdrRegon() {
		return this.adrRegon;
	}

	public void setAdrRegon(String adrRegon) {
		this.adrRegon = adrRegon;
	}

	public BigDecimal getAdrRpId() {
		return this.adrRpId;
	}

	public void setAdrRpId(BigDecimal adrRpId) {
		this.adrRpId = adrRpId;
	}

	public String getAdrSkrytkaPocztowa() {
		return this.adrSkrytkaPocztowa;
	}

	public void setAdrSkrytkaPocztowa(String adrSkrytkaPocztowa) {
		this.adrSkrytkaPocztowa = adrSkrytkaPocztowa;
	}

	public String getAdrStan() {
		return this.adrStan;
	}

	public void setAdrStan(String adrStan) {
		this.adrStan = adrStan;
	}

	public String getAdrTyp() {
		return this.adrTyp;
	}

	public void setAdrTyp(String adrTyp) {
		this.adrTyp = adrTyp;
	}

	public String getAdrTypMiejscowosci() {
		return this.adrTypMiejscowosci;
	}

	public void setAdrTypMiejscowosci(String adrTypMiejscowosci) {
		this.adrTypMiejscowosci = adrTypMiejscowosci;
	}

	public String getAdrTypUlicy() {
		return this.adrTypUlicy;
	}

	public void setAdrTypUlicy(String adrTypUlicy) {
		this.adrTypUlicy = adrTypUlicy;
	}

	public BigDecimal getAdrUlId() {
		return this.adrUlId;
	}

	public void setAdrUlId(BigDecimal adrUlId) {
		this.adrUlId = adrUlId;
	}

	public String getAdrUlica() {
		return this.adrUlica;
	}

	public void setAdrUlica(String adrUlica) {
		this.adrUlica = adrUlica;
	}

	public String getAdrUlica2() {
		return this.adrUlica2;
	}

	public void setAdrUlica2(String adrUlica2) {
		this.adrUlica2 = adrUlica2;
	}

	public String getAdrUlica3() {
		return this.adrUlica3;
	}

	public void setAdrUlica3(String adrUlica3) {
		this.adrUlica3 = adrUlica3;
	}

	public String getAdrUlica4() {
		return this.adrUlica4;
	}

	public void setAdrUlica4(String adrUlica4) {
		this.adrUlica4 = adrUlica4;
	}

	public String getAdrUlica5() {
		return this.adrUlica5;
	}

	public void setAdrUlica5(String adrUlica5) {
		this.adrUlica5 = adrUlica5;
	}

	public String getAdrUlica6() {
		return this.adrUlica6;
	}

	public void setAdrUlica6(String adrUlica6) {
		this.adrUlica6 = adrUlica6;
	}

	public String getAdrUlica7() {
		return this.adrUlica7;
	}

	public void setAdrUlica7(String adrUlica7) {
		this.adrUlica7 = adrUlica7;
	}

	public String getAdrUlica8() {
		return this.adrUlica8;
	}

	public void setAdrUlica8(String adrUlica8) {
		this.adrUlica8 = adrUlica8;
	}

	public String getAdrUlica9() {
		return this.adrUlica9;
	}

	public void setAdrUlica9(String adrUlica9) {
		this.adrUlica9 = adrUlica9;
	}

	public String getAdrUtworzyl() {
		return this.adrUtworzyl;
	}

	public void setAdrUtworzyl(String adrUtworzyl) {
		this.adrUtworzyl = adrUtworzyl;
	}

	public BigDecimal getAdrWojId() {
		return this.adrWojId;
	}

	public void setAdrWojId(BigDecimal adrWojId) {
		this.adrWojId = adrWojId;
	}

	public String getAdrZatwierdzony() {
		return this.adrZatwierdzony;
	}

	public void setAdrZatwierdzony(String adrZatwierdzony) {
		this.adrZatwierdzony = adrZatwierdzony;
	}

	public CkkKlienci getCkkKlienci() {
		return this.ckkKlienci;
	}

	public void setCkkKlienci(CkkKlienci ckkKlienci) {
		this.ckkKlienci = ckkKlienci;
	}

}