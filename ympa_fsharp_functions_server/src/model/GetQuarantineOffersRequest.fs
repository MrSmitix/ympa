namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferCardStatusType

module GetQuarantineOffersRequest =

  //#region GetQuarantineOffersRequest

  [<CLIMutable>]
  type GetQuarantineOffersRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
    [<JsonProperty(PropertyName = "cardStatuses")>]
    CardStatuses : OfferCardStatusType[];
    [<JsonProperty(PropertyName = "categoryIds")>]
    CategoryIds : int[];
    [<JsonProperty(PropertyName = "vendorNames")>]
    VendorNames : string[];
    [<JsonProperty(PropertyName = "tags")>]
    Tags : string[];
  }

  //#endregion
