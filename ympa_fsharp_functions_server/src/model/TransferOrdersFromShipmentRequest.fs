namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TransferOrdersFromShipmentRequest =

  //#region TransferOrdersFromShipmentRequest

  [<CLIMutable>]
  type TransferOrdersFromShipmentRequest = {
    [<JsonProperty(PropertyName = "orderIds")>]
    OrderIds : int64[];
  }

  //#endregion
