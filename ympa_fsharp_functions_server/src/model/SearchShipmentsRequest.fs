namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set
open ympa_fsharp_functions_server.Model.ShipmentStatusType

module SearchShipmentsRequest =

  //#region SearchShipmentsRequest

  [<CLIMutable>]
  type SearchShipmentsRequest = {
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "statuses")>]
    Statuses : ShipmentStatusType[];
    [<JsonProperty(PropertyName = "orderIds")>]
    OrderIds : int64[];
    [<JsonProperty(PropertyName = "cancelledOrders")>]
    CancelledOrders : bool;
  }

  //#endregion
