namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseDTO

module WarehouseGroupDTO =

  //#region WarehouseGroupDTO

  [<CLIMutable>]
  type WarehouseGroupDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "mainWarehouse")>]
    MainWarehouse : WarehouseDTO;
    [<JsonProperty(PropertyName = "warehouses")>]
    Warehouses : WarehouseDTO[];
  }

  //#endregion
