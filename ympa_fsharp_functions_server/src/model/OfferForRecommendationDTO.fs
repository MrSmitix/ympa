namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BasePriceDTO
open ympa_fsharp_functions_server.Model.GetPriceDTO
open ympa_fsharp_functions_server.Model.PriceCompetitivenessType

module OfferForRecommendationDTO =

  //#region OfferForRecommendationDTO

  [<CLIMutable>]
  type OfferForRecommendationDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : BasePriceDTO;
    [<JsonProperty(PropertyName = "cofinancePrice")>]
    CofinancePrice : GetPriceDTO;
    [<JsonProperty(PropertyName = "competitiveness")>]
    Competitiveness : PriceCompetitivenessType;
    [<JsonProperty(PropertyName = "shows")>]
    Shows : int64;
  }

  //#endregion
