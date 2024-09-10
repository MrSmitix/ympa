namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferMappingDTO

module OfferMappingInfoDTO =

  //#region OfferMappingInfoDTO

  [<CLIMutable>]
  type OfferMappingInfoDTO = {
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "awaitingModerationMapping")>]
    AwaitingModerationMapping : OfferMappingDTO;
    [<JsonProperty(PropertyName = "rejectedMapping")>]
    RejectedMapping : OfferMappingDTO;
  }

  //#endregion
