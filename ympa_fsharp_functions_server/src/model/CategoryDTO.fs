namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CategoryDTO =

  //#region CategoryDTO

  [<CLIMutable>]
  type CategoryDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "children")>]
    Children : CategoryDTO[];
  }

  //#endregion
