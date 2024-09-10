namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ReturnsApiHandlerParams
open ReturnsApiServiceInterface
open ReturnsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetReturnResponse
open ympa_fsharp_giraffe_server.Model.GetReturnsResponse
open ympa_fsharp_giraffe_server.Model.RefundStatusType
open ympa_fsharp_giraffe_server.Model.ReturnType
open ympa_fsharp_giraffe_server.Model.SetReturnDecisionRequest

module ReturnsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetReturn
    /// <summary>
    /// Информация о невыкупе или возврате
    /// </summary>

    let GetReturn (pathParams:GetReturnPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReturnArgs
          let result = ReturnsApiService.GetReturn ctx serviceArgs
          return! (match result with
                      | GetReturnStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetReturnStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturnApplication
    /// <summary>
    /// Получение заявления на возврат
    /// </summary>

    let GetReturnApplication (pathParams:GetReturnApplicationPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReturnApplicationArgs
          let result = ReturnsApiService.GetReturnApplication ctx serviceArgs
          return! (match result with
                      | GetReturnApplicationStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GetReturnApplicationStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnApplicationStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnApplicationStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnApplicationStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnApplicationStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnApplicationStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturnPhoto
    /// <summary>
    /// Получение фотографии возврата
    /// </summary>

    let GetReturnPhoto (pathParams:GetReturnPhotoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReturnPhotoArgs
          let result = ReturnsApiService.GetReturnPhoto ctx serviceArgs
          return! (match result with
                      | GetReturnPhotoStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GetReturnPhotoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnPhotoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnPhotoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnPhotoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnPhotoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnPhotoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturns
    /// <summary>
    /// Список невыкупов и возвратов
    /// </summary>

    let GetReturns (pathParams:GetReturnsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetReturnsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetReturnsArgs
          let result = ReturnsApiService.GetReturns ctx serviceArgs
          return! (match result with
                      | GetReturnsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetReturnsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetReturnDecision
    /// <summary>
    /// Принятие или изменение решения по возврату
    /// </summary>

    let SetReturnDecision (pathParams:SetReturnDecisionPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetReturnDecisionBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetReturnDecisionArgs
          let result = ReturnsApiService.SetReturnDecision ctx serviceArgs
          return! (match result with
                      | SetReturnDecisionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetReturnDecisionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetReturnDecisionStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetReturnDecisionStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetReturnDecisionStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetReturnDecisionStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetReturnDecisionStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SubmitReturnDecision
    /// <summary>
    /// Подтверждение решения по возврату
    /// </summary>

    let SubmitReturnDecision (pathParams:SubmitReturnDecisionPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SubmitReturnDecisionArgs
          let result = ReturnsApiService.SubmitReturnDecision ctx serviceArgs
          return! (match result with
                      | SubmitReturnDecisionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SubmitReturnDecisionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SubmitReturnDecisionStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SubmitReturnDecisionStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SubmitReturnDecisionStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SubmitReturnDecisionStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SubmitReturnDecisionStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

