namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.DeliveryServicesDTO

module GetDeliveryServicesResponse =

  //#region GetDeliveryServicesResponse

  [<CLIMutable>]
  type GetDeliveryServicesResponse = {
    [<JsonProperty(PropertyName = "result")>]
    Result : DeliveryServicesDTO;
  }

  //#endregion
