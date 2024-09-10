namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.MappingsOfferDTO
open ympa_fsharp_giraffe_server.Model.OfferMappingDTO

module OfferMappingEntryDTO =

  //#region OfferMappingEntryDTO


  type OfferMappingEntryDTO = {
    Mapping : OfferMappingDTO;
    AwaitingModerationMapping : OfferMappingDTO;
    RejectedMapping : OfferMappingDTO;
    Offer : MappingsOfferDTO;
  }
  //#endregion
