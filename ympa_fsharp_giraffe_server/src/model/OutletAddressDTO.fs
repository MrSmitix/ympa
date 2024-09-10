namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OutletAddressDTO =

  //#region OutletAddressDTO


  type OutletAddressDTO = {
    RegionId : int64;
    Street : string;
    Number : string;
    Building : string;
    Estate : string;
    Block : string;
    Additional : string;
    Km : int;
    City : string;
  }
  //#endregion
