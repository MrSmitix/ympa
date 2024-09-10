/*
 * get_price_dto.h
 *
 * Цена с указанием времени последнего обновления.
 */

#ifndef _get_price_dto_H_
#define _get_price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_price_dto_t get_price_dto_t;

#include "currency_type.h"

// Enum  for get_price_dto

typedef enum  { _api__get_price_dto__NULL = 0, _api__get_price_dto__RUR, _api__get_price_dto__USD, _api__get_price_dto__EUR, _api__get_price_dto__UAH, _api__get_price_dto__AUD, _api__get_price_dto__GBP, _api__get_price_dto__BYR, _api__get_price_dto__BYN, _api__get_price_dto__DKK, _api__get_price_dto__ISK, _api__get_price_dto__KZT, _api__get_price_dto__CAD, _api__get_price_dto__CNY, _api__get_price_dto__NOK, _api__get_price_dto__XDR, _api__get_price_dto__SGD, _api__get_price_dto___TRY, _api__get_price_dto__SEK, _api__get_price_dto__CHF, _api__get_price_dto__JPY, _api__get_price_dto__AZN, _api__get_price_dto__ALL, _api__get_price_dto__DZD, _api__get_price_dto__AOA, _api__get_price_dto__ARS, _api__get_price_dto__AMD, _api__get_price_dto__AFN, _api__get_price_dto__BHD, _api__get_price_dto__BGN, _api__get_price_dto__BOB, _api__get_price_dto__BWP, _api__get_price_dto__BND, _api__get_price_dto__BRL, _api__get_price_dto__BIF, _api__get_price_dto__HUF, _api__get_price_dto__VEF, _api__get_price_dto__KPW, _api__get_price_dto__VND, _api__get_price_dto__GMD, _api__get_price_dto__GHS, _api__get_price_dto__GNF, _api__get_price_dto__HKD, _api__get_price_dto__GEL, _api__get_price_dto__AED, _api__get_price_dto__EGP, _api__get_price_dto__ZMK, _api__get_price_dto__ILS, _api__get_price_dto__INR, _api__get_price_dto__IDR, _api__get_price_dto__JOD, _api__get_price_dto__IQD, _api__get_price_dto__IRR, _api__get_price_dto__YER, _api__get_price_dto__QAR, _api__get_price_dto__KES, _api__get_price_dto__KGS, _api__get_price_dto__COP, _api__get_price_dto__CDF, _api__get_price_dto__CRC, _api__get_price_dto__KWD, _api__get_price_dto__CUP, _api__get_price_dto__LAK, _api__get_price_dto__LVL, _api__get_price_dto__SLL, _api__get_price_dto__LBP, _api__get_price_dto__LYD, _api__get_price_dto__SZL, _api__get_price_dto__LTL, _api__get_price_dto__MUR, _api__get_price_dto__MRO, _api__get_price_dto__MKD, _api__get_price_dto__MWK, _api__get_price_dto__MGA, _api__get_price_dto__MYR, _api__get_price_dto__MAD, _api__get_price_dto__MXN, _api__get_price_dto__MZN, _api__get_price_dto__MDL, _api__get_price_dto__MNT, _api__get_price_dto__NPR, _api__get_price_dto__NGN, _api__get_price_dto__NIO, _api__get_price_dto__NZD, _api__get_price_dto__OMR, _api__get_price_dto__PKR, _api__get_price_dto__PYG, _api__get_price_dto__PEN, _api__get_price_dto__PLN, _api__get_price_dto__KHR, _api__get_price_dto__SAR, _api__get_price_dto__RON, _api__get_price_dto__SCR, _api__get_price_dto__SYP, _api__get_price_dto__SKK, _api__get_price_dto__SOS, _api__get_price_dto__SDG, _api__get_price_dto__SRD, _api__get_price_dto__TJS, _api__get_price_dto__THB, _api__get_price_dto__TWD, _api__get_price_dto__BDT, _api__get_price_dto__TZS, _api__get_price_dto__TND, _api__get_price_dto__TMM, _api__get_price_dto__UGX, _api__get_price_dto__UZS, _api__get_price_dto__UYU, _api__get_price_dto__PHP, _api__get_price_dto__DJF, _api__get_price_dto__XAF, _api__get_price_dto__XOF, _api__get_price_dto__HRK, _api__get_price_dto__CZK, _api__get_price_dto__CLP, _api__get_price_dto__LKR, _api__get_price_dto__EEK, _api__get_price_dto__ETB, _api__get_price_dto__RSD, _api__get_price_dto__ZAR, _api__get_price_dto__KRW, _api__get_price_dto__NAD, _api__get_price_dto__TL, _api__get_price_dto__UE } _api__get_price_dto__e;

char* get_price_dto_currency_id_ToString(_api__get_price_dto__e currency_id);

_api__get_price_dto__e get_price_dto_currency_id_FromString(char* currency_id);



typedef struct get_price_dto_t {
    double value; //numeric
    currency_type_t *currency_id; // custom
    char *updated_at; //date time

} get_price_dto_t;

get_price_dto_t *get_price_dto_create(
    double value,
    currency_type_t *currency_id,
    char *updated_at
);

void get_price_dto_free(get_price_dto_t *get_price_dto);

get_price_dto_t *get_price_dto_parseFromJSON(cJSON *get_price_dtoJSON);

cJSON *get_price_dto_convertToJSON(get_price_dto_t *get_price_dto);

#endif /* _get_price_dto_H_ */

