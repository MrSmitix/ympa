namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrdersStatsCommissionType

module OrdersStatsCommissionDTO =

  //#region OrdersStatsCommissionDTO

  [<CLIMutable>]
  type OrdersStatsCommissionDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OrdersStatsCommissionType;
    [<JsonProperty(PropertyName = "actual")>]
    Actual : decimal;
  }

  //#endregion
