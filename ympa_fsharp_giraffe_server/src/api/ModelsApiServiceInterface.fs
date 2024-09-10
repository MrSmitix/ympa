namespace ympa_fsharp_giraffe_server
open ModelsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ModelsApiServiceInterface =

    //#region Service interface
    type IModelsApiService =
      abstract member GetModel:HttpContext -> GetModelArgs->GetModelResult
      abstract member GetModelOffers:HttpContext -> GetModelOffersArgs->GetModelOffersResult
      abstract member GetModels:HttpContext -> GetModelsArgs->GetModelsResult
      abstract member GetModelsOffers:HttpContext -> GetModelsOffersArgs->GetModelsOffersResult
      abstract member SearchModels:HttpContext -> SearchModelsArgs->SearchModelsResult
    //#endregion