namespace ympa_fsharp_giraffe_server
open RegionsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module RegionsApiServiceInterface =

    //#region Service interface
    type IRegionsApiService =
      abstract member SearchRegionChildren:HttpContext -> SearchRegionChildrenArgs->SearchRegionChildrenResult
      abstract member SearchRegionsById:HttpContext -> SearchRegionsByIdArgs->SearchRegionsByIdResult
      abstract member SearchRegionsByName:HttpContext -> SearchRegionsByNameArgs->SearchRegionsByNameResult
    //#endregion