namespace ympa_fsharp_functions_server
open CategoriesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CategoriesApiServiceInterface =

    //#region Service interface
    type ICategoriesApiService =
      abstract member GetCategoriesMaxSaleQuantum : GetCategoriesMaxSaleQuantumBodyParams -> GetCategoriesMaxSaleQuantumResult
      abstract member GetCategoriesTree : GetCategoriesTreeBodyParams -> GetCategoriesTreeResult
    //#endregion