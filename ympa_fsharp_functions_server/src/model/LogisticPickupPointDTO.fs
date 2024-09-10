namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.LogisticPointType
open ympa_fsharp_functions_server.Model.PickupAddressDTO

module LogisticPickupPointDTO =

  //#region LogisticPickupPointDTO

  [<CLIMutable>]
  type LogisticPickupPointDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "address")>]
    Address : PickupAddressDTO;
    [<JsonProperty(PropertyName = "instruction")>]
    Instruction : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : LogisticPointType;
    [<JsonProperty(PropertyName = "logisticPartnerId")>]
    LogisticPartnerId : int64;
  }

  //#endregion
