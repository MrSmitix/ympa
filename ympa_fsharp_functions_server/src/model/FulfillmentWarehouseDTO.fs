namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseAddressDTO

module FulfillmentWarehouseDTO =

  //#region FulfillmentWarehouseDTO

  [<CLIMutable>]
  type FulfillmentWarehouseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "address")>]
    Address : WarehouseAddressDTO;
  }

  //#endregion
