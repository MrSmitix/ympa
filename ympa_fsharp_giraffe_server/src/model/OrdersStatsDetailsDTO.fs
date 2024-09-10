namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrdersStatsItemStatusType
open ympa_fsharp_giraffe_server.Model.OrdersStatsStockType

module OrdersStatsDetailsDTO =

  //#region OrdersStatsDetailsDTO


  type OrdersStatsDetailsDTO = {
    ItemStatus : OrdersStatsItemStatusType;
    ItemCount : int64;
    UpdateDate : DateTime;
    StockType : OrdersStatsStockType;
  }
  //#endregion
