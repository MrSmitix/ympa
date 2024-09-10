namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.DocumentDTO

module OrderBusinessDocumentsDTO =

  //#region OrderBusinessDocumentsDTO


  type OrderBusinessDocumentsDTO = {
    Upd : DocumentDTO;
    Ukd : DocumentDTO;
    TorgTwelve : DocumentDTO;
    Sf : DocumentDTO;
    Ksf : DocumentDTO;
  }
  //#endregion
