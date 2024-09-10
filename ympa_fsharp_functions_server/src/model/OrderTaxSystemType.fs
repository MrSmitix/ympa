namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderTaxSystemType =

  //#region OrderTaxSystemType

  let OSNEnum = "OSN"
  let USNEnum = "USN"
  let USNMINUSCOSTEnum = "USN_MINUS_COST"
  let ENVDEnum = "ENVD"
  let ECHNEnum = "ECHN"
  let PSNEnum = "PSN"
  let NPDEnum = "NPD"
  let UNKNOWNVALUEEnum = "UNKNOWN_VALUE"
  type OrderTaxSystemType = string

  //#endregion
