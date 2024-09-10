namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.DayOfWeekType

module OutletWorkingScheduleItemDTO =

  //#region OutletWorkingScheduleItemDTO


  type OutletWorkingScheduleItemDTO = {
    StartDay : DayOfWeekType;
    EndDay : DayOfWeekType;
    StartTime : string;
    EndTime : string;
  }
  //#endregion
