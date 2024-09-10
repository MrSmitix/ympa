namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ParcelBoxLabelDTO

module OrderLabelDTO =

  //#region OrderLabelDTO


  type OrderLabelDTO = {
    OrderId : int64;
    PlacesNumber : int;
    Url : string;
    ParcelBoxLabels : ParcelBoxLabelDTO[];
  }
  //#endregion
