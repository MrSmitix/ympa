namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferMappingDTO
open ympa_fsharp_giraffe_server.Model.UpdateMappingsOfferDTO

module UpdateOfferMappingEntryDTO =

  //#region UpdateOfferMappingEntryDTO


  type UpdateOfferMappingEntryDTO = {
    Mapping : OfferMappingDTO;
    AwaitingModerationMapping : OfferMappingDTO;
    RejectedMapping : OfferMappingDTO;
    Offer : UpdateMappingsOfferDTO;
  }
  //#endregion
