namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OutletWorkingScheduleItemDTO

module OutletWorkingScheduleDTO =

  //#region OutletWorkingScheduleDTO

  [<CLIMutable>]
  type OutletWorkingScheduleDTO = {
    [<JsonProperty(PropertyName = "workInHoliday")>]
    WorkInHoliday : bool;
    [<JsonProperty(PropertyName = "scheduleItems")>]
    ScheduleItems : OutletWorkingScheduleItemDTO[];
  }

  //#endregion
