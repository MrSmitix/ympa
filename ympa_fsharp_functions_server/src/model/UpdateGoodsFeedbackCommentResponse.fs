namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.GoodsFeedbackCommentDTO

module UpdateGoodsFeedbackCommentResponse =

  //#region UpdateGoodsFeedbackCommentResponse

  [<CLIMutable>]
  type UpdateGoodsFeedbackCommentResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : GoodsFeedbackCommentDTO;
  }

  //#endregion
