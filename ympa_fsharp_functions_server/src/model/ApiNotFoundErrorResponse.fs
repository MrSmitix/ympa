namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiErrorDTO
open ympa_fsharp_functions_server.Model.ApiResponseStatusType

module ApiNotFoundErrorResponse =

  //#region ApiNotFoundErrorResponse

  [<CLIMutable>]
  type ApiNotFoundErrorResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ApiErrorDTO[];
  }

  //#endregion
