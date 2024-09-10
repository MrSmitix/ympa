namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.OfferRecommendationsResultDTO

module GetOfferRecommendationsResponse =

  //#region GetOfferRecommendationsResponse

  [<CLIMutable>]
  type GetOfferRecommendationsResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : OfferRecommendationsResultDTO;
  }

  //#endregion
