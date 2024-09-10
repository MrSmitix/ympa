namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.CreateChatResultDTO

module CreateChatResponse =

  //#region CreateChatResponse


  type CreateChatResponse = {
    Status : ApiResponseStatusType;
    Result : CreateChatResultDTO;
  }
  //#endregion
