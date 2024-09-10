/*
 * currency_type.h
 *
 * Коды валют. Возможные значения: * &#x60;BYR&#x60; — белорусский рубль. * &#x60;KZT&#x60; — казахстанский тенге. * &#x60;RUR&#x60; — российский рубль. * &#x60;UAH&#x60; — украинская гривна. 
 */

#ifndef _currency_type_H_
#define _currency_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct currency_type_t currency_type_t;


// Enum  for currency_type

typedef enum { _api__currency_type__NULL = 0, _api__currency_type__RUR, _api__currency_type__USD, _api__currency_type__EUR, _api__currency_type__UAH, _api__currency_type__AUD, _api__currency_type__GBP, _api__currency_type__BYR, _api__currency_type__BYN, _api__currency_type__DKK, _api__currency_type__ISK, _api__currency_type__KZT, _api__currency_type__CAD, _api__currency_type__CNY, _api__currency_type__NOK, _api__currency_type__XDR, _api__currency_type__SGD, _api__currency_type___TRY, _api__currency_type__SEK, _api__currency_type__CHF, _api__currency_type__JPY, _api__currency_type__AZN, _api__currency_type__ALL, _api__currency_type__DZD, _api__currency_type__AOA, _api__currency_type__ARS, _api__currency_type__AMD, _api__currency_type__AFN, _api__currency_type__BHD, _api__currency_type__BGN, _api__currency_type__BOB, _api__currency_type__BWP, _api__currency_type__BND, _api__currency_type__BRL, _api__currency_type__BIF, _api__currency_type__HUF, _api__currency_type__VEF, _api__currency_type__KPW, _api__currency_type__VND, _api__currency_type__GMD, _api__currency_type__GHS, _api__currency_type__GNF, _api__currency_type__HKD, _api__currency_type__GEL, _api__currency_type__AED, _api__currency_type__EGP, _api__currency_type__ZMK, _api__currency_type__ILS, _api__currency_type__INR, _api__currency_type__IDR, _api__currency_type__JOD, _api__currency_type__IQD, _api__currency_type__IRR, _api__currency_type__YER, _api__currency_type__QAR, _api__currency_type__KES, _api__currency_type__KGS, _api__currency_type__COP, _api__currency_type__CDF, _api__currency_type__CRC, _api__currency_type__KWD, _api__currency_type__CUP, _api__currency_type__LAK, _api__currency_type__LVL, _api__currency_type__SLL, _api__currency_type__LBP, _api__currency_type__LYD, _api__currency_type__SZL, _api__currency_type__LTL, _api__currency_type__MUR, _api__currency_type__MRO, _api__currency_type__MKD, _api__currency_type__MWK, _api__currency_type__MGA, _api__currency_type__MYR, _api__currency_type__MAD, _api__currency_type__MXN, _api__currency_type__MZN, _api__currency_type__MDL, _api__currency_type__MNT, _api__currency_type__NPR, _api__currency_type__NGN, _api__currency_type__NIO, _api__currency_type__NZD, _api__currency_type__OMR, _api__currency_type__PKR, _api__currency_type__PYG, _api__currency_type__PEN, _api__currency_type__PLN, _api__currency_type__KHR, _api__currency_type__SAR, _api__currency_type__RON, _api__currency_type__SCR, _api__currency_type__SYP, _api__currency_type__SKK, _api__currency_type__SOS, _api__currency_type__SDG, _api__currency_type__SRD, _api__currency_type__TJS, _api__currency_type__THB, _api__currency_type__TWD, _api__currency_type__BDT, _api__currency_type__TZS, _api__currency_type__TND, _api__currency_type__TMM, _api__currency_type__UGX, _api__currency_type__UZS, _api__currency_type__UYU, _api__currency_type__PHP, _api__currency_type__DJF, _api__currency_type__XAF, _api__currency_type__XOF, _api__currency_type__HRK, _api__currency_type__CZK, _api__currency_type__CLP, _api__currency_type__LKR, _api__currency_type__EEK, _api__currency_type__ETB, _api__currency_type__RSD, _api__currency_type__ZAR, _api__currency_type__KRW, _api__currency_type__NAD, _api__currency_type__TL, _api__currency_type__UE } _api__currency_type__e;

char* currency_type_currency_type_ToString(_api__currency_type__e currency_type);

_api__currency_type__e currency_type_currency_type_FromString(char* currency_type);

//cJSON *currency_type_currency_type_convertToJSON(_api__currency_type__e currency_type);

//_api__currency_type__e currency_type_currency_type_parseFromJSON(cJSON *currency_typeJSON);

#endif /* _currency_type_H_ */

