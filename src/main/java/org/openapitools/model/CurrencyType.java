package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна. 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum CurrencyType {
  
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

  private String value;

  CurrencyType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CurrencyType fromValue(String value) {
    for (CurrencyType b : CurrencyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

