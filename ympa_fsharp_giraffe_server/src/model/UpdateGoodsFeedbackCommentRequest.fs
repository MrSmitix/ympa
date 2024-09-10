namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateGoodsFeedbackCommentDTO

module UpdateGoodsFeedbackCommentRequest =

  //#region UpdateGoodsFeedbackCommentRequest


  type UpdateGoodsFeedbackCommentRequest = {
    FeedbackId : int64;
    Comment : UpdateGoodsFeedbackCommentDTO;
  }
  //#endregion
