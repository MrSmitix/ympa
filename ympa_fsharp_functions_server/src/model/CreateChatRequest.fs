namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateChatRequest =

  //#region CreateChatRequest

  [<CLIMutable>]
  type CreateChatRequest = {
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
  }

  //#endregion
