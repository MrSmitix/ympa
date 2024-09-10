namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseDTO
open ympa_fsharp_giraffe_server.Model.WarehouseGroupDTO

module WarehousesDTO =

  //#region WarehousesDTO


  type WarehousesDTO = {
    Warehouses : WarehouseDTO[];
    WarehouseGroups : WarehouseGroupDTO[];
  }
  //#endregion
