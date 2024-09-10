namespace ympa_fsharp_functions_server
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetWarehouseStocksRequest
open ympa_fsharp_functions_server.Model.GetWarehouseStocksResponse
open ympa_fsharp_functions_server.Model.UpdateStocksRequest
open StocksApiHandlerParams
open StocksApiServiceInterface
open System.Collections.Generic
open System

module StocksApiServiceImplementation =

    //#region Service implementation
    type StocksApiServiceImpl() =
      interface IStocksApiService with

        member this.GetStocks (parameters:GetStocksBodyParams) =
          if true then
            let content = "Остатки товаров на складах." :> obj :?> GetWarehouseStocksResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStocksStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStocksStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStocksStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStocksStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStocksStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStocksStatusCode500 { content = content }

        member this.UpdateStocks (parameters:UpdateStocksBodyParams) =
          if true then
            let content = "Пустой ответ." :> obj :?> EmptyApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStocksStatusCode500 { content = content }

      //#endregion

    let StocksApiService = StocksApiServiceImpl() :> IStocksApiService