namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiErrorDTO
open ympa_fsharp_functions_server.Model.ApiResponseStatusType

module ApiLockedErrorResponse =

  //#region ApiLockedErrorResponse

  [<CLIMutable>]
  type ApiLockedErrorResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ApiErrorDTO[];
  }

  //#endregion
