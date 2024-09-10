namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignDTO

module GetCampaignResponse =

  //#region GetCampaignResponse


  type GetCampaignResponse = {
    Campaign : CampaignDTO;
  }
  //#endregion
