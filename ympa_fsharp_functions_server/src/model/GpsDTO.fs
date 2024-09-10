namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GpsDTO =

  //#region GpsDTO

  [<CLIMutable>]
  type GpsDTO = {
    [<JsonProperty(PropertyName = "latitude")>]
    Latitude : decimal;
    [<JsonProperty(PropertyName = "longitude")>]
    Longitude : decimal;
  }

  //#endregion
