namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FieldStateType
open ympa_fsharp_giraffe_server.Model.PriceCompetitivenessType

module GetOfferRecommendationsRequest =

  //#region GetOfferRecommendationsRequest


  type GetOfferRecommendationsRequest = {
    OfferIds : string[];
    CofinancePriceFilter : FieldStateType;
    RecommendedCofinancePriceFilter : FieldStateType;
    CompetitivenessFilter : PriceCompetitivenessType;
  }
  //#endregion
