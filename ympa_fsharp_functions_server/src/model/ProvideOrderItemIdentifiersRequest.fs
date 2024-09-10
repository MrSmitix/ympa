namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderItemInstanceModificationDTO

module ProvideOrderItemIdentifiersRequest =

  //#region ProvideOrderItemIdentifiersRequest

  [<CLIMutable>]
  type ProvideOrderItemIdentifiersRequest = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderItemInstanceModificationDTO[];
  }

  //#endregion
