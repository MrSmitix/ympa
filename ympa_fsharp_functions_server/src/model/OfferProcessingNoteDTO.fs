namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferProcessingNoteType

module OfferProcessingNoteDTO =

  //#region OfferProcessingNoteDTO

  [<CLIMutable>]
  type OfferProcessingNoteDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OfferProcessingNoteType;
    [<JsonProperty(PropertyName = "payload")>]
    Payload : string;
  }

  //#endregion
