namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignSettingsLocalRegionDTO

module CampaignSettingsDTO =

  //#region CampaignSettingsDTO

  [<CLIMutable>]
  type CampaignSettingsDTO = {
    [<JsonProperty(PropertyName = "countryRegion")>]
    CountryRegion : int64;
    [<JsonProperty(PropertyName = "shopName")>]
    ShopName : string;
    [<JsonProperty(PropertyName = "showInContext")>]
    ShowInContext : bool;
    [<JsonProperty(PropertyName = "showInPremium")>]
    ShowInPremium : bool;
    [<JsonProperty(PropertyName = "useOpenStat")>]
    UseOpenStat : bool;
    [<JsonProperty(PropertyName = "localRegion")>]
    LocalRegion : CampaignSettingsLocalRegionDTO;
  }

  //#endregion
