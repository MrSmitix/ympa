namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OutletType =

  //#region OutletType

  let DEPOTEnum = "DEPOT"
  let MIXEDEnum = "MIXED"
  let RETAILEnum = "RETAIL"
  let NOTDEFINEDEnum = "NOT_DEFINED"
  type OutletType = string

  //#endregion
