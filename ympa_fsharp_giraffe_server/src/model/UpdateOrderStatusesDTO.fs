namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusDTO

module UpdateOrderStatusesDTO =

  //#region UpdateOrderStatusesDTO


  type UpdateOrderStatusesDTO = {
    Orders : UpdateOrderStatusDTO[];
  }
  //#endregion
