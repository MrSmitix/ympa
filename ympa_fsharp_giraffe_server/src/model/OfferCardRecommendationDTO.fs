namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferCardRecommendationType

module OfferCardRecommendationDTO =

  //#region OfferCardRecommendationDTO


  type OfferCardRecommendationDTO = {
    Type : OfferCardRecommendationType;
    Percent : int;
  }
  //#endregion
