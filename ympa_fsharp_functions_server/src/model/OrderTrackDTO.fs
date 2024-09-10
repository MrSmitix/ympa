namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderTrackDTO =

  //#region OrderTrackDTO

  [<CLIMutable>]
  type OrderTrackDTO = {
    [<JsonProperty(PropertyName = "trackCode")>]
    TrackCode : string;
    [<JsonProperty(PropertyName = "deliveryServiceId")>]
    DeliveryServiceId : int64;
  }

  //#endregion
