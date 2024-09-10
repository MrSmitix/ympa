namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GpsDTO

module OrderDeliveryAddressDTO =

  //#region OrderDeliveryAddressDTO


  type OrderDeliveryAddressDTO = {
    Country : string;
    Postcode : string;
    City : string;
    District : string;
    Subway : string;
    Street : string;
    House : string;
    Block : string;
    Entrance : string;
    Entryphone : string;
    Floor : string;
    Apartment : string;
    Phone : string;
    Recipient : string;
    Gps : GpsDTO;
  }
  //#endregion
