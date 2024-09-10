namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignSettingsDeliveryDTO
open ympa_fsharp_giraffe_server.Model.CampaignSettingsScheduleSourceType
open ympa_fsharp_giraffe_server.Model.RegionType

module CampaignSettingsLocalRegionDTO =

  //#region CampaignSettingsLocalRegionDTO


  type CampaignSettingsLocalRegionDTO = {
    Id : int64;
    Name : string;
    Type : RegionType;
    DeliveryOptionsSource : CampaignSettingsScheduleSourceType;
    Delivery : CampaignSettingsDeliveryDTO;
  }
  //#endregion
