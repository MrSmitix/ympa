namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ChatStatusType
open ympa_fsharp_giraffe_server.Model.ChatType

module GetChatInfoDTO =

  //#region GetChatInfoDTO


  type GetChatInfoDTO = {
    ChatId : int64;
    OrderId : int64;
    Type : ChatType;
    Status : ChatStatusType;
    CreatedAt : DateTime;
    UpdatedAt : DateTime;
  }
  //#endregion
