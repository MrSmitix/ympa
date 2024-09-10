namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferCardRecommendationType

module OfferCardRecommendationDTO =

  //#region OfferCardRecommendationDTO

  [<CLIMutable>]
  type OfferCardRecommendationDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OfferCardRecommendationType;
    [<JsonProperty(PropertyName = "percent")>]
    Percent : int;
  }

  //#endregion
