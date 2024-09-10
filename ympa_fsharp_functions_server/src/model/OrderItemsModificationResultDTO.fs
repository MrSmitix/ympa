namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BriefOrderItemDTO

module OrderItemsModificationResultDTO =

  //#region OrderItemsModificationResultDTO

  [<CLIMutable>]
  type OrderItemsModificationResultDTO = {
    [<JsonProperty(PropertyName = "items")>]
    Items : BriefOrderItemDTO[];
  }

  //#endregion
