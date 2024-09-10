note
 description:"[
		Партнерский API Маркета
 		API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
  		The version of the OpenAPI document: LATEST
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CURRENCY_TYPE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_rur: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("RUR")
    end

 val_usd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("USD")
    end

 val_eur: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("EUR")
    end

 val_uah: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("UAH")
    end

 val_aud: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("AUD")
    end

 val_gbp: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("GBP")
    end

 val_byr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BYR")
    end

 val_byn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BYN")
    end

 val_dkk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("DKK")
    end

 val_isk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ISK")
    end

 val_kzt: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KZT")
    end

 val_cad: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CAD")
    end

 val_cny: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CNY")
    end

 val_nok: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("NOK")
    end

 val_xdr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("XDR")
    end

 val_sgd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SGD")
    end

 val_try: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TRY")
    end

 val_sek: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SEK")
    end

 val_chf: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CHF")
    end

 val_jpy: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("JPY")
    end

 val_azn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("AZN")
    end

 val_all: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ALL")
    end

 val_dzd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("DZD")
    end

 val_aoa: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("AOA")
    end

 val_ars: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ARS")
    end

 val_amd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("AMD")
    end

 val_afn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("AFN")
    end

 val_bhd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BHD")
    end

 val_bgn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BGN")
    end

 val_bob: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BOB")
    end

 val_bwp: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BWP")
    end

 val_bnd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BND")
    end

 val_brl: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BRL")
    end

 val_bif: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BIF")
    end

 val_huf: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("HUF")
    end

 val_vef: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("VEF")
    end

 val_kpw: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KPW")
    end

 val_vnd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("VND")
    end

 val_gmd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("GMD")
    end

 val_ghs: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("GHS")
    end

 val_gnf: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("GNF")
    end

 val_hkd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("HKD")
    end

 val_gel: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("GEL")
    end

 val_aed: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("AED")
    end

 val_egp: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("EGP")
    end

 val_zmk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ZMK")
    end

 val_ils: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ILS")
    end

 val_inr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("INR")
    end

 val_idr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("IDR")
    end

 val_jod: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("JOD")
    end

 val_iqd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("IQD")
    end

 val_irr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("IRR")
    end

 val_yer: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("YER")
    end

 val_qar: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("QAR")
    end

 val_kes: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KES")
    end

 val_kgs: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KGS")
    end

 val_cop: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("COP")
    end

 val_cdf: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CDF")
    end

 val_crc: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CRC")
    end

 val_kwd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KWD")
    end

 val_cup: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CUP")
    end

 val_lak: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("LAK")
    end

 val_lvl: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("LVL")
    end

 val_sll: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SLL")
    end

 val_lbp: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("LBP")
    end

 val_lyd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("LYD")
    end

 val_szl: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SZL")
    end

 val_ltl: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("LTL")
    end

 val_mur: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MUR")
    end

 val_mro: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MRO")
    end

 val_mkd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MKD")
    end

 val_mwk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MWK")
    end

 val_mga: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MGA")
    end

 val_myr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MYR")
    end

 val_mad: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MAD")
    end

 val_mxn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MXN")
    end

 val_mzn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MZN")
    end

 val_mdl: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MDL")
    end

 val_mnt: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("MNT")
    end

 val_npr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("NPR")
    end

 val_ngn: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("NGN")
    end

 val_nio: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("NIO")
    end

 val_nzd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("NZD")
    end

 val_omr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("OMR")
    end

 val_pkr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("PKR")
    end

 val_pyg: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("PYG")
    end

 val_pen: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("PEN")
    end

 val_pln: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("PLN")
    end

 val_khr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KHR")
    end

 val_sar: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SAR")
    end

 val_ron: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("RON")
    end

 val_scr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SCR")
    end

 val_syp: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SYP")
    end

 val_skk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SKK")
    end

 val_sos: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SOS")
    end

 val_sdg: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SDG")
    end

 val_srd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("SRD")
    end

 val_tjs: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TJS")
    end

 val_thb: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("THB")
    end

 val_twd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TWD")
    end

 val_bdt: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("BDT")
    end

 val_tzs: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TZS")
    end

 val_tnd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TND")
    end

 val_tmm: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TMM")
    end

 val_ugx: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("UGX")
    end

 val_uzs: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("UZS")
    end

 val_uyu: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("UYU")
    end

 val_php: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("PHP")
    end

 val_djf: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("DJF")
    end

 val_xaf: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("XAF")
    end

 val_xof: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("XOF")
    end

 val_hrk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("HRK")
    end

 val_czk: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CZK")
    end

 val_clp: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("CLP")
    end

 val_lkr: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("LKR")
    end

 val_eek: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("EEK")
    end

 val_etb: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ETB")
    end

 val_rsd: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("RSD")
    end

 val_zar: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("ZAR")
    end

 val_krw: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("KRW")
    end

 val_nad: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("NAD")
    end

 val_tl: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("TL")
    end

 val_ue: CURRENCY_TYPE
    once
      create Result
      Result.set_value ("UE")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end

