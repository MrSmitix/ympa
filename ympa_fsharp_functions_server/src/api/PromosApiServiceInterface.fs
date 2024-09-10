namespace ympa_fsharp_functions_server
open PromosApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PromosApiServiceInterface =

    //#region Service interface
    type IPromosApiService =
      abstract member DeletePromoOffers : DeletePromoOffersBodyParams -> DeletePromoOffersResult
      abstract member GetPromoOffers : GetPromoOffersBodyParams -> GetPromoOffersResult
      abstract member GetPromos : GetPromosBodyParams -> GetPromosResult
      abstract member UpdatePromoOffers : UpdatePromoOffersBodyParams -> UpdatePromoOffersResult
    //#endregion