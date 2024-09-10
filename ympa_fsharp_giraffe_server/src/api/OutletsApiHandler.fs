namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OutletsApiHandlerParams
open OutletsApiServiceInterface
open OutletsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.ChangeOutletRequest
open ympa_fsharp_giraffe_server.Model.CreateOutletResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOutletResponse
open ympa_fsharp_giraffe_server.Model.GetOutletsResponse

module OutletsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateOutlet
    /// <summary>
    /// Создание точки продаж
    /// </summary>

    let CreateOutlet (pathParams:CreateOutletPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateOutletBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateOutletArgs
          let result = OutletsApiService.CreateOutlet ctx serviceArgs
          return! (match result with
                      | CreateOutletStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateOutletStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CreateOutletStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CreateOutletStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CreateOutletStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CreateOutletStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | CreateOutletStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteOutlet
    /// <summary>
    /// Удаление точки продаж
    /// </summary>

    let DeleteOutlet (pathParams:DeleteOutletPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteOutletArgs
          let result = OutletsApiService.DeleteOutlet ctx serviceArgs
          return! (match result with
                      | DeleteOutletStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteOutletStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteOutletStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteOutletStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteOutletStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteOutletStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteOutletStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOutlet
    /// <summary>
    /// Информация об одной точке продаж
    /// </summary>

    let GetOutlet (pathParams:GetOutletPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOutletArgs
          let result = OutletsApiService.GetOutlet ctx serviceArgs
          return! (match result with
                      | GetOutletStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOutletStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOutletStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOutletStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOutletStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOutletStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOutletStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOutlets
    /// <summary>
    /// Информация о нескольких точках продаж
    /// </summary>

    let GetOutlets (pathParams:GetOutletsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOutletsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOutletsArgs
          let result = OutletsApiService.GetOutlets ctx serviceArgs
          return! (match result with
                      | GetOutletsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOutletsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOutletsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOutletsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOutletsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOutletsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOutletsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOutlet
    /// <summary>
    /// Изменение информации о точке продаж
    /// </summary>

    let UpdateOutlet (pathParams:UpdateOutletPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOutletBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOutletArgs
          let result = OutletsApiService.UpdateOutlet ctx serviceArgs
          return! (match result with
                      | UpdateOutletStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOutletStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOutletStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOutletStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOutletStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOutletStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOutletStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

