namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferCampaignStatusType

module GetCampaignOffersRequest =

  //#region GetCampaignOffersRequest

  [<CLIMutable>]
  type GetCampaignOffersRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
    [<JsonProperty(PropertyName = "statuses")>]
    Statuses : OfferCampaignStatusType[];
    [<JsonProperty(PropertyName = "categoryIds")>]
    CategoryIds : int[];
    [<JsonProperty(PropertyName = "vendorNames")>]
    VendorNames : string[];
    [<JsonProperty(PropertyName = "tags")>]
    Tags : string[];
  }

  //#endregion
