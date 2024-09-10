namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiErrorDTO
open ympa_fsharp_functions_server.Model.ApiResponseStatusType

module ApiLimitErrorResponse =

  //#region ApiLimitErrorResponse

  [<CLIMutable>]
  type ApiLimitErrorResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ApiErrorDTO[];
  }

  //#endregion
