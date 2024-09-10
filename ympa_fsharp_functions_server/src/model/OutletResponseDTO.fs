namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OutletResponseDTO =

  //#region OutletResponseDTO

  [<CLIMutable>]
  type OutletResponseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
  }

  //#endregion
