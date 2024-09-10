namespace ympa_fsharp_functions_server
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetPricesByOfferIdsRequest
open ympa_fsharp_functions_server.Model.GetPricesByOfferIdsResponse
open ympa_fsharp_functions_server.Model.GetPricesResponse
open ympa_fsharp_functions_server.Model.SuggestPricesRequest
open ympa_fsharp_functions_server.Model.SuggestPricesResponse
open ympa_fsharp_functions_server.Model.UpdateBusinessPricesRequest
open ympa_fsharp_functions_server.Model.UpdatePricesRequest
open PricesApiHandlerParams
open PricesApiServiceInterface
open System.Collections.Generic
open System

module PricesApiServiceImplementation =

    //#region Service implementation
    type PricesApiServiceImpl() =
      interface IPricesApiService with

        member this.GetPrices () =
          if true then
            let content = "Список всех товаров с установленными ценами." :> obj :?> GetPricesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesStatusCode500 { content = content }

        member this.GetPricesByOfferIds (parameters:GetPricesByOfferIdsBodyParams) =
          if true then
            let content = "Список товаров с установленными для заданного магазина ценами." :> obj :?> GetPricesByOfferIdsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetPricesByOfferIdsStatusCode500 { content = content }

        member this.GetSuggestedPrices (parameters:GetSuggestedPricesBodyParams) =
          if true then
            let content = "Список цен для продвижения на Маркете." :> obj :?> SuggestPricesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedPricesStatusCode500 { content = content }

        member this.UpdateBusinessPrices (parameters:UpdateBusinessPricesBodyParams) =
          if true then
            let content = "Маркет принял информацию о новых ценах." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessPricesStatusCode500 { content = content }

        member this.UpdatePrices (parameters:UpdatePricesBodyParams) =
          if true then
            let content = "Маркет принял информацию о новых ценах." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdatePricesStatusCode500 { content = content }

      //#endregion

    let PricesApiService = PricesApiServiceImpl() :> IPricesApiService