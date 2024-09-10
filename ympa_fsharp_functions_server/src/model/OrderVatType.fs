namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderVatType =

  //#region OrderVatType

  let NOVATEnum = "NO_VAT"
  let VAT0Enum = "VAT_0"
  let VAT10Enum = "VAT_10"
  let VAT10110Enum = "VAT_10_110"
  let VAT20Enum = "VAT_20"
  let VAT20120Enum = "VAT_20_120"
  let VAT18Enum = "VAT_18"
  let VAT18118Enum = "VAT_18_118"
  let UNKNOWNVALUEEnum = "UNKNOWN_VALUE"
  type OrderVatType = string

  //#endregion
