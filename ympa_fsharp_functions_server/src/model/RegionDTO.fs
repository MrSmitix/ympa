namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RegionType

module RegionDTO =

  //#region RegionDTO

  [<CLIMutable>]
  type RegionDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : RegionType;
    [<JsonProperty(PropertyName = "parent")>]
    Parent : RegionDTO;
    [<JsonProperty(PropertyName = "children")>]
    Children : RegionDTO[];
  }

  //#endregion
