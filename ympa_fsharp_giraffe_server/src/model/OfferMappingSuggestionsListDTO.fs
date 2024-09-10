namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.EnrichedMappingsOfferDTO

module OfferMappingSuggestionsListDTO =

  //#region OfferMappingSuggestionsListDTO


  type OfferMappingSuggestionsListDTO = {
    Offers : EnrichedMappingsOfferDTO[];
  }
  //#endregion
