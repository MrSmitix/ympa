namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ChatStatusType
open ympa_fsharp_functions_server.Model.ChatType

module GetChatInfoDTO =

  //#region GetChatInfoDTO

  [<CLIMutable>]
  type GetChatInfoDTO = {
    [<JsonProperty(PropertyName = "chatId")>]
    ChatId : int64;
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "type")>]
    Type : ChatType;
    [<JsonProperty(PropertyName = "status")>]
    Status : ChatStatusType;
    [<JsonProperty(PropertyName = "createdAt")>]
    CreatedAt : DateTime;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : DateTime;
  }

  //#endregion
