namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdateTimeDTO =

  //#region UpdateTimeDTO

  [<CLIMutable>]
  type UpdateTimeDTO = {
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : DateTime;
  }

  //#endregion
