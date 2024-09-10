namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OrderCourierDTO =

  //#region OrderCourierDTO


  type OrderCourierDTO = {
    FullName : string;
    Phone : string;
    PhoneExtension : string;
    VehicleNumber : string;
    VehicleDescription : string;
  }
  //#endregion
