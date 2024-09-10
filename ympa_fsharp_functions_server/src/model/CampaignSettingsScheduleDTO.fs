namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignSettingsTimePeriodDTO

module CampaignSettingsScheduleDTO =

  //#region CampaignSettingsScheduleDTO

  [<CLIMutable>]
  type CampaignSettingsScheduleDTO = {
    [<JsonProperty(PropertyName = "availableOnHolidays")>]
    AvailableOnHolidays : bool;
    [<JsonProperty(PropertyName = "customHolidays")>]
    CustomHolidays : string[];
    [<JsonProperty(PropertyName = "customWorkingDays")>]
    CustomWorkingDays : string[];
    [<JsonProperty(PropertyName = "period")>]
    Period : CampaignSettingsTimePeriodDTO;
    [<JsonProperty(PropertyName = "totalHolidays")>]
    TotalHolidays : string[];
    [<JsonProperty(PropertyName = "weeklyHolidays")>]
    WeeklyHolidays : int[];
  }

  //#endregion
