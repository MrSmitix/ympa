namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignSettingsLocalRegionDTO

module CampaignSettingsDTO =

  //#region CampaignSettingsDTO


  type CampaignSettingsDTO = {
    CountryRegion : int64;
    ShopName : string;
    ShowInContext : bool;
    ShowInPremium : bool;
    UseOpenStat : bool;
    LocalRegion : CampaignSettingsLocalRegionDTO;
  }
  //#endregion
