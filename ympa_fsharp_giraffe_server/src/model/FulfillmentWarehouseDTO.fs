namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseAddressDTO

module FulfillmentWarehouseDTO =

  //#region FulfillmentWarehouseDTO


  type FulfillmentWarehouseDTO = {
    Id : int64;
    Name : string;
    Address : WarehouseAddressDTO;
  }
  //#endregion
