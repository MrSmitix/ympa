namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OutletLicensesApiHandlerParams
open OutletLicensesApiServiceInterface
open OutletLicensesApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOutletLicensesResponse
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.UpdateOutletLicenseRequest

module OutletLicensesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteOutletLicenses
    /// <summary>
    /// Удаление лицензий для точек продаж
    /// </summary>

    let DeleteOutletLicenses (pathParams:DeleteOutletLicensesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<DeleteOutletLicensesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : DeleteOutletLicensesArgs
          let result = OutletLicensesApiService.DeleteOutletLicenses ctx serviceArgs
          return! (match result with
                      | DeleteOutletLicensesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteOutletLicensesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteOutletLicensesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteOutletLicensesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteOutletLicensesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteOutletLicensesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteOutletLicensesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOutletLicenses
    /// <summary>
    /// Информация о лицензиях для точек продаж
    /// </summary>

    let GetOutletLicenses (pathParams:GetOutletLicensesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOutletLicensesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOutletLicensesArgs
          let result = OutletLicensesApiService.GetOutletLicenses ctx serviceArgs
          return! (match result with
                      | GetOutletLicensesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOutletLicensesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOutletLicensesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOutletLicensesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOutletLicensesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOutletLicensesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOutletLicensesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOutletLicenses
    /// <summary>
    /// Создание и изменение лицензий для точек продаж
    /// </summary>

    let UpdateOutletLicenses (pathParams:UpdateOutletLicensesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOutletLicensesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOutletLicensesArgs
          let result = OutletLicensesApiService.UpdateOutletLicenses ctx serviceArgs
          return! (match result with
                      | UpdateOutletLicensesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOutletLicensesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOutletLicensesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOutletLicensesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOutletLicensesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOutletLicensesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOutletLicensesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

