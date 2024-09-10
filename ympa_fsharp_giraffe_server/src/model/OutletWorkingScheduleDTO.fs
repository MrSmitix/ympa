namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OutletWorkingScheduleItemDTO

module OutletWorkingScheduleDTO =

  //#region OutletWorkingScheduleDTO


  type OutletWorkingScheduleDTO = {
    WorkInHoliday : bool;
    ScheduleItems : OutletWorkingScheduleItemDTO[];
  }
  //#endregion
