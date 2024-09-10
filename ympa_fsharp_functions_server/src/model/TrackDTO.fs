namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TrackDTO =

  //#region TrackDTO

  [<CLIMutable>]
  type TrackDTO = {
    [<JsonProperty(PropertyName = "trackCode")>]
    TrackCode : string;
  }

  //#endregion
