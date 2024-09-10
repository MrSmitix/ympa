namespace ympa_fsharp_functions_server
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetOfferMappingEntriesResponse
open ympa_fsharp_functions_server.Model.GetSuggestedOfferMappingEntriesRequest
open ympa_fsharp_functions_server.Model.GetSuggestedOfferMappingEntriesResponse
open ympa_fsharp_functions_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_functions_server.Model.OfferMappingKindType
open ympa_fsharp_functions_server.Model.OfferProcessingStatusType
open ympa_fsharp_functions_server.Model.UpdateOfferMappingEntryRequest
open OfferMappingsApiHandlerParams
open OfferMappingsApiServiceInterface
open System.Collections.Generic
open System

module OfferMappingsApiServiceImplementation =

    //#region Service implementation
    type OfferMappingsApiServiceImpl() =
      interface IOfferMappingsApiService with

        member this.GetOfferMappingEntries () =
          if true then
            let content = "Информация о товарах в каталоге." :> obj :?> GetOfferMappingEntriesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingEntriesStatusCode500 { content = content }

        member this.GetSuggestedOfferMappingEntries (parameters:GetSuggestedOfferMappingEntriesBodyParams) =
          if true then
            let content = "Информация о товарах в каталоге." :> obj :?> GetSuggestedOfferMappingEntriesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingEntriesStatusCode500 { content = content }

        member this.UpdateOfferMappingEntries (parameters:UpdateOfferMappingEntriesBodyParams) =
          if true then
            let content = "Статус выполнения операции." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingEntriesStatusCode500 { content = content }

      //#endregion

    let OfferMappingsApiService = OfferMappingsApiServiceImpl() :> IOfferMappingsApiService