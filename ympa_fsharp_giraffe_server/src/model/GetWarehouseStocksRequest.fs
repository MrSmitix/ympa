namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set

module GetWarehouseStocksRequest =

  //#region GetWarehouseStocksRequest


  type GetWarehouseStocksRequest = {
    WithTurnover : bool;
    Archived : bool;
    OfferIds : string[];
  }
  //#endregion
