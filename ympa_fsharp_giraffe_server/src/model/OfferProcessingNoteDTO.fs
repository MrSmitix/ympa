namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferProcessingNoteType

module OfferProcessingNoteDTO =

  //#region OfferProcessingNoteDTO


  type OfferProcessingNoteDTO = {
    Type : OfferProcessingNoteType;
    Payload : string;
  }
  //#endregion
