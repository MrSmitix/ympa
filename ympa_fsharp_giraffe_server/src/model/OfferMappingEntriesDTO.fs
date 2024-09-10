namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferMappingEntryDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module OfferMappingEntriesDTO =

  //#region OfferMappingEntriesDTO


  type OfferMappingEntriesDTO = {
    Paging : ScrollingPagerDTO;
    OfferMappingEntries : OfferMappingEntryDTO[];
  }
  //#endregion
