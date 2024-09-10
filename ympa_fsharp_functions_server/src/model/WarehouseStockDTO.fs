namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseStockType

module WarehouseStockDTO =

  //#region WarehouseStockDTO

  [<CLIMutable>]
  type WarehouseStockDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : WarehouseStockType;
    [<JsonProperty(PropertyName = "count")>]
    Count : int64;
  }

  //#endregion
