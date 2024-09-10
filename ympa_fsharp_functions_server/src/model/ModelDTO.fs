namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ModelPriceDTO

module ModelDTO =

  //#region ModelDTO

  [<CLIMutable>]
  type ModelDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "prices")>]
    Prices : ModelPriceDTO;
  }

  //#endregion
