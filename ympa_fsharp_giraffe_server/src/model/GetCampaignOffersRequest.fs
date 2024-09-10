namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferCampaignStatusType

module GetCampaignOffersRequest =

  //#region GetCampaignOffersRequest


  type GetCampaignOffersRequest = {
    OfferIds : string[];
    Statuses : OfferCampaignStatusType[];
    CategoryIds : int[];
    VendorNames : string[];
    Tags : string[];
  }
  //#endregion
