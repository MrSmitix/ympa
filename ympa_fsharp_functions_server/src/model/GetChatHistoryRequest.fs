namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetChatHistoryRequest =

  //#region GetChatHistoryRequest

  [<CLIMutable>]
  type GetChatHistoryRequest = {
    [<JsonProperty(PropertyName = "messageIdFrom")>]
    MessageIdFrom : int64;
  }

  //#endregion
