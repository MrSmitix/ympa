namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module SetOrderDeliveryTrackCodeRequest =

  //#region SetOrderDeliveryTrackCodeRequest


  type SetOrderDeliveryTrackCodeRequest = {
    TrackCode : string;
    DeliveryServiceId : int64;
  }
  //#endregion
