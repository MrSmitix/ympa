namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseStockType

module WarehouseStockDTO =

  //#region WarehouseStockDTO


  type WarehouseStockDTO = {
    Type : WarehouseStockType;
    Count : int64;
  }
  //#endregion
