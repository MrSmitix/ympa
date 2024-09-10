namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.TimeUnitType

module TimePeriodDTO =

  //#region TimePeriodDTO


  type TimePeriodDTO = {
    TimePeriod : int;
    TimeUnit : TimeUnitType;
    Comment : string;
  }
  //#endregion
