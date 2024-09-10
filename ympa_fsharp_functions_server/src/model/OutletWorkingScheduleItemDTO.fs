namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.DayOfWeekType

module OutletWorkingScheduleItemDTO =

  //#region OutletWorkingScheduleItemDTO

  [<CLIMutable>]
  type OutletWorkingScheduleItemDTO = {
    [<JsonProperty(PropertyName = "startDay")>]
    StartDay : DayOfWeekType;
    [<JsonProperty(PropertyName = "endDay")>]
    EndDay : DayOfWeekType;
    [<JsonProperty(PropertyName = "startTime")>]
    StartTime : string;
    [<JsonProperty(PropertyName = "endTime")>]
    EndTime : string;
  }

  //#endregion
