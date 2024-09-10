namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignSettingsTimePeriodDTO

module CampaignSettingsScheduleDTO =

  //#region CampaignSettingsScheduleDTO


  type CampaignSettingsScheduleDTO = {
    AvailableOnHolidays : bool;
    CustomHolidays : string[];
    CustomWorkingDays : string[];
    Period : CampaignSettingsTimePeriodDTO;
    TotalHolidays : string[];
    WeeklyHolidays : int[];
  }
  //#endregion
