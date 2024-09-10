namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateGoodsFeedbackCommentDTO

module UpdateGoodsFeedbackCommentRequest =

  //#region UpdateGoodsFeedbackCommentRequest

  [<CLIMutable>]
  type UpdateGoodsFeedbackCommentRequest = {
    [<JsonProperty(PropertyName = "feedbackId")>]
    FeedbackId : int64;
    [<JsonProperty(PropertyName = "comment")>]
    Comment : UpdateGoodsFeedbackCommentDTO;
  }

  //#endregion
