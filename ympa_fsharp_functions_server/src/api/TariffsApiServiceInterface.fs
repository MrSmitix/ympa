namespace ympa_fsharp_functions_server
open TariffsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module TariffsApiServiceInterface =

    //#region Service interface
    type ITariffsApiService =
      abstract member CalculateTariffs : CalculateTariffsBodyParams -> CalculateTariffsResult
    //#endregion