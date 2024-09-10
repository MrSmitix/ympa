namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferProcessingNoteDTO
open ympa_fsharp_functions_server.Model.OfferProcessingStatusType

module OfferProcessingStateDTO =

  //#region OfferProcessingStateDTO

  [<CLIMutable>]
  type OfferProcessingStateDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : OfferProcessingStatusType;
    [<JsonProperty(PropertyName = "notes")>]
    Notes : OfferProcessingNoteDTO[];
  }

  //#endregion
