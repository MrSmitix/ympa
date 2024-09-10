namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.SuggestedOfferMappingDTO

module GetSuggestedOfferMappingsResultDTO =

  //#region GetSuggestedOfferMappingsResultDTO


  type GetSuggestedOfferMappingsResultDTO = {
    Offers : SuggestedOfferMappingDTO[];
  }
  //#endregion
