namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedPublicationFullDTO
open ympa_fsharp_giraffe_server.Model.FeedPublicationPriceAndStockUpdateDTO
open ympa_fsharp_giraffe_server.Model.FeedStatusType

module FeedPublicationDTO =

  //#region FeedPublicationDTO


  type FeedPublicationDTO = {
    Status : FeedStatusType;
    Full : FeedPublicationFullDTO;
    PriceAndStockUpdate : FeedPublicationPriceAndStockUpdateDTO;
  }
  //#endregion
