namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferMappingEntryDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module OfferMappingEntriesDTO =

  //#region OfferMappingEntriesDTO

  [<CLIMutable>]
  type OfferMappingEntriesDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "offerMappingEntries")>]
    OfferMappingEntries : OfferMappingEntryDTO[];
  }

  //#endregion
