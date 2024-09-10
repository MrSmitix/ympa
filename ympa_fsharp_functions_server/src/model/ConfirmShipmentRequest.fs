namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConfirmShipmentRequest =

  //#region ConfirmShipmentRequest

  [<CLIMutable>]
  type ConfirmShipmentRequest = {
    [<JsonProperty(PropertyName = "externalShipmentId")>]
    ExternalShipmentId : string;
  }

  //#endregion
