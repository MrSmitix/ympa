namespace ympa_fsharp_functions_server
open RegionsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module RegionsApiServiceInterface =

    //#region Service interface
    type IRegionsApiService =
      abstract member SearchRegionChildren : unit -> SearchRegionChildrenResult
      abstract member SearchRegionsById : unit -> SearchRegionsByIdResult
      abstract member SearchRegionsByName : unit -> SearchRegionsByNameResult
    //#endregion