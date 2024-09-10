namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OfferRecommendationsResultDTO

module GetOfferRecommendationsResponse =

  //#region GetOfferRecommendationsResponse


  type GetOfferRecommendationsResponse = {
    Status : ApiResponseStatusType;
    Result : OfferRecommendationsResultDTO;
  }
  //#endregion
