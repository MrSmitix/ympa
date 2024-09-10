namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FieldStateType
open ympa_fsharp_functions_server.Model.PriceCompetitivenessType

module GetOfferRecommendationsRequest =

  //#region GetOfferRecommendationsRequest

  [<CLIMutable>]
  type GetOfferRecommendationsRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
    [<JsonProperty(PropertyName = "cofinancePriceFilter")>]
    CofinancePriceFilter : FieldStateType;
    [<JsonProperty(PropertyName = "recommendedCofinancePriceFilter")>]
    RecommendedCofinancePriceFilter : FieldStateType;
    [<JsonProperty(PropertyName = "competitivenessFilter")>]
    CompetitivenessFilter : PriceCompetitivenessType;
  }

  //#endregion
