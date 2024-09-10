namespace ympa_fsharp_giraffe_server
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
open OutletLicensesApiHandlerParams
open OutletLicensesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module OutletLicensesApiServiceImplementation =

    //#region Service implementation
    type OutletLicensesApiServiceImpl() =
      interface IOutletLicensesApiService with

        member this.DeleteOutletLicenses ctx args =
          if true then
            let content = "Пустой ответ." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletLicensesStatusCode500 { content = content }

        member this.GetOutletLicenses ctx args =
          if true then
            let content = "Найденные лицензии собственных точек продаж." :> obj :?> GetOutletLicensesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletLicensesStatusCode500 { content = content }

        member this.UpdateOutletLicenses ctx args =
          if true then
            let content = "Пустой ответ." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletLicensesStatusCode500 { content = content }

      //#endregion

    let OutletLicensesApiService = OutletLicensesApiServiceImpl() :> IOutletLicensesApiService