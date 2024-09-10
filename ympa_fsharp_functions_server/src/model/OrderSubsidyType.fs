namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderSubsidyType =

  //#region OrderSubsidyType

  let YANDEXCASHBACKEnum = "YANDEX_CASHBACK"
  let SUBSIDYEnum = "SUBSIDY"
  let DELIVERYEnum = "DELIVERY"
  type OrderSubsidyType = string

  //#endregion
