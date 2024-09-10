namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.TurnoverType

module TurnoverDTO =

  //#region TurnoverDTO

  [<CLIMutable>]
  type TurnoverDTO = {
    [<JsonProperty(PropertyName = "turnover")>]
    Turnover : TurnoverType;
    [<JsonProperty(PropertyName = "turnoverDays")>]
    TurnoverDays : double;
  }

  //#endregion
