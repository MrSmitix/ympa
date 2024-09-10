namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderBoxLayoutItemDTO

module OrderBoxLayoutDTO =

  //#region OrderBoxLayoutDTO

  [<CLIMutable>]
  type OrderBoxLayoutDTO = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderBoxLayoutItemDTO[];
  }

  //#endregion
