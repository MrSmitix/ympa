namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FulfillmentWarehouseDTO

module FulfillmentWarehousesDTO =

  //#region FulfillmentWarehousesDTO

  [<CLIMutable>]
  type FulfillmentWarehousesDTO = {
    [<JsonProperty(PropertyName = "warehouses")>]
    Warehouses : FulfillmentWarehouseDTO[];
  }

  //#endregion
