namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetPromosResultDTO

module GetPromosResponse =

  //#region GetPromosResponse


  type GetPromosResponse = {
    Status : ApiResponseStatusType;
    Result : GetPromosResultDTO;
  }
  //#endregion
