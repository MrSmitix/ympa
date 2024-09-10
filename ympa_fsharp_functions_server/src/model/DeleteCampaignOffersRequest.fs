namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteCampaignOffersRequest =

  //#region DeleteCampaignOffersRequest

  [<CLIMutable>]
  type DeleteCampaignOffersRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
