package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна. 
* Values: RUR,USD,EUR,UAH,AUD,GBP,BYR,BYN,DKK,ISK,KZT,CAD,CNY,NOK,XDR,SGD,TRY,SEK,CHF,JPY,AZN,ALL,DZD,AOA,ARS,AMD,AFN,BHD,BGN,BOB,BWP,BND,BRL,BIF,HUF,VEF,KPW,VND,GMD,GHS,GNF,HKD,GEL,AED,EGP,ZMK,ILS,INR,IDR,JOD,IQD,IRR,YER,QAR,KES,KGS,COP,CDF,CRC,KWD,CUP,LAK,LVL,SLL,LBP,LYD,SZL,LTL,MUR,MRO,MKD,MWK,MGA,MYR,MAD,MXN,MZN,MDL,MNT,NPR,NGN,NIO,NZD,OMR,PKR,PYG,PEN,PLN,KHR,SAR,RON,SCR,SYP,SKK,SOS,SDG,SRD,TJS,THB,TWD,BDT,TZS,TND,TMM,UGX,UZS,UYU,PHP,DJF,XAF,XOF,HRK,CZK,CLP,LKR,EEK,ETB,RSD,ZAR,KRW,NAD,TL,UE
*/
enum class CurrencyType(@get:JsonValue val value: kotlin.String) {

    RUR("RUR"),
    USD("USD"),
    EUR("EUR"),
    UAH("UAH"),
    AUD("AUD"),
    GBP("GBP"),
    BYR("BYR"),
    BYN("BYN"),
    DKK("DKK"),
    ISK("ISK"),
    KZT("KZT"),
    CAD("CAD"),
    CNY("CNY"),
    NOK("NOK"),
    XDR("XDR"),
    SGD("SGD"),
    TRY("TRY"),
    SEK("SEK"),
    CHF("CHF"),
    JPY("JPY"),
    AZN("AZN"),
    ALL("ALL"),
    DZD("DZD"),
    AOA("AOA"),
    ARS("ARS"),
    AMD("AMD"),
    AFN("AFN"),
    BHD("BHD"),
    BGN("BGN"),
    BOB("BOB"),
    BWP("BWP"),
    BND("BND"),
    BRL("BRL"),
    BIF("BIF"),
    HUF("HUF"),
    VEF("VEF"),
    KPW("KPW"),
    VND("VND"),
    GMD("GMD"),
    GHS("GHS"),
    GNF("GNF"),
    HKD("HKD"),
    GEL("GEL"),
    AED("AED"),
    EGP("EGP"),
    ZMK("ZMK"),
    ILS("ILS"),
    INR("INR"),
    IDR("IDR"),
    JOD("JOD"),
    IQD("IQD"),
    IRR("IRR"),
    YER("YER"),
    QAR("QAR"),
    KES("KES"),
    KGS("KGS"),
    COP("COP"),
    CDF("CDF"),
    CRC("CRC"),
    KWD("KWD"),
    CUP("CUP"),
    LAK("LAK"),
    LVL("LVL"),
    SLL("SLL"),
    LBP("LBP"),
    LYD("LYD"),
    SZL("SZL"),
    LTL("LTL"),
    MUR("MUR"),
    MRO("MRO"),
    MKD("MKD"),
    MWK("MWK"),
    MGA("MGA"),
    MYR("MYR"),
    MAD("MAD"),
    MXN("MXN"),
    MZN("MZN"),
    MDL("MDL"),
    MNT("MNT"),
    NPR("NPR"),
    NGN("NGN"),
    NIO("NIO"),
    NZD("NZD"),
    OMR("OMR"),
    PKR("PKR"),
    PYG("PYG"),
    PEN("PEN"),
    PLN("PLN"),
    KHR("KHR"),
    SAR("SAR"),
    RON("RON"),
    SCR("SCR"),
    SYP("SYP"),
    SKK("SKK"),
    SOS("SOS"),
    SDG("SDG"),
    SRD("SRD"),
    TJS("TJS"),
    THB("THB"),
    TWD("TWD"),
    BDT("BDT"),
    TZS("TZS"),
    TND("TND"),
    TMM("TMM"),
    UGX("UGX"),
    UZS("UZS"),
    UYU("UYU"),
    PHP("PHP"),
    DJF("DJF"),
    XAF("XAF"),
    XOF("XOF"),
    HRK("HRK"),
    CZK("CZK"),
    CLP("CLP"),
    LKR("LKR"),
    EEK("EEK"),
    ETB("ETB"),
    RSD("RSD"),
    ZAR("ZAR"),
    KRW("KRW"),
    NAD("NAD"),
    TL("TL"),
    UE("UE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CurrencyType {
                return values().first{it -> it.value == value}
        }
    }
}

