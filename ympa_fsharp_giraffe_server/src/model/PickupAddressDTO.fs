namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module PickupAddressDTO =

  //#region PickupAddressDTO


  type PickupAddressDTO = {
    Country : string;
    City : string;
    Street : string;
    House : string;
    Postcode : string;
  }
  //#endregion
