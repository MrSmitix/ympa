namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferMappingDTO

module OfferMappingInfoDTO =

  //#region OfferMappingInfoDTO


  type OfferMappingInfoDTO = {
    Mapping : OfferMappingDTO;
    AwaitingModerationMapping : OfferMappingDTO;
    RejectedMapping : OfferMappingDTO;
  }
  //#endregion
