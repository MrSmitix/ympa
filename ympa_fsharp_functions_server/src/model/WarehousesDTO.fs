namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseDTO
open ympa_fsharp_functions_server.Model.WarehouseGroupDTO

module WarehousesDTO =

  //#region WarehousesDTO

  [<CLIMutable>]
  type WarehousesDTO = {
    [<JsonProperty(PropertyName = "warehouses")>]
    Warehouses : WarehouseDTO[];
    [<JsonProperty(PropertyName = "warehouseGroups")>]
    WarehouseGroups : WarehouseGroupDTO[];
  }

  //#endregion
