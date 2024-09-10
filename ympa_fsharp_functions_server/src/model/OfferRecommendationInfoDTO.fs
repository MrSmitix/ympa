namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BasePriceDTO
open ympa_fsharp_functions_server.Model.PriceCompetitivenessThresholdsDTO

module OfferRecommendationInfoDTO =

  //#region OfferRecommendationInfoDTO

  [<CLIMutable>]
  type OfferRecommendationInfoDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "recommendedCofinancePrice")>]
    RecommendedCofinancePrice : BasePriceDTO;
    [<JsonProperty(PropertyName = "competitivenessThresholds")>]
    CompetitivenessThresholds : PriceCompetitivenessThresholdsDTO;
  }

  //#endregion
