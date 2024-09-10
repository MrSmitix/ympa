namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.EnrichedMappingsOfferDTO

module OfferMappingSuggestionsListDTO =

  //#region OfferMappingSuggestionsListDTO

  [<CLIMutable>]
  type OfferMappingSuggestionsListDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : EnrichedMappingsOfferDTO[];
  }

  //#endregion
