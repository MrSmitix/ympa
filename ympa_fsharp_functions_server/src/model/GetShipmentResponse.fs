namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.ShipmentDTO

module GetShipmentResponse =

  //#region GetShipmentResponse

  [<CLIMutable>]
  type GetShipmentResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : ShipmentDTO;
  }

  //#endregion
