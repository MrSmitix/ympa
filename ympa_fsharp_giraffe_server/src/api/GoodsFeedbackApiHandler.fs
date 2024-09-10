namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GoodsFeedbackApiHandlerParams
open GoodsFeedbackApiServiceInterface
open GoodsFeedbackApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeleteGoodsFeedbackCommentRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackCommentsRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackCommentsResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackResponse
open ympa_fsharp_giraffe_server.Model.SkipGoodsFeedbackReactionRequest
open ympa_fsharp_giraffe_server.Model.UpdateGoodsFeedbackCommentRequest
open ympa_fsharp_giraffe_server.Model.UpdateGoodsFeedbackCommentResponse

module GoodsFeedbackApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteGoodsFeedbackComment
    /// <summary>
    /// Удаление комментария к отзыву
    /// </summary>

    let DeleteGoodsFeedbackComment (pathParams:DeleteGoodsFeedbackCommentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteGoodsFeedbackCommentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteGoodsFeedbackCommentArgs
          let result = GoodsFeedbackApiService.DeleteGoodsFeedbackComment ctx serviceArgs
          return! (match result with
                      | DeleteGoodsFeedbackCommentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetGoodsFeedbackComments
    /// <summary>
    /// Получение комментариев к отзыву
    /// </summary>

    let GetGoodsFeedbackComments (pathParams:GetGoodsFeedbackCommentsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetGoodsFeedbackCommentsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetGoodsFeedbackCommentsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetGoodsFeedbackCommentsArgs
          let result = GoodsFeedbackApiService.GetGoodsFeedbackComments ctx serviceArgs
          return! (match result with
                      | GetGoodsFeedbackCommentsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetGoodsFeedbacks
    /// <summary>
    /// Получение отзывов о товарах продавца
    /// </summary>

    let GetGoodsFeedbacks (pathParams:GetGoodsFeedbacksPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetGoodsFeedbacksQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetGoodsFeedbacksBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetGoodsFeedbacksArgs
          let result = GoodsFeedbackApiService.GetGoodsFeedbacks ctx serviceArgs
          return! (match result with
                      | GetGoodsFeedbacksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SkipGoodsFeedbacksReaction
    /// <summary>
    /// Отказ от ответа на отзывы
    /// </summary>

    let SkipGoodsFeedbacksReaction (pathParams:SkipGoodsFeedbacksReactionPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SkipGoodsFeedbacksReactionBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SkipGoodsFeedbacksReactionArgs
          let result = GoodsFeedbackApiService.SkipGoodsFeedbacksReaction ctx serviceArgs
          return! (match result with
                      | SkipGoodsFeedbacksReactionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateGoodsFeedbackComment
    /// <summary>
    /// Добавление нового или изменение созданного комментария
    /// </summary>

    let UpdateGoodsFeedbackComment (pathParams:UpdateGoodsFeedbackCommentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateGoodsFeedbackCommentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateGoodsFeedbackCommentArgs
          let result = GoodsFeedbackApiService.UpdateGoodsFeedbackComment ctx serviceArgs
          return! (match result with
                      | UpdateGoodsFeedbackCommentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

