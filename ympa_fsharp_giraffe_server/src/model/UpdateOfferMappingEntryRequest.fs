namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingEntryDTO

module UpdateOfferMappingEntryRequest =

  //#region UpdateOfferMappingEntryRequest


  type UpdateOfferMappingEntryRequest = {
    OfferMappingEntries : UpdateOfferMappingEntryDTO[];
  }
  //#endregion
