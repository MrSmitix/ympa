namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderBoxLayoutPartialCountDTO =

  //#region OrderBoxLayoutPartialCountDTO

  [<CLIMutable>]
  type OrderBoxLayoutPartialCountDTO = {
    [<JsonProperty(PropertyName = "current")>]
    Current : int;
    [<JsonProperty(PropertyName = "total")>]
    Total : int;
  }

  //#endregion
