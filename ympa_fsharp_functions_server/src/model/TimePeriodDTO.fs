namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.TimeUnitType

module TimePeriodDTO =

  //#region TimePeriodDTO

  [<CLIMutable>]
  type TimePeriodDTO = {
    [<JsonProperty(PropertyName = "timePeriod")>]
    TimePeriod : int;
    [<JsonProperty(PropertyName = "timeUnit")>]
    TimeUnit : TimeUnitType;
    [<JsonProperty(PropertyName = "comment")>]
    Comment : string;
  }

  //#endregion
