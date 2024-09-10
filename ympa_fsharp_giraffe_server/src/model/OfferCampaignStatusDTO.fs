namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferCampaignStatusType

module OfferCampaignStatusDTO =

  //#region OfferCampaignStatusDTO


  type OfferCampaignStatusDTO = {
    CampaignId : int64;
    Status : OfferCampaignStatusType;
  }
  //#endregion
