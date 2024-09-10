namespace ympa_fsharp_functions_server
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiLockedErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.ConfirmPricesRequest
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetQuarantineOffersRequest
open ympa_fsharp_functions_server.Model.GetQuarantineOffersResponse
open PriceQuarantineApiHandlerParams
open PriceQuarantineApiServiceInterface
open System.Collections.Generic
open System

module PriceQuarantineApiServiceImplementation =

    //#region Service implementation
    type PriceQuarantineApiServiceImpl() =
      interface IPriceQuarantineApiService with

        member this.ConfirmBusinessPrices (parameters:ConfirmBusinessPricesBodyParams) =
          if true then
            let content = "Ответ 200 обозначает, что цены подтверждены." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmBusinessPricesStatusCode500 { content = content }

        member this.ConfirmCampaignPrices (parameters:ConfirmCampaignPricesBodyParams) =
          if true then
            let content = "Ответ 200 обозначает, что цены подтверждены." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConfirmCampaignPricesStatusCode500 { content = content }

        member this.GetBusinessQuarantineOffers (parameters:GetBusinessQuarantineOffersBodyParams) =
          if true then
            let content = "Список товаров в карантине." :> obj :?> GetQuarantineOffersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessQuarantineOffersStatusCode500 { content = content }

        member this.GetCampaignQuarantineOffers (parameters:GetCampaignQuarantineOffersBodyParams) =
          if true then
            let content = "Список товаров в карантине." :> obj :?> GetQuarantineOffersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCampaignQuarantineOffersStatusCode500 { content = content }

      //#endregion

    let PriceQuarantineApiService = PriceQuarantineApiServiceImpl() :> IPriceQuarantineApiService