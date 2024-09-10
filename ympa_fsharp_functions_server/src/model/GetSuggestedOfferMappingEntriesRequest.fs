namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.MappingsOfferDTO

module GetSuggestedOfferMappingEntriesRequest =

  //#region GetSuggestedOfferMappingEntriesRequest

  [<CLIMutable>]
  type GetSuggestedOfferMappingEntriesRequest = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : MappingsOfferDTO[];
  }

  //#endregion
