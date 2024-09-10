namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GpsDTO

module WarehouseAddressDTO =

  //#region WarehouseAddressDTO


  type WarehouseAddressDTO = {
    City : string;
    Street : string;
    Number : string;
    Building : string;
    Block : string;
    Gps : GpsDTO;
  }
  //#endregion
