namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatsStatusType

module GetOrdersStatsRequest =

  //#region GetOrdersStatsRequest

  [<CLIMutable>]
  type GetOrdersStatsRequest = {
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "updateFrom")>]
    UpdateFrom : DateTime;
    [<JsonProperty(PropertyName = "updateTo")>]
    UpdateTo : DateTime;
    [<JsonProperty(PropertyName = "orders")>]
    Orders : int64[];
    [<JsonProperty(PropertyName = "statuses")>]
    Statuses : OrderStatsStatusType[];
    [<JsonProperty(PropertyName = "hasCis")>]
    HasCis : bool;
  }

  //#endregion
