namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.MappingsOfferDTO

module GetSuggestedOfferMappingEntriesRequest =

  //#region GetSuggestedOfferMappingEntriesRequest


  type GetSuggestedOfferMappingEntriesRequest = {
    Offers : MappingsOfferDTO[];
  }
  //#endregion
