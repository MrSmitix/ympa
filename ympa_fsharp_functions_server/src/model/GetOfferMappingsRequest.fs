namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferCardStatusType

module GetOfferMappingsRequest =

  //#region GetOfferMappingsRequest

  [<CLIMutable>]
  type GetOfferMappingsRequest = {
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
    [<JsonProperty(PropertyName = "archived")>]
    Archived : bool;
  }

  //#endregion
