namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.LogisticPointType
open ympa_fsharp_giraffe_server.Model.PickupAddressDTO

module LogisticPickupPointDTO =

  //#region LogisticPickupPointDTO


  type LogisticPickupPointDTO = {
    Id : int64;
    Name : string;
    Address : PickupAddressDTO;
    Instruction : string;
    Type : LogisticPointType;
    LogisticPartnerId : int64;
  }
  //#endregion
