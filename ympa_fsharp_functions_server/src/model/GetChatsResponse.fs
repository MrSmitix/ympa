namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.GetChatsInfoDTO

module GetChatsResponse =

  //#region GetChatsResponse

  [<CLIMutable>]
  type GetChatsResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : GetChatsInfoDTO;
  }

  //#endregion
