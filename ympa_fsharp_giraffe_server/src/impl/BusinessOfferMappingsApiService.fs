namespace ympa_fsharp_giraffe_server
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveRequest
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveResponse
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveResponse
open ympa_fsharp_giraffe_server.Model.DeleteOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingsResponse
open BusinessOfferMappingsApiHandlerParams
open BusinessOfferMappingsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BusinessOfferMappingsApiServiceImplementation =

    //#region Service implementation
    type BusinessOfferMappingsApiServiceImpl() =
      interface IBusinessOfferMappingsApiService with

        member this.AddOffersToArchive ctx args =
          if true then
            let content = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. " :> obj :?> AddOffersToArchiveResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddOffersToArchiveStatusCode500 { content = content }

        member this.DeleteOffers ctx args =
          if true then
            let content = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине." :> obj :?> DeleteOffersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersStatusCode500 { content = content }

        member this.DeleteOffersFromArchive ctx args =
          if true then
            let content = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. " :> obj :?> DeleteOffersFromArchiveResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteOffersFromArchiveStatusCode500 { content = content }

        member this.GetOfferMappings ctx args =
          if true then
            let content = "Информация о товарах в каталоге." :> obj :?> GetOfferMappingsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOfferMappingsStatusCode500 { content = content }

        member this.GetSuggestedOfferMappings ctx args =
          if true then
            let content = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. " :> obj :?> GetSuggestedOfferMappingsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSuggestedOfferMappingsStatusCode500 { content = content }

        member this.UpdateOfferMappings ctx args =
          if true then
            let content = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. " :> obj :?> UpdateOfferMappingsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode420 { content = content }
          else if true then
            let content = "К ресурсу нельзя применить указанный метод." :> obj :?> ApiLockedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode423 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateOfferMappingsStatusCode500 { content = content }

      //#endregion

    let BusinessOfferMappingsApiService = BusinessOfferMappingsApiServiceImpl() :> IBusinessOfferMappingsApiService