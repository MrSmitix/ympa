namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModelPriceDTO =

  //#region ModelPriceDTO

  [<CLIMutable>]
  type ModelPriceDTO = {
    [<JsonProperty(PropertyName = "avg")>]
    Avg : decimal;
    [<JsonProperty(PropertyName = "max")>]
    Max : decimal;
    [<JsonProperty(PropertyName = "min")>]
    Min : decimal;
  }

  //#endregion
