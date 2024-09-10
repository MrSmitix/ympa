namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ForwardScrollingPagerDTO =

  //#region ForwardScrollingPagerDTO

  [<CLIMutable>]
  type ForwardScrollingPagerDTO = {
    [<JsonProperty(PropertyName = "nextPageToken")>]
    NextPageToken : string;
  }

  //#endregion
