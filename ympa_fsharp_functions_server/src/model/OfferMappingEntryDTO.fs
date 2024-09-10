namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.MappingsOfferDTO
open ympa_fsharp_functions_server.Model.OfferMappingDTO

module OfferMappingEntryDTO =

  //#region OfferMappingEntryDTO

  [<CLIMutable>]
  type OfferMappingEntryDTO = {
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "awaitingModerationMapping")>]
    AwaitingModerationMapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "rejectedMapping")>]
    RejectedMapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "offer")>]
    Offer : MappingsOfferDTO;
  }

  //#endregion
