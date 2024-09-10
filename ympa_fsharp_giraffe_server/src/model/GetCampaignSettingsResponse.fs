namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignSettingsDTO

module GetCampaignSettingsResponse =

  //#region GetCampaignSettingsResponse


  type GetCampaignSettingsResponse = {
    Settings : CampaignSettingsDTO;
  }
  //#endregion
