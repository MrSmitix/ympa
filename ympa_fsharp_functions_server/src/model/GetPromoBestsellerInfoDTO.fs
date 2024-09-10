namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetPromoBestsellerInfoDTO =

  //#region GetPromoBestsellerInfoDTO

  [<CLIMutable>]
  type GetPromoBestsellerInfoDTO = {
    [<JsonProperty(PropertyName = "bestseller")>]
    Bestseller : bool;
    [<JsonProperty(PropertyName = "entryDeadline")>]
    EntryDeadline : Nullable<DateTime>;
  }

  //#endregion
