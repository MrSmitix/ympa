namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderBuyerType

module OrderBuyerInfoDTO =

  //#region OrderBuyerInfoDTO


  type OrderBuyerInfoDTO = {
    Id : string;
    LastName : string;
    FirstName : string;
    MiddleName : string;
    Type : OrderBuyerType;
    Phone : string;
  }
  //#endregion
