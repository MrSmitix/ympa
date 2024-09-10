namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module GetWarehouseStocksRequest =

  //#region GetWarehouseStocksRequest

  [<CLIMutable>]
  type GetWarehouseStocksRequest = {
    [<JsonProperty(PropertyName = "withTurnover")>]
    WithTurnover : bool;
    [<JsonProperty(PropertyName = "archived")>]
    Archived : bool;
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
