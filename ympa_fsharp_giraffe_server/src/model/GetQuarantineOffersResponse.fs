namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersResultDTO

module GetQuarantineOffersResponse =

  //#region GetQuarantineOffersResponse


  type GetQuarantineOffersResponse = {
    Status : ApiResponseStatusType;
    Result : GetQuarantineOffersResultDTO;
  }
  //#endregion
