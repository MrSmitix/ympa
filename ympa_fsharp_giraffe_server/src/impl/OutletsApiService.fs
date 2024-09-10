namespace ympa_fsharp_giraffe_server
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
open OutletsApiHandlerParams
open OutletsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module OutletsApiServiceImplementation =

    //#region Service implementation
    type OutletsApiServiceImpl() =
      interface IOutletsApiService with

        member this.CreateOutlet ctx args =
          if true then
            let content = "Информация о созданной точке продаж." :> obj :?> CreateOutletResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateOutletStatusCode500 { content = content }

        member this.DeleteOutlet ctx args =
          if true then
            let content = "Пустой ответ." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOutletStatusCode500 { content = content }

        member this.GetOutlet ctx args =
          if true then
            let content = "Информация о точке продаж." :> obj :?> GetOutletResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletStatusCode500 { content = content }

        member this.GetOutlets ctx args =
          if true then
            let content = "Информация о точках продаж." :> obj :?> GetOutletsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOutletsStatusCode500 { content = content }

        member this.UpdateOutlet ctx args =
          if true then
            let content = "Пустой ответ." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOutletStatusCode500 { content = content }

      //#endregion

    let OutletsApiService = OutletsApiServiceImpl() :> IOutletsApiService