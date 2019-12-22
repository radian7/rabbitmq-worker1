package com.rabbitmq.cwiczenia.rabbitmqworker1.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CKK_KLIENCI_DANE database table.
 * 
 */
@Entity
@Table(name="CKK_KLIENCI_DANE")
@NamedQuery(name="CkkKlienciDane.findAll", query="SELECT c FROM CkkKlienciDane c")
public class CkkKlienciDane implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KLD_ID", unique=true, nullable=false, precision=10)
	private long kldId;

	@Column(name="KLD_AUDYT_KM", length=100)
	private String kldAudytKm;

	@Column(name="KLD_AUDYT_KT", length=100)
	private String kldAudytKt;

	@Column(name="KLD_AUDYT_LM")
	private BigDecimal kldAudytLm;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_BDO_DATA_ROZP_DZIAL")
	private Date kldBdoDataRozpDzial;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_BDO_DATA_UZYSK_UPR")
	private Date kldBdoDataUzyskUpr;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_BDO_DATA_WYKRESLENIA")
	private Date kldBdoDataWykreslenia;

	@Column(name="KLD_BDO_DYREKTOR", length=200)
	private String kldBdoDyrektor;

	@Column(name="KLD_BDO_F_DOTOWANA", length=1)
	private String kldBdoFDotowana;

	@Column(name="KLD_BDO_F_POSIADA_FILIE", length=1)
	private String kldBdoFPosiadaFilie;

	@Column(name="KLD_BDO_GRUPA_EWID", length=20)
	private String kldBdoGrupaEwid;

	@Column(name="KLD_BDO_KATEGORIA_UCZNIOW")
	private BigDecimal kldBdoKategoriaUczniow;

	@Column(name="KLD_BDO_KL_KOD_FILIA")
	private BigDecimal kldBdoKlKodFilia;

	@Column(name="KLD_BDO_KL_KOD_JEDN_PROW")
	private BigDecimal kldBdoKlKodJednProw;

	@Column(name="KLD_BDO_KL_KOD_ZESPOLU")
	private BigDecimal kldBdoKlKodZespolu;

	@Column(name="KLD_BDO_NAZWA_PATRONA", length=200)
	private String kldBdoNazwaPatrona;

	@Column(name="KLD_BDO_NR_EWID", length=20)
	private String kldBdoNrEwid;

	@Column(name="KLD_BDO_PODBUDOWA")
	private BigDecimal kldBdoPodbudowa;

	@Column(name="KLD_BDO_PUBLICZNA")
	private BigDecimal kldBdoPubliczna;

	@Column(name="KLD_BDO_RODZAJ_JEDN_PROW")
	private BigDecimal kldBdoRodzajJednProw;

	@Column(name="KLD_BDO_RODZAJ_NIEPELNOSPR")
	private BigDecimal kldBdoRodzajNiepelnospr;

	@Column(name="KLD_BDO_TRYB_NAUKI")
	private BigDecimal kldBdoTrybNauki;

	@Column(name="KLD_BDO_TYP_ODDZIALU")
	private BigDecimal kldBdoTypOddzialu;

	@Column(name="KLD_BDO_TYP_WG_MEN", length=10)
	private String kldBdoTypWgMen;

	@Column(name="KLD_BDO_TYP_WG_UMK", length=10)
	private String kldBdoTypWgUmk;

	@Column(name="KLD_BDO_UCZNIOWIE_DOTACJA")
	private BigDecimal kldBdoUczniowieDotacja;

	@Column(name="KLD_BDO_ZWIAZANIE_Z_ORG")
	private BigDecimal kldBdoZwiazanieZOrg;

	@Column(name="KLD_BIEZACE_SPRAWOZD_DOCHOD", precision=14, scale=2)
	private BigDecimal kldBiezaceSprawozdDochod;

	@Column(name="KLD_BIEZACE_SPRAWOZD_PRZYCHOD", precision=14, scale=2)
	private BigDecimal kldBiezaceSprawozdPrzychod;

	@Column(name="KLD_CRM_KLASA_I_SEGM_OBSLUGI", length=4)
	private String kldCrmKlasaISegmObslugi;

	@Column(name="KLD_CRM_PODSEGMENT", length=4)
	private String kldCrmPodsegment;

	@Column(name="KLD_CRM_TYP", length=4)
	private String kldCrmTyp;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_MODYFIKACJI")
	private Date kldDataModyfikacji;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_OSW_BIK")
	private Date kldDataOswBik;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_POWSTANIA")
	private Date kldDataPowstania;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_REJESTRACJI")
	private Date kldDataRejestracji;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_REZYGNACJI")
	private Date kldDataRezygnacji;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_UMOCOWANIA_1")
	private Date kldDataUmocowania1;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_UMOCOWANIA_100001")
	private Date kldDataUmocowania100001;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_URODZENIA")
	private Date kldDataUrodzenia;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_DATA_ZGODY")
	private Date kldDataZgody;

	@Column(name="KLD_DECYZJA")
	private BigDecimal kldDecyzja;

	@Column(name="KLD_DEF0", length=240)
	private String kldDef0;

	@Column(name="KLD_DEF1", length=240)
	private String kldDef1;

	@Column(name="KLD_DEF2", length=240)
	private String kldDef2;

	@Column(name="KLD_DEF3", length=240)
	private String kldDef3;

	@Column(name="KLD_DEF4", length=240)
	private String kldDef4;

	@Column(name="KLD_DEF5", length=240)
	private String kldDef5;

	@Column(name="KLD_DEF6")
	private String kldDef6;

	@Column(name="KLD_DEKLARACJA_FRM", precision=10)
	private BigDecimal kldDeklaracjaFrm;

	@Column(name="KLD_DORADCA1", length=240)
	private String kldDoradca1;

	@Column(name="KLD_DORADCA2", length=240)
	private String kldDoradca2;

	@Column(name="KLD_DORADCA3", length=240)
	private String kldDoradca3;

	@Column(name="KLD_DRUGIE_IMIE", length=50)
	private String kldDrugieImie;

	@Column(name="KLD_E_FAKTURA", length=1)
	private String kldEFaktura;

	@Column(name="KLD_EMAIL_ALT", length=120)
	private String kldEmailAlt;

	@Column(name="KLD_EMAIL_DO", length=120)
	private String kldEmailDo;

	@Column(name="KLD_EMAIL_DW", length=240)
	private String kldEmailDw;

	@Column(name="KLD_F_AKTUALNE", nullable=false, length=1)
	private String kldFAktualne;

	@Column(name="KLD_F_BYL_KONTAKT", length=1)
	private String kldFBylKontakt;

	@Column(name="KLD_F_GENEROWAC_WEZWANIA", nullable=false, length=1)
	private String kldFGenerowacWezwania;

	@Column(name="KLD_F_KAPITAL_ZAGR", nullable=false, length=1)
	private String kldFKapitalZagr;

	@Column(name="KLD_F_OCHRONA_DANYCH", length=1)
	private String kldFOchronaDanych;

	@Column(name="KLD_F_PODEJRZANY", nullable=false, length=1)
	private String kldFPodejrzany;

	@Column(name="KLD_F_PODZIELONA_PLATNOSC", nullable=false, length=1)
	private String kldFPodzielonaPlatnosc;

	@Column(name="KLD_F_REZYDENT", length=1)
	private String kldFRezydent;

	@Column(name="KLD_F_SPRZ_PRZETW_DANYCH", length=2)
	private String kldFSprzPrzetwDanych;

	@Column(name="KLD_F_STRUKTURA_ZLOZONA", length=1)
	private String kldFStrukturaZlozona;

	@Column(name="KLD_F_UDOST_GRUPA", precision=5)
	private BigDecimal kldFUdostGrupa;

	@Column(name="KLD_F_ZGODA_NA_KONTAKT", length=1)
	private String kldFZgodaNaKontakt;

	@Column(name="KLD_F_ZGODA_NA_KORESP", length=1)
	private String kldFZgodaNaKoresp;

	@Column(name="KLD_F_ZWOLNIONY_CERT", nullable=false, length=1)
	private String kldFZwolnionyCert;

	@Column(name="KLD_FORMA_WLASNOSCI", length=3)
	private String kldFormaWlasnosci;

	@Column(name="KLD_ILU_KOMPLEMENTARIUSZY", precision=10)
	private BigDecimal kldIluKomplementariuszy;

	@Column(name="KLD_IMIE", length=50)
	private String kldImie;

	@Column(name="KLD_IMIE_MATKI", length=50)
	private String kldImieMatki;

	@Column(name="KLD_IMIE_OJCA", length=50)
	private String kldImieOjca;

	@Column(name="KLD_IMIE2", length=50)
	private String kldImie2;

	@Column(name="KLD_IMIE3", length=50)
	private String kldImie3;

	@Column(name="KLD_IMIE4", length=50)
	private String kldImie4;

	@Column(name="KLD_IMIE5", length=50)
	private String kldImie5;

	@Column(name="KLD_IMIE6", length=50)
	private String kldImie6;

	@Column(name="KLD_IMIE7", length=50)
	private String kldImie7;

	@Column(name="KLD_IMIE8", length=50)
	private String kldImie8;

	@Column(name="KLD_IMIE9", length=50)
	private String kldImie9;

	@Column(name="KLD_INNA_DZIALALNOSC", length=100)
	private String kldInnaDzialalnosc;

	@Column(name="KLD_ISIC", length=240)
	private String kldIsic;

	@Column(name="KLD_KAPITAL_WPLACONY", precision=14, scale=2)
	private BigDecimal kldKapitalWplacony;

	@Column(name="KLD_KAPITAL_ZAKLADOWY", precision=14, scale=2)
	private BigDecimal kldKapitalZakladowy;

	@Column(name="KLD_KATEGORIA_RYZYKA", length=4)
	private String kldKategoriaRyzyka;

	@Column(name="KLD_KGN", length=30)
	private String kldKgn;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_KIEDY_MODYFIKOWAL")
	private Date kldKiedyModyfikowal;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_KIEDY_UTWORZYL", nullable=false)
	private Date kldKiedyUtworzyl;

	@Column(name="KLD_KL_KOD_TKL", precision=10)
	private BigDecimal kldKlKodTkl;

	@Column(name="KLD_KNT_ID", precision=10)
	private BigDecimal kldKntId;

	@Column(name="KLD_KOD_RYZYKA", length=4)
	private String kldKodRyzyka;

	@Column(name="KLD_KOD_RYZYKA_NALEZN_NAJG", length=4)
	private String kldKodRyzykaNaleznNajg;

	@Column(name="KLD_KOMENTARZ", length=240)
	private String kldKomentarz;

	@Column(name="KLD_KONTO_KG", length=200)
	private String kldKontoKg;

	@Column(name="KLD_KR_ID")
	private BigDecimal kldKrId;

	@Column(name="KLD_KR_ID_REJ_DZ", precision=10)
	private BigDecimal kldKrIdRejDz;

	@Column(name="KLD_KR_ID_URODZENIA", precision=10)
	private BigDecimal kldKrIdUrodzenia;

	@Column(name="KLD_KRS", length=50)
	private String kldKrs;

	@Column(name="KLD_LICZBA_WSPOLNIKOW")
	private BigDecimal kldLiczbaWspolnikow;

	@Column(name="KLD_MIEJSCE_URODZENIA", length=100)
	private String kldMiejsceUrodzenia;

	@Column(name="KLD_MIESIAC_DEKLARACJI", length=2)
	private String kldMiesiacDeklaracji;

	@Column(name="KLD_MODYFIKOWAL", length=30)
	private String kldModyfikowal;

	@Column(name="KLD_NACE", length=240)
	private String kldNace;

	@Column(name="KLD_NAZWA", nullable=false, length=240)
	private String kldNazwa;

	@Column(name="KLD_NAZWA_NA_WYDRUKI", length=1000)
	private String kldNazwaNaWydruki;

	@Column(name="KLD_NAZWA2", length=240)
	private String kldNazwa2;

	@Column(name="KLD_NAZWA3", length=240)
	private String kldNazwa3;

	@Column(name="KLD_NAZWA4", length=240)
	private String kldNazwa4;

	@Column(name="KLD_NAZWA5", length=240)
	private String kldNazwa5;

	@Column(name="KLD_NAZWA6", length=240)
	private String kldNazwa6;

	@Column(name="KLD_NAZWA7", length=240)
	private String kldNazwa7;

	@Column(name="KLD_NAZWA8", length=240)
	private String kldNazwa8;

	@Column(name="KLD_NAZWA9", length=240)
	private String kldNazwa9;

	@Column(name="KLD_NAZWISKO", length=240)
	private String kldNazwisko;

	@Column(name="KLD_NAZWISKO_DRUGIE", length=240)
	private String kldNazwiskoDrugie;

	@Column(name="KLD_NAZWISKO2", length=240)
	private String kldNazwisko2;

	@Column(name="KLD_NAZWISKO3", length=240)
	private String kldNazwisko3;

	@Column(name="KLD_NAZWISKO4", length=240)
	private String kldNazwisko4;

	@Column(name="KLD_NAZWISKO5", length=240)
	private String kldNazwisko5;

	@Column(name="KLD_NAZWISKO6", length=240)
	private String kldNazwisko6;

	@Column(name="KLD_NAZWISKO7", length=240)
	private String kldNazwisko7;

	@Column(name="KLD_NAZWISKO8", length=240)
	private String kldNazwisko8;

	@Column(name="KLD_NAZWISKO9", length=240)
	private String kldNazwisko9;

	@Column(name="KLD_NIP", length=25)
	private String kldNip;

	@Column(name="KLD_NIP_DANE", length=22)
	private String kldNipDane;

	@Column(name="KLD_NIP_PREFIKS", length=3)
	private String kldNipPrefiks;

	@Column(name="KLD_NR_REJESTRU", length=256)
	private String kldNrRejestru;

	@Column(name="KLD_NUMER_NIEREZYDENTA", length=256)
	private String kldNumerNierezydenta;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_OBOWIAZUJE_DO")
	private Date kldObowiazujeDo;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_OBOWIAZUJE_OD")
	private Date kldObowiazujeOd;

	@Column(name="KLD_OBY_KR_ID", precision=10)
	private BigDecimal kldObyKrId;

	@Column(name="KLD_OBY_KR_ID_WYDANIA", precision=10)
	private BigDecimal kldObyKrIdWydania;

	@Column(name="KLD_OBY_RODZAJ_DOKUMENTU", length=240)
	private String kldObyRodzajDokumentu;

	@Column(name="KLD_OBY_SERIA_NUMER_DOK", length=240)
	private String kldObySeriaNumerDok;

	@Column(name="KLD_ODDZIAL", length=3)
	private String kldOddzial;

	@Column(name="KLD_ODDZIAL_CIS", precision=38)
	private BigDecimal kldOddzialCis;

	@Temporal(TemporalType.DATE)
	@Column(name="KLD_OGRN_DATA")
	private Date kldOgrnData;

	@Column(name="KLD_OGRN_NUMER", precision=15)
	private BigDecimal kldOgrnNumer;

	@Column(name="KLD_OGRN_ORGAN_REJ", length=100)
	private String kldOgrnOrganRej;

	@Column(name="KLD_OPIS_RODZ_DZIALALN", length=100)
	private String kldOpisRodzDzialaln;

	@Column(name="KLD_ORGAN_EWIDENCYJNY", length=100)
	private String kldOrganEwidencyjny;

	@Column(name="KLD_OSTATNI_ROK_OBRACH", precision=4)
	private BigDecimal kldOstatniRokObrach;

	@Column(name="KLD_OSTATNI_ROK_OBRACH_DOCHOD", precision=14, scale=2)
	private BigDecimal kldOstatniRokObrachDochod;

	@Column(name="KLD_OSTATNI_ROK_OBRACH_PRZYCH", precision=14, scale=2)
	private BigDecimal kldOstatniRokObrachPrzych;

	@Column(name="KLD_OSTATNI_ROK_OBRACH_TYP_PIT", length=1)
	private String kldOstatniRokObrachTypPit;

	@Column(name="KLD_PELNOMOCNICTWO_1")
	private BigDecimal kldPelnomocnictwo1;

	@Column(name="KLD_PELNOMOCNICTWO_100001")
	private BigDecimal kldPelnomocnictwo100001;

	@Column(name="KLD_PEP", precision=10)
	private BigDecimal kldPep;

	@Column(name="KLD_PESEL", length=11)
	private String kldPesel;

	@Column(name="KLD_PKD", length=240)
	private String kldPkd;

	@Column(name="KLD_PLEC", length=1)
	private String kldPlec;

	@Column(name="KLD_POWOD_MODYFIKACJI", length=240)
	private String kldPowodModyfikacji;

	@Column(name="KLD_PREF_FORMA_KONTAKTU", length=2)
	private String kldPrefFormaKontaktu;

	@Column(name="KLD_RBA", precision=10)
	private BigDecimal kldRba;

	@Column(name="KLD_REGON", length=20)
	private String kldRegon;

	@Column(name="KLD_RODZAJ_OSW_BIK", length=10)
	private String kldRodzajOswBik;

	@Column(name="KLD_RODZAJ_WYSYLKI", length=1)
	private String kldRodzajWysylki;

	@Column(name="KLD_SAD", length=1024)
	private String kldSad;

	@Column(name="KLD_SPOSOB_ZAPLATY", length=5)
	private String kldSposobZaplaty;

	@Column(name="KLD_STAN", length=10)
	private String kldStan;

	@Column(name="KLD_STAN_DOKUMENTACJI", length=1)
	private String kldStanDokumentacji;

	@Column(name="KLD_STATUS_GIODO", length=1)
	private String kldStatusGiodo;

	@Column(name="KLD_SUMA_KREDYTOW_POZA_BZWBK", precision=14, scale=2)
	private BigDecimal kldSumaKredytowPozaBzwbk;

	@Column(name="KLD_SUMA_RAT_NETTO_POZA_BZWBK", precision=14, scale=2)
	private BigDecimal kldSumaRatNettoPozaBzwbk;

	@Column(name="KLD_SWIFT", length=100)
	private String kldSwift;

	@Column(name="KLD_TEMP", length=234)
	private String kldTemp;

	@Column(name="KLD_TEMP2", length=123)
	private String kldTemp2;

	@Column(name="KLD_TEMP3", length=123)
	private String kldTemp3;

	@Column(name="KLD_TERMIN_ZAPLATY", precision=3)
	private BigDecimal kldTerminZaplaty;

	@Column(name="KLD_TERMIN_ZAPLATY_VAT", precision=3)
	private BigDecimal kldTerminZaplatyVat;

	@Column(name="KLD_TK_ID", precision=10)
	private BigDecimal kldTkId;

	@Column(name="KLD_TYP", nullable=false, length=1)
	private String kldTyp;

	@Column(name="KLD_TYP_KURSU", length=1)
	private String kldTypKursu;

	@Column(name="KLD_URZAD_SKARBOWY", length=240)
	private String kldUrzadSkarbowy;

	@Column(name="KLD_URZAD_STATYSTYCZNY", length=240)
	private String kldUrzadStatystyczny;

	@Column(name="KLD_UTWORZYL", nullable=false, length=30)
	private String kldUtworzyl;

	@Column(name="KLD_WARUNKI_ZAPLATY", length=3)
	private String kldWarunkiZaplaty;

	@Column(name="KLD_WYKSZTALCENIE", precision=3)
	private BigDecimal kldWyksztalcenie;

	@Column(name="KLD_ZATWIERDZONY", nullable=false, length=1)
	private String kldZatwierdzony;

	//bi-directional many-to-one association to CkkKlienci
	@ManyToOne
	@JoinColumn(name="KLD_KL_KOD", nullable=false)
	@JsonBackReference
	private CkkKlienci ckkKlienci;

	public CkkKlienciDane() {
	}

	public long getKldId() {
		return this.kldId;
	}

	public void setKldId(long kldId) {
		this.kldId = kldId;
	}

	public String getKldAudytKm() {
		return this.kldAudytKm;
	}

	public void setKldAudytKm(String kldAudytKm) {
		this.kldAudytKm = kldAudytKm;
	}

	public String getKldAudytKt() {
		return this.kldAudytKt;
	}

	public void setKldAudytKt(String kldAudytKt) {
		this.kldAudytKt = kldAudytKt;
	}

	public BigDecimal getKldAudytLm() {
		return this.kldAudytLm;
	}

	public void setKldAudytLm(BigDecimal kldAudytLm) {
		this.kldAudytLm = kldAudytLm;
	}

	public Date getKldBdoDataRozpDzial() {
		return this.kldBdoDataRozpDzial;
	}

	public void setKldBdoDataRozpDzial(Date kldBdoDataRozpDzial) {
		this.kldBdoDataRozpDzial = kldBdoDataRozpDzial;
	}

	public Date getKldBdoDataUzyskUpr() {
		return this.kldBdoDataUzyskUpr;
	}

	public void setKldBdoDataUzyskUpr(Date kldBdoDataUzyskUpr) {
		this.kldBdoDataUzyskUpr = kldBdoDataUzyskUpr;
	}

	public Date getKldBdoDataWykreslenia() {
		return this.kldBdoDataWykreslenia;
	}

	public void setKldBdoDataWykreslenia(Date kldBdoDataWykreslenia) {
		this.kldBdoDataWykreslenia = kldBdoDataWykreslenia;
	}

	public String getKldBdoDyrektor() {
		return this.kldBdoDyrektor;
	}

	public void setKldBdoDyrektor(String kldBdoDyrektor) {
		this.kldBdoDyrektor = kldBdoDyrektor;
	}

	public String getKldBdoFDotowana() {
		return this.kldBdoFDotowana;
	}

	public void setKldBdoFDotowana(String kldBdoFDotowana) {
		this.kldBdoFDotowana = kldBdoFDotowana;
	}

	public String getKldBdoFPosiadaFilie() {
		return this.kldBdoFPosiadaFilie;
	}

	public void setKldBdoFPosiadaFilie(String kldBdoFPosiadaFilie) {
		this.kldBdoFPosiadaFilie = kldBdoFPosiadaFilie;
	}

	public String getKldBdoGrupaEwid() {
		return this.kldBdoGrupaEwid;
	}

	public void setKldBdoGrupaEwid(String kldBdoGrupaEwid) {
		this.kldBdoGrupaEwid = kldBdoGrupaEwid;
	}

	public BigDecimal getKldBdoKategoriaUczniow() {
		return this.kldBdoKategoriaUczniow;
	}

	public void setKldBdoKategoriaUczniow(BigDecimal kldBdoKategoriaUczniow) {
		this.kldBdoKategoriaUczniow = kldBdoKategoriaUczniow;
	}

	public BigDecimal getKldBdoKlKodFilia() {
		return this.kldBdoKlKodFilia;
	}

	public void setKldBdoKlKodFilia(BigDecimal kldBdoKlKodFilia) {
		this.kldBdoKlKodFilia = kldBdoKlKodFilia;
	}

	public BigDecimal getKldBdoKlKodJednProw() {
		return this.kldBdoKlKodJednProw;
	}

	public void setKldBdoKlKodJednProw(BigDecimal kldBdoKlKodJednProw) {
		this.kldBdoKlKodJednProw = kldBdoKlKodJednProw;
	}

	public BigDecimal getKldBdoKlKodZespolu() {
		return this.kldBdoKlKodZespolu;
	}

	public void setKldBdoKlKodZespolu(BigDecimal kldBdoKlKodZespolu) {
		this.kldBdoKlKodZespolu = kldBdoKlKodZespolu;
	}

	public String getKldBdoNazwaPatrona() {
		return this.kldBdoNazwaPatrona;
	}

	public void setKldBdoNazwaPatrona(String kldBdoNazwaPatrona) {
		this.kldBdoNazwaPatrona = kldBdoNazwaPatrona;
	}

	public String getKldBdoNrEwid() {
		return this.kldBdoNrEwid;
	}

	public void setKldBdoNrEwid(String kldBdoNrEwid) {
		this.kldBdoNrEwid = kldBdoNrEwid;
	}

	public BigDecimal getKldBdoPodbudowa() {
		return this.kldBdoPodbudowa;
	}

	public void setKldBdoPodbudowa(BigDecimal kldBdoPodbudowa) {
		this.kldBdoPodbudowa = kldBdoPodbudowa;
	}

	public BigDecimal getKldBdoPubliczna() {
		return this.kldBdoPubliczna;
	}

	public void setKldBdoPubliczna(BigDecimal kldBdoPubliczna) {
		this.kldBdoPubliczna = kldBdoPubliczna;
	}

	public BigDecimal getKldBdoRodzajJednProw() {
		return this.kldBdoRodzajJednProw;
	}

	public void setKldBdoRodzajJednProw(BigDecimal kldBdoRodzajJednProw) {
		this.kldBdoRodzajJednProw = kldBdoRodzajJednProw;
	}

	public BigDecimal getKldBdoRodzajNiepelnospr() {
		return this.kldBdoRodzajNiepelnospr;
	}

	public void setKldBdoRodzajNiepelnospr(BigDecimal kldBdoRodzajNiepelnospr) {
		this.kldBdoRodzajNiepelnospr = kldBdoRodzajNiepelnospr;
	}

	public BigDecimal getKldBdoTrybNauki() {
		return this.kldBdoTrybNauki;
	}

	public void setKldBdoTrybNauki(BigDecimal kldBdoTrybNauki) {
		this.kldBdoTrybNauki = kldBdoTrybNauki;
	}

	public BigDecimal getKldBdoTypOddzialu() {
		return this.kldBdoTypOddzialu;
	}

	public void setKldBdoTypOddzialu(BigDecimal kldBdoTypOddzialu) {
		this.kldBdoTypOddzialu = kldBdoTypOddzialu;
	}

	public String getKldBdoTypWgMen() {
		return this.kldBdoTypWgMen;
	}

	public void setKldBdoTypWgMen(String kldBdoTypWgMen) {
		this.kldBdoTypWgMen = kldBdoTypWgMen;
	}

	public String getKldBdoTypWgUmk() {
		return this.kldBdoTypWgUmk;
	}

	public void setKldBdoTypWgUmk(String kldBdoTypWgUmk) {
		this.kldBdoTypWgUmk = kldBdoTypWgUmk;
	}

	public BigDecimal getKldBdoUczniowieDotacja() {
		return this.kldBdoUczniowieDotacja;
	}

	public void setKldBdoUczniowieDotacja(BigDecimal kldBdoUczniowieDotacja) {
		this.kldBdoUczniowieDotacja = kldBdoUczniowieDotacja;
	}

	public BigDecimal getKldBdoZwiazanieZOrg() {
		return this.kldBdoZwiazanieZOrg;
	}

	public void setKldBdoZwiazanieZOrg(BigDecimal kldBdoZwiazanieZOrg) {
		this.kldBdoZwiazanieZOrg = kldBdoZwiazanieZOrg;
	}

	public BigDecimal getKldBiezaceSprawozdDochod() {
		return this.kldBiezaceSprawozdDochod;
	}

	public void setKldBiezaceSprawozdDochod(BigDecimal kldBiezaceSprawozdDochod) {
		this.kldBiezaceSprawozdDochod = kldBiezaceSprawozdDochod;
	}

	public BigDecimal getKldBiezaceSprawozdPrzychod() {
		return this.kldBiezaceSprawozdPrzychod;
	}

	public void setKldBiezaceSprawozdPrzychod(BigDecimal kldBiezaceSprawozdPrzychod) {
		this.kldBiezaceSprawozdPrzychod = kldBiezaceSprawozdPrzychod;
	}

	public String getKldCrmKlasaISegmObslugi() {
		return this.kldCrmKlasaISegmObslugi;
	}

	public void setKldCrmKlasaISegmObslugi(String kldCrmKlasaISegmObslugi) {
		this.kldCrmKlasaISegmObslugi = kldCrmKlasaISegmObslugi;
	}

	public String getKldCrmPodsegment() {
		return this.kldCrmPodsegment;
	}

	public void setKldCrmPodsegment(String kldCrmPodsegment) {
		this.kldCrmPodsegment = kldCrmPodsegment;
	}

	public String getKldCrmTyp() {
		return this.kldCrmTyp;
	}

	public void setKldCrmTyp(String kldCrmTyp) {
		this.kldCrmTyp = kldCrmTyp;
	}

	public Date getKldDataModyfikacji() {
		return this.kldDataModyfikacji;
	}

	public void setKldDataModyfikacji(Date kldDataModyfikacji) {
		this.kldDataModyfikacji = kldDataModyfikacji;
	}

	public Date getKldDataOswBik() {
		return this.kldDataOswBik;
	}

	public void setKldDataOswBik(Date kldDataOswBik) {
		this.kldDataOswBik = kldDataOswBik;
	}

	public Date getKldDataPowstania() {
		return this.kldDataPowstania;
	}

	public void setKldDataPowstania(Date kldDataPowstania) {
		this.kldDataPowstania = kldDataPowstania;
	}

	public Date getKldDataRejestracji() {
		return this.kldDataRejestracji;
	}

	public void setKldDataRejestracji(Date kldDataRejestracji) {
		this.kldDataRejestracji = kldDataRejestracji;
	}

	public Date getKldDataRezygnacji() {
		return this.kldDataRezygnacji;
	}

	public void setKldDataRezygnacji(Date kldDataRezygnacji) {
		this.kldDataRezygnacji = kldDataRezygnacji;
	}

	public Date getKldDataUmocowania1() {
		return this.kldDataUmocowania1;
	}

	public void setKldDataUmocowania1(Date kldDataUmocowania1) {
		this.kldDataUmocowania1 = kldDataUmocowania1;
	}

	public Date getKldDataUmocowania100001() {
		return this.kldDataUmocowania100001;
	}

	public void setKldDataUmocowania100001(Date kldDataUmocowania100001) {
		this.kldDataUmocowania100001 = kldDataUmocowania100001;
	}

	public Date getKldDataUrodzenia() {
		return this.kldDataUrodzenia;
	}

	public void setKldDataUrodzenia(Date kldDataUrodzenia) {
		this.kldDataUrodzenia = kldDataUrodzenia;
	}

	public Date getKldDataZgody() {
		return this.kldDataZgody;
	}

	public void setKldDataZgody(Date kldDataZgody) {
		this.kldDataZgody = kldDataZgody;
	}

	public BigDecimal getKldDecyzja() {
		return this.kldDecyzja;
	}

	public void setKldDecyzja(BigDecimal kldDecyzja) {
		this.kldDecyzja = kldDecyzja;
	}

	public String getKldDef0() {
		return this.kldDef0;
	}

	public void setKldDef0(String kldDef0) {
		this.kldDef0 = kldDef0;
	}

	public String getKldDef1() {
		return this.kldDef1;
	}

	public void setKldDef1(String kldDef1) {
		this.kldDef1 = kldDef1;
	}

	public String getKldDef2() {
		return this.kldDef2;
	}

	public void setKldDef2(String kldDef2) {
		this.kldDef2 = kldDef2;
	}

	public String getKldDef3() {
		return this.kldDef3;
	}

	public void setKldDef3(String kldDef3) {
		this.kldDef3 = kldDef3;
	}

	public String getKldDef4() {
		return this.kldDef4;
	}

	public void setKldDef4(String kldDef4) {
		this.kldDef4 = kldDef4;
	}

	public String getKldDef5() {
		return this.kldDef5;
	}

	public void setKldDef5(String kldDef5) {
		this.kldDef5 = kldDef5;
	}

	public String getKldDef6() {
		return this.kldDef6;
	}

	public void setKldDef6(String kldDef6) {
		this.kldDef6 = kldDef6;
	}

	public BigDecimal getKldDeklaracjaFrm() {
		return this.kldDeklaracjaFrm;
	}

	public void setKldDeklaracjaFrm(BigDecimal kldDeklaracjaFrm) {
		this.kldDeklaracjaFrm = kldDeklaracjaFrm;
	}

	public String getKldDoradca1() {
		return this.kldDoradca1;
	}

	public void setKldDoradca1(String kldDoradca1) {
		this.kldDoradca1 = kldDoradca1;
	}

	public String getKldDoradca2() {
		return this.kldDoradca2;
	}

	public void setKldDoradca2(String kldDoradca2) {
		this.kldDoradca2 = kldDoradca2;
	}

	public String getKldDoradca3() {
		return this.kldDoradca3;
	}

	public void setKldDoradca3(String kldDoradca3) {
		this.kldDoradca3 = kldDoradca3;
	}

	public String getKldDrugieImie() {
		return this.kldDrugieImie;
	}

	public void setKldDrugieImie(String kldDrugieImie) {
		this.kldDrugieImie = kldDrugieImie;
	}

	public String getKldEFaktura() {
		return this.kldEFaktura;
	}

	public void setKldEFaktura(String kldEFaktura) {
		this.kldEFaktura = kldEFaktura;
	}

	public String getKldEmailAlt() {
		return this.kldEmailAlt;
	}

	public void setKldEmailAlt(String kldEmailAlt) {
		this.kldEmailAlt = kldEmailAlt;
	}

	public String getKldEmailDo() {
		return this.kldEmailDo;
	}

	public void setKldEmailDo(String kldEmailDo) {
		this.kldEmailDo = kldEmailDo;
	}

	public String getKldEmailDw() {
		return this.kldEmailDw;
	}

	public void setKldEmailDw(String kldEmailDw) {
		this.kldEmailDw = kldEmailDw;
	}

	public String getKldFAktualne() {
		return this.kldFAktualne;
	}

	public void setKldFAktualne(String kldFAktualne) {
		this.kldFAktualne = kldFAktualne;
	}

	public String getKldFBylKontakt() {
		return this.kldFBylKontakt;
	}

	public void setKldFBylKontakt(String kldFBylKontakt) {
		this.kldFBylKontakt = kldFBylKontakt;
	}

	public String getKldFGenerowacWezwania() {
		return this.kldFGenerowacWezwania;
	}

	public void setKldFGenerowacWezwania(String kldFGenerowacWezwania) {
		this.kldFGenerowacWezwania = kldFGenerowacWezwania;
	}

	public String getKldFKapitalZagr() {
		return this.kldFKapitalZagr;
	}

	public void setKldFKapitalZagr(String kldFKapitalZagr) {
		this.kldFKapitalZagr = kldFKapitalZagr;
	}

	public String getKldFOchronaDanych() {
		return this.kldFOchronaDanych;
	}

	public void setKldFOchronaDanych(String kldFOchronaDanych) {
		this.kldFOchronaDanych = kldFOchronaDanych;
	}

	public String getKldFPodejrzany() {
		return this.kldFPodejrzany;
	}

	public void setKldFPodejrzany(String kldFPodejrzany) {
		this.kldFPodejrzany = kldFPodejrzany;
	}

	public String getKldFPodzielonaPlatnosc() {
		return this.kldFPodzielonaPlatnosc;
	}

	public void setKldFPodzielonaPlatnosc(String kldFPodzielonaPlatnosc) {
		this.kldFPodzielonaPlatnosc = kldFPodzielonaPlatnosc;
	}

	public String getKldFRezydent() {
		return this.kldFRezydent;
	}

	public void setKldFRezydent(String kldFRezydent) {
		this.kldFRezydent = kldFRezydent;
	}

	public String getKldFSprzPrzetwDanych() {
		return this.kldFSprzPrzetwDanych;
	}

	public void setKldFSprzPrzetwDanych(String kldFSprzPrzetwDanych) {
		this.kldFSprzPrzetwDanych = kldFSprzPrzetwDanych;
	}

	public String getKldFStrukturaZlozona() {
		return this.kldFStrukturaZlozona;
	}

	public void setKldFStrukturaZlozona(String kldFStrukturaZlozona) {
		this.kldFStrukturaZlozona = kldFStrukturaZlozona;
	}

	public BigDecimal getKldFUdostGrupa() {
		return this.kldFUdostGrupa;
	}

	public void setKldFUdostGrupa(BigDecimal kldFUdostGrupa) {
		this.kldFUdostGrupa = kldFUdostGrupa;
	}

	public String getKldFZgodaNaKontakt() {
		return this.kldFZgodaNaKontakt;
	}

	public void setKldFZgodaNaKontakt(String kldFZgodaNaKontakt) {
		this.kldFZgodaNaKontakt = kldFZgodaNaKontakt;
	}

	public String getKldFZgodaNaKoresp() {
		return this.kldFZgodaNaKoresp;
	}

	public void setKldFZgodaNaKoresp(String kldFZgodaNaKoresp) {
		this.kldFZgodaNaKoresp = kldFZgodaNaKoresp;
	}

	public String getKldFZwolnionyCert() {
		return this.kldFZwolnionyCert;
	}

	public void setKldFZwolnionyCert(String kldFZwolnionyCert) {
		this.kldFZwolnionyCert = kldFZwolnionyCert;
	}

	public String getKldFormaWlasnosci() {
		return this.kldFormaWlasnosci;
	}

	public void setKldFormaWlasnosci(String kldFormaWlasnosci) {
		this.kldFormaWlasnosci = kldFormaWlasnosci;
	}

	public BigDecimal getKldIluKomplementariuszy() {
		return this.kldIluKomplementariuszy;
	}

	public void setKldIluKomplementariuszy(BigDecimal kldIluKomplementariuszy) {
		this.kldIluKomplementariuszy = kldIluKomplementariuszy;
	}

	public String getKldImie() {
		return this.kldImie;
	}

	public void setKldImie(String kldImie) {
		this.kldImie = kldImie;
	}

	public String getKldImieMatki() {
		return this.kldImieMatki;
	}

	public void setKldImieMatki(String kldImieMatki) {
		this.kldImieMatki = kldImieMatki;
	}

	public String getKldImieOjca() {
		return this.kldImieOjca;
	}

	public void setKldImieOjca(String kldImieOjca) {
		this.kldImieOjca = kldImieOjca;
	}

	public String getKldImie2() {
		return this.kldImie2;
	}

	public void setKldImie2(String kldImie2) {
		this.kldImie2 = kldImie2;
	}

	public String getKldImie3() {
		return this.kldImie3;
	}

	public void setKldImie3(String kldImie3) {
		this.kldImie3 = kldImie3;
	}

	public String getKldImie4() {
		return this.kldImie4;
	}

	public void setKldImie4(String kldImie4) {
		this.kldImie4 = kldImie4;
	}

	public String getKldImie5() {
		return this.kldImie5;
	}

	public void setKldImie5(String kldImie5) {
		this.kldImie5 = kldImie5;
	}

	public String getKldImie6() {
		return this.kldImie6;
	}

	public void setKldImie6(String kldImie6) {
		this.kldImie6 = kldImie6;
	}

	public String getKldImie7() {
		return this.kldImie7;
	}

	public void setKldImie7(String kldImie7) {
		this.kldImie7 = kldImie7;
	}

	public String getKldImie8() {
		return this.kldImie8;
	}

	public void setKldImie8(String kldImie8) {
		this.kldImie8 = kldImie8;
	}

	public String getKldImie9() {
		return this.kldImie9;
	}

	public void setKldImie9(String kldImie9) {
		this.kldImie9 = kldImie9;
	}

	public String getKldInnaDzialalnosc() {
		return this.kldInnaDzialalnosc;
	}

	public void setKldInnaDzialalnosc(String kldInnaDzialalnosc) {
		this.kldInnaDzialalnosc = kldInnaDzialalnosc;
	}

	public String getKldIsic() {
		return this.kldIsic;
	}

	public void setKldIsic(String kldIsic) {
		this.kldIsic = kldIsic;
	}

	public BigDecimal getKldKapitalWplacony() {
		return this.kldKapitalWplacony;
	}

	public void setKldKapitalWplacony(BigDecimal kldKapitalWplacony) {
		this.kldKapitalWplacony = kldKapitalWplacony;
	}

	public BigDecimal getKldKapitalZakladowy() {
		return this.kldKapitalZakladowy;
	}

	public void setKldKapitalZakladowy(BigDecimal kldKapitalZakladowy) {
		this.kldKapitalZakladowy = kldKapitalZakladowy;
	}

	public String getKldKategoriaRyzyka() {
		return this.kldKategoriaRyzyka;
	}

	public void setKldKategoriaRyzyka(String kldKategoriaRyzyka) {
		this.kldKategoriaRyzyka = kldKategoriaRyzyka;
	}

	public String getKldKgn() {
		return this.kldKgn;
	}

	public void setKldKgn(String kldKgn) {
		this.kldKgn = kldKgn;
	}

	public Date getKldKiedyModyfikowal() {
		return this.kldKiedyModyfikowal;
	}

	public void setKldKiedyModyfikowal(Date kldKiedyModyfikowal) {
		this.kldKiedyModyfikowal = kldKiedyModyfikowal;
	}

	public Date getKldKiedyUtworzyl() {
		return this.kldKiedyUtworzyl;
	}

	public void setKldKiedyUtworzyl(Date kldKiedyUtworzyl) {
		this.kldKiedyUtworzyl = kldKiedyUtworzyl;
	}

	public BigDecimal getKldKlKodTkl() {
		return this.kldKlKodTkl;
	}

	public void setKldKlKodTkl(BigDecimal kldKlKodTkl) {
		this.kldKlKodTkl = kldKlKodTkl;
	}

	public BigDecimal getKldKntId() {
		return this.kldKntId;
	}

	public void setKldKntId(BigDecimal kldKntId) {
		this.kldKntId = kldKntId;
	}

	public String getKldKodRyzyka() {
		return this.kldKodRyzyka;
	}

	public void setKldKodRyzyka(String kldKodRyzyka) {
		this.kldKodRyzyka = kldKodRyzyka;
	}

	public String getKldKodRyzykaNaleznNajg() {
		return this.kldKodRyzykaNaleznNajg;
	}

	public void setKldKodRyzykaNaleznNajg(String kldKodRyzykaNaleznNajg) {
		this.kldKodRyzykaNaleznNajg = kldKodRyzykaNaleznNajg;
	}

	public String getKldKomentarz() {
		return this.kldKomentarz;
	}

	public void setKldKomentarz(String kldKomentarz) {
		this.kldKomentarz = kldKomentarz;
	}

	public String getKldKontoKg() {
		return this.kldKontoKg;
	}

	public void setKldKontoKg(String kldKontoKg) {
		this.kldKontoKg = kldKontoKg;
	}

	public BigDecimal getKldKrId() {
		return this.kldKrId;
	}

	public void setKldKrId(BigDecimal kldKrId) {
		this.kldKrId = kldKrId;
	}

	public BigDecimal getKldKrIdRejDz() {
		return this.kldKrIdRejDz;
	}

	public void setKldKrIdRejDz(BigDecimal kldKrIdRejDz) {
		this.kldKrIdRejDz = kldKrIdRejDz;
	}

	public BigDecimal getKldKrIdUrodzenia() {
		return this.kldKrIdUrodzenia;
	}

	public void setKldKrIdUrodzenia(BigDecimal kldKrIdUrodzenia) {
		this.kldKrIdUrodzenia = kldKrIdUrodzenia;
	}

	public String getKldKrs() {
		return this.kldKrs;
	}

	public void setKldKrs(String kldKrs) {
		this.kldKrs = kldKrs;
	}

	public BigDecimal getKldLiczbaWspolnikow() {
		return this.kldLiczbaWspolnikow;
	}

	public void setKldLiczbaWspolnikow(BigDecimal kldLiczbaWspolnikow) {
		this.kldLiczbaWspolnikow = kldLiczbaWspolnikow;
	}

	public String getKldMiejsceUrodzenia() {
		return this.kldMiejsceUrodzenia;
	}

	public void setKldMiejsceUrodzenia(String kldMiejsceUrodzenia) {
		this.kldMiejsceUrodzenia = kldMiejsceUrodzenia;
	}

	public String getKldMiesiacDeklaracji() {
		return this.kldMiesiacDeklaracji;
	}

	public void setKldMiesiacDeklaracji(String kldMiesiacDeklaracji) {
		this.kldMiesiacDeklaracji = kldMiesiacDeklaracji;
	}

	public String getKldModyfikowal() {
		return this.kldModyfikowal;
	}

	public void setKldModyfikowal(String kldModyfikowal) {
		this.kldModyfikowal = kldModyfikowal;
	}

	public String getKldNace() {
		return this.kldNace;
	}

	public void setKldNace(String kldNace) {
		this.kldNace = kldNace;
	}

	public String getKldNazwa() {
		return this.kldNazwa;
	}

	public void setKldNazwa(String kldNazwa) {
		this.kldNazwa = kldNazwa;
	}

	public String getKldNazwaNaWydruki() {
		return this.kldNazwaNaWydruki;
	}

	public void setKldNazwaNaWydruki(String kldNazwaNaWydruki) {
		this.kldNazwaNaWydruki = kldNazwaNaWydruki;
	}

	public String getKldNazwa2() {
		return this.kldNazwa2;
	}

	public void setKldNazwa2(String kldNazwa2) {
		this.kldNazwa2 = kldNazwa2;
	}

	public String getKldNazwa3() {
		return this.kldNazwa3;
	}

	public void setKldNazwa3(String kldNazwa3) {
		this.kldNazwa3 = kldNazwa3;
	}

	public String getKldNazwa4() {
		return this.kldNazwa4;
	}

	public void setKldNazwa4(String kldNazwa4) {
		this.kldNazwa4 = kldNazwa4;
	}

	public String getKldNazwa5() {
		return this.kldNazwa5;
	}

	public void setKldNazwa5(String kldNazwa5) {
		this.kldNazwa5 = kldNazwa5;
	}

	public String getKldNazwa6() {
		return this.kldNazwa6;
	}

	public void setKldNazwa6(String kldNazwa6) {
		this.kldNazwa6 = kldNazwa6;
	}

	public String getKldNazwa7() {
		return this.kldNazwa7;
	}

	public void setKldNazwa7(String kldNazwa7) {
		this.kldNazwa7 = kldNazwa7;
	}

	public String getKldNazwa8() {
		return this.kldNazwa8;
	}

	public void setKldNazwa8(String kldNazwa8) {
		this.kldNazwa8 = kldNazwa8;
	}

	public String getKldNazwa9() {
		return this.kldNazwa9;
	}

	public void setKldNazwa9(String kldNazwa9) {
		this.kldNazwa9 = kldNazwa9;
	}

	public String getKldNazwisko() {
		return this.kldNazwisko;
	}

	public void setKldNazwisko(String kldNazwisko) {
		this.kldNazwisko = kldNazwisko;
	}

	public String getKldNazwiskoDrugie() {
		return this.kldNazwiskoDrugie;
	}

	public void setKldNazwiskoDrugie(String kldNazwiskoDrugie) {
		this.kldNazwiskoDrugie = kldNazwiskoDrugie;
	}

	public String getKldNazwisko2() {
		return this.kldNazwisko2;
	}

	public void setKldNazwisko2(String kldNazwisko2) {
		this.kldNazwisko2 = kldNazwisko2;
	}

	public String getKldNazwisko3() {
		return this.kldNazwisko3;
	}

	public void setKldNazwisko3(String kldNazwisko3) {
		this.kldNazwisko3 = kldNazwisko3;
	}

	public String getKldNazwisko4() {
		return this.kldNazwisko4;
	}

	public void setKldNazwisko4(String kldNazwisko4) {
		this.kldNazwisko4 = kldNazwisko4;
	}

	public String getKldNazwisko5() {
		return this.kldNazwisko5;
	}

	public void setKldNazwisko5(String kldNazwisko5) {
		this.kldNazwisko5 = kldNazwisko5;
	}

	public String getKldNazwisko6() {
		return this.kldNazwisko6;
	}

	public void setKldNazwisko6(String kldNazwisko6) {
		this.kldNazwisko6 = kldNazwisko6;
	}

	public String getKldNazwisko7() {
		return this.kldNazwisko7;
	}

	public void setKldNazwisko7(String kldNazwisko7) {
		this.kldNazwisko7 = kldNazwisko7;
	}

	public String getKldNazwisko8() {
		return this.kldNazwisko8;
	}

	public void setKldNazwisko8(String kldNazwisko8) {
		this.kldNazwisko8 = kldNazwisko8;
	}

	public String getKldNazwisko9() {
		return this.kldNazwisko9;
	}

	public void setKldNazwisko9(String kldNazwisko9) {
		this.kldNazwisko9 = kldNazwisko9;
	}

	public String getKldNip() {
		return this.kldNip;
	}

	public void setKldNip(String kldNip) {
		this.kldNip = kldNip;
	}

	public String getKldNipDane() {
		return this.kldNipDane;
	}

	public void setKldNipDane(String kldNipDane) {
		this.kldNipDane = kldNipDane;
	}

	public String getKldNipPrefiks() {
		return this.kldNipPrefiks;
	}

	public void setKldNipPrefiks(String kldNipPrefiks) {
		this.kldNipPrefiks = kldNipPrefiks;
	}

	public String getKldNrRejestru() {
		return this.kldNrRejestru;
	}

	public void setKldNrRejestru(String kldNrRejestru) {
		this.kldNrRejestru = kldNrRejestru;
	}

	public String getKldNumerNierezydenta() {
		return this.kldNumerNierezydenta;
	}

	public void setKldNumerNierezydenta(String kldNumerNierezydenta) {
		this.kldNumerNierezydenta = kldNumerNierezydenta;
	}

	public Date getKldObowiazujeDo() {
		return this.kldObowiazujeDo;
	}

	public void setKldObowiazujeDo(Date kldObowiazujeDo) {
		this.kldObowiazujeDo = kldObowiazujeDo;
	}

	public Date getKldObowiazujeOd() {
		return this.kldObowiazujeOd;
	}

	public void setKldObowiazujeOd(Date kldObowiazujeOd) {
		this.kldObowiazujeOd = kldObowiazujeOd;
	}

	public BigDecimal getKldObyKrId() {
		return this.kldObyKrId;
	}

	public void setKldObyKrId(BigDecimal kldObyKrId) {
		this.kldObyKrId = kldObyKrId;
	}

	public BigDecimal getKldObyKrIdWydania() {
		return this.kldObyKrIdWydania;
	}

	public void setKldObyKrIdWydania(BigDecimal kldObyKrIdWydania) {
		this.kldObyKrIdWydania = kldObyKrIdWydania;
	}

	public String getKldObyRodzajDokumentu() {
		return this.kldObyRodzajDokumentu;
	}

	public void setKldObyRodzajDokumentu(String kldObyRodzajDokumentu) {
		this.kldObyRodzajDokumentu = kldObyRodzajDokumentu;
	}

	public String getKldObySeriaNumerDok() {
		return this.kldObySeriaNumerDok;
	}

	public void setKldObySeriaNumerDok(String kldObySeriaNumerDok) {
		this.kldObySeriaNumerDok = kldObySeriaNumerDok;
	}

	public String getKldOddzial() {
		return this.kldOddzial;
	}

	public void setKldOddzial(String kldOddzial) {
		this.kldOddzial = kldOddzial;
	}

	public BigDecimal getKldOddzialCis() {
		return this.kldOddzialCis;
	}

	public void setKldOddzialCis(BigDecimal kldOddzialCis) {
		this.kldOddzialCis = kldOddzialCis;
	}

	public Date getKldOgrnData() {
		return this.kldOgrnData;
	}

	public void setKldOgrnData(Date kldOgrnData) {
		this.kldOgrnData = kldOgrnData;
	}

	public BigDecimal getKldOgrnNumer() {
		return this.kldOgrnNumer;
	}

	public void setKldOgrnNumer(BigDecimal kldOgrnNumer) {
		this.kldOgrnNumer = kldOgrnNumer;
	}

	public String getKldOgrnOrganRej() {
		return this.kldOgrnOrganRej;
	}

	public void setKldOgrnOrganRej(String kldOgrnOrganRej) {
		this.kldOgrnOrganRej = kldOgrnOrganRej;
	}

	public String getKldOpisRodzDzialaln() {
		return this.kldOpisRodzDzialaln;
	}

	public void setKldOpisRodzDzialaln(String kldOpisRodzDzialaln) {
		this.kldOpisRodzDzialaln = kldOpisRodzDzialaln;
	}

	public String getKldOrganEwidencyjny() {
		return this.kldOrganEwidencyjny;
	}

	public void setKldOrganEwidencyjny(String kldOrganEwidencyjny) {
		this.kldOrganEwidencyjny = kldOrganEwidencyjny;
	}

	public BigDecimal getKldOstatniRokObrach() {
		return this.kldOstatniRokObrach;
	}

	public void setKldOstatniRokObrach(BigDecimal kldOstatniRokObrach) {
		this.kldOstatniRokObrach = kldOstatniRokObrach;
	}

	public BigDecimal getKldOstatniRokObrachDochod() {
		return this.kldOstatniRokObrachDochod;
	}

	public void setKldOstatniRokObrachDochod(BigDecimal kldOstatniRokObrachDochod) {
		this.kldOstatniRokObrachDochod = kldOstatniRokObrachDochod;
	}

	public BigDecimal getKldOstatniRokObrachPrzych() {
		return this.kldOstatniRokObrachPrzych;
	}

	public void setKldOstatniRokObrachPrzych(BigDecimal kldOstatniRokObrachPrzych) {
		this.kldOstatniRokObrachPrzych = kldOstatniRokObrachPrzych;
	}

	public String getKldOstatniRokObrachTypPit() {
		return this.kldOstatniRokObrachTypPit;
	}

	public void setKldOstatniRokObrachTypPit(String kldOstatniRokObrachTypPit) {
		this.kldOstatniRokObrachTypPit = kldOstatniRokObrachTypPit;
	}

	public BigDecimal getKldPelnomocnictwo1() {
		return this.kldPelnomocnictwo1;
	}

	public void setKldPelnomocnictwo1(BigDecimal kldPelnomocnictwo1) {
		this.kldPelnomocnictwo1 = kldPelnomocnictwo1;
	}

	public BigDecimal getKldPelnomocnictwo100001() {
		return this.kldPelnomocnictwo100001;
	}

	public void setKldPelnomocnictwo100001(BigDecimal kldPelnomocnictwo100001) {
		this.kldPelnomocnictwo100001 = kldPelnomocnictwo100001;
	}

	public BigDecimal getKldPep() {
		return this.kldPep;
	}

	public void setKldPep(BigDecimal kldPep) {
		this.kldPep = kldPep;
	}

	public String getKldPesel() {
		return this.kldPesel;
	}

	public void setKldPesel(String kldPesel) {
		this.kldPesel = kldPesel;
	}

	public String getKldPkd() {
		return this.kldPkd;
	}

	public void setKldPkd(String kldPkd) {
		this.kldPkd = kldPkd;
	}

	public String getKldPlec() {
		return this.kldPlec;
	}

	public void setKldPlec(String kldPlec) {
		this.kldPlec = kldPlec;
	}

	public String getKldPowodModyfikacji() {
		return this.kldPowodModyfikacji;
	}

	public void setKldPowodModyfikacji(String kldPowodModyfikacji) {
		this.kldPowodModyfikacji = kldPowodModyfikacji;
	}

	public String getKldPrefFormaKontaktu() {
		return this.kldPrefFormaKontaktu;
	}

	public void setKldPrefFormaKontaktu(String kldPrefFormaKontaktu) {
		this.kldPrefFormaKontaktu = kldPrefFormaKontaktu;
	}

	public BigDecimal getKldRba() {
		return this.kldRba;
	}

	public void setKldRba(BigDecimal kldRba) {
		this.kldRba = kldRba;
	}

	public String getKldRegon() {
		return this.kldRegon;
	}

	public void setKldRegon(String kldRegon) {
		this.kldRegon = kldRegon;
	}

	public String getKldRodzajOswBik() {
		return this.kldRodzajOswBik;
	}

	public void setKldRodzajOswBik(String kldRodzajOswBik) {
		this.kldRodzajOswBik = kldRodzajOswBik;
	}

	public String getKldRodzajWysylki() {
		return this.kldRodzajWysylki;
	}

	public void setKldRodzajWysylki(String kldRodzajWysylki) {
		this.kldRodzajWysylki = kldRodzajWysylki;
	}

	public String getKldSad() {
		return this.kldSad;
	}

	public void setKldSad(String kldSad) {
		this.kldSad = kldSad;
	}

	public String getKldSposobZaplaty() {
		return this.kldSposobZaplaty;
	}

	public void setKldSposobZaplaty(String kldSposobZaplaty) {
		this.kldSposobZaplaty = kldSposobZaplaty;
	}

	public String getKldStan() {
		return this.kldStan;
	}

	public void setKldStan(String kldStan) {
		this.kldStan = kldStan;
	}

	public String getKldStanDokumentacji() {
		return this.kldStanDokumentacji;
	}

	public void setKldStanDokumentacji(String kldStanDokumentacji) {
		this.kldStanDokumentacji = kldStanDokumentacji;
	}

	public String getKldStatusGiodo() {
		return this.kldStatusGiodo;
	}

	public void setKldStatusGiodo(String kldStatusGiodo) {
		this.kldStatusGiodo = kldStatusGiodo;
	}

	public BigDecimal getKldSumaKredytowPozaBzwbk() {
		return this.kldSumaKredytowPozaBzwbk;
	}

	public void setKldSumaKredytowPozaBzwbk(BigDecimal kldSumaKredytowPozaBzwbk) {
		this.kldSumaKredytowPozaBzwbk = kldSumaKredytowPozaBzwbk;
	}

	public BigDecimal getKldSumaRatNettoPozaBzwbk() {
		return this.kldSumaRatNettoPozaBzwbk;
	}

	public void setKldSumaRatNettoPozaBzwbk(BigDecimal kldSumaRatNettoPozaBzwbk) {
		this.kldSumaRatNettoPozaBzwbk = kldSumaRatNettoPozaBzwbk;
	}

	public String getKldSwift() {
		return this.kldSwift;
	}

	public void setKldSwift(String kldSwift) {
		this.kldSwift = kldSwift;
	}

	public String getKldTemp() {
		return this.kldTemp;
	}

	public void setKldTemp(String kldTemp) {
		this.kldTemp = kldTemp;
	}

	public String getKldTemp2() {
		return this.kldTemp2;
	}

	public void setKldTemp2(String kldTemp2) {
		this.kldTemp2 = kldTemp2;
	}

	public String getKldTemp3() {
		return this.kldTemp3;
	}

	public void setKldTemp3(String kldTemp3) {
		this.kldTemp3 = kldTemp3;
	}

	public BigDecimal getKldTerminZaplaty() {
		return this.kldTerminZaplaty;
	}

	public void setKldTerminZaplaty(BigDecimal kldTerminZaplaty) {
		this.kldTerminZaplaty = kldTerminZaplaty;
	}

	public BigDecimal getKldTerminZaplatyVat() {
		return this.kldTerminZaplatyVat;
	}

	public void setKldTerminZaplatyVat(BigDecimal kldTerminZaplatyVat) {
		this.kldTerminZaplatyVat = kldTerminZaplatyVat;
	}

	public BigDecimal getKldTkId() {
		return this.kldTkId;
	}

	public void setKldTkId(BigDecimal kldTkId) {
		this.kldTkId = kldTkId;
	}

	public String getKldTyp() {
		return this.kldTyp;
	}

	public void setKldTyp(String kldTyp) {
		this.kldTyp = kldTyp;
	}

	public String getKldTypKursu() {
		return this.kldTypKursu;
	}

	public void setKldTypKursu(String kldTypKursu) {
		this.kldTypKursu = kldTypKursu;
	}

	public String getKldUrzadSkarbowy() {
		return this.kldUrzadSkarbowy;
	}

	public void setKldUrzadSkarbowy(String kldUrzadSkarbowy) {
		this.kldUrzadSkarbowy = kldUrzadSkarbowy;
	}

	public String getKldUrzadStatystyczny() {
		return this.kldUrzadStatystyczny;
	}

	public void setKldUrzadStatystyczny(String kldUrzadStatystyczny) {
		this.kldUrzadStatystyczny = kldUrzadStatystyczny;
	}

	public String getKldUtworzyl() {
		return this.kldUtworzyl;
	}

	public void setKldUtworzyl(String kldUtworzyl) {
		this.kldUtworzyl = kldUtworzyl;
	}

	public String getKldWarunkiZaplaty() {
		return this.kldWarunkiZaplaty;
	}

	public void setKldWarunkiZaplaty(String kldWarunkiZaplaty) {
		this.kldWarunkiZaplaty = kldWarunkiZaplaty;
	}

	public BigDecimal getKldWyksztalcenie() {
		return this.kldWyksztalcenie;
	}

	public void setKldWyksztalcenie(BigDecimal kldWyksztalcenie) {
		this.kldWyksztalcenie = kldWyksztalcenie;
	}

	public String getKldZatwierdzony() {
		return this.kldZatwierdzony;
	}

	public void setKldZatwierdzony(String kldZatwierdzony) {
		this.kldZatwierdzony = kldZatwierdzony;
	}

	public CkkKlienci getCkkKlienci() {
		return this.ckkKlienci;
	}

	public void setCkkKlienci(CkkKlienci ckkKlienci) {
		this.ckkKlienci = ckkKlienci;
	}

}