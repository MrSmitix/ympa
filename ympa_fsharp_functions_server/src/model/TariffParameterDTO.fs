namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TariffParameterDTO =

  //#region TariffParameterDTO

  [<CLIMutable>]
  type TariffParameterDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
