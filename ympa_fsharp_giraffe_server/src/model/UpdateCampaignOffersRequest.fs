namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateCampaignOfferDTO

module UpdateCampaignOffersRequest =

  //#region UpdateCampaignOffersRequest


  type UpdateCampaignOffersRequest = {
    Offers : UpdateCampaignOfferDTO[];
  }
  //#endregion
