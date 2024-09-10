namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignSettingsScheduleDTO

module CampaignSettingsDeliveryDTO =

  //#region CampaignSettingsDeliveryDTO

  [<CLIMutable>]
  type CampaignSettingsDeliveryDTO = {
    [<JsonProperty(PropertyName = "schedule")>]
    Schedule : CampaignSettingsScheduleDTO;
  }

  //#endregion
