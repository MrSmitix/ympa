namespace ympa_fsharp_giraffe_server
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessSettingsResponse
open BusinessesApiHandlerParams
open BusinessesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BusinessesApiServiceImplementation =

    //#region Service implementation
    type BusinessesApiServiceImpl() =
      interface IBusinessesApiService with

        member this.GetBusinessSettings ctx args =
          if true then
            let content = "Настройки кабинета." :> obj :?> GetBusinessSettingsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessSettingsStatusCode500 { content = content }

      //#endregion

    let BusinessesApiService = BusinessesApiServiceImpl() :> IBusinessesApiService