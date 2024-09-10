namespace ympa_fsharp_giraffe_server
open CategoriesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CategoriesApiServiceInterface =

    //#region Service interface
    type ICategoriesApiService =
      abstract member GetCategoriesMaxSaleQuantum:HttpContext -> GetCategoriesMaxSaleQuantumArgs->GetCategoriesMaxSaleQuantumResult
      abstract member GetCategoriesTree:HttpContext -> GetCategoriesTreeArgs->GetCategoriesTreeResult
    //#endregion