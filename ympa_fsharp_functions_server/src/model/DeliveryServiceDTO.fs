namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeliveryServiceDTO =

  //#region DeliveryServiceDTO

  [<CLIMutable>]
  type DeliveryServiceDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
