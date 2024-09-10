namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignDTO
open ympa_fsharp_giraffe_server.Model.FlippingPagerDTO

module GetCampaignsResponse =

  //#region GetCampaignsResponse


  type GetCampaignsResponse = {
    Campaigns : CampaignDTO[];
    Pager : FlippingPagerDTO;
  }
  //#endregion
