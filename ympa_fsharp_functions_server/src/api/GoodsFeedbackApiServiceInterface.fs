namespace ympa_fsharp_functions_server
open GoodsFeedbackApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GoodsFeedbackApiServiceInterface =

    //#region Service interface
    type IGoodsFeedbackApiService =
      abstract member DeleteGoodsFeedbackComment : DeleteGoodsFeedbackCommentBodyParams -> DeleteGoodsFeedbackCommentResult
      abstract member GetGoodsFeedbackComments : GetGoodsFeedbackCommentsBodyParams -> GetGoodsFeedbackCommentsResult
      abstract member GetGoodsFeedbacks : GetGoodsFeedbacksBodyParams -> GetGoodsFeedbacksResult
      abstract member SkipGoodsFeedbacksReaction : SkipGoodsFeedbacksReactionBodyParams -> SkipGoodsFeedbacksReactionResult
      abstract member UpdateGoodsFeedbackComment : UpdateGoodsFeedbackCommentBodyParams -> UpdateGoodsFeedbackCommentResult
    //#endregion