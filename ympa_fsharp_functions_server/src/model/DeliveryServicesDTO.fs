namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.DeliveryServiceInfoDTO

module DeliveryServicesDTO =

  //#region DeliveryServicesDTO

  [<CLIMutable>]
  type DeliveryServicesDTO = {
    [<JsonProperty(PropertyName = "deliveryService")>]
    DeliveryService : DeliveryServiceInfoDTO[];
  }

  //#endregion
