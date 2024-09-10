namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderParcelBoxDTO =

  //#region OrderParcelBoxDTO

  [<CLIMutable>]
  type OrderParcelBoxDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "fulfilmentId")>]
    FulfilmentId : string;
  }

  //#endregion
