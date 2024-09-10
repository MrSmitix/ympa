namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetHiddenOffersResultDTO

module GetHiddenOffersResponse =

  //#region GetHiddenOffersResponse


  type GetHiddenOffersResponse = {
    Status : ApiResponseStatusType;
    Result : GetHiddenOffersResultDTO;
  }
  //#endregion
