namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignSettingsScheduleDTO

module CampaignSettingsDeliveryDTO =

  //#region CampaignSettingsDeliveryDTO


  type CampaignSettingsDeliveryDTO = {
    Schedule : CampaignSettingsScheduleDTO;
  }
  //#endregion
