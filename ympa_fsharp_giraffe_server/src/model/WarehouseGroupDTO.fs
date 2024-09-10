namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseDTO

module WarehouseGroupDTO =

  //#region WarehouseGroupDTO


  type WarehouseGroupDTO = {
    Name : string;
    MainWarehouse : WarehouseDTO;
    Warehouses : WarehouseDTO[];
  }
  //#endregion
