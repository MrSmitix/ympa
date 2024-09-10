namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferProcessingNoteDTO
open ympa_fsharp_giraffe_server.Model.OfferProcessingStatusType

module OfferProcessingStateDTO =

  //#region OfferProcessingStateDTO


  type OfferProcessingStateDTO = {
    Status : OfferProcessingStatusType;
    Notes : OfferProcessingNoteDTO[];
  }
  //#endregion
