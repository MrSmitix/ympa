namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module OrdersShipmentInfoDTO =

  //#region OrdersShipmentInfoDTO

  [<CLIMutable>]
  type OrdersShipmentInfoDTO = {
    [<JsonProperty(PropertyName = "orderIdsWithLabels")>]
    OrderIdsWithLabels : int64[];
    [<JsonProperty(PropertyName = "orderIdsWithoutLabels")>]
    OrderIdsWithoutLabels : int64[];
  }

  //#endregion
