namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OrderDeliveryDatesDTO =

  //#region OrderDeliveryDatesDTO


  type OrderDeliveryDatesDTO = {
    FromDate : string;
    ToDate : string;
    FromTime : string;
    ToTime : string;
    RealDeliveryDate : string;
  }
  //#endregion
