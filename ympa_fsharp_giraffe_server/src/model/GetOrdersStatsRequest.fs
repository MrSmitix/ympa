namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatsStatusType

module GetOrdersStatsRequest =

  //#region GetOrdersStatsRequest


  type GetOrdersStatsRequest = {
    DateFrom : DateTime;
    DateTo : DateTime;
    UpdateFrom : DateTime;
    UpdateTo : DateTime;
    Orders : int64[];
    Statuses : OrderStatsStatusType[];
    HasCis : bool;
  }
  //#endregion
