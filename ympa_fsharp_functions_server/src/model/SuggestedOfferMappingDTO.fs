namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetMappingDTO
open ympa_fsharp_functions_server.Model.SuggestedOfferDTO

module SuggestedOfferMappingDTO =

  //#region SuggestedOfferMappingDTO

  [<CLIMutable>]
  type SuggestedOfferMappingDTO = {
    [<JsonProperty(PropertyName = "offer")>]
    Offer : SuggestedOfferDTO;
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : GetMappingDTO;
  }

  //#endregion
