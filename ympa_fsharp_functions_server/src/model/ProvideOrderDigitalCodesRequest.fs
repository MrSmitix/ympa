namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderDigitalItemDTO

module ProvideOrderDigitalCodesRequest =

  //#region ProvideOrderDigitalCodesRequest

  [<CLIMutable>]
  type ProvideOrderDigitalCodesRequest = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderDigitalItemDTO[];
  }

  //#endregion
