namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.SuggestedOfferMappingDTO

module GetSuggestedOfferMappingsResultDTO =

  //#region GetSuggestedOfferMappingsResultDTO

  [<CLIMutable>]
  type GetSuggestedOfferMappingsResultDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : SuggestedOfferMappingDTO[];
  }

  //#endregion
