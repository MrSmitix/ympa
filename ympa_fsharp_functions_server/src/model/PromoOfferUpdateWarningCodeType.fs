namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PromoOfferUpdateWarningCodeType =

  //#region PromoOfferUpdateWarningCodeType

  let DEEPDISCOUNTOFFEREnum = "DEEP_DISCOUNT_OFFER"
  let CATALOGPRICEISLOWERTHANPROMOEnum = "CATALOG_PRICE_IS_LOWER_THAN_PROMO"
  let SHOPPRICESARELOWERTHANPROMOEnum = "SHOP_PRICES_ARE_LOWER_THAN_PROMO"
  let PROMOCODEPRICEMORETHANMAXFAIRPRICEEnum = "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE"
  let SHOPOFFERNOTELIGIBLEFORPROMOEnum = "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO"
  type PromoOfferUpdateWarningCodeType = string

  //#endregion
