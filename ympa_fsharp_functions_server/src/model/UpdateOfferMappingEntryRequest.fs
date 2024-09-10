namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateOfferMappingEntryDTO

module UpdateOfferMappingEntryRequest =

  //#region UpdateOfferMappingEntryRequest

  [<CLIMutable>]
  type UpdateOfferMappingEntryRequest = {
    [<JsonProperty(PropertyName = "offerMappingEntries")>]
    OfferMappingEntries : UpdateOfferMappingEntryDTO[];
  }

  //#endregion
