namespace ympa_fsharp_giraffe_server
open GoodsFeedbackApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GoodsFeedbackApiServiceInterface =

    //#region Service interface
    type IGoodsFeedbackApiService =
      abstract member DeleteGoodsFeedbackComment:HttpContext -> DeleteGoodsFeedbackCommentArgs->DeleteGoodsFeedbackCommentResult
      abstract member GetGoodsFeedbackComments:HttpContext -> GetGoodsFeedbackCommentsArgs->GetGoodsFeedbackCommentsResult
      abstract member GetGoodsFeedbacks:HttpContext -> GetGoodsFeedbacksArgs->GetGoodsFeedbacksResult
      abstract member SkipGoodsFeedbacksReaction:HttpContext -> SkipGoodsFeedbacksReactionArgs->SkipGoodsFeedbacksReactionResult
      abstract member UpdateGoodsFeedbackComment:HttpContext -> UpdateGoodsFeedbackCommentArgs->UpdateGoodsFeedbackCommentResult
    //#endregion