namespace ympa_fsharp_giraffe_server
open TariffsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module TariffsApiServiceInterface =

    //#region Service interface
    type ITariffsApiService =
      abstract member CalculateTariffs:HttpContext -> CalculateTariffsArgs->CalculateTariffsResult
    //#endregion