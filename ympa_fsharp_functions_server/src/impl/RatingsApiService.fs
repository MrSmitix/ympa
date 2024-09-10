namespace ympa_fsharp_functions_server
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GetQualityRatingDetailsResponse
open ympa_fsharp_functions_server.Model.GetQualityRatingRequest
open ympa_fsharp_functions_server.Model.GetQualityRatingResponse
open RatingsApiHandlerParams
open RatingsApiServiceInterface
open System.Collections.Generic
open System

module RatingsApiServiceImplementation =

    //#region Service implementation
    type RatingsApiServiceImpl() =
      interface IRatingsApiService with

        member this.GetQualityRatingDetails () =
          if true then
            let content = "Информация о заказах, которые повлияли на индекс качества." :> obj :?> GetQualityRatingDetailsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingDetailsStatusCode500 { content = content }

        member this.GetQualityRatings (parameters:GetQualityRatingsBodyParams) =
          if true then
            let content = "Значение индекса качества магазинов и его составляющие." :> obj :?> GetQualityRatingResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetQualityRatingsStatusCode500 { content = content }

      //#endregion

    let RatingsApiService = RatingsApiServiceImpl() :> IRatingsApiService