namespace ympa_fsharp_giraffe_server
open OfferMappingsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OfferMappingsApiServiceInterface =

    //#region Service interface
    type IOfferMappingsApiService =
      abstract member GetOfferMappingEntries:HttpContext -> GetOfferMappingEntriesArgs->GetOfferMappingEntriesResult
      abstract member GetSuggestedOfferMappingEntries:HttpContext -> GetSuggestedOfferMappingEntriesArgs->GetSuggestedOfferMappingEntriesResult
      abstract member UpdateOfferMappingEntries:HttpContext -> UpdateOfferMappingEntriesArgs->UpdateOfferMappingEntriesResult
    //#endregion