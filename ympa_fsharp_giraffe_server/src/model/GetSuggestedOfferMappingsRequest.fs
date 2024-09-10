namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.SuggestedOfferDTO

module GetSuggestedOfferMappingsRequest =

  //#region GetSuggestedOfferMappingsRequest


  type GetSuggestedOfferMappingsRequest = {
    Offers : SuggestedOfferDTO[];
  }
  //#endregion
