namespace ympa_fsharp_functions_server
open OfferMappingsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OfferMappingsApiServiceInterface =

    //#region Service interface
    type IOfferMappingsApiService =
      abstract member GetOfferMappingEntries : unit -> GetOfferMappingEntriesResult
      abstract member GetSuggestedOfferMappingEntries : GetSuggestedOfferMappingEntriesBodyParams -> GetSuggestedOfferMappingEntriesResult
      abstract member UpdateOfferMappingEntries : UpdateOfferMappingEntriesBodyParams -> UpdateOfferMappingEntriesResult
    //#endregion