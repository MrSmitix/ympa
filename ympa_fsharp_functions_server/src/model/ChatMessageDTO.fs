namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ChatMessagePayloadDTO
open ympa_fsharp_functions_server.Model.ChatMessageSenderType

module ChatMessageDTO =

  //#region ChatMessageDTO

  [<CLIMutable>]
  type ChatMessageDTO = {
    [<JsonProperty(PropertyName = "messageId")>]
    MessageId : int64;
    [<JsonProperty(PropertyName = "createdAt")>]
    CreatedAt : DateTime;
    [<JsonProperty(PropertyName = "sender")>]
    Sender : ChatMessageSenderType;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "payload")>]
    Payload : ChatMessagePayloadDTO[];
  }

  //#endregion
