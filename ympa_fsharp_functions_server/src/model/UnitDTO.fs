namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UnitDTO =

  //#region UnitDTO

  [<CLIMutable>]
  type UnitDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "fullName")>]
    FullName : string;
  }

  //#endregion
