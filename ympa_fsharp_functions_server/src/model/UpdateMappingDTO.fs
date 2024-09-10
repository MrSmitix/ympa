namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdateMappingDTO =

  //#region UpdateMappingDTO

  [<CLIMutable>]
  type UpdateMappingDTO = {
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
  }

  //#endregion
