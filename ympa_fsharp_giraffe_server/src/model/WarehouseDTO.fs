namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseAddressDTO

module WarehouseDTO =

  //#region WarehouseDTO


  type WarehouseDTO = {
    Id : int64;
    Name : string;
    CampaignId : int64;
    Express : bool;
    Address : WarehouseAddressDTO;
  }
  //#endregion
