namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FlippingPagerDTO =

  //#region FlippingPagerDTO

  [<CLIMutable>]
  type FlippingPagerDTO = {
    [<JsonProperty(PropertyName = "total")>]
    Total : int;
    [<JsonProperty(PropertyName = "from")>]
    From : int;
    [<JsonProperty(PropertyName = "to")>]
    To : int;
    [<JsonProperty(PropertyName = "currentPage")>]
    CurrentPage : int;
    [<JsonProperty(PropertyName = "pagesCount")>]
    PagesCount : int;
    [<JsonProperty(PropertyName = "pageSize")>]
    PageSize : int;
  }

  //#endregion
