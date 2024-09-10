/*
 * get_models_response.h
 *
 * Ответ на запрос информации о моделях.
 */

#ifndef _get_models_response_H_
#define _get_models_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_models_response_t get_models_response_t;

#include "currency_type.h"
#include "model_dto.h"

// Enum  for get_models_response

typedef enum  { _api__get_models_response__NULL = 0, _api__get_models_response__RUR, _api__get_models_response__USD, _api__get_models_response__EUR, _api__get_models_response__UAH, _api__get_models_response__AUD, _api__get_models_response__GBP, _api__get_models_response__BYR, _api__get_models_response__BYN, _api__get_models_response__DKK, _api__get_models_response__ISK, _api__get_models_response__KZT, _api__get_models_response__CAD, _api__get_models_response__CNY, _api__get_models_response__NOK, _api__get_models_response__XDR, _api__get_models_response__SGD, _api__get_models_response___TRY, _api__get_models_response__SEK, _api__get_models_response__CHF, _api__get_models_response__JPY, _api__get_models_response__AZN, _api__get_models_response__ALL, _api__get_models_response__DZD, _api__get_models_response__AOA, _api__get_models_response__ARS, _api__get_models_response__AMD, _api__get_models_response__AFN, _api__get_models_response__BHD, _api__get_models_response__BGN, _api__get_models_response__BOB, _api__get_models_response__BWP, _api__get_models_response__BND, _api__get_models_response__BRL, _api__get_models_response__BIF, _api__get_models_response__HUF, _api__get_models_response__VEF, _api__get_models_response__KPW, _api__get_models_response__VND, _api__get_models_response__GMD, _api__get_models_response__GHS, _api__get_models_response__GNF, _api__get_models_response__HKD, _api__get_models_response__GEL, _api__get_models_response__AED, _api__get_models_response__EGP, _api__get_models_response__ZMK, _api__get_models_response__ILS, _api__get_models_response__INR, _api__get_models_response__IDR, _api__get_models_response__JOD, _api__get_models_response__IQD, _api__get_models_response__IRR, _api__get_models_response__YER, _api__get_models_response__QAR, _api__get_models_response__KES, _api__get_models_response__KGS, _api__get_models_response__COP, _api__get_models_response__CDF, _api__get_models_response__CRC, _api__get_models_response__KWD, _api__get_models_response__CUP, _api__get_models_response__LAK, _api__get_models_response__LVL, _api__get_models_response__SLL, _api__get_models_response__LBP, _api__get_models_response__LYD, _api__get_models_response__SZL, _api__get_models_response__LTL, _api__get_models_response__MUR, _api__get_models_response__MRO, _api__get_models_response__MKD, _api__get_models_response__MWK, _api__get_models_response__MGA, _api__get_models_response__MYR, _api__get_models_response__MAD, _api__get_models_response__MXN, _api__get_models_response__MZN, _api__get_models_response__MDL, _api__get_models_response__MNT, _api__get_models_response__NPR, _api__get_models_response__NGN, _api__get_models_response__NIO, _api__get_models_response__NZD, _api__get_models_response__OMR, _api__get_models_response__PKR, _api__get_models_response__PYG, _api__get_models_response__PEN, _api__get_models_response__PLN, _api__get_models_response__KHR, _api__get_models_response__SAR, _api__get_models_response__RON, _api__get_models_response__SCR, _api__get_models_response__SYP, _api__get_models_response__SKK, _api__get_models_response__SOS, _api__get_models_response__SDG, _api__get_models_response__SRD, _api__get_models_response__TJS, _api__get_models_response__THB, _api__get_models_response__TWD, _api__get_models_response__BDT, _api__get_models_response__TZS, _api__get_models_response__TND, _api__get_models_response__TMM, _api__get_models_response__UGX, _api__get_models_response__UZS, _api__get_models_response__UYU, _api__get_models_response__PHP, _api__get_models_response__DJF, _api__get_models_response__XAF, _api__get_models_response__XOF, _api__get_models_response__HRK, _api__get_models_response__CZK, _api__get_models_response__CLP, _api__get_models_response__LKR, _api__get_models_response__EEK, _api__get_models_response__ETB, _api__get_models_response__RSD, _api__get_models_response__ZAR, _api__get_models_response__KRW, _api__get_models_response__NAD, _api__get_models_response__TL, _api__get_models_response__UE } _api__get_models_response__e;

char* get_models_response_currency_ToString(_api__get_models_response__e currency);

_api__get_models_response__e get_models_response_currency_FromString(char* currency);



typedef struct get_models_response_t {
    list_t *models; //nonprimitive container
    currency_type_t *currency; // custom
    long region_id; //numeric

} get_models_response_t;

get_models_response_t *get_models_response_create(
    list_t *models,
    currency_type_t *currency,
    long region_id
);

void get_models_response_free(get_models_response_t *get_models_response);

get_models_response_t *get_models_response_parseFromJSON(cJSON *get_models_responseJSON);

cJSON *get_models_response_convertToJSON(get_models_response_t *get_models_response);

#endif /* _get_models_response_H_ */

