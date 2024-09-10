namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.FeedbackListDTO

module GetFeedbackListResponse =

  //#region GetFeedbackListResponse

  [<CLIMutable>]
  type GetFeedbackListResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : FeedbackListDTO;
  }

  //#endregion
