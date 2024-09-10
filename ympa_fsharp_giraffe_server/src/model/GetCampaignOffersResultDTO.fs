namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetCampaignOfferDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module GetCampaignOffersResultDTO =

  //#region GetCampaignOffersResultDTO


  type GetCampaignOffersResultDTO = {
    Paging : ScrollingPagerDTO;
    Offers : GetCampaignOfferDTO[];
  }
  //#endregion
