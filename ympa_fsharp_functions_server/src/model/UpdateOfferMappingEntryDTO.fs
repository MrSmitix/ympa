namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferMappingDTO
open ympa_fsharp_functions_server.Model.UpdateMappingsOfferDTO

module UpdateOfferMappingEntryDTO =

  //#region UpdateOfferMappingEntryDTO

  [<CLIMutable>]
  type UpdateOfferMappingEntryDTO = {
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "awaitingModerationMapping")>]
    AwaitingModerationMapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "rejectedMapping")>]
    RejectedMapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "offer")>]
    Offer : UpdateMappingsOfferDTO;
  }

  //#endregion
