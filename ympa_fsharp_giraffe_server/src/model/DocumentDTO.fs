namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderDocumentStatusType

module DocumentDTO =

  //#region DocumentDTO


  type DocumentDTO = {
    Status : OrderDocumentStatusType;
    Number : string;
    Date : DateTime;
  }
  //#endregion
