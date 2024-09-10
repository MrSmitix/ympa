namespace ympa_fsharp_functions_server
open PricesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PricesApiServiceInterface =

    //#region Service interface
    type IPricesApiService =
      abstract member GetPrices : unit -> GetPricesResult
      abstract member GetPricesByOfferIds : GetPricesByOfferIdsBodyParams -> GetPricesByOfferIdsResult
      abstract member GetSuggestedPrices : GetSuggestedPricesBodyParams -> GetSuggestedPricesResult
      abstract member UpdateBusinessPrices : UpdateBusinessPricesBodyParams -> UpdateBusinessPricesResult
      abstract member UpdatePrices : UpdatePricesBodyParams -> UpdatePricesResult
    //#endregion