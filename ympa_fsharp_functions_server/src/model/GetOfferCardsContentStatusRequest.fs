namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferCardStatusType
open ympa_fsharp_functions_server.Model.Set

module GetOfferCardsContentStatusRequest =

  //#region GetOfferCardsContentStatusRequest

  [<CLIMutable>]
  type GetOfferCardsContentStatusRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
    [<JsonProperty(PropertyName = "cardStatuses")>]
    CardStatuses : OfferCardStatusType[];
    [<JsonProperty(PropertyName = "categoryIds")>]
    CategoryIds : int[];
  }

  //#endregion
