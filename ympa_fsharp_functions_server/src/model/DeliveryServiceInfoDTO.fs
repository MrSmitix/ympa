namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeliveryServiceInfoDTO =

  //#region DeliveryServiceInfoDTO

  [<CLIMutable>]
  type DeliveryServiceInfoDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
