namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SetShipmentPalletsCountRequest =

  //#region SetShipmentPalletsCountRequest

  [<CLIMutable>]
  type SetShipmentPalletsCountRequest = {
    [<JsonProperty(PropertyName = "placesCount")>]
    PlacesCount : int;
  }

  //#endregion
