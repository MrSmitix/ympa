namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ScrollingPagerDTO =

  //#region ScrollingPagerDTO

  [<CLIMutable>]
  type ScrollingPagerDTO = {
    [<JsonProperty(PropertyName = "nextPageToken")>]
    NextPageToken : string;
    [<JsonProperty(PropertyName = "prevPageToken")>]
    PrevPageToken : string;
  }

  //#endregion
