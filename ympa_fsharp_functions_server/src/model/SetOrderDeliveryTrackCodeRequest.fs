namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SetOrderDeliveryTrackCodeRequest =

  //#region SetOrderDeliveryTrackCodeRequest

  [<CLIMutable>]
  type SetOrderDeliveryTrackCodeRequest = {
    [<JsonProperty(PropertyName = "trackCode")>]
    TrackCode : string;
    [<JsonProperty(PropertyName = "deliveryServiceId")>]
    DeliveryServiceId : int64;
  }

  //#endregion
