namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FulfillmentWarehouseDTO

module FulfillmentWarehousesDTO =

  //#region FulfillmentWarehousesDTO


  type FulfillmentWarehousesDTO = {
    Warehouses : FulfillmentWarehouseDTO[];
  }
  //#endregion
