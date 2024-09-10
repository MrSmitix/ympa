namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OrderTrackDTO =

  //#region OrderTrackDTO


  type OrderTrackDTO = {
    TrackCode : string;
    DeliveryServiceId : int64;
  }
  //#endregion
