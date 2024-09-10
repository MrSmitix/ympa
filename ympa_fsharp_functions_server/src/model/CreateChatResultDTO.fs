namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateChatResultDTO =

  //#region CreateChatResultDTO

  [<CLIMutable>]
  type CreateChatResultDTO = {
    [<JsonProperty(PropertyName = "chatId")>]
    ChatId : int64;
  }

  //#endregion
