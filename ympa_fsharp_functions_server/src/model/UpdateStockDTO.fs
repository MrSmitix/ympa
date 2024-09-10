namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateStockItemDTO

module UpdateStockDTO =

  //#region UpdateStockDTO

  [<CLIMutable>]
  type UpdateStockDTO = {
    [<JsonProperty(PropertyName = "sku")>]
    Sku : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdateStockItemDTO[];
  }

  //#endregion
