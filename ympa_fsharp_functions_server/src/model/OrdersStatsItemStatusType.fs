namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsItemStatusType =

  //#region OrdersStatsItemStatusType

  let REJECTEDEnum = "REJECTED"
  let RETURNEDEnum = "RETURNED"
  type OrdersStatsItemStatusType = string

  //#endregion
