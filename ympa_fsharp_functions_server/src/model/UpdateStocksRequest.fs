namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set
open ympa_fsharp_functions_server.Model.UpdateStockDTO

module UpdateStocksRequest =

  //#region UpdateStocksRequest

  [<CLIMutable>]
  type UpdateStocksRequest = {
    [<JsonProperty(PropertyName = "skus")>]
    Skus : UpdateStockDTO[];
  }

  //#endregion
