namespace ympa_fsharp_functions_server
open ModelsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ModelsApiServiceInterface =

    //#region Service interface
    type IModelsApiService =
      abstract member GetModel : unit -> GetModelResult
      abstract member GetModelOffers : unit -> GetModelOffersResult
      abstract member GetModels : GetModelsBodyParams -> GetModelsResult
      abstract member GetModelsOffers : GetModelsOffersBodyParams -> GetModelsOffersResult
      abstract member SearchModels : unit -> SearchModelsResult
    //#endregion