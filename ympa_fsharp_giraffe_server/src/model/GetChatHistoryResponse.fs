namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.ChatMessagesResultDTO

module GetChatHistoryResponse =

  //#region GetChatHistoryResponse


  type GetChatHistoryResponse = {
    Status : ApiResponseStatusType;
    Result : ChatMessagesResultDTO;
  }
  //#endregion
