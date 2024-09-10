namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetBidsInfoResponseDTO

module GetBidsInfoResponse =

  //#region GetBidsInfoResponse


  type GetBidsInfoResponse = {
    Status : ApiResponseStatusType;
    Result : GetBidsInfoResponseDTO;
  }
  //#endregion
