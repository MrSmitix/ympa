namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PartnerShipmentWarehouseDTO =

  //#region PartnerShipmentWarehouseDTO

  [<CLIMutable>]
  type PartnerShipmentWarehouseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "address")>]
    Address : string;
  }

  //#endregion
