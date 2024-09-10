namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.TurnoverType

module TurnoverDTO =

  //#region TurnoverDTO


  type TurnoverDTO = {
    Turnover : TurnoverType;
    TurnoverDays : double;
  }
  //#endregion
