namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsResultDTO

module GetSuggestedOfferMappingsResponse =

  //#region GetSuggestedOfferMappingsResponse


  type GetSuggestedOfferMappingsResponse = {
    Status : ApiResponseStatusType;
    Result : GetSuggestedOfferMappingsResultDTO;
  }
  //#endregion
