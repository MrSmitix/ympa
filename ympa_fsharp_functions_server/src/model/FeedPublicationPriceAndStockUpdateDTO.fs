namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedPublicationPriceAndStockUpdateDTO =

  //#region FeedPublicationPriceAndStockUpdateDTO

  [<CLIMutable>]
  type FeedPublicationPriceAndStockUpdateDTO = {
    [<JsonProperty(PropertyName = "fileTime")>]
    FileTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "publishedTime")>]
    PublishedTime : Nullable<DateTime>;
  }

  //#endregion
