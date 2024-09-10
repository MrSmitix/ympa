namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.SuggestedOfferDTO

module GetSuggestedOfferMappingsRequest =

  //#region GetSuggestedOfferMappingsRequest

  [<CLIMutable>]
  type GetSuggestedOfferMappingsRequest = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : SuggestedOfferDTO[];
  }

  //#endregion
