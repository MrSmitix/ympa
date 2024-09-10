namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.ShipmentStatusType

module SearchShipmentsRequest =

  //#region SearchShipmentsRequest


  type SearchShipmentsRequest = {
    DateFrom : DateTime;
    DateTo : DateTime;
    Statuses : ShipmentStatusType[];
    OrderIds : int64[];
    CancelledOrders : bool;
  }
  //#endregion
