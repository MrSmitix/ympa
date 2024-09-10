namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedContentDTO
open ympa_fsharp_functions_server.Model.FeedDownloadDTO
open ympa_fsharp_functions_server.Model.FeedPlacementDTO
open ympa_fsharp_functions_server.Model.FeedPublicationDTO

module FeedDTO =

  //#region FeedDTO

  [<CLIMutable>]
  type FeedDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "login")>]
    Login : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "password")>]
    Password : string;
    [<JsonProperty(PropertyName = "uploadDate")>]
    UploadDate : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : FeedContentDTO;
    [<JsonProperty(PropertyName = "download")>]
    Download : FeedDownloadDTO;
    [<JsonProperty(PropertyName = "placement")>]
    Placement : FeedPlacementDTO;
    [<JsonProperty(PropertyName = "publication")>]
    Publication : FeedPublicationDTO;
  }

  //#endregion
