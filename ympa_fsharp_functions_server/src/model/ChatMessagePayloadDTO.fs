namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatMessagePayloadDTO =

  //#region ChatMessagePayloadDTO

  [<CLIMutable>]
  type ChatMessagePayloadDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
  }

  //#endregion
