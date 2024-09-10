namespace ympa_fsharp_functions_server
open BusinessOfferMappingsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BusinessOfferMappingsApiServiceInterface =

    //#region Service interface
    type IBusinessOfferMappingsApiService =
      abstract member AddOffersToArchive : AddOffersToArchiveBodyParams -> AddOffersToArchiveResult
      abstract member DeleteOffers : DeleteOffersBodyParams -> DeleteOffersResult
      abstract member DeleteOffersFromArchive : DeleteOffersFromArchiveBodyParams -> DeleteOffersFromArchiveResult
      abstract member GetOfferMappings : GetOfferMappingsBodyParams -> GetOfferMappingsResult
      abstract member GetSuggestedOfferMappings : GetSuggestedOfferMappingsBodyParams -> GetSuggestedOfferMappingsResult
      abstract member UpdateOfferMappings : UpdateOfferMappingsBodyParams -> UpdateOfferMappingsResult
    //#endregion