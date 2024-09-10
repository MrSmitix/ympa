namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsResponseDTO

module GetBidsRecommendationsResponse =

  //#region GetBidsRecommendationsResponse


  type GetBidsRecommendationsResponse = {
    Status : ApiResponseStatusType;
    Result : GetBidsRecommendationsResponseDTO;
  }
  //#endregion
