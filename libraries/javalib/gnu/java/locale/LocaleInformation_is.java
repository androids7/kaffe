/* LocaleInformation_is.java --
   Copyright (C) 2004  Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by gnu.localegen from LDML

package gnu.java.locale;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.ListResourceBundle;

public class LocaleInformation_is extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "YDD|GRN|TWD|LKR|TJS|RWF|TJR|SDP|GRD|IEP|CFF|ARS|ARP|SDD|ARM|FKP|EEK|TVD|HKD|IQD|ARA|SCR|XID|VUV|KPW|DKK|IDR|LVR|KPP|AED|LVL|RUR|FJP|MOP|FJD|ADP|DJF|SBD|ADD|TTO|ECS|THB|LUF|FIM|TTD|MNT|UAK|SAR|UAH|HUF|IBP|COP|LTT|VGD|PTE|AOS|GBP|INR|XFU|LTL|KZT|COF|KZR|COB|BUK|XFO|SYP|OMR|NGP|MZE|MMX|NGN|PSP|CNY|CNX|GNI|MAF|GNF|MAD|MMK|MYR|LSL|TRL|KMF|GAF|CZK|ANG|GMP|BGX|XEF|KYD|BGO|BGN|MXV|CAD|BGM|BGL|VEB|MLF|MXP|ILS|BSP|MXN|GYD|CMF|ILP|CYP|SKK|XDR|ILL|LRD|AMD|BSD|GLK|HRK|MKN|ALX|CLP|JEP|ALV|XPF|FRF|MWP|TDF|MKD|TPP|CLF|CLE|ALL|ALK|BRL|TPE|DES|XCF|DEM|XCD|KWD|YUM|SVC|GWM|SIT|JPY|XOF|TOS|BEF|GWE|TCC|CKD|SUR|ROL|DDM|NOK|XNF|SHP|ZAP|ZAL|KID|TZS|GIP|ZMP|CVE|ZMK|XAF|LBP|STE|STD|FOK|DOP|EUR|BOV|CUX|LNR|WSP|XMF|MTP|USS|MHD|BOP|NZP|CUP|MTL|TMM|USN|GHP|SSP|AUP|SGD|NZD|USD|HNL|ITL|PAB|GTQ|AUD|NAD|MGF|BBD|CHF|MGA|JMP|PLZ|PLX|YER|ATS|ETD|LYP|BND|YEI|EGP|JMD|ISK|SRG|BZH|LYD|BZD|ESP|KRW|NLG|MRO|BMP|ZWD|SEK|KRO|CSK|IRR|PKR|BMD|KRH|CSC";

  private static final String currenciesDisplayNameValues = "Jemenskur denari|Drakma, N\u00fd|Ta\u00edvanskur dalur|Sr\u00edl\u00f6nsk r\u00fap\u00eda|Tajikistan Somoni|Rwandan Franc|Tadsjiksk r\u00fabla|S\u00fadanskt pund|Drakma|\u00cdrskt pund|Mi\u00f0afr\u00edskur franki|Argent\u00edskur pesi|Argent\u00edskur pesi (1983-1985)|S\u00fadanskur denari|Argent\u00edskur pesi (1899-1970)|Falklenskt pund|Eistnesk kr\u00f3na|T\u00faval\u00faskur dalur|Hong Kong-dalur|\u00cdrakskur denari|Argentine Austral|Seychelles r\u00fap\u00eda|\u00cdslamskur denari|Vanuatu Vatu|Nor\u00f0urk\u00f3reskt vonn|D\u00f6nsk kr\u00f3na|Ind\u00f3nes\u00edsk r\u00fap\u00eda|Lettnesk r\u00fabla|Nor\u00f0urk\u00f3reskt vonn (1947-1959)|Arab\u00edskt d\u00edrham|Lat|R\u00fassnesk r\u00fabla|F\u00eddjeyskt pund|Macao Pataca|F\u00eddjeyskur dalur|Andorrskur peseti|Djibouti Franc|Sal\u00f3monseyskur dalur|Andorrskur denari|Tr\u00ednidad og T\u00f3bag\u00f3-dalur, eldri|Ecuador Sucre|Bat|L\u00faxemborgarfranki|Finnskt mark|Tr\u00ednidad og T\u00f3bag\u00f3-dalur|T\u00far\u00edkur|Ukrainian Karbovanetz|S\u00e1diarab\u00edskt r\u00edal|Hrinja|F\u00f3rinta|Nor\u00f0ur\u00edrskt pund|K\u00f3lumb\u00edskur pesi|Lithuanian Talonas|J\u00f3mfr\u00faaeyjadalur|Port\u00fagalskur sk\u00fati|Ang\u00f3lskur sk\u00fati|Sterlingspund|Indversk r\u00fap\u00eda|Franskur franki, UIC|L\u00edt|Kazakhstan Tenge|Mi\u00f0afr\u00edskur franki, Kong\u00f3|Kazakhstan Ruble|K\u00f3lumb\u00edskur papp\u00edrspesi|B\u00farmverskt kjat|Franskur gullfranki|S\u00fdrlenskt pund|\u00d3manskt r\u00edal|N\u00edger\u00edskt pund|M\u00f3samb\u00edskur sk\u00fati|Mjanmarskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum|Nigerian Naira|Palest\u00ednskt pund|J\u00faan|K\u00ednverskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum|G\u00edneufranki (1960-1972)|Marokk\u00f3skur franki|G\u00edneufranki|Marokk\u00f3skt d\u00edrham|Mjanmarskt kjat|Malaysian Ringgit|Lesotho Loti|Tyrknesk l\u00edra|K\u00f3moreyskur franki|Mi\u00f0afr\u00edskur franki, Gabon|T\u00e9kknesk kr\u00f3na|Hollenskt Antillugyllini|Gamb\u00edskt pund|B\u00falgarskt gjaldeyrissk\u00edrteini \u00ed lef|Mi\u00f0afr\u00edskur franki, BCEAEC|Caymaneyskur dalur|Lef (1879-1952)|Lef, n\u00fdtt|Mex\u00edk\u00f3skur pesi, UDI|Kanad\u00edskur dalur|Lef (1952-1962)|Lef|Venezuelan Bolivar|Mal\u00edskur franki|Mex\u00edk\u00f3skur silfurpesi  (1861-1992)|Sikill|Bahameyskt pund|Mex\u00edk\u00f3skur pesi|Gv\u00e6janskur dalur|Mi\u00f0afr\u00edskur franki, Kamer\u00fan|\u00cdsraelskt pund|K\u00fdpverskt pund|Sl\u00f3vak\u00edsk kr\u00f3na|S\u00e9rst\u00f6k dr\u00e1ttarr\u00e9ttindi|Israeli Sheqel|L\u00edber\u00edskur dalur|Dramm|Bahameyskur dalur|Gr\u00e6nlensk kr\u00f3na|K\u00fana|Maked\u00f3nskur denari (1992-1993)|Albanskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum|Chileskur pesi|Jerseyskt pund|Lek Valute (1992-1993)|P\u00f3lines\u00edskur franki|Franskur franki|Malav\u00edskt pund|Mi\u00f0afr\u00edskur franki, Tsjad|Maked\u00f3nskur denari|Timor Pataca|Chilean Unidades de Fomento|Chileskur sk\u00fati|Lek|Lek (1946-1961)|Brasil\u00edskt r\u00edal|T\u00edmorskur sk\u00fati|German Sperrmark|Mi\u00f0afr\u00edskur franki, n\u00fdr|\u00de\u00fdskt mark|Austur-Kar\u00edbahafsdalur|K\u00faveiskur denari|J\u00fag\u00f3slavneskur denari|El Salvador Colon|Portuguese Guinea Mil Reis|Sl\u00f3venskur dalur|Jen|Mi\u00f0afr\u00edskur franki, BCEAO|Tongverskt sterlingspund|Belg\u00edskur franki|Port\u00fagalskur, g\u00edneskur sk\u00fati|Turk- og Caicoseysk kr\u00f3na|Cookseyskur dalur|Soviet Rouble|R\u00famenskt lei|Austur\u00fe\u00fdskt mark|Norsk kr\u00f3na|Mi\u00f0afr\u00edskur franki, Antillur|Helenskt pund|Su\u00f0urafr\u00edskt pund|Rand (vi\u00f0skipta)|K\u00edribat\u00edskur dalur|Tanzanian Shilling|G\u00edbraltarspund|Samb\u00edskt pund|Gr\u00e6nh\u00f6f\u00f0eyskur sk\u00fati|Zambian Kwacha|Mi\u00f0afr\u00edskur franki, BEAC|L\u00edbanskt pund|Sa\u00f3 T\u00f3me og Prins\u00edpe sk\u00fati|Sao Tome and Principe Dobra|F\u00e6reysk kr\u00f3na|D\u00f3min\u00edskur pesi|Euro|Bolivian Mvdol|K\u00fabverskt gjaldeyrissk\u00edrteini|Ceylon Rupee|Sam\u00f3skt pund|K\u00f3moreyskur franki, CFA|Maltneskt pund|Bandar\u00edkjadalur (sama dag)|Marshalleyskur dalur|B\u00f3liv\u00edskur pesi|N\u00fdsj\u00e1lenskt pund|K\u00fabverskur pesi|Meltnesk l\u00edra|T\u00farkmenskt manat|Bandar\u00edkjadalur (n\u00e6sta dag)|Ganverskt pund|Skoskt pund|\u00c1stralskt pund|Singap\u00farskur dalur|N\u00fdsj\u00e1lenskur dalur|Bandar\u00edkjadalur|Hoduras Lempira|\u00cdt\u00f6lsk l\u00edra|Balb\u00f3i|Guatemala Quetzal|\u00c1stralskur dalur|Namib\u00edskur dalur|Madagaskur franki|Barbadoskur dalur|Svissneskur franki|Madagascar Ariary|Jama\u00edskt pund|Slot|P\u00f3lskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum|Jemenskt r\u00edal|Austurr\u00edskur skildingur|E\u00fe\u00ed\u00f3p\u00edskur dalur|L\u00edb\u00edskt pund|Br\u00faneiskur dalur|Jemenskt r\u00edal (1904-1964)|Egypskt pund|Jama\u00edskur dalur|\u00cdslensk kr\u00f3na|Suriname Guilder|Hond\u00farskur dalur|L\u00edb\u00edskur denari|Bel\u00edskur dalur|Sp\u00e6nskur peseti|Su\u00f0urk\u00f3reskt vonn|Hollenskt gyllini|Mauritania Ouguiya|Berm\u00fadeyskt pund|Simbabveskur dalur|S\u00e6nsk kr\u00f3na|Su\u00f0urk\u00f3reskt vonn (1947-1953)|T\u00e9kknesk kr\u00f3na, eldri|\u00cdranskt r\u00edal|Pakist\u00f6nsk r\u00fap\u00eda|Berm\u00fadeyskur dalur|South Korean Hwan|T\u00e9kknesk kr\u00f3na (1945-1953)";

  private static final Hashtable currenciesDisplayName;
  static
  {
    currenciesDisplayName = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesDisplayNameKeys, "|");
    Enumeration values = new StringTokenizer(currenciesDisplayNameValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesDisplayName.put(key, value);
      }
  }

  private static final String currenciesSymbolKeys = "YDD|GRN|TWD|LKR|TJS|RWF|TJR|SDP|GRD|IEP|CFF|ARS|ARP|SDD|ARM|FKP|EEK|TVD|HKD|IQD|ARA|SCR|XID|VUV|KPW|DKK|IDR|LVR|KPP|AED|LVL|RUR|FJP|MOP|FJD|ADP|DJF|SBD|ADD|TTO|ECS|THB|LUF|FIM|TTD|MNT|UAK|SAR|UAH|HUF|IBP|COP|LTT|VGD|PTE|AOS|INR|XFU|LTL|KZT|COF|KZR|COB|BUK|XFO|SYP|OMR|NGP|MZE|MMX|NGN|PSP|CNY|CNX|GNI|MAF|GNF|MAD|MMK|MYR|LSL|TRL|KMF|GAF|CZK|ANG|GMP|BGX|XEF|KYD|BGO|BGN|MXV|CAD|BGM|BGL|VEB|MLF|MXP|ILS|BSP|MXN|GYD|CMF|ILP|CYP|SKK|XDR|ILL|LRD|AMD|BSD|GLK|HRK|MKN|ALX|CLP|JEP|ALV|XPF|FRF|MWP|TDF|MKD|TPP|CLF|CLE|ALL|ALK|BRL|TPE|DES|XCF|DEM|XCD|KWD|YUM|SVC|GWM|SIT|XOF|TOS|BEF|GWE|TCC|CKD|SUR|ROL|DDM|NOK|XNF|SHP|ZAP|ZAL|KID|TZS|GIP|ZMP|CVE|ZMK|XAF|LBP|STE|STD|FOK|DOP|BOV|CUX|LNR|WSP|XMF|MTP|USS|MHD|BOP|NZP|CUP|MTL|TMM|USN|GHP|SSP|AUP|SGD|NZD|USD|HNL|PAB|GTQ|AUD|NAD|MGF|BBD|CHF|MGA|JMP|PLZ|PLX|YER|ATS|ETD|LYP|BND|YEI|EGP|JMD|ISK|SRG|BZH|LYD|BZD|ESP|KRW|NLG|MRO|BMP|ZWD|SEK|KRO|CSK|IRR|PKR|BMD|KRH|CSC";

  private static final String currenciesSymbolValues = "YDD|GRN|NT$|SL Re|TJS|RWF|TJR|SDP|GRD|IR\u00a3|CFF|Arg$|ARP|SDD|ARM|FKP|EEK|TVD|HK$|ID|ARA|SR|XID|VT|KPW|DKr|Rp|LVR|KPP|AED|LVL|RUR|FJP|MOP|F$|ADP|DF|SI$|ADD|TTO|ECS|THB|LUF|FIM|TT$|Tug|UAK|SRl|UAH|Ft|IBP|Col$|LTT|VGD|PTE|AOS|INR|XFU|LTL|T|COF|KZR|COB|BUK|XFO|LS|RO|NGP|MZE|MMX|NGN|PSP|Y|CNX|GNI|MAF|GF|MAD|MMK|RM|M|TL|CF|GAF|CZK|NA f.|GMP|BGX|XEF|KYD|BGO|BGN|MXV|Can$|BGM|lev|Be|MLF|MXP|ILS|BSP|MEX$|G$|CMF|ILP|\u00a3C|Sk|XDR|ILL|LRD|dram|BSD|GLK|HRK|MKN|ALX|Ch$|JEP|ALV|CFPF|FRF|MWP|TDF|MDen|TPP|CLF|CLE|lek|ALK|R$|TPE|DES|XCF|DEM|EC$|KD|YUM|SVC|GWM|SIT|XOF|TOS|BF|GWE|TCC|CKD|SUR|leu|DDM|NKr|XNF|SHP|ZAP|ZAL|KID|T Sh|GIP|ZMP|CVEsc|ZMK|XAF|LL|STE|Db|FOK|RD$|BOV|CUX|LNR|WSP|XMF|MTP|USS|MHD|BOP|NZP|CUP|Lm|TMM|USN|GHP|SSP|AUP|S$|$NZ|US$|L|PAB|Q|$A|N$|MGF|BDS$|SwF|MGA|JMP|PLZ|PLX|YRl|ATS|ETD|LYP|BND|YEI|EGP|J$|kr.|Sf|BZH|LD|BZ$|ESP|KRW|NLG|UM|BMP|Z$|SKr|KRO|CSK|RI|Pra|Ber$|KRH|CSC";

  private static final Hashtable currenciesSymbol;
  static
  {
    currenciesSymbol = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesSymbolKeys, "|");
    Enumeration values = new StringTokenizer(currenciesSymbolValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesSymbol.put(key, value);
      }
  }

  private static final String[] shortMonths = {
    "jan",
    "feb",
    "mar",
    "apr",
    "ma\u00ed",
    "j\u00fan",
    "j\u00fal",
    "\u00e1g\u00fa",
    "sep",
    "okt",
    "n\u00f3v",
    "des",
    null,
  };

  private static final String[] months = {
    "jan\u00faar",
    "febr\u00faar",
    "mars",
    "apr\u00edl",
    "ma\u00ed",
    "j\u00fan\u00ed",
    "j\u00fal\u00ed",
    "\u00e1g\u00fast",
    "september",
    "okt\u00f3ber",
    "n\u00f3vember",
    "desember",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "sun",
    "m\u00e1n",
    "\u00feri",
    "mi\u00f0",
    "fim",
    "f\u00f6s",
    "lau",
  };

  private static final String[] weekdays = {
    null,
    "sunnudagur",
    "m\u00e1nudagur",
    "\u00feri\u00f0judagur",
    "mi\u00f0vikudagur",
    "fimmtudagur",
    "f\u00f6studagur",
    "laugardagur",
  };

  private static final String territoriesKeys = "TL|TK|TJ|TH|TG|TF|GY|TD|TC|GW|GU|GT|GS|GR|GQ|GP|SZ|SY|GN|GM|GL|SV|ST|GI|GH|SR|GF|SP|GE|SO|GD|SN|SM|GB|SL|GA|SK|SJ|SI|SH|SG|SE|SD|SC|SB|SA|FR|FO|FM|RW|FK|RU|FJ|FI|RO|RE|ET|ES|ER|EH|EG|EE|EC|DZ|QA|DO|PY|DM|PW|DK|DJ|PT|PS|PR|DE|PN|PM|PL|PK|PH|PG|PF|CZ|PE|CY|CX|CV|CU|CR|CO|CN|CM|CK|CI|CH|CG|CF|CD|CC|OM|CA|BZ|BY|BW|BV|BT|BS|BR|NZ|BO|BN|BM|NU|BJ|BI|BH|NR|BG|BF|NP|BE|NO|BD|BB|NL|BA|NI|NG|NF|AZ|NE|NC|AW|ZM|NA|AU|AT|AS|AR|AQ|MZ|AO|MY|AN|MX|AM|MW|AL|MV|ZA|MU|MT|AI|MS|MR|AG|MQ|AF|MP|AE|MO|AD|MN|MM|ML|MK|YU|YT|MH|MG|MD|MC|MA|YE|LY|LV|LU|LT|LS|LR|LK|LI|LC|LB|LA|KZ|KY|KW|KR|KP|KN|KM|KI|WS|KH|KG|KE|WF|JP|JO|JM|VU|VN|VI|VG|VE|VC|VA|IT|IS|IR|IQ|UZ|IO|UY|IN|IL|US|IE|ID|UM|UG|UA|HU|HT|HR|TZ|HN|HM|TW|TV|HK|TT|TR|TO|TN|TM";

  private static final String territoriesValues = "Austur-T\u00edmor|T\u00f3kel\u00e1|Tadsjikistan|Ta\u00edland|T\u00f3g\u00f3|Fr\u00f6nsku su\u00f0l\u00e6gu landsv\u00e6\u00f0in|Gv\u00e6jana|Tsjad|Turks- og Caicoseyjar|G\u00ednea-Biss\u00e1|Gvam|Gvatemala|Su\u00f0ur-Georg\u00eda og Su\u00f0ur-Sandv\u00edkureyjar|Grikkland|Mi\u00f0baugs-G\u00ednea|Gvadel\u00fapeyjar|Svas\u00edland|S\u00fdrland|G\u00ednea|Gamb\u00eda|Gr\u00e6nland|El Salvador|Sa\u00f3 T\u00f3me og Prins\u00edpe|G\u00edbraltar|Gana|S\u00far\u00ednam|Franska Gv\u00e6jana|Serb\u00eda|Georg\u00eda|S\u00f3mal\u00eda|Grenada|Senegal|San Mar\u00edn\u00f3|Bretland|S\u00ederra Le\u00f3ne|Gabon|Sl\u00f3vak\u00eda|Svalbar\u00f0i og Jan Mayen|Sl\u00f3ven\u00eda|Sankti Helena|Singap\u00far|Sv\u00ed\u00fej\u00f3\u00f0|S\u00fadan|Seychelleseyjar|Sal\u00f3monseyjar|S\u00e1di-Arab\u00eda|Frakkland|F\u00e6reyjar|Mikr\u00f3nes\u00eda|R\u00faanda|Falklandseyjar|R\u00fassland|F\u00eddjieyjar|Finnland|R\u00famen\u00eda|R\u00e9union|E\u00fe\u00ed\u00f3p\u00eda|Sp\u00e1nn|Er\u00edtrea|Vestur-Sahara|Egyptaland|Eistland|Ekvador|Als\u00edr|Katar|D\u00f3min\u00edska l\u00fd\u00f0veldi\u00f0|Paragv\u00e6|D\u00f3min\u00edka|Pal\u00e1|Danm\u00f6rk|Dj\u00edb\u00fat\u00ed|Port\u00fagal|Palest\u00edna|P\u00faert\u00f3 R\u00edk\u00f3|\u00de\u00fdskaland|Pitcairn|Sankti Pierre og Miquelon|P\u00f3lland|Pakistan|Filippseyjar|Pap\u00faa N\u00fdja-G\u00ednea|Franska P\u00f3l\u00fdnes\u00eda|T\u00e9kkland|Per\u00fa|K\u00fdpur|J\u00f3laey|Gr\u00e6nh\u00f6f\u00f0aeyjar|K\u00faba|Kostar\u00edka|K\u00f3lumb\u00eda|K\u00edna|Kamer\u00fan|Cookseyjar|F\u00edlabeinsstr\u00f6ndin|Sviss|Vestur-Kong\u00f3|Mi\u00f0-Afr\u00edkul\u00fd\u00f0veldi\u00f0|Austur-Kong\u00f3|K\u00f3koseyjar|\u00d3man|Kanada|Bel\u00eds|Hv\u00edta-R\u00fassland|Botsvana|Bouveteyja|B\u00fatan|Bahamaeyjar|Brasil\u00eda|N\u00fdja-Sj\u00e1land|B\u00f3liv\u00eda|Br\u00fanei|Berm\u00fadaeyjar|Niue|Ben\u00edn|B\u00far\u00fand\u00ed|Barein|N\u00e1r\u00fa|B\u00falgar\u00eda|B\u00fark\u00edna Fas\u00f3|Nepal|Belg\u00eda|Noregur|Bangladess|Barbados|Ni\u00f0url\u00f6nd|Bosn\u00eda og Herseg\u00f3v\u00edna|N\u00edkaragva|N\u00edger\u00eda|Norfolkeyja|Aserba\u00eddsjan|N\u00edger|N\u00fdja-Kaled\u00f3n\u00eda|Ar\u00faba|Samb\u00eda|Namib\u00eda|\u00c1stral\u00eda|Austurr\u00edki|Bandar\u00edska Sam\u00f3a|Argent\u00edna|Su\u00f0urskautslandi\u00f0|M\u00f3samb\u00edk|Ang\u00f3la|Malas\u00eda|Hollensku Antillur|Mex\u00edk\u00f3|Armen\u00eda|Malav\u00ed|Alban\u00eda|Mald\u00edveyjar|Su\u00f0ur-Afr\u00edka|M\u00e1rit\u00edus|Malta|Angvilla|Montserrat|M\u00e1ritan\u00eda|Ant\u00edgva og Barb\u00fada|Martin\u00edk|Afganistan|Nor\u00f0ur-Mar\u00edanaeyjar|Sameinu\u00f0u arab\u00edsku furstad\u00e6min|Maka\u00f3|Andorra|Mong\u00f3l\u00eda|Mjanmar|Mal\u00ed|Maked\u00f3n\u00eda|J\u00fag\u00f3slav\u00eda|Mayotte|Marshalleyjar|Madagaskar|Mold\u00f3va|M\u00f3nak\u00f3|Marokk\u00f3|Jemen|L\u00edb\u00eda|Lettland|L\u00faxemborg|Lith\u00e1en|Les\u00f3t\u00f3|L\u00edber\u00eda|Sr\u00ed Lanka|Liechtenstein|Sankti L\u00fas\u00eda|L\u00edbanon|Laos|Kasakstan|Caymaneyjar|K\u00faveit|Su\u00f0ur-K\u00f3rea|Nor\u00f0ur-K\u00f3rea|Sankti Krist\u00f3fer og Nevis|K\u00f3moreyjar|K\u00edribat\u00ed|Sam\u00f3a|Kamb\u00f3d\u00eda|Kirgisistan|Ken\u00eda|Wallis- og F\u00fat\u00fanaeyjar|Japan|J\u00f3rdan\u00eda|Jama\u00edka|Van\u00faat\u00fa|V\u00edetnam|J\u00f3mfr\u00faaeyjar (bandar\u00edsku)|J\u00f3mfr\u00faaeyjar (bresku)|Venes\u00faela|Sankti Vinsent og Grenad\u00edneyjar|P\u00e1fagar\u00f0ur|\u00cdtal\u00eda|\u00cdsland|\u00cdran|\u00cdrak|\u00dasbekistan|Bresku Indlandshafseyjar|\u00dar\u00fagv\u00e6|Indland|\u00cdsrael|Bandar\u00edkin|\u00cdrland|Ind\u00f3nes\u00eda|Sm\u00e1eyjar Bandar\u00edkjanna|\u00daganda|\u00dakra\u00edna|Ungverjaland|Ha\u00edt\u00ed|Kr\u00f3at\u00eda|Tansan\u00eda|Hond\u00faras|Heard og McDonaldseyjar|Ta\u00edvan|T\u00faval\u00fa|Hong Kong|Tr\u00ednidad og T\u00f3bag\u00f3|Tyrkland|Tonga|T\u00fanis|T\u00farkmenistan";

  private static final Hashtable territories;
  static
  {
    territories = new Hashtable();
    Enumeration keys = new StringTokenizer(territoriesKeys, "|");
    Enumeration values = new StringTokenizer(territoriesValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         territories.put(key, value);
      }
  }

  private static final String languagesKeys = "gwi|akk|eka|ijo|xh|sux|sus|mis|loz|tog|pon|min|suk|wo|lol|kut|mic|wa|kum|zap|cus|jbo|doi|vo|oto|vi|vai|rar|ve|rap|raj|ota|nzi|nap|uz|uga|tmh|nai|nah|ur|fat|uk|egy|ug|fan|ssa|mga|bat|nyo|bas|nyn|nym|hmn|ban|osa|bal|ty|bai|tw|srr|tli|tt|ts|bad|tr|to|tn|tl|tk|ti|th|kru|tg|byn|te|kro|csb|ta|tkl|efi|sw|sv|su|krc|st|ss|sr|sq|men|crp|so|afh|sn|sm|sl|grc|sk|grb|si|sh|crh|afa|sg|se|sd|udm|sc|sa|rw|ru|mdr|ro|rn|rm|mdf|tiv|ady|zun|kpe|qu|tig|son|cpp|sog|ada|kos|hit|cpf|cpe|him|kok|hil|got|gor|gon|din|nub|pt|ps|fur|phn|goh|snk|cop|yap|ach|yao|phi|pl|ace|pi|pa|bug|iba|sms|bua|mas|smn|os|map|or|man|smj|smi|mak|om|mai|oj|mag|mad|sma|oc|nso|btk|myv|dgr|ny|myn|nv|kmb|nr|gmh|no|nn|nl|ng|sla|ne|nd|cmc|tet|nb|na|ter|tem|my|lez|mt|peo|ms|mr|fro|mo|frm|mn|jrb|ml|mk|mi|mh|mg|mwr|bra|den|lv|lu|del|lt|lo|ln|li|ewo|lg|lb|la|jpr|vot|sit|ky|kw|kv|ku|sio|ks|kr|awa|ko|kn|km|kl|kk|rom|kj|sid|ki|kg|non|ka|mus|roa|nog|mun|mul|jv|gil|znd|shn|fon|xal|aus|kho|ja|khi|pau|chy|tai|iu|pap|it|sgn|is|kha|chr|pam|pal|chp|io|cho|chn|chm|tyv|bnt|pag|ik|chk|ii|haw|lam|ig|chg|sga|paa|ie|id|lah|day|chb|ia|lad|hz|hai|dar|hy|ath|hu|ht|dak|hr|ho|hi|dyu|he|ast|ha|wen|gv|gu|sem|sel|iro|gn|gl|arw|gez|art|gd|ira|ga|arp|arn|fy|bla|gem|ypk|arc|fr|fo|cel|fj|fi|ff|tvl|ceb|fa|eu|sco|et|es|eo|en|el|tut|niu|tup|ee|tum|mos|dz|nic|lus|fiu|dv|nia|moh|luo|lun|apa|lui|hup|bin|de|lua|bik|was|und|war|da|dum|wal|mno|wak|sat|cy|sas|kbd|cv|cu|mni|cs|sam|cr|sal|dua|co|sai|mnc|sah|kaw|inh|gba|sad|ch|ine|bho|enm|kar|inc|ce|gay|ca|umb|syr|kam|tsi|ang|kac|cau|kab|kaa|bs|car|br|bo|bn|bm|gaa|cai|bi|bh|bg|be|cad|ba|zu|zen|pro|hsb|az|ay|av|as|dsb|ar|ilo|elx|zh|an|pra|am|new|ak|za|af|ae|ab|yo|alg|ale|mkh|yi|dra|ber|nds|bem|bej|tpi";

  private static final String languagesValues = "Gv\u00eds\u00edn|Akkad\u00edska|Ekaj\u00fak|\u00cdj\u00f3|S\u00f3sa|S\u00famerska|S\u00fas\u00fa|\u00ddmis m\u00e1l|Los\u00ed|Tongverska|Ponpeiska|M\u00ednangkab\u00e1|S\u00fak\u00fama|Volof|Mong\u00f3|K\u00fatena\u00ed|Mikmak|Vall\u00f3nska|K\u00fam\u00edk|Sap\u00f3tek|K\u00fasit\u00edsk m\u00e1l (\u00f6nnur)|Lojban|Dogr\u00ed|Volap\u00fck|\u00d3tomm\u00e1l|V\u00edetnamska|Va\u00ed|Rar\u00f3tongska|Venda|Rapan\u00fa\u00ed|Rajastan\u00ed|Tyrkneska, ott\u00f3man (1500-1928)|Ns\u00edma|Nap\u00f3l\u00edska|\u00dasbekska|\u00dagar\u00edt\u00edska|Tamasjek|Ind\u00ed\u00e1nam\u00e1l Nor\u00f0ur-Amer\u00edku (\u00f6nnur)|Nah\u00faatl|\u00dard\u00fa|Fant\u00ed|\u00dakra\u00ednska|Fornegypska|\u00da\u00edg\u00far|Fang|N\u00edl\u00f3saharam\u00e1l (\u00f6nnur)|Mi\u00f0\u00edrska (900-1200)|Baltnesk m\u00e1l (\u00f6nnur)|Nj\u00f3r\u00f3|Basa|Njank\u00f3le|Njamves\u00ed|Hmong|Bal\u00edska|\u00d3sage|Bal\u00fak\u00ed|Tah\u00edt\u00edska|Bam\u00edlekem\u00e1l|Tv\u00ed|Serer|Tlingit|Tatarska|Tsonga|Banda|Tyrkneska|Tongverska|Ts\u00faana|Tagalog|T\u00farkmenska|T\u00edgrinja|Ta\u00edlenska|K\u00far\u00fak|Tadsjikska|Bl\u00edn|Tel\u00fag\u00fa|Kr\u00fa|Kas\u00fab\u00edska|Tam\u00edlska|T\u00f3kel\u00e1ska|Ef\u00edk|Svah\u00edl\u00ed|S\u00e6nska|S\u00fandanska|Karasa\u00edbalkar|Su\u00f0urs\u00f3t\u00f3|Svat\u00ed|Serbneska|Albanska|Mende|Kre\u00f3l- og pidginm\u00e1l (\u00f6nnur)|S\u00f3malska|Afr\u00edh\u00edl\u00ed|S\u00edn\u00f3t\u00edbesk m\u00e1l (\u00f6nnur)|Sam\u00f3ska|Sl\u00f3venska|Forngr\u00edska (til 1453)|Sl\u00f3vak\u00edska|Gerb\u00f3|Singales\u00edska|Serb\u00f3kr\u00f3at\u00edska|Kr\u00edmtyrkneska|Afr\u00f3as\u00edsk m\u00e1l (\u00f6nnur)|Sang\u00f3|Nor\u00f0ursam\u00edska|Sind\u00ed|\u00dadm\u00fart|Sard\u00ednska|Sanskr\u00edt|K\u00ednjarvanda|R\u00fassneska|Mandar|R\u00famenska|R\u00fand\u00ed|Ret\u00f3r\u00f3manska|Moksa|T\u00edv|Ad\u00fdge|S\u00fan\u00ed|Kpelle|Kvesj\u00faa|T\u00edgre|Songha\u00ed|Kre\u00f3l- og pidginm\u00e1l \u00e1 port\u00fag\u00f6lskum grunni|Sogd\u00eden|Adangme|Kosraska|Hettit\u00edska|Kre\u00f3l- og pidginm\u00e1l \u00e1 fr\u00f6nskum grunni|Kre\u00f3l- og pidginm\u00e1l \u00e1 enskum grunni|H\u00edmasjal\u00ed|Konkan\u00ed|H\u00edliga\u00ednon|Gotneska|Gorontal\u00f3|Gond\u00ed|Dinka|N\u00fab\u00edsk m\u00e1l|Port\u00fagalska|Past\u00fa|Fr\u00ed\u00falska|F\u00f6nik\u00edska|Fornh\u00e1\u00fe\u00fdska (um 750-1050)|S\u00f3ninke|Kopt\u00edska|Jap\u00edska|Ak\u00f3l\u00ed|Ja\u00f3|Filippseysk m\u00e1l (\u00f6nnur)|P\u00f3lska|Akk\u00edska|Pal\u00ed|P\u00fanjab\u00ed|B\u00fag\u00edska|\u00cdban|Skoltesam\u00edska|B\u00far\u00edat|Masa\u00ed|Enaresam\u00edska|Osset\u00edska|\u00c1str\u00f3nes\u00edska|\u00d3r\u00eda|Manding\u00f3|L\u00falesam\u00edska|Sam\u00edsk m\u00e1l (\u00f6nnur)|Makasar|\u00d3r\u00f3m\u00f3|Ma\u00edt\u00edl\u00ed|Ojibva|Magah\u00ed|Mad\u00farska|Su\u00f0ursam\u00edska|Okkit\u00edska (eftir 1500); Pr\u00f3vensalska|Nor\u00f0urs\u00f3t\u00f3|Batak|Ersja|Dogr\u00edb|Njanja; S\u00edsjeva; Sjeva|Majam\u00e1l|Navah\u00f3|Kimb\u00fand\u00fa|Su\u00f0urndebele|Mi\u00f0h\u00e1\u00fe\u00fdska (um 1050-1500|Norska|N\u00fdnorska|Hollenska|Ndonga|Slavnesk m\u00e1l (\u00f6nnur)|Nepalska|Nor\u00f0urndebele|Kam\u00edsk m\u00e1l|Tet\u00fam|Norskt b\u00f3km\u00e1l|N\u00e1r\u00faska|Teren\u00f3|T\u00edmne|Burmneska|Lesg\u00edska|Maltneska|Fornpersneska|Mala\u00edska|Marat\u00ed|Fornfranska (842 - um 1400)|Mold\u00f3vska|Mi\u00f0franska (um 1400-1600)|Mong\u00f3lska|Gy\u00f0ingaarab\u00edska|Malajalam|Maked\u00f3nska|Ma\u00f3r\u00ed|Marshallska|Malagas\u00edska|Marvar\u00ed|Bra\u00ed|Slav|Lettneska|L\u00fabakatanga|Delaver|Lith\u00e1\u00edska|La\u00f3|Lingala|Limb\u00farg\u00edska|Evond\u00f3|Ganda|L\u00faxemborg\u00edska|Lat\u00edna|Gy\u00f0ingapersneska|Vot\u00edska|S\u00edn\u00f3t\u00edbesk m\u00e1l (\u00f6nnur)|Kirgiska|Korn\u00edska|Kom\u00edska|K\u00fardneska|S\u00ed\u00fam\u00e1l|Kasm\u00edrska|Kan\u00far\u00ed|Avad\u00ed|K\u00f3reska|Kannada|Kmer|Gr\u00e6nlenska|Kasakska|Roman\u00ed|K\u00faanjama|S\u00eddam\u00f3|K\u00edk\u00faj\u00fa|Kong\u00f3|Norr\u00e6na|Georg\u00edska|Kr\u00edk|R\u00f3m\u00f6nsk m\u00e1l (\u00f6nnur)|N\u00f3ga\u00ed|M\u00fandam\u00e1l|Margv\u00edsleg m\u00e1l|Javanska|Gilberska|Sande|Sjan|F\u00f3n|Kalm\u00fakska|\u00c1str\u00f6lsk m\u00e1l|Kotaska|Japanska|Ko\u00edm\u00e1l (\u00f6nnur)|Pal\u00e1ska|Sjeyen|Ta\u00edm\u00e1l (\u00f6nnur)|In\u00faktit\u00fat|Pap\u00edament\u00f3|\u00cdtalska|T\u00e1knm\u00e1l|\u00cdslenska|Kas\u00ed|Sjer\u00f3k\u00ed|Pampanga|Palav\u00ed|S\u00edpev\u00edska|\u00cdd\u00f3|Sjokt\u00e1|S\u00edn\u00fak|Mar\u00ed|T\u00fav\u00ednska|Bant\u00fam\u00e1l|Pangas\u00ednm\u00e1l|\u00cdn\u00fap\u00edak|Sj\u00fak\u00edska|S\u00eds\u00faanj\u00ed|Hava\u00edska|Lamba|\u00cdgb\u00f3|Sjagata\u00ed|Forn\u00edrska (til 900)|Pap\u00fask m\u00e1l (\u00f6nnur)|Interlingva|Ind\u00f3nes\u00edska|Landa|Dajak|S\u00edbsja|Interlingva|Lad\u00ednska|Herer\u00f3|Ha\u00edda|Dargva|Armenska|Atapask\u00edsk m\u00e1l|Ungverska|Ha\u00edt\u00edska|Dak\u00f3ta|Kr\u00f3at\u00edska|H\u00edr\u00edm\u00f3t\u00fa|Hind\u00ed|Dj\u00fala|Hebreska|Ast\u00far\u00edska|H\u00e1sa|Sorbnesk m\u00e1l|Manx|G\u00fajarat\u00ed|Sem\u00edsk m\u00e1l (\u00f6nnur)|Selk\u00fap|\u00cdr\u00f3kesk m\u00e1l|Gvaran\u00ed|Gallegska|Aravakska|G\u00eds|Al\u00fej\u00f3\u00f0am\u00e1l (\u00f6nnur)|Skosk gel\u00edska|\u00cdranska|\u00cdrska|Arapah\u00f3|Ar\u00e1kan\u00edska|Fr\u00edsneska|Siksika|Germ\u00f6nsk m\u00e1l (\u00f6nnur)|J\u00fap\u00edsk m\u00e1l|Arame\u00edska|Franska|F\u00e6reyska|Keltnesk (\u00f6nnur)|F\u00eddjeyska|Finnska|F\u00fala|T\u00faval\u00faska|Keb\u00faan\u00f3|Persneska|Baskneska|Skoska|Eistneska|Sp\u00e6nska|Esperant\u00f3|Enska|N\u00fdgr\u00edska (1453-)|Alta\u00edsk m\u00e1l (\u00f6nnur)|N\u00edveska|T\u00fap\u00edm\u00e1l|Eve|T\u00famb\u00faka|Moss\u00ed|Dsongka|N\u00edgerkord\u00f3fanm\u00e1l (\u00f6nnur)|L\u00fasa\u00ed|Finnsk\u00fagr\u00edsk m\u00e1l (\u00f6nnur)|D\u00edveh\u00ed|N\u00edas|M\u00f3h\u00edska|L\u00fa\u00f3|L\u00fanda|Apatsjam\u00e1l|L\u00faisen\u00f3|H\u00fapa|B\u00edn\u00ed|\u00de\u00fdska|L\u00fabal\u00fal\u00faa|B\u00edkol|Vasj\u00f3|\u00d3lj\u00f3st|Vara\u00ed|Danska|Mi\u00f0hollenska (um 1050-1350)|Valam\u00f3|Man\u00f3b\u00f3m\u00e1l|Vakasm\u00e1l|Santal\u00ed|Velska|Sasak|Kabard\u00edska|Sj\u00favas|Kirkjuslavneska|Man\u00edp\u00far\u00ed|T\u00e9kkneska|Samversk arame\u00edska|Kr\u00ed|Sal\u00edsm\u00e1l|D\u00faala|Kors\u00edska|Ind\u00ed\u00e1nam\u00e1l Su\u00f0ur-Amer\u00edku (\u00f6nnur)|Mansj\u00fa|Jak\u00fat|Kav\u00ed|Ing\u00fas|Gbaja|Sandave|Kamorr\u00f3|Ind\u00f3evr\u00f3psk m\u00e1l (\u00f6nnur)|Bojp\u00far\u00ed|Mi\u00f0enska (1100-1500)|Karen|Indversk m\u00e1l (\u00f6nnur)|Tsjetsjenska|Gaj\u00f3|Katal\u00f3nska|\u00damb\u00fand\u00fa|S\u00fdrlenska|Kamba|Tsims\u00edska|Fornenska (um 450-1100)|Kas\u00edn|K\u00e1kasusm\u00e1l (\u00f6nnur)|Kab\u00edle|Karakalpak|Bosn\u00edska|Kar\u00edbam\u00e1l|Bret\u00f3nska|T\u00edbeska|Bengalska|Bambara|Ga|Ind\u00ed\u00e1nam\u00e1l Mi\u00f0-Amer\u00edku (\u00f6nnur)|B\u00edslama|B\u00edhar\u00ed|B\u00falgarska|Hv\u00edtr\u00fassneska|Kadd\u00f3|Bask\u00edr|S\u00fal\u00fa|Senaga|Fornpr\u00f3vensalska (til 1500)|H\u00e1sorbneska|Aserska|A\u00edmara|Avar\u00edska|Assamska|L\u00e1gsorbneska|Arab\u00edska|\u00cdlok\u00f3|Elam\u00edt|K\u00ednverska|Aragonska|Prakr\u00edtm\u00e1l|Amhar\u00edska|Nevar\u00ed|Akan|S\u00faang|Afr\u00edkanska|Avest\u00edska|Abkas\u00edska|J\u00f3r\u00faba|Algonkv\u00ednsk m\u00e1l|Ale\u00faska|Monkmerm\u00e1l (\u00f6nnur)|Jidd\u00edska|Dravid\u00edsk m\u00e1l (\u00f6nnur)|Berbam\u00e1l|L\u00e1g\u00fe\u00fdska; L\u00e1gsaxneska|Bemba|Beja|Tokpisin";

  private static final Hashtable languages;
  static
  {
    languages = new Hashtable();
    Enumeration keys = new StringTokenizer(languagesKeys, "|");
    Enumeration values = new StringTokenizer(languagesValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         languages.put(key, value);
      }
  }

  private static final Object[][] contents =
  {
    { "decimalSeparator", "," },
    { "groupingSeparator", "." },
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "shortDateFormat", "d.M.yyyy" },
    { "mediumDateFormat", "d.M.yyyy" },
    { "longDateFormat", "d. MMMM yyyy" },
    { "fullDateFormat", "EEEE, d. MMMM yyyy" },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}