namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MaxSaleQuantumDTO =

  //#region MaxSaleQuantumDTO

  [<CLIMutable>]
  type MaxSaleQuantumDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "maxSaleQuantum")>]
    MaxSaleQuantum : int;
  }

  //#endregion
