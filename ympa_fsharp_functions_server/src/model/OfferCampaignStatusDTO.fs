namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferCampaignStatusType

module OfferCampaignStatusDTO =

  //#region OfferCampaignStatusDTO

  [<CLIMutable>]
  type OfferCampaignStatusDTO = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "status")>]
    Status : OfferCampaignStatusType;
  }

  //#endregion
