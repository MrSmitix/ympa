namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrdersStatsPriceType

module OrdersStatsPriceDTO =

  //#region OrdersStatsPriceDTO


  type OrdersStatsPriceDTO = {
    Type : OrdersStatsPriceType;
    CostPerItem : decimal;
    Total : decimal;
  }
  //#endregion
