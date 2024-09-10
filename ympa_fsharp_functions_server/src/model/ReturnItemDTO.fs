namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ReturnDecisionDTO
open ympa_fsharp_functions_server.Model.ReturnInstanceDTO
open ympa_fsharp_functions_server.Model.TrackDTO

module ReturnItemDTO =

  //#region ReturnItemDTO

  [<CLIMutable>]
  type ReturnItemDTO = {
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "shopSku")>]
    ShopSku : string;
    [<JsonProperty(PropertyName = "count")>]
    Count : int64;
    [<JsonProperty(PropertyName = "decisions")>]
    Decisions : ReturnDecisionDTO[];
    [<JsonProperty(PropertyName = "instances")>]
    Instances : ReturnInstanceDTO[];
    [<JsonProperty(PropertyName = "tracks")>]
    Tracks : TrackDTO[];
  }

  //#endregion
