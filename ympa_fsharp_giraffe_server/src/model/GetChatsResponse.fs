namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetChatsInfoDTO

module GetChatsResponse =

  //#region GetChatsResponse


  type GetChatsResponse = {
    Status : ApiResponseStatusType;
    Result : GetChatsInfoDTO;
  }
  //#endregion
