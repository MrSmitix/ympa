namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SendMessageToChatRequest =

  //#region SendMessageToChatRequest

  [<CLIMutable>]
  type SendMessageToChatRequest = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
