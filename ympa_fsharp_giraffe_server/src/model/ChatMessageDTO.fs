namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ChatMessagePayloadDTO
open ympa_fsharp_giraffe_server.Model.ChatMessageSenderType

module ChatMessageDTO =

  //#region ChatMessageDTO


  type ChatMessageDTO = {
    MessageId : int64;
    CreatedAt : DateTime;
    Sender : ChatMessageSenderType;
    Message : string;
    Payload : ChatMessagePayloadDTO[];
  }
  //#endregion
