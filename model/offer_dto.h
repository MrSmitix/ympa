/*
 * offer_dto.h
 *
 * Предложение.
 */

#ifndef _offer_dto_H_
#define _offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_dto_t offer_dto_t;

#include "currency_type.h"

// Enum  for offer_dto

typedef enum  { _api__offer_dto__NULL = 0, _api__offer_dto__RUR, _api__offer_dto__USD, _api__offer_dto__EUR, _api__offer_dto__UAH, _api__offer_dto__AUD, _api__offer_dto__GBP, _api__offer_dto__BYR, _api__offer_dto__BYN, _api__offer_dto__DKK, _api__offer_dto__ISK, _api__offer_dto__KZT, _api__offer_dto__CAD, _api__offer_dto__CNY, _api__offer_dto__NOK, _api__offer_dto__XDR, _api__offer_dto__SGD, _api__offer_dto___TRY, _api__offer_dto__SEK, _api__offer_dto__CHF, _api__offer_dto__JPY, _api__offer_dto__AZN, _api__offer_dto__ALL, _api__offer_dto__DZD, _api__offer_dto__AOA, _api__offer_dto__ARS, _api__offer_dto__AMD, _api__offer_dto__AFN, _api__offer_dto__BHD, _api__offer_dto__BGN, _api__offer_dto__BOB, _api__offer_dto__BWP, _api__offer_dto__BND, _api__offer_dto__BRL, _api__offer_dto__BIF, _api__offer_dto__HUF, _api__offer_dto__VEF, _api__offer_dto__KPW, _api__offer_dto__VND, _api__offer_dto__GMD, _api__offer_dto__GHS, _api__offer_dto__GNF, _api__offer_dto__HKD, _api__offer_dto__GEL, _api__offer_dto__AED, _api__offer_dto__EGP, _api__offer_dto__ZMK, _api__offer_dto__ILS, _api__offer_dto__INR, _api__offer_dto__IDR, _api__offer_dto__JOD, _api__offer_dto__IQD, _api__offer_dto__IRR, _api__offer_dto__YER, _api__offer_dto__QAR, _api__offer_dto__KES, _api__offer_dto__KGS, _api__offer_dto__COP, _api__offer_dto__CDF, _api__offer_dto__CRC, _api__offer_dto__KWD, _api__offer_dto__CUP, _api__offer_dto__LAK, _api__offer_dto__LVL, _api__offer_dto__SLL, _api__offer_dto__LBP, _api__offer_dto__LYD, _api__offer_dto__SZL, _api__offer_dto__LTL, _api__offer_dto__MUR, _api__offer_dto__MRO, _api__offer_dto__MKD, _api__offer_dto__MWK, _api__offer_dto__MGA, _api__offer_dto__MYR, _api__offer_dto__MAD, _api__offer_dto__MXN, _api__offer_dto__MZN, _api__offer_dto__MDL, _api__offer_dto__MNT, _api__offer_dto__NPR, _api__offer_dto__NGN, _api__offer_dto__NIO, _api__offer_dto__NZD, _api__offer_dto__OMR, _api__offer_dto__PKR, _api__offer_dto__PYG, _api__offer_dto__PEN, _api__offer_dto__PLN, _api__offer_dto__KHR, _api__offer_dto__SAR, _api__offer_dto__RON, _api__offer_dto__SCR, _api__offer_dto__SYP, _api__offer_dto__SKK, _api__offer_dto__SOS, _api__offer_dto__SDG, _api__offer_dto__SRD, _api__offer_dto__TJS, _api__offer_dto__THB, _api__offer_dto__TWD, _api__offer_dto__BDT, _api__offer_dto__TZS, _api__offer_dto__TND, _api__offer_dto__TMM, _api__offer_dto__UGX, _api__offer_dto__UZS, _api__offer_dto__UYU, _api__offer_dto__PHP, _api__offer_dto__DJF, _api__offer_dto__XAF, _api__offer_dto__XOF, _api__offer_dto__HRK, _api__offer_dto__CZK, _api__offer_dto__CLP, _api__offer_dto__LKR, _api__offer_dto__EEK, _api__offer_dto__ETB, _api__offer_dto__RSD, _api__offer_dto__ZAR, _api__offer_dto__KRW, _api__offer_dto__NAD, _api__offer_dto__TL, _api__offer_dto__UE } _api__offer_dto__e;

char* offer_dto_currency_ToString(_api__offer_dto__e currency);

_api__offer_dto__e offer_dto_currency_FromString(char* currency);



typedef struct offer_dto_t {
    double price; //numeric
    long feed_id; //numeric
    char *id; // string
    char *shop_category_id; // string
    int market_category_id; //numeric
    double pre_discount_price; //numeric
    int discount; //numeric
    int cut_price; //boolean
    char *url; // string
    long model_id; //numeric
    char *name; // string
    currency_type_t *currency; // custom
    double bid; //numeric
    double cbid; //numeric
    double fee; //numeric
    int blocked; //boolean

} offer_dto_t;

offer_dto_t *offer_dto_create(
    double price,
    long feed_id,
    char *id,
    char *shop_category_id,
    int market_category_id,
    double pre_discount_price,
    int discount,
    int cut_price,
    char *url,
    long model_id,
    char *name,
    currency_type_t *currency,
    double bid,
    double cbid,
    double fee,
    int blocked
);

void offer_dto_free(offer_dto_t *offer_dto);

offer_dto_t *offer_dto_parseFromJSON(cJSON *offer_dtoJSON);

cJSON *offer_dto_convertToJSON(offer_dto_t *offer_dto);

#endif /* _offer_dto_H_ */

