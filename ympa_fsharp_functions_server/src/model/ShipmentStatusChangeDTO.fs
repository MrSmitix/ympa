namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ShipmentStatusType

module ShipmentStatusChangeDTO =

  //#region ShipmentStatusChangeDTO

  [<CLIMutable>]
  type ShipmentStatusChangeDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ShipmentStatusType;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "updateTime")>]
    UpdateTime : Nullable<DateTime>;
  }

  //#endregion
