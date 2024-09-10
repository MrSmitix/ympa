namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType

module ApiResponse =

  //#region ApiResponse

  [<CLIMutable>]
  type ApiResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
  }

  //#endregion
