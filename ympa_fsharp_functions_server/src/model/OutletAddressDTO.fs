namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OutletAddressDTO =

  //#region OutletAddressDTO

  [<CLIMutable>]
  type OutletAddressDTO = {
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int64;
    [<JsonProperty(PropertyName = "street")>]
    Street : string;
    [<JsonProperty(PropertyName = "number")>]
    Number : string;
    [<JsonProperty(PropertyName = "building")>]
    Building : string;
    [<JsonProperty(PropertyName = "estate")>]
    Estate : string;
    [<JsonProperty(PropertyName = "block")>]
    Block : string;
    [<JsonProperty(PropertyName = "additional")>]
    Additional : string;
    [<JsonProperty(PropertyName = "km")>]
    Km : int;
    [<JsonProperty(PropertyName = "city")>]
    City : string;
  }

  //#endregion
