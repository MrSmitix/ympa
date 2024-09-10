namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignSettingsDeliveryDTO
open ympa_fsharp_functions_server.Model.CampaignSettingsScheduleSourceType
open ympa_fsharp_functions_server.Model.RegionType

module CampaignSettingsLocalRegionDTO =

  //#region CampaignSettingsLocalRegionDTO

  [<CLIMutable>]
  type CampaignSettingsLocalRegionDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : RegionType;
    [<JsonProperty(PropertyName = "deliveryOptionsSource")>]
    DeliveryOptionsSource : CampaignSettingsScheduleSourceType;
    [<JsonProperty(PropertyName = "delivery")>]
    Delivery : CampaignSettingsDeliveryDTO;
  }

  //#endregion
