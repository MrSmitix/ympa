namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GpsDTO

module WarehouseAddressDTO =

  //#region WarehouseAddressDTO

  [<CLIMutable>]
  type WarehouseAddressDTO = {
    [<JsonProperty(PropertyName = "city")>]
    City : string;
    [<JsonProperty(PropertyName = "street")>]
    Street : string;
    [<JsonProperty(PropertyName = "number")>]
    Number : string;
    [<JsonProperty(PropertyName = "building")>]
    Building : string;
    [<JsonProperty(PropertyName = "block")>]
    Block : string;
    [<JsonProperty(PropertyName = "gps")>]
    Gps : GpsDTO;
  }

  //#endregion
