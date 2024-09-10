namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OrderDigitalItemDTO =

  //#region OrderDigitalItemDTO


  type OrderDigitalItemDTO = {
    Id : int64;
    Code : string;
    Slip : string;
    ActivateTill : DateTime;
  }
  //#endregion
