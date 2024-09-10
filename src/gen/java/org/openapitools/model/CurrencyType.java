package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Коды валют. Возможные значения: * &#x60;BYR&#x60; — белорусский рубль. * &#x60;KZT&#x60; — казахстанский тенге. * &#x60;RUR&#x60; — российский рубль. * &#x60;UAH&#x60; — украинская гривна. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CurrencyType {

    @JsonProperty("RUR") RUR(String.valueOf("RUR")), @JsonProperty("USD") USD(String.valueOf("USD")), @JsonProperty("EUR") EUR(String.valueOf("EUR")), @JsonProperty("UAH") UAH(String.valueOf("UAH")), @JsonProperty("AUD") AUD(String.valueOf("AUD")), @JsonProperty("GBP") GBP(String.valueOf("GBP")), @JsonProperty("BYR") BYR(String.valueOf("BYR")), @JsonProperty("BYN") BYN(String.valueOf("BYN")), @JsonProperty("DKK") DKK(String.valueOf("DKK")), @JsonProperty("ISK") ISK(String.valueOf("ISK")), @JsonProperty("KZT") KZT(String.valueOf("KZT")), @JsonProperty("CAD") CAD(String.valueOf("CAD")), @JsonProperty("CNY") CNY(String.valueOf("CNY")), @JsonProperty("NOK") NOK(String.valueOf("NOK")), @JsonProperty("XDR") XDR(String.valueOf("XDR")), @JsonProperty("SGD") SGD(String.valueOf("SGD")), @JsonProperty("TRY") TRY(String.valueOf("TRY")), @JsonProperty("SEK") SEK(String.valueOf("SEK")), @JsonProperty("CHF") CHF(String.valueOf("CHF")), @JsonProperty("JPY") JPY(String.valueOf("JPY")), @JsonProperty("AZN") AZN(String.valueOf("AZN")), @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("DZD") DZD(String.valueOf("DZD")), @JsonProperty("AOA") AOA(String.valueOf("AOA")), @JsonProperty("ARS") ARS(String.valueOf("ARS")), @JsonProperty("AMD") AMD(String.valueOf("AMD")), @JsonProperty("AFN") AFN(String.valueOf("AFN")), @JsonProperty("BHD") BHD(String.valueOf("BHD")), @JsonProperty("BGN") BGN(String.valueOf("BGN")), @JsonProperty("BOB") BOB(String.valueOf("BOB")), @JsonProperty("BWP") BWP(String.valueOf("BWP")), @JsonProperty("BND") BND(String.valueOf("BND")), @JsonProperty("BRL") BRL(String.valueOf("BRL")), @JsonProperty("BIF") BIF(String.valueOf("BIF")), @JsonProperty("HUF") HUF(String.valueOf("HUF")), @JsonProperty("VEF") VEF(String.valueOf("VEF")), @JsonProperty("KPW") KPW(String.valueOf("KPW")), @JsonProperty("VND") VND(String.valueOf("VND")), @JsonProperty("GMD") GMD(String.valueOf("GMD")), @JsonProperty("GHS") GHS(String.valueOf("GHS")), @JsonProperty("GNF") GNF(String.valueOf("GNF")), @JsonProperty("HKD") HKD(String.valueOf("HKD")), @JsonProperty("GEL") GEL(String.valueOf("GEL")), @JsonProperty("AED") AED(String.valueOf("AED")), @JsonProperty("EGP") EGP(String.valueOf("EGP")), @JsonProperty("ZMK") ZMK(String.valueOf("ZMK")), @JsonProperty("ILS") ILS(String.valueOf("ILS")), @JsonProperty("INR") INR(String.valueOf("INR")), @JsonProperty("IDR") IDR(String.valueOf("IDR")), @JsonProperty("JOD") JOD(String.valueOf("JOD")), @JsonProperty("IQD") IQD(String.valueOf("IQD")), @JsonProperty("IRR") IRR(String.valueOf("IRR")), @JsonProperty("YER") YER(String.valueOf("YER")), @JsonProperty("QAR") QAR(String.valueOf("QAR")), @JsonProperty("KES") KES(String.valueOf("KES")), @JsonProperty("KGS") KGS(String.valueOf("KGS")), @JsonProperty("COP") COP(String.valueOf("COP")), @JsonProperty("CDF") CDF(String.valueOf("CDF")), @JsonProperty("CRC") CRC(String.valueOf("CRC")), @JsonProperty("KWD") KWD(String.valueOf("KWD")), @JsonProperty("CUP") CUP(String.valueOf("CUP")), @JsonProperty("LAK") LAK(String.valueOf("LAK")), @JsonProperty("LVL") LVL(String.valueOf("LVL")), @JsonProperty("SLL") SLL(String.valueOf("SLL")), @JsonProperty("LBP") LBP(String.valueOf("LBP")), @JsonProperty("LYD") LYD(String.valueOf("LYD")), @JsonProperty("SZL") SZL(String.valueOf("SZL")), @JsonProperty("LTL") LTL(String.valueOf("LTL")), @JsonProperty("MUR") MUR(String.valueOf("MUR")), @JsonProperty("MRO") MRO(String.valueOf("MRO")), @JsonProperty("MKD") MKD(String.valueOf("MKD")), @JsonProperty("MWK") MWK(String.valueOf("MWK")), @JsonProperty("MGA") MGA(String.valueOf("MGA")), @JsonProperty("MYR") MYR(String.valueOf("MYR")), @JsonProperty("MAD") MAD(String.valueOf("MAD")), @JsonProperty("MXN") MXN(String.valueOf("MXN")), @JsonProperty("MZN") MZN(String.valueOf("MZN")), @JsonProperty("MDL") MDL(String.valueOf("MDL")), @JsonProperty("MNT") MNT(String.valueOf("MNT")), @JsonProperty("NPR") NPR(String.valueOf("NPR")), @JsonProperty("NGN") NGN(String.valueOf("NGN")), @JsonProperty("NIO") NIO(String.valueOf("NIO")), @JsonProperty("NZD") NZD(String.valueOf("NZD")), @JsonProperty("OMR") OMR(String.valueOf("OMR")), @JsonProperty("PKR") PKR(String.valueOf("PKR")), @JsonProperty("PYG") PYG(String.valueOf("PYG")), @JsonProperty("PEN") PEN(String.valueOf("PEN")), @JsonProperty("PLN") PLN(String.valueOf("PLN")), @JsonProperty("KHR") KHR(String.valueOf("KHR")), @JsonProperty("SAR") SAR(String.valueOf("SAR")), @JsonProperty("RON") RON(String.valueOf("RON")), @JsonProperty("SCR") SCR(String.valueOf("SCR")), @JsonProperty("SYP") SYP(String.valueOf("SYP")), @JsonProperty("SKK") SKK(String.valueOf("SKK")), @JsonProperty("SOS") SOS(String.valueOf("SOS")), @JsonProperty("SDG") SDG(String.valueOf("SDG")), @JsonProperty("SRD") SRD(String.valueOf("SRD")), @JsonProperty("TJS") TJS(String.valueOf("TJS")), @JsonProperty("THB") THB(String.valueOf("THB")), @JsonProperty("TWD") TWD(String.valueOf("TWD")), @JsonProperty("BDT") BDT(String.valueOf("BDT")), @JsonProperty("TZS") TZS(String.valueOf("TZS")), @JsonProperty("TND") TND(String.valueOf("TND")), @JsonProperty("TMM") TMM(String.valueOf("TMM")), @JsonProperty("UGX") UGX(String.valueOf("UGX")), @JsonProperty("UZS") UZS(String.valueOf("UZS")), @JsonProperty("UYU") UYU(String.valueOf("UYU")), @JsonProperty("PHP") PHP(String.valueOf("PHP")), @JsonProperty("DJF") DJF(String.valueOf("DJF")), @JsonProperty("XAF") XAF(String.valueOf("XAF")), @JsonProperty("XOF") XOF(String.valueOf("XOF")), @JsonProperty("HRK") HRK(String.valueOf("HRK")), @JsonProperty("CZK") CZK(String.valueOf("CZK")), @JsonProperty("CLP") CLP(String.valueOf("CLP")), @JsonProperty("LKR") LKR(String.valueOf("LKR")), @JsonProperty("EEK") EEK(String.valueOf("EEK")), @JsonProperty("ETB") ETB(String.valueOf("ETB")), @JsonProperty("RSD") RSD(String.valueOf("RSD")), @JsonProperty("ZAR") ZAR(String.valueOf("ZAR")), @JsonProperty("KRW") KRW(String.valueOf("KRW")), @JsonProperty("NAD") NAD(String.valueOf("NAD")), @JsonProperty("TL") TL(String.valueOf("TL")), @JsonProperty("UE") UE(String.valueOf("UE"));


    private String value;

    CurrencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CurrencyType fromValue(String value) {
        for (CurrencyType b : CurrencyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



