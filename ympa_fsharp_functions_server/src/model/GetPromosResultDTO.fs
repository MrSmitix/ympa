namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetPromoDTO

module GetPromosResultDTO =

  //#region GetPromosResultDTO

  [<CLIMutable>]
  type GetPromosResultDTO = {
    [<JsonProperty(PropertyName = "promos")>]
    Promos : GetPromoDTO[];
  }

  //#endregion
