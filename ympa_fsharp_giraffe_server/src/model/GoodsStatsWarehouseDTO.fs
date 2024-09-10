namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseStockDTO

module GoodsStatsWarehouseDTO =

  //#region GoodsStatsWarehouseDTO


  type GoodsStatsWarehouseDTO = {
    Id : int64;
    Name : string;
    Stocks : WarehouseStockDTO[];
  }
  //#endregion
