#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ModelsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for ModelsAPI_getModel

static char* getModel__ToString(_api__getModel_currency_e ){
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return Array[];
}

static _api__getModel_currency_e getModel__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getModel__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getModel__convertToJSON(_api__getModel_currency_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getModel__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getModel_currency_e getModel__parseFromJSON(cJSON* JSON) {
    _api__getModel_currency_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ModelsAPI_getModelOffers

static char* getModelOffers__ToString(_api__getModelOffers_currency_e ){
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return Array[];
}

static _api__getModelOffers_currency_e getModelOffers__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getModelOffers__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getModelOffers__convertToJSON(_api__getModelOffers_currency_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getModelOffers__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getModelOffers_currency_e getModelOffers__parseFromJSON(cJSON* JSON) {
    _api__getModelOffers_currency_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ModelsAPI_getModelOffers

static char* getModelOffers__ToString(_api__getModelOffers_orderByPrice_e ){
    char *Array[] =  { "NULL", "ASC", "DESC" };
    return Array[];
}

static _api__getModelOffers_orderByPrice_e getModelOffers__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ASC", "DESC" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getModelOffers__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getModelOffers__convertToJSON(_api__getModelOffers_orderByPrice_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getModelOffers__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getModelOffers_orderByPrice_e getModelOffers__parseFromJSON(cJSON* JSON) {
    _api__getModelOffers_orderByPrice_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ModelsAPI_getModels

static char* getModels__ToString(_api__getModels_currency_e ){
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return Array[];
}

static _api__getModels_currency_e getModels__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getModels__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getModels__convertToJSON(_api__getModels_currency_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getModels__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getModels_currency_e getModels__parseFromJSON(cJSON* JSON) {
    _api__getModels_currency_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ModelsAPI_getModelsOffers

static char* getModelsOffers__ToString(_api__getModelsOffers_currency_e ){
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return Array[];
}

static _api__getModelsOffers_currency_e getModelsOffers__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getModelsOffers__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getModelsOffers__convertToJSON(_api__getModelsOffers_currency_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getModelsOffers__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getModelsOffers_currency_e getModelsOffers__parseFromJSON(cJSON* JSON) {
    _api__getModelsOffers_currency_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ModelsAPI_getModelsOffers

static char* getModelsOffers__ToString(_api__getModelsOffers_orderByPrice_e ){
    char *Array[] =  { "NULL", "ASC", "DESC" };
    return Array[];
}

static _api__getModelsOffers_orderByPrice_e getModelsOffers__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ASC", "DESC" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getModelsOffers__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getModelsOffers__convertToJSON(_api__getModelsOffers_orderByPrice_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getModelsOffers__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getModelsOffers_orderByPrice_e getModelsOffers__parseFromJSON(cJSON* JSON) {
    _api__getModelsOffers_orderByPrice_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ModelsAPI_searchModels

static char* searchModels__ToString(_api__searchModels_currency_e ){
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return Array[];
}

static _api__searchModels_currency_e searchModels__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function searchModels__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *searchModels__convertToJSON(_api__searchModels_currency_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function searchModels__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__searchModels_currency_e searchModels__parseFromJSON(cJSON* JSON) {
    _api__searchModels_currency_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Информация об одной модели
//
// Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_response_t*
ModelsAPI_getModel(apiClient_t *apiClient, long modelId, long regionId, currency_type_e currency)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models/{modelId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models/{modelId}");


    // Path Params
    long sizeOfPathParams_modelId = sizeof(modelId)+3 + strlen("{ modelId }");
    if(modelId == 0){
        goto end;
    }
    char* localVarToReplace_modelId = malloc(sizeOfPathParams_modelId);
    snprintf(localVarToReplace_modelId, sizeOfPathParams_modelId, "{%s}", "modelId");

    char localVarBuff_modelId[256];
    intToStr(localVarBuff_modelId, modelId);

    localVarPath = strReplace(localVarPath, localVarToReplace_modelId, localVarBuff_modelId);




    // query parameters
    char *keyQuery_regionId = NULL;
    long valueQuery_regionId ;
    keyValuePair_t *keyPairQuery_regionId = 0;
    if (regionId)
    {
        keyQuery_regionId = strdup("regionId");
        valueQuery_regionId = (regionId);
        keyPairQuery_regionId = keyValuePair_create(keyQuery_regionId, &valueQuery_regionId);
        list_addElement(localVarQueryParameters,keyPairQuery_regionId);
    }

    // query parameters
    char *keyQuery_currency = NULL;
    currency_type_e valueQuery_currency ;
    keyValuePair_t *keyPairQuery_currency = 0;
    if (currency)
    {
        keyQuery_currency = strdup("currency");
        valueQuery_currency = (currency);
        keyPairQuery_currency = keyValuePair_create(keyQuery_currency, (void *)strdup(getModel__ToString(
        &valueQuery_currency)));
        list_addElement(localVarQueryParameters,keyPairQuery_currency);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Информация о модели.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ModelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_response_t *elementToReturn = get_models_response_parseFromJSON(ModelsAPIlocalVarJSON);
    cJSON_Delete(ModelsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_modelId);
    if(keyQuery_regionId){
        free(keyQuery_regionId);
        keyQuery_regionId = NULL;
    }
    if(keyPairQuery_regionId){
        keyValuePair_free(keyPairQuery_regionId);
        keyPairQuery_regionId = NULL;
    }
    if(keyQuery_currency){
        free(keyQuery_currency);
        keyQuery_currency = NULL;
    }
    if(keyPairQuery_currency){
        keyValuePair_free(keyPairQuery_currency);
        keyPairQuery_currency = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список предложений для одной модели
//
// Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_offers_response_t*
ModelsAPI_getModelOffers(apiClient_t *apiClient, long modelId, long regionId, currency_type_e currency, sort_order_type_e orderByPrice, int *count, int *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models/{modelId}/offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models/{modelId}/offers");


    // Path Params
    long sizeOfPathParams_modelId = sizeof(modelId)+3 + strlen("{ modelId }");
    if(modelId == 0){
        goto end;
    }
    char* localVarToReplace_modelId = malloc(sizeOfPathParams_modelId);
    snprintf(localVarToReplace_modelId, sizeOfPathParams_modelId, "{%s}", "modelId");

    char localVarBuff_modelId[256];
    intToStr(localVarBuff_modelId, modelId);

    localVarPath = strReplace(localVarPath, localVarToReplace_modelId, localVarBuff_modelId);




    // query parameters
    char *keyQuery_regionId = NULL;
    long valueQuery_regionId ;
    keyValuePair_t *keyPairQuery_regionId = 0;
    if (regionId)
    {
        keyQuery_regionId = strdup("regionId");
        valueQuery_regionId = (regionId);
        keyPairQuery_regionId = keyValuePair_create(keyQuery_regionId, &valueQuery_regionId);
        list_addElement(localVarQueryParameters,keyPairQuery_regionId);
    }

    // query parameters
    char *keyQuery_currency = NULL;
    currency_type_e valueQuery_currency ;
    keyValuePair_t *keyPairQuery_currency = 0;
    if (currency)
    {
        keyQuery_currency = strdup("currency");
        valueQuery_currency = (currency);
        keyPairQuery_currency = keyValuePair_create(keyQuery_currency, (void *)strdup(getModelOffers__ToString(
        &valueQuery_currency)));
        list_addElement(localVarQueryParameters,keyPairQuery_currency);
    }

    // query parameters
    char *keyQuery_orderByPrice = NULL;
    sort_order_type_e valueQuery_orderByPrice ;
    keyValuePair_t *keyPairQuery_orderByPrice = 0;
    if (orderByPrice)
    {
        keyQuery_orderByPrice = strdup("orderByPrice");
        valueQuery_orderByPrice = (orderByPrice);
        keyPairQuery_orderByPrice = keyValuePair_create(keyQuery_orderByPrice, (void *)strdup(getModelOffers__ToString(
        &valueQuery_orderByPrice)));
        list_addElement(localVarQueryParameters,keyPairQuery_orderByPrice);
    }

    // query parameters
    char *keyQuery_count = NULL;
    char * valueQuery_count = NULL;
    keyValuePair_t *keyPairQuery_count = 0;
    if (count)
    {
        keyQuery_count = strdup("count");
        valueQuery_count = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_count, MAX_NUMBER_LENGTH, "%d", *count);
        keyPairQuery_count = keyValuePair_create(keyQuery_count, valueQuery_count);
        list_addElement(localVarQueryParameters,keyPairQuery_count);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page, MAX_NUMBER_LENGTH, "%d", *page);
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Список предложений для модели.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ModelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_offers_response_t *elementToReturn = get_models_offers_response_parseFromJSON(ModelsAPIlocalVarJSON);
    cJSON_Delete(ModelsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_modelId);
    if(keyQuery_regionId){
        free(keyQuery_regionId);
        keyQuery_regionId = NULL;
    }
    if(keyPairQuery_regionId){
        keyValuePair_free(keyPairQuery_regionId);
        keyPairQuery_regionId = NULL;
    }
    if(keyQuery_currency){
        free(keyQuery_currency);
        keyQuery_currency = NULL;
    }
    if(keyPairQuery_currency){
        keyValuePair_free(keyPairQuery_currency);
        keyPairQuery_currency = NULL;
    }
    if(keyQuery_orderByPrice){
        free(keyQuery_orderByPrice);
        keyQuery_orderByPrice = NULL;
    }
    if(keyPairQuery_orderByPrice){
        keyValuePair_free(keyPairQuery_orderByPrice);
        keyPairQuery_orderByPrice = NULL;
    }
    if(keyQuery_count){
        free(keyQuery_count);
        keyQuery_count = NULL;
    }
    if(valueQuery_count){
        free(valueQuery_count);
        valueQuery_count = NULL;
    }
    if(keyPairQuery_count){
        keyValuePair_free(keyPairQuery_count);
        keyPairQuery_count = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о нескольких моделях
//
// Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_response_t*
ModelsAPI_getModels(apiClient_t *apiClient, long regionId, get_models_request_t *get_models_request, currency_type_e currency)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models");




    // query parameters
    char *keyQuery_regionId = NULL;
    long valueQuery_regionId ;
    keyValuePair_t *keyPairQuery_regionId = 0;
    if (regionId)
    {
        keyQuery_regionId = strdup("regionId");
        valueQuery_regionId = (regionId);
        keyPairQuery_regionId = keyValuePair_create(keyQuery_regionId, &valueQuery_regionId);
        list_addElement(localVarQueryParameters,keyPairQuery_regionId);
    }

    // query parameters
    char *keyQuery_currency = NULL;
    currency_type_e valueQuery_currency ;
    keyValuePair_t *keyPairQuery_currency = 0;
    if (currency)
    {
        keyQuery_currency = strdup("currency");
        valueQuery_currency = (currency);
        keyPairQuery_currency = keyValuePair_create(keyQuery_currency, (void *)strdup(getModels__ToString(
        &valueQuery_currency)));
        list_addElement(localVarQueryParameters,keyPairQuery_currency);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_models_request = NULL;
    if (get_models_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_models_request = get_models_request_convertToJSON(get_models_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_models_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Информация о моделях.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ModelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_response_t *elementToReturn = get_models_response_parseFromJSON(ModelsAPIlocalVarJSON);
    cJSON_Delete(ModelsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_get_models_request) {
        cJSON_Delete(localVarSingleItemJSON_get_models_request);
        localVarSingleItemJSON_get_models_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_regionId){
        free(keyQuery_regionId);
        keyQuery_regionId = NULL;
    }
    if(keyPairQuery_regionId){
        keyValuePair_free(keyPairQuery_regionId);
        keyPairQuery_regionId = NULL;
    }
    if(keyQuery_currency){
        free(keyQuery_currency);
        keyQuery_currency = NULL;
    }
    if(keyPairQuery_currency){
        keyValuePair_free(keyPairQuery_currency);
        keyPairQuery_currency = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список предложений для нескольких моделей
//
// Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_offers_response_t*
ModelsAPI_getModelsOffers(apiClient_t *apiClient, long regionId, get_models_request_t *get_models_request, currency_type_e currency, sort_order_type_e orderByPrice)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models/offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models/offers");




    // query parameters
    char *keyQuery_regionId = NULL;
    long valueQuery_regionId ;
    keyValuePair_t *keyPairQuery_regionId = 0;
    if (regionId)
    {
        keyQuery_regionId = strdup("regionId");
        valueQuery_regionId = (regionId);
        keyPairQuery_regionId = keyValuePair_create(keyQuery_regionId, &valueQuery_regionId);
        list_addElement(localVarQueryParameters,keyPairQuery_regionId);
    }

    // query parameters
    char *keyQuery_currency = NULL;
    currency_type_e valueQuery_currency ;
    keyValuePair_t *keyPairQuery_currency = 0;
    if (currency)
    {
        keyQuery_currency = strdup("currency");
        valueQuery_currency = (currency);
        keyPairQuery_currency = keyValuePair_create(keyQuery_currency, (void *)strdup(getModelsOffers__ToString(
        &valueQuery_currency)));
        list_addElement(localVarQueryParameters,keyPairQuery_currency);
    }

    // query parameters
    char *keyQuery_orderByPrice = NULL;
    sort_order_type_e valueQuery_orderByPrice ;
    keyValuePair_t *keyPairQuery_orderByPrice = 0;
    if (orderByPrice)
    {
        keyQuery_orderByPrice = strdup("orderByPrice");
        valueQuery_orderByPrice = (orderByPrice);
        keyPairQuery_orderByPrice = keyValuePair_create(keyQuery_orderByPrice, (void *)strdup(getModelsOffers__ToString(
        &valueQuery_orderByPrice)));
        list_addElement(localVarQueryParameters,keyPairQuery_orderByPrice);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_models_request = NULL;
    if (get_models_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_models_request = get_models_request_convertToJSON(get_models_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_models_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Список предложений для моделей.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ModelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_offers_response_t *elementToReturn = get_models_offers_response_parseFromJSON(ModelsAPIlocalVarJSON);
    cJSON_Delete(ModelsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_get_models_request) {
        cJSON_Delete(localVarSingleItemJSON_get_models_request);
        localVarSingleItemJSON_get_models_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_regionId){
        free(keyQuery_regionId);
        keyQuery_regionId = NULL;
    }
    if(keyPairQuery_regionId){
        keyValuePair_free(keyPairQuery_regionId);
        keyPairQuery_regionId = NULL;
    }
    if(keyQuery_currency){
        free(keyQuery_currency);
        keyQuery_currency = NULL;
    }
    if(keyPairQuery_currency){
        keyValuePair_free(keyPairQuery_currency);
        keyPairQuery_currency = NULL;
    }
    if(keyQuery_orderByPrice){
        free(keyQuery_orderByPrice);
        keyQuery_orderByPrice = NULL;
    }
    if(keyPairQuery_orderByPrice){
        keyValuePair_free(keyPairQuery_orderByPrice);
        keyPairQuery_orderByPrice = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Поиск модели товара
//
// Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
search_models_response_t*
ModelsAPI_searchModels(apiClient_t *apiClient, char *query, long regionId, currency_type_e currency, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/models")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/models");




    // query parameters
    char *keyQuery_query = NULL;
    char * valueQuery_query = NULL;
    keyValuePair_t *keyPairQuery_query = 0;
    if (query)
    {
        keyQuery_query = strdup("query");
        valueQuery_query = strdup((query));
        keyPairQuery_query = keyValuePair_create(keyQuery_query, valueQuery_query);
        list_addElement(localVarQueryParameters,keyPairQuery_query);
    }

    // query parameters
    char *keyQuery_regionId = NULL;
    long valueQuery_regionId ;
    keyValuePair_t *keyPairQuery_regionId = 0;
    if (regionId)
    {
        keyQuery_regionId = strdup("regionId");
        valueQuery_regionId = (regionId);
        keyPairQuery_regionId = keyValuePair_create(keyQuery_regionId, &valueQuery_regionId);
        list_addElement(localVarQueryParameters,keyPairQuery_regionId);
    }

    // query parameters
    char *keyQuery_currency = NULL;
    currency_type_e valueQuery_currency ;
    keyValuePair_t *keyPairQuery_currency = 0;
    if (currency)
    {
        keyQuery_currency = strdup("currency");
        valueQuery_currency = (currency);
        keyPairQuery_currency = keyValuePair_create(keyQuery_currency, (void *)strdup(searchModels__ToString(
        &valueQuery_currency)));
        list_addElement(localVarQueryParameters,keyPairQuery_currency);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page, MAX_NUMBER_LENGTH, "%d", *page);
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }

    // query parameters
    char *keyQuery_pageSize = NULL;
    char * valueQuery_pageSize = NULL;
    keyValuePair_t *keyPairQuery_pageSize = 0;
    if (pageSize)
    {
        keyQuery_pageSize = strdup("pageSize");
        valueQuery_pageSize = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pageSize, MAX_NUMBER_LENGTH, "%d", *pageSize);
        keyPairQuery_pageSize = keyValuePair_create(keyQuery_pageSize, valueQuery_pageSize);
        list_addElement(localVarQueryParameters,keyPairQuery_pageSize);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Информация о моделях.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Запрос содержит неправильные данные.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","В запросе не указаны данные для авторизации.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Данные для авторизации неверны или доступ к ресурсу запрещен.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Запрашиваемый ресурс не найден.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *ModelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    search_models_response_t *elementToReturn = search_models_response_parseFromJSON(ModelsAPIlocalVarJSON);
    cJSON_Delete(ModelsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_query){
        free(keyQuery_query);
        keyQuery_query = NULL;
    }
    if(valueQuery_query){
        free(valueQuery_query);
        valueQuery_query = NULL;
    }
    if(keyPairQuery_query){
        keyValuePair_free(keyPairQuery_query);
        keyPairQuery_query = NULL;
    }
    if(keyQuery_regionId){
        free(keyQuery_regionId);
        keyQuery_regionId = NULL;
    }
    if(keyPairQuery_regionId){
        keyValuePair_free(keyPairQuery_regionId);
        keyPairQuery_regionId = NULL;
    }
    if(keyQuery_currency){
        free(keyQuery_currency);
        keyQuery_currency = NULL;
    }
    if(keyPairQuery_currency){
        keyValuePair_free(keyPairQuery_currency);
        keyPairQuery_currency = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    if(keyQuery_pageSize){
        free(keyQuery_pageSize);
        keyQuery_pageSize = NULL;
    }
    if(valueQuery_pageSize){
        free(valueQuery_pageSize);
        valueQuery_pageSize = NULL;
    }
    if(keyPairQuery_pageSize){
        keyValuePair_free(keyPairQuery_pageSize);
        keyPairQuery_pageSize = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

