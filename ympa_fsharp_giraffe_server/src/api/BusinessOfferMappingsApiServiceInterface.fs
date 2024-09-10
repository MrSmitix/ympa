namespace ympa_fsharp_giraffe_server
open BusinessOfferMappingsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BusinessOfferMappingsApiServiceInterface =

    //#region Service interface
    type IBusinessOfferMappingsApiService =
      abstract member AddOffersToArchive:HttpContext -> AddOffersToArchiveArgs->AddOffersToArchiveResult
      abstract member DeleteOffers:HttpContext -> DeleteOffersArgs->DeleteOffersResult
      abstract member DeleteOffersFromArchive:HttpContext -> DeleteOffersFromArchiveArgs->DeleteOffersFromArchiveResult
      abstract member GetOfferMappings:HttpContext -> GetOfferMappingsArgs->GetOfferMappingsResult
      abstract member GetSuggestedOfferMappings:HttpContext -> GetSuggestedOfferMappingsArgs->GetSuggestedOfferMappingsResult
      abstract member UpdateOfferMappings:HttpContext -> UpdateOfferMappingsArgs->UpdateOfferMappingsResult
    //#endregion