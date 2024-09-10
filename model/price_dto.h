/*
 * price_dto.h
 *
 * Цена с указанием скидки, валюты и времени последнего обновления.
 */

#ifndef _price_dto_H_
#define _price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_dto_t price_dto_t;

#include "currency_type.h"

// Enum  for price_dto

typedef enum  { _api__price_dto__NULL = 0, _api__price_dto__RUR, _api__price_dto__USD, _api__price_dto__EUR, _api__price_dto__UAH, _api__price_dto__AUD, _api__price_dto__GBP, _api__price_dto__BYR, _api__price_dto__BYN, _api__price_dto__DKK, _api__price_dto__ISK, _api__price_dto__KZT, _api__price_dto__CAD, _api__price_dto__CNY, _api__price_dto__NOK, _api__price_dto__XDR, _api__price_dto__SGD, _api__price_dto___TRY, _api__price_dto__SEK, _api__price_dto__CHF, _api__price_dto__JPY, _api__price_dto__AZN, _api__price_dto__ALL, _api__price_dto__DZD, _api__price_dto__AOA, _api__price_dto__ARS, _api__price_dto__AMD, _api__price_dto__AFN, _api__price_dto__BHD, _api__price_dto__BGN, _api__price_dto__BOB, _api__price_dto__BWP, _api__price_dto__BND, _api__price_dto__BRL, _api__price_dto__BIF, _api__price_dto__HUF, _api__price_dto__VEF, _api__price_dto__KPW, _api__price_dto__VND, _api__price_dto__GMD, _api__price_dto__GHS, _api__price_dto__GNF, _api__price_dto__HKD, _api__price_dto__GEL, _api__price_dto__AED, _api__price_dto__EGP, _api__price_dto__ZMK, _api__price_dto__ILS, _api__price_dto__INR, _api__price_dto__IDR, _api__price_dto__JOD, _api__price_dto__IQD, _api__price_dto__IRR, _api__price_dto__YER, _api__price_dto__QAR, _api__price_dto__KES, _api__price_dto__KGS, _api__price_dto__COP, _api__price_dto__CDF, _api__price_dto__CRC, _api__price_dto__KWD, _api__price_dto__CUP, _api__price_dto__LAK, _api__price_dto__LVL, _api__price_dto__SLL, _api__price_dto__LBP, _api__price_dto__LYD, _api__price_dto__SZL, _api__price_dto__LTL, _api__price_dto__MUR, _api__price_dto__MRO, _api__price_dto__MKD, _api__price_dto__MWK, _api__price_dto__MGA, _api__price_dto__MYR, _api__price_dto__MAD, _api__price_dto__MXN, _api__price_dto__MZN, _api__price_dto__MDL, _api__price_dto__MNT, _api__price_dto__NPR, _api__price_dto__NGN, _api__price_dto__NIO, _api__price_dto__NZD, _api__price_dto__OMR, _api__price_dto__PKR, _api__price_dto__PYG, _api__price_dto__PEN, _api__price_dto__PLN, _api__price_dto__KHR, _api__price_dto__SAR, _api__price_dto__RON, _api__price_dto__SCR, _api__price_dto__SYP, _api__price_dto__SKK, _api__price_dto__SOS, _api__price_dto__SDG, _api__price_dto__SRD, _api__price_dto__TJS, _api__price_dto__THB, _api__price_dto__TWD, _api__price_dto__BDT, _api__price_dto__TZS, _api__price_dto__TND, _api__price_dto__TMM, _api__price_dto__UGX, _api__price_dto__UZS, _api__price_dto__UYU, _api__price_dto__PHP, _api__price_dto__DJF, _api__price_dto__XAF, _api__price_dto__XOF, _api__price_dto__HRK, _api__price_dto__CZK, _api__price_dto__CLP, _api__price_dto__LKR, _api__price_dto__EEK, _api__price_dto__ETB, _api__price_dto__RSD, _api__price_dto__ZAR, _api__price_dto__KRW, _api__price_dto__NAD, _api__price_dto__TL, _api__price_dto__UE } _api__price_dto__e;

char* price_dto_currency_id_ToString(_api__price_dto__e currency_id);

_api__price_dto__e price_dto_currency_id_FromString(char* currency_id);



typedef struct price_dto_t {
    double value; //numeric
    double discount_base; //numeric
    currency_type_t *currency_id; // custom
    int vat; //numeric

} price_dto_t;

price_dto_t *price_dto_create(
    double value,
    double discount_base,
    currency_type_t *currency_id,
    int vat
);

void price_dto_free(price_dto_t *price_dto);

price_dto_t *price_dto_parseFromJSON(cJSON *price_dtoJSON);

cJSON *price_dto_convertToJSON(price_dto_t *price_dto);

#endif /* _price_dto_H_ */

