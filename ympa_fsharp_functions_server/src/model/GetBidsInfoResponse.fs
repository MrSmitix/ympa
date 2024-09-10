namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.GetBidsInfoResponseDTO

module GetBidsInfoResponse =

  //#region GetBidsInfoResponse

  [<CLIMutable>]
  type GetBidsInfoResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : GetBidsInfoResponseDTO;
  }

  //#endregion
