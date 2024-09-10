namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseStockDTO

module GoodsStatsWarehouseDTO =

  //#region GoodsStatsWarehouseDTO

  [<CLIMutable>]
  type GoodsStatsWarehouseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "stocks")>]
    Stocks : WarehouseStockDTO[];
  }

  //#endregion
