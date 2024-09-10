namespace ympa_fsharp_giraffe_server
open PricesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PricesApiServiceInterface =

    //#region Service interface
    type IPricesApiService =
      abstract member GetPrices:HttpContext -> GetPricesArgs->GetPricesResult
      abstract member GetPricesByOfferIds:HttpContext -> GetPricesByOfferIdsArgs->GetPricesByOfferIdsResult
      abstract member GetSuggestedPrices:HttpContext -> GetSuggestedPricesArgs->GetSuggestedPricesResult
      abstract member UpdateBusinessPrices:HttpContext -> UpdateBusinessPricesArgs->UpdateBusinessPricesResult
      abstract member UpdatePrices:HttpContext -> UpdatePricesArgs->UpdatePricesResult
    //#endregion