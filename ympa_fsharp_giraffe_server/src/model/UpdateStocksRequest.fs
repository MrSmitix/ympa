namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.UpdateStockDTO

module UpdateStocksRequest =

  //#region UpdateStocksRequest


  type UpdateStocksRequest = {
    Skus : UpdateStockDTO[];
  }
  //#endregion
