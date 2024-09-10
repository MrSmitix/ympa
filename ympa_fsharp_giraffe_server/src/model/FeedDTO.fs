namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedContentDTO
open ympa_fsharp_giraffe_server.Model.FeedDownloadDTO
open ympa_fsharp_giraffe_server.Model.FeedPlacementDTO
open ympa_fsharp_giraffe_server.Model.FeedPublicationDTO

module FeedDTO =

  //#region FeedDTO


  type FeedDTO = {
    Id : int64;
    Login : string;
    Name : string;
    Password : string;
    UploadDate : Nullable<DateTime>;
    Url : string;
    Content : FeedContentDTO;
    Download : FeedDownloadDTO;
    Placement : FeedPlacementDTO;
    Publication : FeedPublicationDTO;
  }
  //#endregion
