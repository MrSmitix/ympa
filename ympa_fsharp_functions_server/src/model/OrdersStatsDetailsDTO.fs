namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrdersStatsItemStatusType
open ympa_fsharp_functions_server.Model.OrdersStatsStockType

module OrdersStatsDetailsDTO =

  //#region OrdersStatsDetailsDTO

  [<CLIMutable>]
  type OrdersStatsDetailsDTO = {
    [<JsonProperty(PropertyName = "itemStatus")>]
    ItemStatus : OrdersStatsItemStatusType;
    [<JsonProperty(PropertyName = "itemCount")>]
    ItemCount : int64;
    [<JsonProperty(PropertyName = "updateDate")>]
    UpdateDate : DateTime;
    [<JsonProperty(PropertyName = "stockType")>]
    StockType : OrdersStatsStockType;
  }

  //#endregion
