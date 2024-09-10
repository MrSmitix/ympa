#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "DbsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for DbsAPI_generateBoostConsolidatedReport

static char* generateBoostConsolidatedReport__ToString(_api__generateBoostConsolidatedReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateBoostConsolidatedReport_format_e generateBoostConsolidatedReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateBoostConsolidatedReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateBoostConsolidatedReport__convertToJSON(_api__generateBoostConsolidatedReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateBoostConsolidatedReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateBoostConsolidatedReport_format_e generateBoostConsolidatedReport__parseFromJSON(cJSON* JSON) {
    _api__generateBoostConsolidatedReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateCompetitorsPositionReport

static char* generateCompetitorsPositionReport__ToString(_api__generateCompetitorsPositionReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateCompetitorsPositionReport_format_e generateCompetitorsPositionReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateCompetitorsPositionReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateCompetitorsPositionReport__convertToJSON(_api__generateCompetitorsPositionReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateCompetitorsPositionReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateCompetitorsPositionReport_format_e generateCompetitorsPositionReport__parseFromJSON(cJSON* JSON) {
    _api__generateCompetitorsPositionReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateGoodsFeedbackReport

static char* generateGoodsFeedbackReport__ToString(_api__generateGoodsFeedbackReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateGoodsFeedbackReport_format_e generateGoodsFeedbackReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateGoodsFeedbackReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateGoodsFeedbackReport__convertToJSON(_api__generateGoodsFeedbackReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateGoodsFeedbackReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateGoodsFeedbackReport_format_e generateGoodsFeedbackReport__parseFromJSON(cJSON* JSON) {
    _api__generateGoodsFeedbackReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateMassOrderLabelsReport

static char* generateMassOrderLabelsReport__ToString(_api__generateMassOrderLabelsReport_format_e ){
    char *Array[] =  { "NULL", "A7", "A4" };
    return Array[];
}

static _api__generateMassOrderLabelsReport_format_e generateMassOrderLabelsReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "A7", "A4" };
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
// Function generateMassOrderLabelsReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateMassOrderLabelsReport__convertToJSON(_api__generateMassOrderLabelsReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateMassOrderLabelsReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateMassOrderLabelsReport_format_e generateMassOrderLabelsReport__parseFromJSON(cJSON* JSON) {
    _api__generateMassOrderLabelsReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateOrderLabel

static char* generateOrderLabel__ToString(_api__generateOrderLabel_format_e ){
    char *Array[] =  { "NULL", "A7", "A4" };
    return Array[];
}

static _api__generateOrderLabel_format_e generateOrderLabel__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "A7", "A4" };
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
// Function generateOrderLabel__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateOrderLabel__convertToJSON(_api__generateOrderLabel_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateOrderLabel__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateOrderLabel_format_e generateOrderLabel__parseFromJSON(cJSON* JSON) {
    _api__generateOrderLabel_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateOrderLabels

static char* generateOrderLabels__ToString(_api__generateOrderLabels_format_e ){
    char *Array[] =  { "NULL", "A7", "A4" };
    return Array[];
}

static _api__generateOrderLabels_format_e generateOrderLabels__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "A7", "A4" };
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
// Function generateOrderLabels__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateOrderLabels__convertToJSON(_api__generateOrderLabels_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateOrderLabels__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateOrderLabels_format_e generateOrderLabels__parseFromJSON(cJSON* JSON) {
    _api__generateOrderLabels_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generatePricesReport

static char* generatePricesReport__ToString(_api__generatePricesReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generatePricesReport_format_e generatePricesReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generatePricesReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generatePricesReport__convertToJSON(_api__generatePricesReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generatePricesReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generatePricesReport_format_e generatePricesReport__parseFromJSON(cJSON* JSON) {
    _api__generatePricesReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateShelfsStatisticsReport

static char* generateShelfsStatisticsReport__ToString(_api__generateShelfsStatisticsReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateShelfsStatisticsReport_format_e generateShelfsStatisticsReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateShelfsStatisticsReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateShelfsStatisticsReport__convertToJSON(_api__generateShelfsStatisticsReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateShelfsStatisticsReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateShelfsStatisticsReport_format_e generateShelfsStatisticsReport__parseFromJSON(cJSON* JSON) {
    _api__generateShelfsStatisticsReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateShowsSalesReport

static char* generateShowsSalesReport__ToString(_api__generateShowsSalesReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateShowsSalesReport_format_e generateShowsSalesReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateShowsSalesReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateShowsSalesReport__convertToJSON(_api__generateShowsSalesReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateShowsSalesReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateShowsSalesReport_format_e generateShowsSalesReport__parseFromJSON(cJSON* JSON) {
    _api__generateShowsSalesReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateStocksOnWarehousesReport

static char* generateStocksOnWarehousesReport__ToString(_api__generateStocksOnWarehousesReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateStocksOnWarehousesReport_format_e generateStocksOnWarehousesReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateStocksOnWarehousesReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateStocksOnWarehousesReport__convertToJSON(_api__generateStocksOnWarehousesReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateStocksOnWarehousesReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateStocksOnWarehousesReport_format_e generateStocksOnWarehousesReport__parseFromJSON(cJSON* JSON) {
    _api__generateStocksOnWarehousesReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateUnitedMarketplaceServicesReport

static char* generateUnitedMarketplaceServicesReport__ToString(_api__generateUnitedMarketplaceServicesReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateUnitedMarketplaceServicesReport_format_e generateUnitedMarketplaceServicesReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateUnitedMarketplaceServicesReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateUnitedMarketplaceServicesReport__convertToJSON(_api__generateUnitedMarketplaceServicesReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateUnitedMarketplaceServicesReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateUnitedMarketplaceServicesReport_format_e generateUnitedMarketplaceServicesReport__parseFromJSON(cJSON* JSON) {
    _api__generateUnitedMarketplaceServicesReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateUnitedNettingReport

static char* generateUnitedNettingReport__ToString(_api__generateUnitedNettingReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateUnitedNettingReport_format_e generateUnitedNettingReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateUnitedNettingReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateUnitedNettingReport__convertToJSON(_api__generateUnitedNettingReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateUnitedNettingReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateUnitedNettingReport_format_e generateUnitedNettingReport__parseFromJSON(cJSON* JSON) {
    _api__generateUnitedNettingReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_generateUnitedOrdersReport

static char* generateUnitedOrdersReport__ToString(_api__generateUnitedOrdersReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateUnitedOrdersReport_format_e generateUnitedOrdersReport__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "FILE", "CSV" };
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
// Function generateUnitedOrdersReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateUnitedOrdersReport__convertToJSON(_api__generateUnitedOrdersReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateUnitedOrdersReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateUnitedOrdersReport_format_e generateUnitedOrdersReport__parseFromJSON(cJSON* JSON) {
    _api__generateUnitedOrdersReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_getFeedIndexLogs

static char* getFeedIndexLogs__ToString(_api__getFeedIndexLogs_status_e ){
    char *Array[] =  { "NULL", "ERROR", "OK", "WARNING" };
    return Array[];
}

static _api__getFeedIndexLogs_status_e getFeedIndexLogs__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ERROR", "OK", "WARNING" };
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
// Function getFeedIndexLogs__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getFeedIndexLogs__convertToJSON(_api__getFeedIndexLogs_status_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getFeedIndexLogs__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getFeedIndexLogs_status_e getFeedIndexLogs__parseFromJSON(cJSON* JSON) {
    _api__getFeedIndexLogs_status_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_getModel

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

// Functions for enum  for DbsAPI_getModelOffers

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

// Functions for enum  for DbsAPI_getModelOffers

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

// Functions for enum  for DbsAPI_getModels

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

// Functions for enum  for DbsAPI_getModelsOffers

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

// Functions for enum  for DbsAPI_getModelsOffers

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

// Functions for enum  for DbsAPI_getOfferMappingEntries

static char* getOfferMappingEntries__ToString(_api__getOfferMappingEntries_mapping_kind_e ){
    char *Array[] =  { "NULL", "ACTIVE", "ALL" };
    return Array[];
}

static _api__getOfferMappingEntries_mapping_kind_e getOfferMappingEntries__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ACTIVE", "ALL" };
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
// Function getOfferMappingEntries__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOfferMappingEntries__convertToJSON(_api__getOfferMappingEntries_mapping_kind_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOfferMappingEntries__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOfferMappingEntries_mapping_kind_e getOfferMappingEntries__parseFromJSON(cJSON* JSON) {
    _api__getOfferMappingEntries_mapping_kind_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum STATUS for DbsAPI_getOfferMappingEntries

static char* getOfferMappingEntries_STATUS_ToString(_api__getOfferMappingEntries_status_e STATUS){
    char *STATUSArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    return STATUSArray[STATUS];
}

static _api__getOfferMappingEntries_status_e getOfferMappingEntries_STATUS_FromString(char* STATUS){
    int stringToReturn = 0;
    char *STATUSArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    size_t sizeofArray = sizeof(STATUSArray) / sizeof(STATUSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(STATUS, STATUSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOfferMappingEntries_STATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOfferMappingEntries_STATUS_convertToJSON(_api__getOfferMappingEntries_status_e STATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOfferMappingEntries_STATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOfferMappingEntries_status_e getOfferMappingEntries_STATUS_parseFromJSON(cJSON* STATUSJSON) {
    _api__getOfferMappingEntries_status_e STATUSVariable = 0;
    return STATUSVariable;
end:
    return 0;
}
*/

// Functions for enum AVAILABILITY for DbsAPI_getOfferMappingEntries

static char* getOfferMappingEntries_AVAILABILITY_ToString(_api__getOfferMappingEntries_availability_e AVAILABILITY){
    char *AVAILABILITYArray[] =  { "NULL", "ACTIVE", "INACTIVE", "DELISTED" };
    return AVAILABILITYArray[AVAILABILITY];
}

static _api__getOfferMappingEntries_availability_e getOfferMappingEntries_AVAILABILITY_FromString(char* AVAILABILITY){
    int stringToReturn = 0;
    char *AVAILABILITYArray[] =  { "NULL", "ACTIVE", "INACTIVE", "DELISTED" };
    size_t sizeofArray = sizeof(AVAILABILITYArray) / sizeof(AVAILABILITYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(AVAILABILITY, AVAILABILITYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOfferMappingEntries_AVAILABILITY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOfferMappingEntries_AVAILABILITY_convertToJSON(_api__getOfferMappingEntries_availability_e AVAILABILITY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOfferMappingEntries_AVAILABILITY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOfferMappingEntries_availability_e getOfferMappingEntries_AVAILABILITY_parseFromJSON(cJSON* AVAILABILITYJSON) {
    _api__getOfferMappingEntries_availability_e AVAILABILITYVariable = 0;
    return AVAILABILITYVariable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_getOffers

static char* getOffers__ToString(_api__getOffers_currency_e ){
    char *Array[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return Array[];
}

static _api__getOffers_currency_e getOffers__FromString(char* ){
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
// Function getOffers__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOffers__convertToJSON(_api__getOffers_currency_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOffers__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOffers_currency_e getOffers__parseFromJSON(cJSON* JSON) {
    _api__getOffers_currency_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum STATUS for DbsAPI_getOrders

static char* getOrders_STATUS_ToString(_api__getOrders_status_e STATUS){
    char *STATUSArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    return STATUSArray[STATUS];
}

static _api__getOrders_status_e getOrders_STATUS_FromString(char* STATUS){
    int stringToReturn = 0;
    char *STATUSArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    size_t sizeofArray = sizeof(STATUSArray) / sizeof(STATUSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(STATUS, STATUSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOrders_STATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders_STATUS_convertToJSON(_api__getOrders_status_e STATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders_STATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_status_e getOrders_STATUS_parseFromJSON(cJSON* STATUSJSON) {
    _api__getOrders_status_e STATUSVariable = 0;
    return STATUSVariable;
end:
    return 0;
}
*/

// Functions for enum SUBSTATUS for DbsAPI_getOrders

static char* getOrders_SUBSTATUS_ToString(_api__getOrders_substatus_e SUBSTATUS){
    char *SUBSTATUSArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    return SUBSTATUSArray[SUBSTATUS];
}

static _api__getOrders_substatus_e getOrders_SUBSTATUS_FromString(char* SUBSTATUS){
    int stringToReturn = 0;
    char *SUBSTATUSArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    size_t sizeofArray = sizeof(SUBSTATUSArray) / sizeof(SUBSTATUSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SUBSTATUS, SUBSTATUSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getOrders_SUBSTATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders_SUBSTATUS_convertToJSON(_api__getOrders_substatus_e SUBSTATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders_SUBSTATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_substatus_e getOrders_SUBSTATUS_parseFromJSON(cJSON* SUBSTATUSJSON) {
    _api__getOrders_substatus_e SUBSTATUSVariable = 0;
    return SUBSTATUSVariable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_getOrders

static char* getOrders__ToString(_api__getOrders_dispatchType_e ){
    char *Array[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
    return Array[];
}

static _api__getOrders_dispatchType_e getOrders__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
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
// Function getOrders__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders__convertToJSON(_api__getOrders_dispatchType_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_dispatchType_e getOrders__parseFromJSON(cJSON* JSON) {
    _api__getOrders_dispatchType_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_getOrders

static char* getOrders__ToString(_api__getOrders_buyerType_e ){
    char *Array[] =  { "NULL", "PERSON", "BUSINESS" };
    return Array[];
}

static _api__getOrders_buyerType_e getOrders__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "PERSON", "BUSINESS" };
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
// Function getOrders__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getOrders__convertToJSON(_api__getOrders_buyerType_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getOrders__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getOrders_buyerType_e getOrders__parseFromJSON(cJSON* JSON) {
    _api__getOrders_buyerType_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum STATUSES for DbsAPI_getReturns

static char* getReturns_STATUSES_ToString(_api__getReturns_statuses_e STATUSES){
    char *STATUSESArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    return STATUSESArray[STATUSES];
}

static _api__getReturns_statuses_e getReturns_STATUSES_FromString(char* STATUSES){
    int stringToReturn = 0;
    char *STATUSESArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    size_t sizeofArray = sizeof(STATUSESArray) / sizeof(STATUSESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(STATUSES, STATUSESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getReturns_STATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getReturns_STATUSES_convertToJSON(_api__getReturns_statuses_e STATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getReturns_STATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getReturns_statuses_e getReturns_STATUSES_parseFromJSON(cJSON* STATUSESJSON) {
    _api__getReturns_statuses_e STATUSESVariable = 0;
    return STATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_getReturns

static char* getReturns__ToString(_api__getReturns_type_e ){
    char *Array[] =  { "NULL", "UNREDEEMED", "RETURN" };
    return Array[];
}

static _api__getReturns_type_e getReturns__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "UNREDEEMED", "RETURN" };
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
// Function getReturns__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getReturns__convertToJSON(_api__getReturns_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getReturns__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__getReturns_type_e getReturns__parseFromJSON(cJSON* JSON) {
    _api__getReturns_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for DbsAPI_searchModels

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


// Отмена заказа покупателем
//
// Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.  Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.  Если заказ уже передан службе доставки (принимает статус `DELIVERY` или `PICKUP`) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.  Чтобы узнать, какие заказы были отменены в статусе `DELIVERY` или `PICKUP`, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр `onlyWaitingForCancellationApprove=true`. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.  Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.  |**⚙️ Лимит:** 500 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_acceptOrderCancellation(apiClient_t *apiClient, long campaignId, long orderId, accept_order_cancellation_request_t *accept_order_cancellation_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_accept_order_cancellation_request = NULL;
    if (accept_order_cancellation_request != NULL)
    {
        //string
        localVarSingleItemJSON_accept_order_cancellation_request = accept_order_cancellation_request_convertToJSON(accept_order_cancellation_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_accept_order_cancellation_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Ответ на отмену заказа был успешно передан.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_accept_order_cancellation_request) {
        cJSON_Delete(localVarSingleItemJSON_accept_order_cancellation_request);
        localVarSingleItemJSON_accept_order_cancellation_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Скрытие товаров и настройки скрытия
//
// Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_addHiddenOffers(apiClient_t *apiClient, long campaignId, add_hidden_offers_request_t *add_hidden_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/hidden-offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/hidden-offers");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_add_hidden_offers_request = NULL;
    if (add_hidden_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_add_hidden_offers_request = add_hidden_offers_request_convertToJSON(add_hidden_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_add_hidden_offers_request);
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
    //    printf("%s\n","Настройки скрытия получены и скоро вступят в силу.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_add_hidden_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_add_hidden_offers_request);
        localVarSingleItemJSON_add_hidden_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление товаров в архив
//
// Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
add_offers_to_archive_response_t*
DbsAPI_addOffersToArchive(apiClient_t *apiClient, long businessId, add_offers_to_archive_request_t *add_offers_to_archive_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/archive")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/archive");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_add_offers_to_archive_request = NULL;
    if (add_offers_to_archive_request != NULL)
    {
        //string
        localVarSingleItemJSON_add_offers_to_archive_request = add_offers_to_archive_request_convertToJSON(add_offers_to_archive_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_add_offers_to_archive_request);
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
    //    printf("%s\n","Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    add_offers_to_archive_response_t *elementToReturn = add_offers_to_archive_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_add_offers_to_archive_request) {
        cJSON_Delete(localVarSingleItemJSON_add_offers_to_archive_request);
        localVarSingleItemJSON_add_offers_to_archive_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Калькулятор стоимости услуг
//
// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
calculate_tariffs_response_t*
DbsAPI_calculateTariffs(apiClient_t *apiClient, calculate_tariffs_request_t *calculate_tariffs_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tariffs/calculate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tariffs/calculate");




    // Body Param
    cJSON *localVarSingleItemJSON_calculate_tariffs_request = NULL;
    if (calculate_tariffs_request != NULL)
    {
        //string
        localVarSingleItemJSON_calculate_tariffs_request = calculate_tariffs_request_convertToJSON(calculate_tariffs_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_calculate_tariffs_request);
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
    //    printf("%s\n","Стоимость услуг.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    calculate_tariffs_response_t *elementToReturn = calculate_tariffs_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_calculate_tariffs_request) {
        cJSON_Delete(localVarSingleItemJSON_calculate_tariffs_request);
        localVarSingleItemJSON_calculate_tariffs_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товара из карантина по цене в кабинете
//
// Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
empty_api_response_t*
DbsAPI_confirmBusinessPrices(apiClient_t *apiClient, long businessId, confirm_prices_request_t *confirm_prices_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/price-quarantine/confirm")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/price-quarantine/confirm");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_confirm_prices_request = NULL;
    if (confirm_prices_request != NULL)
    {
        //string
        localVarSingleItemJSON_confirm_prices_request = confirm_prices_request_convertToJSON(confirm_prices_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_confirm_prices_request);
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
    //    printf("%s\n","Ответ 200 обозначает, что цены подтверждены.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_confirm_prices_request) {
        cJSON_Delete(localVarSingleItemJSON_confirm_prices_request);
        localVarSingleItemJSON_confirm_prices_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товара из карантина по цене в магазине
//
// Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_confirmCampaignPrices(apiClient_t *apiClient, long campaignId, confirm_prices_request_t *confirm_prices_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/price-quarantine/confirm")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/price-quarantine/confirm");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_confirm_prices_request = NULL;
    if (confirm_prices_request != NULL)
    {
        //string
        localVarSingleItemJSON_confirm_prices_request = confirm_prices_request_convertToJSON(confirm_prices_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_confirm_prices_request);
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
    //    printf("%s\n","Ответ 200 обозначает, что цены подтверждены.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_confirm_prices_request) {
        cJSON_Delete(localVarSingleItemJSON_confirm_prices_request);
        localVarSingleItemJSON_confirm_prices_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Создание нового чата с покупателем
//
// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
create_chat_response_t*
DbsAPI_createChat(apiClient_t *apiClient, long businessId, create_chat_request_t *create_chat_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/new")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/new");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_create_chat_request = NULL;
    if (create_chat_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_chat_request = create_chat_request_convertToJSON(create_chat_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_chat_request);
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
    //    printf("%s\n","Все получилось: чат создан. ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_chat_response_t *elementToReturn = create_chat_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_create_chat_request) {
        cJSON_Delete(localVarSingleItemJSON_create_chat_request);
        localVarSingleItemJSON_create_chat_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Создание точки продаж
//
// Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
create_outlet_response_t*
DbsAPI_createOutlet(apiClient_t *apiClient, long campaignId, change_outlet_request_t *change_outlet_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_change_outlet_request = NULL;
    if (change_outlet_request != NULL)
    {
        //string
        localVarSingleItemJSON_change_outlet_request = change_outlet_request_convertToJSON(change_outlet_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_change_outlet_request);
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
    //    printf("%s\n","Информация о созданной точке продаж.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_outlet_response_t *elementToReturn = create_outlet_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_change_outlet_request) {
        cJSON_Delete(localVarSingleItemJSON_change_outlet_request);
        localVarSingleItemJSON_change_outlet_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товаров из ассортимента магазина
//
// Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
delete_campaign_offers_response_t*
DbsAPI_deleteCampaignOffers(apiClient_t *apiClient, long campaignId, delete_campaign_offers_request_t *delete_campaign_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers/delete")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers/delete");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_delete_campaign_offers_request = NULL;
    if (delete_campaign_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_campaign_offers_request = delete_campaign_offers_request_convertToJSON(delete_campaign_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_campaign_offers_request);
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
    //    printf("%s\n","Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_campaign_offers_response_t *elementToReturn = delete_campaign_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_delete_campaign_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_campaign_offers_request);
        localVarSingleItemJSON_delete_campaign_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление комментария к отзыву
//
// Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_deleteGoodsFeedbackComment(apiClient_t *apiClient, long businessId, delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/goods-feedback/comments/delete")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/goods-feedback/comments/delete");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_delete_goods_feedback_comment_request = NULL;
    if (delete_goods_feedback_comment_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_goods_feedback_comment_request = delete_goods_feedback_comment_request_convertToJSON(delete_goods_feedback_comment_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_goods_feedback_comment_request);
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
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_delete_goods_feedback_comment_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_goods_feedback_comment_request);
        localVarSingleItemJSON_delete_goods_feedback_comment_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Возобновление показа товаров
//
// Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_deleteHiddenOffers(apiClient_t *apiClient, long campaignId, delete_hidden_offers_request_t *delete_hidden_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/hidden-offers/delete")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/hidden-offers/delete");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_delete_hidden_offers_request = NULL;
    if (delete_hidden_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_hidden_offers_request = delete_hidden_offers_request_convertToJSON(delete_hidden_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_hidden_offers_request);
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
    //    printf("%s\n","Показ товаров возобновлен.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_delete_hidden_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_hidden_offers_request);
        localVarSingleItemJSON_delete_hidden_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товаров из каталога
//
// Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_response_t*
DbsAPI_deleteOffers(apiClient_t *apiClient, long businessId, delete_offers_request_t *delete_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/delete")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/delete");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_delete_offers_request = NULL;
    if (delete_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_offers_request = delete_offers_request_convertToJSON(delete_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_offers_request);
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
    //    printf("%s\n","Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_offers_response_t *elementToReturn = delete_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_delete_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_offers_request);
        localVarSingleItemJSON_delete_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товаров из архива
//
// Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_from_archive_response_t*
DbsAPI_deleteOffersFromArchive(apiClient_t *apiClient, long businessId, delete_offers_from_archive_request_t *delete_offers_from_archive_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/unarchive")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/unarchive");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_delete_offers_from_archive_request = NULL;
    if (delete_offers_from_archive_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_offers_from_archive_request = delete_offers_from_archive_request_convertToJSON(delete_offers_from_archive_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_offers_from_archive_request);
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
    //    printf("%s\n","Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_offers_from_archive_response_t *elementToReturn = delete_offers_from_archive_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_delete_offers_from_archive_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_offers_from_archive_request);
        localVarSingleItemJSON_delete_offers_from_archive_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление точки продаж
//
// Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_deleteOutlet(apiClient_t *apiClient, long campaignId, long outletId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets/{outletId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets/{outletId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(outletId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_outletId = sizeof(campaignId)+3 + sizeof(outletId)+3 + strlen("{ outletId }");
    if(outletId == 0){
        goto end;
    }
    char* localVarToReplace_outletId = malloc(sizeOfPathParams_outletId);
    snprintf(localVarToReplace_outletId, sizeOfPathParams_outletId, "{%s}", "outletId");

    char localVarBuff_outletId[256];
    intToStr(localVarBuff_outletId, outletId);

    localVarPath = strReplace(localVarPath, localVarToReplace_outletId, localVarBuff_outletId);



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_outletId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление лицензий для точек продаж
//
// Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_deleteOutletLicenses(apiClient_t *apiClient, long campaignId, list_t *ids)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets/licenses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets/licenses");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    if (ids)
    {
        list_addElement(localVarQueryParameters,ids);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товаров из акции
//
// Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
delete_promo_offers_response_t*
DbsAPI_deletePromoOffers(apiClient_t *apiClient, long businessId, delete_promo_offers_request_t *delete_promo_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/promos/offers/delete")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/promos/offers/delete");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_delete_promo_offers_request = NULL;
    if (delete_promo_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_promo_offers_request = delete_promo_offers_request_convertToJSON(delete_promo_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_promo_offers_request);
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
    //    printf("%s\n","Результат удаления товаров из акции.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_promo_offers_response_t *elementToReturn = delete_promo_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_delete_promo_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_promo_offers_request);
        localVarSingleItemJSON_delete_promo_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по бусту продаж
//
// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateBoostConsolidatedReport(apiClient_t *apiClient, generate_boost_consolidated_request_t *generate_boost_consolidated_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/boost-consolidated/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/boost-consolidated/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateBoostConsolidatedReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_boost_consolidated_request = NULL;
    if (generate_boost_consolidated_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_boost_consolidated_request = generate_boost_consolidated_request_convertToJSON(generate_boost_consolidated_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_boost_consolidated_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_boost_consolidated_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_boost_consolidated_request);
        localVarSingleItemJSON_generate_boost_consolidated_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет «Конкурентная позиция»
//
// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateCompetitorsPositionReport(apiClient_t *apiClient, generate_competitors_position_report_request_t *generate_competitors_position_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/competitors-position/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/competitors-position/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateCompetitorsPositionReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_competitors_position_report_request = NULL;
    if (generate_competitors_position_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_competitors_position_report_request = generate_competitors_position_report_request_convertToJSON(generate_competitors_position_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_competitors_position_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_competitors_position_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_competitors_position_report_request);
        localVarSingleItemJSON_generate_competitors_position_report_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по отзывам о товарах
//
// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateGoodsFeedbackReport(apiClient_t *apiClient, generate_goods_feedback_request_t *generate_goods_feedback_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/goods-feedback/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/goods-feedback/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateGoodsFeedbackReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_goods_feedback_request = NULL;
    if (generate_goods_feedback_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_goods_feedback_request = generate_goods_feedback_request_convertToJSON(generate_goods_feedback_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_goods_feedback_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_goods_feedback_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_goods_feedback_request);
        localVarSingleItemJSON_generate_goods_feedback_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
//
// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateMassOrderLabelsReport(apiClient_t *apiClient, generate_mass_order_labels_request_t *generate_mass_order_labels_request, page_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/documents/labels/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/documents/labels/generate");




    // query parameters
    char *keyQuery_format = NULL;
    page_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateMassOrderLabelsReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_mass_order_labels_request = NULL;
    if (generate_mass_order_labels_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_mass_order_labels_request = generate_mass_order_labels_request_convertToJSON(generate_mass_order_labels_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_mass_order_labels_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;. ");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_mass_order_labels_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_mass_order_labels_request);
        localVarSingleItemJSON_generate_mass_order_labels_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Готовый ярлык‑наклейка для коробки в заказе
//
// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
DbsAPI_generateOrderLabel(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, long boxId, page_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);


    // Path Params
    long sizeOfPathParams_boxId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + sizeof(boxId)+3 + strlen("{ boxId }");
    if(boxId == 0){
        goto end;
    }
    char* localVarToReplace_boxId = malloc(sizeOfPathParams_boxId);
    snprintf(localVarToReplace_boxId, sizeOfPathParams_boxId, "{%s}", "boxId");

    char localVarBuff_boxId[256];
    intToStr(localVarBuff_boxId, boxId);

    localVarPath = strReplace(localVarPath, localVarToReplace_boxId, localVarBuff_boxId);




    // query parameters
    char *keyQuery_format = NULL;
    page_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateOrderLabel__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }
    list_addElement(localVarHeaderType,"application/pdf"); //produces
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
    //    printf("%s\n","PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.");
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_shipmentId);
    free(localVarToReplace_boxId);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Готовые ярлыки‑наклейки на все коробки в одном заказе
//
// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
DbsAPI_generateOrderLabels(apiClient_t *apiClient, long campaignId, long orderId, page_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/labels")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/labels");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // query parameters
    char *keyQuery_format = NULL;
    page_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateOrderLabels__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }
    list_addElement(localVarHeaderType,"application/pdf"); //produces
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
    //    printf("%s\n","PDF‑файл с ярлыками на все коробки.");
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет «Цены на рынке»
//
// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generatePricesReport(apiClient_t *apiClient, generate_prices_report_request_t *generate_prices_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/prices/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/prices/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generatePricesReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_prices_report_request = NULL;
    if (generate_prices_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_prices_report_request = generate_prices_report_request_convertToJSON(generate_prices_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_prices_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_prices_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_prices_report_request);
        localVarSingleItemJSON_generate_prices_report_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по полкам
//
// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateShelfsStatisticsReport(apiClient_t *apiClient, generate_shelfs_statistics_request_t *generate_shelfs_statistics_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/shelf-statistics/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/shelf-statistics/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateShelfsStatisticsReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_shelfs_statistics_request = NULL;
    if (generate_shelfs_statistics_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_shelfs_statistics_request = generate_shelfs_statistics_request_convertToJSON(generate_shelfs_statistics_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_shelfs_statistics_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_shelfs_statistics_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_shelfs_statistics_request);
        localVarSingleItemJSON_generate_shelfs_statistics_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет «Аналитика продаж»
//
// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateShowsSalesReport(apiClient_t *apiClient, generate_shows_sales_report_request_t *generate_shows_sales_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/shows-sales/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/shows-sales/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateShowsSalesReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_shows_sales_report_request = NULL;
    if (generate_shows_sales_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_shows_sales_report_request = generate_shows_sales_report_request_convertToJSON(generate_shows_sales_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_shows_sales_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_shows_sales_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_shows_sales_report_request);
        localVarSingleItemJSON_generate_shows_sales_report_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по остаткам на складах
//
// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateStocksOnWarehousesReport(apiClient_t *apiClient, generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/stocks-on-warehouses/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/stocks-on-warehouses/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateStocksOnWarehousesReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_stocks_on_warehouses_report_request = NULL;
    if (generate_stocks_on_warehouses_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_stocks_on_warehouses_report_request = generate_stocks_on_warehouses_report_request_convertToJSON(generate_stocks_on_warehouses_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_stocks_on_warehouses_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_stocks_on_warehouses_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_stocks_on_warehouses_report_request);
        localVarSingleItemJSON_generate_stocks_on_warehouses_report_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по стоимости услуг
//
// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateUnitedMarketplaceServicesReport(apiClient_t *apiClient, generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/united-marketplace-services/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/united-marketplace-services/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateUnitedMarketplaceServicesReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_united_marketplace_services_report_request = NULL;
    if (generate_united_marketplace_services_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_united_marketplace_services_report_request = generate_united_marketplace_services_report_request_convertToJSON(generate_united_marketplace_services_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_united_marketplace_services_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_united_marketplace_services_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_united_marketplace_services_report_request);
        localVarSingleItemJSON_generate_united_marketplace_services_report_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по платежам
//
// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateUnitedNettingReport(apiClient_t *apiClient, generate_united_netting_report_request_t *generate_united_netting_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/united-netting/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/united-netting/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateUnitedNettingReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_united_netting_report_request = NULL;
    if (generate_united_netting_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_united_netting_report_request = generate_united_netting_report_request_convertToJSON(generate_united_netting_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_united_netting_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_united_netting_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_united_netting_report_request);
        localVarSingleItemJSON_generate_united_netting_report_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по заказам
//
// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateUnitedOrdersReport(apiClient_t *apiClient, generate_united_orders_request_t *generate_united_orders_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/united-orders/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/united-orders/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateUnitedOrdersReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_united_orders_request = NULL;
    if (generate_united_orders_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_united_orders_request = generate_united_orders_request_convertToJSON(generate_united_orders_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_united_orders_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_united_orders_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_united_orders_request);
        localVarSingleItemJSON_generate_united_orders_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Все предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_all_offers_response_t*
DbsAPI_getAllOffers(apiClient_t *apiClient, long campaignId, long feedId, int *chunk)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers/all")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers/all");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_feedId = NULL;
    long valueQuery_feedId ;
    keyValuePair_t *keyPairQuery_feedId = 0;
    if (feedId)
    {
        keyQuery_feedId = strdup("feedId");
        valueQuery_feedId = (feedId);
        keyPairQuery_feedId = keyValuePair_create(keyQuery_feedId, &valueQuery_feedId);
        list_addElement(localVarQueryParameters,keyPairQuery_feedId);
    }

    // query parameters
    char *keyQuery_chunk = NULL;
    char * valueQuery_chunk = NULL;
    keyValuePair_t *keyPairQuery_chunk = 0;
    if (chunk)
    {
        keyQuery_chunk = strdup("chunk");
        valueQuery_chunk = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_chunk, MAX_NUMBER_LENGTH, "%d", *chunk);
        keyPairQuery_chunk = keyValuePair_create(keyQuery_chunk, valueQuery_chunk);
        list_addElement(localVarQueryParameters,keyPairQuery_chunk);
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
    //    printf("%s\n","Предложения магазина.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_all_offers_response_t *elementToReturn = get_all_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_feedId){
        free(keyQuery_feedId);
        keyQuery_feedId = NULL;
    }
    if(keyPairQuery_feedId){
        keyValuePair_free(keyPairQuery_feedId);
        keyPairQuery_feedId = NULL;
    }
    if(keyQuery_chunk){
        free(keyQuery_chunk);
        keyQuery_chunk = NULL;
    }
    if(valueQuery_chunk){
        free(valueQuery_chunk);
        valueQuery_chunk = NULL;
    }
    if(keyPairQuery_chunk){
        keyValuePair_free(keyPairQuery_chunk);
        keyPairQuery_chunk = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация об установленных ставках
//
// Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
get_bids_info_response_t*
DbsAPI_getBidsInfoForBusiness(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_bids_info_request_t *get_bids_info_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/bids/info")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/bids/info");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_bids_info_request = NULL;
    if (get_bids_info_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_bids_info_request = get_bids_info_request_convertToJSON(get_bids_info_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_bids_info_request);
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
    //    printf("%s\n","Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_bids_info_response_t *elementToReturn = get_bids_info_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_bids_info_request) {
        cJSON_Delete(localVarSingleItemJSON_get_bids_info_request);
        localVarSingleItemJSON_get_bids_info_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Рекомендованные ставки для заданных товаров
//
// Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
get_bids_recommendations_response_t*
DbsAPI_getBidsRecommendations(apiClient_t *apiClient, long businessId, get_bids_recommendations_request_t *get_bids_recommendations_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/bids/recommendations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/bids/recommendations");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_get_bids_recommendations_request = NULL;
    if (get_bids_recommendations_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_bids_recommendations_request = get_bids_recommendations_request_convertToJSON(get_bids_recommendations_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_bids_recommendations_request);
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
    //    printf("%s\n","Рекомендованные ставки для заданных товаров.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_bids_recommendations_response_t *elementToReturn = get_bids_recommendations_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_bids_recommendations_request) {
        cJSON_Delete(localVarSingleItemJSON_get_bids_recommendations_request);
        localVarSingleItemJSON_get_bids_recommendations_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список товаров, находящихся в карантине по цене в кабинете
//
// Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_quarantine_offers_response_t*
DbsAPI_getBusinessQuarantineOffers(apiClient_t *apiClient, long businessId, get_quarantine_offers_request_t *get_quarantine_offers_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/price-quarantine")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/price-quarantine");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_quarantine_offers_request = NULL;
    if (get_quarantine_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_quarantine_offers_request = get_quarantine_offers_request_convertToJSON(get_quarantine_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_quarantine_offers_request);
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
    //    printf("%s\n","Список товаров в карантине.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_quarantine_offers_response_t *elementToReturn = get_quarantine_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_quarantine_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_get_quarantine_offers_request);
        localVarSingleItemJSON_get_quarantine_offers_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Настройки кабинета
//
// Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_business_settings_response_t*
DbsAPI_getBusinessSettings(apiClient_t *apiClient, long businessId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/settings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/settings");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Настройки кабинета.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_settings_response_t *elementToReturn = get_business_settings_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_businessId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о магазине
//
// Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_response_t*
DbsAPI_getCampaign(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



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
    //    printf("%s\n","Информация о магазине.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_response_t *elementToReturn = get_campaign_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Логины, связанные с магазином
//
// Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_logins_response_t*
DbsAPI_getCampaignLogins(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/logins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/logins");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



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
    //    printf("%s\n","Список логинов, связанных с магазином.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_logins_response_t *elementToReturn = get_campaign_logins_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о товарах, которые размещены в заданном магазине
//
// Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_campaign_offers_response_t*
DbsAPI_getCampaignOffers(apiClient_t *apiClient, long campaignId, get_campaign_offers_request_t *get_campaign_offers_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_campaign_offers_request = NULL;
    if (get_campaign_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_campaign_offers_request = get_campaign_offers_request_convertToJSON(get_campaign_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_campaign_offers_request);
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
    //    printf("%s\n","Список товаров, размещенных в заданном магазине.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_offers_response_t *elementToReturn = get_campaign_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_campaign_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_get_campaign_offers_request);
        localVarSingleItemJSON_get_campaign_offers_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список товаров, находящихся в карантине по цене в магазине
//
// Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_quarantine_offers_response_t*
DbsAPI_getCampaignQuarantineOffers(apiClient_t *apiClient, long campaignId, get_quarantine_offers_request_t *get_quarantine_offers_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/price-quarantine")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/price-quarantine");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_quarantine_offers_request = NULL;
    if (get_quarantine_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_quarantine_offers_request = get_quarantine_offers_request_convertToJSON(get_quarantine_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_quarantine_offers_request);
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
    //    printf("%s\n","Список товаров в карантине.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_quarantine_offers_response_t *elementToReturn = get_quarantine_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_quarantine_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_get_quarantine_offers_request);
        localVarSingleItemJSON_get_quarantine_offers_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Регион магазина
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_campaign_region_response_t*
DbsAPI_getCampaignRegion(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/region")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/region");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



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
    //    printf("%s\n","Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_region_response_t *elementToReturn = get_campaign_region_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Настройки магазина
//
// Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_settings_response_t*
DbsAPI_getCampaignSettings(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/settings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/settings");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



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
    //    printf("%s\n","Настройки магазина.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaign_settings_response_t *elementToReturn = get_campaign_settings_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список магазинов пользователя
//
// Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaigns_response_t*
DbsAPI_getCampaigns(apiClient_t *apiClient, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns");




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
    //    printf("%s\n","Магазины пользователя.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaigns_response_t *elementToReturn = get_campaigns_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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

// Магазины, доступные логину
//
// Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_campaigns_response_t*
DbsAPI_getCampaignsByLogin(apiClient_t *apiClient, char *login, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/by_login/{login}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/by_login/{login}");


    // Path Params
    long sizeOfPathParams_login = strlen(login)+3 + strlen("{ login }");
    if(login == NULL) {
        goto end;
    }
    char* localVarToReplace_login = malloc(sizeOfPathParams_login);
    sprintf(localVarToReplace_login, "{%s}", "login");

    localVarPath = strReplace(localVarPath, localVarToReplace_login, login);



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
    //    printf("%s\n","Информация о магазинах.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_campaigns_response_t *elementToReturn = get_campaigns_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_login);
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

// Лимит на установку кванта продажи и минимального количества товаров в заказе
//
// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_max_sale_quantum_response_t*
DbsAPI_getCategoriesMaxSaleQuantum(apiClient_t *apiClient, get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/categories/max-sale-quantum")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/categories/max-sale-quantum");




    // Body Param
    cJSON *localVarSingleItemJSON_get_categories_max_sale_quantum_request = NULL;
    if (get_categories_max_sale_quantum_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_categories_max_sale_quantum_request = get_categories_max_sale_quantum_request_convertToJSON(get_categories_max_sale_quantum_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_categories_max_sale_quantum_request);
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
    //    printf("%s\n","Лимит на установку кванта и минимального количества товаров.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_categories_max_sale_quantum_response_t *elementToReturn = get_categories_max_sale_quantum_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_get_categories_max_sale_quantum_request) {
        cJSON_Delete(localVarSingleItemJSON_get_categories_max_sale_quantum_request);
        localVarSingleItemJSON_get_categories_max_sale_quantum_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Дерево категорий
//
// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_response_t*
DbsAPI_getCategoriesTree(apiClient_t *apiClient, get_categories_request_t *get_categories_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/categories/tree")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/categories/tree");




    // Body Param
    cJSON *localVarSingleItemJSON_get_categories_request = NULL;
    if (get_categories_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_categories_request = get_categories_request_convertToJSON(get_categories_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_categories_request);
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
    //    printf("%s\n","Категории Маркета.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_categories_response_t *elementToReturn = get_categories_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_get_categories_request) {
        cJSON_Delete(localVarSingleItemJSON_get_categories_request);
        localVarSingleItemJSON_get_categories_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Списки характеристик товаров по категориям
//
// Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
//
get_category_content_parameters_response_t*
DbsAPI_getCategoryContentParameters(apiClient_t *apiClient, long categoryId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/category/{categoryId}/parameters")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/category/{categoryId}/parameters");


    // Path Params
    long sizeOfPathParams_categoryId = sizeof(categoryId)+3 + strlen("{ categoryId }");
    if(categoryId == 0){
        goto end;
    }
    char* localVarToReplace_categoryId = malloc(sizeOfPathParams_categoryId);
    snprintf(localVarToReplace_categoryId, sizeOfPathParams_categoryId, "{%s}", "categoryId");

    char localVarBuff_categoryId[256];
    intToStr(localVarBuff_categoryId, categoryId);

    localVarPath = strReplace(localVarPath, localVarToReplace_categoryId, localVarBuff_categoryId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Список характеристик товаров из заданной категории.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_category_content_parameters_response_t *elementToReturn = get_category_content_parameters_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_categoryId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение истории сообщений в чате
//
// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chat_history_response_t*
DbsAPI_getChatHistory(apiClient_t *apiClient, long businessId, long chatId, get_chat_history_request_t *get_chat_history_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/history")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/history");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_chatId = NULL;
    long valueQuery_chatId ;
    keyValuePair_t *keyPairQuery_chatId = 0;
    if (chatId)
    {
        keyQuery_chatId = strdup("chatId");
        valueQuery_chatId = (chatId);
        keyPairQuery_chatId = keyValuePair_create(keyQuery_chatId, &valueQuery_chatId);
        list_addElement(localVarQueryParameters,keyPairQuery_chatId);
    }

    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_chat_history_request = NULL;
    if (get_chat_history_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_chat_history_request = get_chat_history_request_convertToJSON(get_chat_history_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_chat_history_request);
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
    //    printf("%s\n","История сообщений успешно получена. ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_chat_history_response_t *elementToReturn = get_chat_history_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_chat_history_request) {
        cJSON_Delete(localVarSingleItemJSON_get_chat_history_request);
        localVarSingleItemJSON_get_chat_history_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_chatId){
        free(keyQuery_chatId);
        keyQuery_chatId = NULL;
    }
    if(keyPairQuery_chatId){
        keyValuePair_free(keyPairQuery_chatId);
        keyPairQuery_chatId = NULL;
    }
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение доступных чатов
//
// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chats_response_t*
DbsAPI_getChats(apiClient_t *apiClient, long businessId, get_chats_request_t *get_chats_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_chats_request = NULL;
    if (get_chats_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_chats_request = get_chats_request_convertToJSON(get_chats_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_chats_request);
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
    //    printf("%s\n","Список чатов. ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_chats_response_t *elementToReturn = get_chats_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_chats_request) {
        cJSON_Delete(localVarSingleItemJSON_get_chats_request);
        localVarSingleItemJSON_get_chats_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Справочник служб доставки
//
// Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_delivery_services_response_t*
DbsAPI_getDeliveryServices(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/delivery/services")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/delivery/services");



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
    //    printf("%s\n","Информация о службах доставки.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_delivery_services_response_t *elementToReturn = get_delivery_services_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о прайс-листе
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feed_response_t*
DbsAPI_getFeed(apiClient_t *apiClient, long campaignId, long feedId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);



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
    //    printf("%s\n","Информация о прайс-листе.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feed_response_t *elementToReturn = get_feed_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по индексации прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_feed_index_logs_response_t*
DbsAPI_getFeedIndexLogs(apiClient_t *apiClient, long campaignId, long feedId, int *limit, char published_time_from, char published_time_to, feed_index_logs_status_type_e status)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}/index-logs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}/index-logs");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);




    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_published_time_from = NULL;
    char valueQuery_published_time_from ;
    keyValuePair_t *keyPairQuery_published_time_from = 0;
    if (published_time_from)
    {
        keyQuery_published_time_from = strdup("published_time_from");
        valueQuery_published_time_from = (published_time_from);
        keyPairQuery_published_time_from = keyValuePair_create(keyQuery_published_time_from, &valueQuery_published_time_from);
        list_addElement(localVarQueryParameters,keyPairQuery_published_time_from);
    }

    // query parameters
    char *keyQuery_published_time_to = NULL;
    char valueQuery_published_time_to ;
    keyValuePair_t *keyPairQuery_published_time_to = 0;
    if (published_time_to)
    {
        keyQuery_published_time_to = strdup("published_time_to");
        valueQuery_published_time_to = (published_time_to);
        keyPairQuery_published_time_to = keyValuePair_create(keyQuery_published_time_to, &valueQuery_published_time_to);
        list_addElement(localVarQueryParameters,keyPairQuery_published_time_to);
    }

    // query parameters
    char *keyQuery_status = NULL;
    feed_index_logs_status_type_e valueQuery_status ;
    keyValuePair_t *keyPairQuery_status = 0;
    if (status)
    {
        keyQuery_status = strdup("status");
        valueQuery_status = (status);
        keyPairQuery_status = keyValuePair_create(keyQuery_status, (void *)strdup(getFeedIndexLogs__ToString(
        &valueQuery_status)));
        list_addElement(localVarQueryParameters,keyPairQuery_status);
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
    //    printf("%s\n","Отчет по индексации прайс-листа.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feed_index_logs_response_t *elementToReturn = get_feed_index_logs_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_published_time_from){
        free(keyQuery_published_time_from);
        keyQuery_published_time_from = NULL;
    }
    if(keyPairQuery_published_time_from){
        keyValuePair_free(keyPairQuery_published_time_from);
        keyPairQuery_published_time_from = NULL;
    }
    if(keyQuery_published_time_to){
        free(keyQuery_published_time_to);
        keyQuery_published_time_to = NULL;
    }
    if(keyPairQuery_published_time_to){
        keyValuePair_free(keyPairQuery_published_time_to);
        keyPairQuery_published_time_to = NULL;
    }
    if(keyQuery_status){
        free(keyQuery_status);
        keyQuery_status = NULL;
    }
    if(keyPairQuery_status){
        keyValuePair_free(keyPairQuery_status);
        keyPairQuery_status = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Новые и обновленные отзывы о магазине
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_feedback_list_response_t*
DbsAPI_getFeedbackAndCommentUpdates(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, char from_date)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feedback/updates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feedback/updates");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_from_date = NULL;
    char valueQuery_from_date ;
    keyValuePair_t *keyPairQuery_from_date = 0;
    if (from_date)
    {
        keyQuery_from_date = strdup("from_date");
        valueQuery_from_date = (from_date);
        keyPairQuery_from_date = keyValuePair_create(keyQuery_from_date, &valueQuery_from_date);
        list_addElement(localVarQueryParameters,keyPairQuery_from_date);
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
    //    printf("%s\n","Список отзывов для магазина.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feedback_list_response_t *elementToReturn = get_feedback_list_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_from_date){
        free(keyQuery_from_date);
        keyQuery_from_date = NULL;
    }
    if(keyPairQuery_from_date){
        keyValuePair_free(keyPairQuery_from_date);
        keyPairQuery_from_date = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список прайс-листов магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feeds_response_t*
DbsAPI_getFeeds(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



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
    //    printf("%s\n","Список прайс-листов.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_feeds_response_t *elementToReturn = get_feeds_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение комментариев к отзыву
//
// Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_comments_response_t*
DbsAPI_getGoodsFeedbackComments(apiClient_t *apiClient, long businessId, get_goods_feedback_comments_request_t *get_goods_feedback_comments_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/goods-feedback/comments")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/goods-feedback/comments");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_goods_feedback_comments_request = NULL;
    if (get_goods_feedback_comments_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_goods_feedback_comments_request = get_goods_feedback_comments_request_convertToJSON(get_goods_feedback_comments_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_goods_feedback_comments_request);
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
    //    printf("%s\n","Дерево комментариев к отзыву.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_goods_feedback_comments_response_t *elementToReturn = get_goods_feedback_comments_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_goods_feedback_comments_request) {
        cJSON_Delete(localVarSingleItemJSON_get_goods_feedback_comments_request);
        localVarSingleItemJSON_get_goods_feedback_comments_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение отзывов о товарах продавца
//
// Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_response_t*
DbsAPI_getGoodsFeedbacks(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_goods_feedback_request_t *get_goods_feedback_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/goods-feedback")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/goods-feedback");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_goods_feedback_request = NULL;
    if (get_goods_feedback_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_goods_feedback_request = get_goods_feedback_request_convertToJSON(get_goods_feedback_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_goods_feedback_request);
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
    //    printf("%s\n","Список отзывов.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_goods_feedback_response_t *elementToReturn = get_goods_feedback_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_goods_feedback_request) {
        cJSON_Delete(localVarSingleItemJSON_get_goods_feedback_request);
        localVarSingleItemJSON_get_goods_feedback_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отчет по товарам
//
// Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_goods_stats_response_t*
DbsAPI_getGoodsStats(apiClient_t *apiClient, long campaignId, get_goods_stats_request_t *get_goods_stats_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/stats/skus")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/stats/skus");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_get_goods_stats_request = NULL;
    if (get_goods_stats_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_goods_stats_request = get_goods_stats_request_convertToJSON(get_goods_stats_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_goods_stats_request);
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
    //    printf("%s\n","Отчет по товарам.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_goods_stats_response_t *elementToReturn = get_goods_stats_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_goods_stats_request) {
        cJSON_Delete(localVarSingleItemJSON_get_goods_stats_request);
        localVarSingleItemJSON_get_goods_stats_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о скрытых вами товарах
//
// Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_hidden_offers_response_t*
DbsAPI_getHiddenOffers(apiClient_t *apiClient, long campaignId, list_t *offer_id, char *page_token, int *limit, int *offset, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/hidden-offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/hidden-offers");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    if (offer_id)
    {
        list_addElement(localVarQueryParameters,offer_id);
    }

    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_offset = NULL;
    char * valueQuery_offset = NULL;
    keyValuePair_t *keyPairQuery_offset = 0;
    if (offset)
    {
        keyQuery_offset = strdup("offset");
        valueQuery_offset = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_offset, MAX_NUMBER_LENGTH, "%d", *offset);
        keyPairQuery_offset = keyValuePair_create(keyQuery_offset, valueQuery_offset);
        list_addElement(localVarQueryParameters,keyPairQuery_offset);
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
    //    printf("%s\n","Информация о скрытых вами товарах.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_hidden_offers_response_t *elementToReturn = get_hidden_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_offset){
        free(keyQuery_offset);
        keyQuery_offset = NULL;
    }
    if(valueQuery_offset){
        free(valueQuery_offset);
        valueQuery_offset = NULL;
    }
    if(keyPairQuery_offset){
        keyValuePair_free(keyPairQuery_offset);
        keyPairQuery_offset = NULL;
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

// Информация об одной модели
//
// Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_response_t*
DbsAPI_getModel(apiClient_t *apiClient, long modelId, long regionId, currency_type_e currency)
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_response_t *elementToReturn = get_models_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
DbsAPI_getModelOffers(apiClient_t *apiClient, long modelId, long regionId, currency_type_e currency, sort_order_type_e orderByPrice, int *count, int *page)
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_offers_response_t *elementToReturn = get_models_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
DbsAPI_getModels(apiClient_t *apiClient, long regionId, get_models_request_t *get_models_request, currency_type_e currency)
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_response_t *elementToReturn = get_models_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
DbsAPI_getModelsOffers(apiClient_t *apiClient, long regionId, get_models_request_t *get_models_request, currency_type_e currency, sort_order_type_e orderByPrice)
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_models_offers_response_t *elementToReturn = get_models_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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

// Получение информации о заполненности карточек магазина
//
// Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
//
get_offer_cards_content_status_response_t*
DbsAPI_getOfferCardsContentStatus(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_cards_content_status_request_t *get_offer_cards_content_status_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-cards")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-cards");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_offer_cards_content_status_request = NULL;
    if (get_offer_cards_content_status_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_offer_cards_content_status_request = get_offer_cards_content_status_request_convertToJSON(get_offer_cards_content_status_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_offer_cards_content_status_request);
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
    //    printf("%s\n","Информация о карточках указанных товаров.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offer_cards_content_status_response_t *elementToReturn = get_offer_cards_content_status_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_offer_cards_content_status_request) {
        cJSON_Delete(localVarSingleItemJSON_get_offer_cards_content_status_request);
        localVarSingleItemJSON_get_offer_cards_content_status_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
//
get_offer_mapping_entries_response_t*
DbsAPI_getOfferMappingEntries(apiClient_t *apiClient, long campaignId, list_t *offer_id, list_t *shop_sku, offer_mapping_kind_type_e mapping_kind, list_t *status, list_t *availability, list_t *category_id, list_t *vendor, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-mapping-entries")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-mapping-entries");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    if (offer_id)
    {
        list_addElement(localVarQueryParameters,offer_id);
    }

    // query parameters
    if (shop_sku)
    {
        list_addElement(localVarQueryParameters,shop_sku);
    }

    // query parameters
    char *keyQuery_mapping_kind = NULL;
    offer_mapping_kind_type_e valueQuery_mapping_kind ;
    keyValuePair_t *keyPairQuery_mapping_kind = 0;
    if (mapping_kind)
    {
        keyQuery_mapping_kind = strdup("mapping_kind");
        valueQuery_mapping_kind = (mapping_kind);
        keyPairQuery_mapping_kind = keyValuePair_create(keyQuery_mapping_kind, (void *)strdup(getOfferMappingEntries__ToString(
        &valueQuery_mapping_kind)));
        list_addElement(localVarQueryParameters,keyPairQuery_mapping_kind);
    }

    // query parameters
    if (status)
    {
        list_addElement(localVarQueryParameters,status);
    }

    // query parameters
    if (availability)
    {
        list_addElement(localVarQueryParameters,availability);
    }

    // query parameters
    if (category_id)
    {
        list_addElement(localVarQueryParameters,category_id);
    }

    // query parameters
    if (vendor)
    {
        list_addElement(localVarQueryParameters,vendor);
    }

    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
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
    //    printf("%s\n","Информация о товарах в каталоге.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offer_mapping_entries_response_t *elementToReturn = get_offer_mapping_entries_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_mapping_kind){
        free(keyQuery_mapping_kind);
        keyQuery_mapping_kind = NULL;
    }
    if(keyPairQuery_mapping_kind){
        keyValuePair_free(keyPairQuery_mapping_kind);
        keyPairQuery_mapping_kind = NULL;
    }
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о товарах в каталоге
//
// Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
//
get_offer_mappings_response_t*
DbsAPI_getOfferMappings(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_mappings_request_t *get_offer_mappings_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_offer_mappings_request = NULL;
    if (get_offer_mappings_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_offer_mappings_request = get_offer_mappings_request_convertToJSON(get_offer_mappings_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_offer_mappings_request);
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
    //    printf("%s\n","Информация о товарах в каталоге.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offer_mappings_response_t *elementToReturn = get_offer_mappings_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_offer_mappings_request) {
        cJSON_Delete(localVarSingleItemJSON_get_offer_mappings_request);
        localVarSingleItemJSON_get_offer_mappings_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Рекомендации Маркета, касающиеся цен
//
// Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_offer_recommendations_response_t*
DbsAPI_getOfferRecommendations(apiClient_t *apiClient, long businessId, get_offer_recommendations_request_t *get_offer_recommendations_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offers/recommendations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offers/recommendations");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_offer_recommendations_request = NULL;
    if (get_offer_recommendations_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_offer_recommendations_request = get_offer_recommendations_request_convertToJSON(get_offer_recommendations_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_offer_recommendations_request);
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
    //    printf("%s\n","Список товаров с рекомендациями.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offer_recommendations_response_t *elementToReturn = get_offer_recommendations_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_offer_recommendations_request) {
        cJSON_Delete(localVarSingleItemJSON_get_offer_recommendations_request);
        localVarSingleItemJSON_get_offer_recommendations_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_offers_response_t*
DbsAPI_getOffers(apiClient_t *apiClient, long campaignId, char *query, long feedId, char *shopCategoryId, currency_type_e currency, int *matched, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




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
    char *keyQuery_feedId = NULL;
    long valueQuery_feedId ;
    keyValuePair_t *keyPairQuery_feedId = 0;
    if (feedId)
    {
        keyQuery_feedId = strdup("feedId");
        valueQuery_feedId = (feedId);
        keyPairQuery_feedId = keyValuePair_create(keyQuery_feedId, &valueQuery_feedId);
        list_addElement(localVarQueryParameters,keyPairQuery_feedId);
    }

    // query parameters
    char *keyQuery_shopCategoryId = NULL;
    char * valueQuery_shopCategoryId = NULL;
    keyValuePair_t *keyPairQuery_shopCategoryId = 0;
    if (shopCategoryId)
    {
        keyQuery_shopCategoryId = strdup("shopCategoryId");
        valueQuery_shopCategoryId = strdup((shopCategoryId));
        keyPairQuery_shopCategoryId = keyValuePair_create(keyQuery_shopCategoryId, valueQuery_shopCategoryId);
        list_addElement(localVarQueryParameters,keyPairQuery_shopCategoryId);
    }

    // query parameters
    char *keyQuery_currency = NULL;
    currency_type_e valueQuery_currency ;
    keyValuePair_t *keyPairQuery_currency = 0;
    if (currency)
    {
        keyQuery_currency = strdup("currency");
        valueQuery_currency = (currency);
        keyPairQuery_currency = keyValuePair_create(keyQuery_currency, (void *)strdup(getOffers__ToString(
        &valueQuery_currency)));
        list_addElement(localVarQueryParameters,keyPairQuery_currency);
    }

    // query parameters
    char *keyQuery_matched = NULL;
    char * valueQuery_matched = NULL;
    keyValuePair_t *keyPairQuery_matched = 0;
    if (matched)
    {
        keyQuery_matched = strdup("matched");
        valueQuery_matched = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_matched, MAX_NUMBER_LENGTH, "%d", *matched);
        keyPairQuery_matched = keyValuePair_create(keyQuery_matched, valueQuery_matched);
        list_addElement(localVarQueryParameters,keyPairQuery_matched);
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
    //    printf("%s\n","Предложения магазина.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_offers_response_t *elementToReturn = get_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
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
    if(keyQuery_feedId){
        free(keyQuery_feedId);
        keyQuery_feedId = NULL;
    }
    if(keyPairQuery_feedId){
        keyValuePair_free(keyPairQuery_feedId);
        keyPairQuery_feedId = NULL;
    }
    if(keyQuery_shopCategoryId){
        free(keyQuery_shopCategoryId);
        keyQuery_shopCategoryId = NULL;
    }
    if(valueQuery_shopCategoryId){
        free(valueQuery_shopCategoryId);
        valueQuery_shopCategoryId = NULL;
    }
    if(keyPairQuery_shopCategoryId){
        keyValuePair_free(keyPairQuery_shopCategoryId);
        keyPairQuery_shopCategoryId = NULL;
    }
    if(keyQuery_currency){
        free(keyQuery_currency);
        keyQuery_currency = NULL;
    }
    if(keyPairQuery_currency){
        keyValuePair_free(keyPairQuery_currency);
        keyPairQuery_currency = NULL;
    }
    if(keyQuery_matched){
        free(keyQuery_matched);
        keyQuery_matched = NULL;
    }
    if(valueQuery_matched){
        free(valueQuery_matched);
        valueQuery_matched = NULL;
    }
    if(keyPairQuery_matched){
        keyValuePair_free(keyPairQuery_matched);
        keyPairQuery_matched = NULL;
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

// Информация об одном заказе
//
// Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_response_t*
DbsAPI_getOrder(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);



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
    //    printf("%s\n","Информация о заказе.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_order_response_t *elementToReturn = get_order_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о покупателе — юридическом лице
//
// Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_business_buyer_info_response_t*
DbsAPI_getOrderBusinessBuyerInfo(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/business-buyer")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/business-buyer");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Информация о покупателе.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_buyer_info_response_t *elementToReturn = get_business_buyer_info_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о документах
//
// Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_business_documents_info_response_t*
DbsAPI_getOrderBusinessDocumentsInfo(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/documents")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/documents");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Информация о документах.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_documents_info_response_t *elementToReturn = get_business_documents_info_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о покупателе — физическом лице
//
// Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_order_buyer_info_response_t*
DbsAPI_getOrderBuyerInfo(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/buyer")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/buyer");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);



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
    //    printf("%s\n","Информация о покупателе.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_order_buyer_info_response_t *elementToReturn = get_order_buyer_info_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Данные для самостоятельного изготовления ярлыков
//
// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_labels_data_response_t*
DbsAPI_getOrderLabelsData(apiClient_t *apiClient, long campaignId, long orderId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);



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
    //    printf("%s\n","Информация для печати ярлыков.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_order_labels_data_response_t *elementToReturn = get_order_labels_data_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о нескольких заказах
//
// Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_response_t*
DbsAPI_getOrders(apiClient_t *apiClient, long campaignId, list_t *orderIds, list_t *status, list_t *substatus, char fromDate, char toDate, char supplierShipmentDateFrom, char supplierShipmentDateTo, char updatedAtFrom, char updatedAtTo, order_delivery_dispatch_type_e dispatchType, int *fake, int *hasCis, int *onlyWaitingForCancellationApprove, int *onlyEstimatedDelivery, order_buyer_type_e buyerType, int *page, int *pageSize, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    if (orderIds)
    {
        list_addElement(localVarQueryParameters,orderIds);
    }

    // query parameters
    if (status)
    {
        list_addElement(localVarQueryParameters,status);
    }

    // query parameters
    if (substatus)
    {
        list_addElement(localVarQueryParameters,substatus);
    }

    // query parameters
    char *keyQuery_fromDate = NULL;
    char valueQuery_fromDate ;
    keyValuePair_t *keyPairQuery_fromDate = 0;
    if (fromDate)
    {
        keyQuery_fromDate = strdup("fromDate");
        valueQuery_fromDate = (fromDate);
        keyPairQuery_fromDate = keyValuePair_create(keyQuery_fromDate, &valueQuery_fromDate);
        list_addElement(localVarQueryParameters,keyPairQuery_fromDate);
    }

    // query parameters
    char *keyQuery_toDate = NULL;
    char valueQuery_toDate ;
    keyValuePair_t *keyPairQuery_toDate = 0;
    if (toDate)
    {
        keyQuery_toDate = strdup("toDate");
        valueQuery_toDate = (toDate);
        keyPairQuery_toDate = keyValuePair_create(keyQuery_toDate, &valueQuery_toDate);
        list_addElement(localVarQueryParameters,keyPairQuery_toDate);
    }

    // query parameters
    char *keyQuery_supplierShipmentDateFrom = NULL;
    char valueQuery_supplierShipmentDateFrom ;
    keyValuePair_t *keyPairQuery_supplierShipmentDateFrom = 0;
    if (supplierShipmentDateFrom)
    {
        keyQuery_supplierShipmentDateFrom = strdup("supplierShipmentDateFrom");
        valueQuery_supplierShipmentDateFrom = (supplierShipmentDateFrom);
        keyPairQuery_supplierShipmentDateFrom = keyValuePair_create(keyQuery_supplierShipmentDateFrom, &valueQuery_supplierShipmentDateFrom);
        list_addElement(localVarQueryParameters,keyPairQuery_supplierShipmentDateFrom);
    }

    // query parameters
    char *keyQuery_supplierShipmentDateTo = NULL;
    char valueQuery_supplierShipmentDateTo ;
    keyValuePair_t *keyPairQuery_supplierShipmentDateTo = 0;
    if (supplierShipmentDateTo)
    {
        keyQuery_supplierShipmentDateTo = strdup("supplierShipmentDateTo");
        valueQuery_supplierShipmentDateTo = (supplierShipmentDateTo);
        keyPairQuery_supplierShipmentDateTo = keyValuePair_create(keyQuery_supplierShipmentDateTo, &valueQuery_supplierShipmentDateTo);
        list_addElement(localVarQueryParameters,keyPairQuery_supplierShipmentDateTo);
    }

    // query parameters
    char *keyQuery_updatedAtFrom = NULL;
    char valueQuery_updatedAtFrom ;
    keyValuePair_t *keyPairQuery_updatedAtFrom = 0;
    if (updatedAtFrom)
    {
        keyQuery_updatedAtFrom = strdup("updatedAtFrom");
        valueQuery_updatedAtFrom = (updatedAtFrom);
        keyPairQuery_updatedAtFrom = keyValuePair_create(keyQuery_updatedAtFrom, &valueQuery_updatedAtFrom);
        list_addElement(localVarQueryParameters,keyPairQuery_updatedAtFrom);
    }

    // query parameters
    char *keyQuery_updatedAtTo = NULL;
    char valueQuery_updatedAtTo ;
    keyValuePair_t *keyPairQuery_updatedAtTo = 0;
    if (updatedAtTo)
    {
        keyQuery_updatedAtTo = strdup("updatedAtTo");
        valueQuery_updatedAtTo = (updatedAtTo);
        keyPairQuery_updatedAtTo = keyValuePair_create(keyQuery_updatedAtTo, &valueQuery_updatedAtTo);
        list_addElement(localVarQueryParameters,keyPairQuery_updatedAtTo);
    }

    // query parameters
    char *keyQuery_dispatchType = NULL;
    order_delivery_dispatch_type_e valueQuery_dispatchType ;
    keyValuePair_t *keyPairQuery_dispatchType = 0;
    if (dispatchType)
    {
        keyQuery_dispatchType = strdup("dispatchType");
        valueQuery_dispatchType = (dispatchType);
        keyPairQuery_dispatchType = keyValuePair_create(keyQuery_dispatchType, (void *)strdup(getOrders__ToString(
        &valueQuery_dispatchType)));
        list_addElement(localVarQueryParameters,keyPairQuery_dispatchType);
    }

    // query parameters
    char *keyQuery_fake = NULL;
    char * valueQuery_fake = NULL;
    keyValuePair_t *keyPairQuery_fake = 0;
    if (fake)
    {
        keyQuery_fake = strdup("fake");
        valueQuery_fake = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_fake, MAX_NUMBER_LENGTH, "%d", *fake);
        keyPairQuery_fake = keyValuePair_create(keyQuery_fake, valueQuery_fake);
        list_addElement(localVarQueryParameters,keyPairQuery_fake);
    }

    // query parameters
    char *keyQuery_hasCis = NULL;
    char * valueQuery_hasCis = NULL;
    keyValuePair_t *keyPairQuery_hasCis = 0;
    if (hasCis)
    {
        keyQuery_hasCis = strdup("hasCis");
        valueQuery_hasCis = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_hasCis, MAX_NUMBER_LENGTH, "%d", *hasCis);
        keyPairQuery_hasCis = keyValuePair_create(keyQuery_hasCis, valueQuery_hasCis);
        list_addElement(localVarQueryParameters,keyPairQuery_hasCis);
    }

    // query parameters
    char *keyQuery_onlyWaitingForCancellationApprove = NULL;
    char * valueQuery_onlyWaitingForCancellationApprove = NULL;
    keyValuePair_t *keyPairQuery_onlyWaitingForCancellationApprove = 0;
    if (onlyWaitingForCancellationApprove)
    {
        keyQuery_onlyWaitingForCancellationApprove = strdup("onlyWaitingForCancellationApprove");
        valueQuery_onlyWaitingForCancellationApprove = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_onlyWaitingForCancellationApprove, MAX_NUMBER_LENGTH, "%d", *onlyWaitingForCancellationApprove);
        keyPairQuery_onlyWaitingForCancellationApprove = keyValuePair_create(keyQuery_onlyWaitingForCancellationApprove, valueQuery_onlyWaitingForCancellationApprove);
        list_addElement(localVarQueryParameters,keyPairQuery_onlyWaitingForCancellationApprove);
    }

    // query parameters
    char *keyQuery_onlyEstimatedDelivery = NULL;
    char * valueQuery_onlyEstimatedDelivery = NULL;
    keyValuePair_t *keyPairQuery_onlyEstimatedDelivery = 0;
    if (onlyEstimatedDelivery)
    {
        keyQuery_onlyEstimatedDelivery = strdup("onlyEstimatedDelivery");
        valueQuery_onlyEstimatedDelivery = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_onlyEstimatedDelivery, MAX_NUMBER_LENGTH, "%d", *onlyEstimatedDelivery);
        keyPairQuery_onlyEstimatedDelivery = keyValuePair_create(keyQuery_onlyEstimatedDelivery, valueQuery_onlyEstimatedDelivery);
        list_addElement(localVarQueryParameters,keyPairQuery_onlyEstimatedDelivery);
    }

    // query parameters
    char *keyQuery_buyerType = NULL;
    order_buyer_type_e valueQuery_buyerType ;
    keyValuePair_t *keyPairQuery_buyerType = 0;
    if (buyerType)
    {
        keyQuery_buyerType = strdup("buyerType");
        valueQuery_buyerType = (buyerType);
        keyPairQuery_buyerType = keyValuePair_create(keyQuery_buyerType, (void *)strdup(getOrders__ToString(
        &valueQuery_buyerType)));
        list_addElement(localVarQueryParameters,keyPairQuery_buyerType);
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

    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
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
    //    printf("%s\n","Информация о заказах.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_orders_response_t *elementToReturn = get_orders_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_fromDate){
        free(keyQuery_fromDate);
        keyQuery_fromDate = NULL;
    }
    if(keyPairQuery_fromDate){
        keyValuePair_free(keyPairQuery_fromDate);
        keyPairQuery_fromDate = NULL;
    }
    if(keyQuery_toDate){
        free(keyQuery_toDate);
        keyQuery_toDate = NULL;
    }
    if(keyPairQuery_toDate){
        keyValuePair_free(keyPairQuery_toDate);
        keyPairQuery_toDate = NULL;
    }
    if(keyQuery_supplierShipmentDateFrom){
        free(keyQuery_supplierShipmentDateFrom);
        keyQuery_supplierShipmentDateFrom = NULL;
    }
    if(keyPairQuery_supplierShipmentDateFrom){
        keyValuePair_free(keyPairQuery_supplierShipmentDateFrom);
        keyPairQuery_supplierShipmentDateFrom = NULL;
    }
    if(keyQuery_supplierShipmentDateTo){
        free(keyQuery_supplierShipmentDateTo);
        keyQuery_supplierShipmentDateTo = NULL;
    }
    if(keyPairQuery_supplierShipmentDateTo){
        keyValuePair_free(keyPairQuery_supplierShipmentDateTo);
        keyPairQuery_supplierShipmentDateTo = NULL;
    }
    if(keyQuery_updatedAtFrom){
        free(keyQuery_updatedAtFrom);
        keyQuery_updatedAtFrom = NULL;
    }
    if(keyPairQuery_updatedAtFrom){
        keyValuePair_free(keyPairQuery_updatedAtFrom);
        keyPairQuery_updatedAtFrom = NULL;
    }
    if(keyQuery_updatedAtTo){
        free(keyQuery_updatedAtTo);
        keyQuery_updatedAtTo = NULL;
    }
    if(keyPairQuery_updatedAtTo){
        keyValuePair_free(keyPairQuery_updatedAtTo);
        keyPairQuery_updatedAtTo = NULL;
    }
    if(keyQuery_dispatchType){
        free(keyQuery_dispatchType);
        keyQuery_dispatchType = NULL;
    }
    if(keyPairQuery_dispatchType){
        keyValuePair_free(keyPairQuery_dispatchType);
        keyPairQuery_dispatchType = NULL;
    }
    if(keyQuery_fake){
        free(keyQuery_fake);
        keyQuery_fake = NULL;
    }
    if(valueQuery_fake){
        free(valueQuery_fake);
        valueQuery_fake = NULL;
    }
    if(keyPairQuery_fake){
        keyValuePair_free(keyPairQuery_fake);
        keyPairQuery_fake = NULL;
    }
    if(keyQuery_hasCis){
        free(keyQuery_hasCis);
        keyQuery_hasCis = NULL;
    }
    if(valueQuery_hasCis){
        free(valueQuery_hasCis);
        valueQuery_hasCis = NULL;
    }
    if(keyPairQuery_hasCis){
        keyValuePair_free(keyPairQuery_hasCis);
        keyPairQuery_hasCis = NULL;
    }
    if(keyQuery_onlyWaitingForCancellationApprove){
        free(keyQuery_onlyWaitingForCancellationApprove);
        keyQuery_onlyWaitingForCancellationApprove = NULL;
    }
    if(valueQuery_onlyWaitingForCancellationApprove){
        free(valueQuery_onlyWaitingForCancellationApprove);
        valueQuery_onlyWaitingForCancellationApprove = NULL;
    }
    if(keyPairQuery_onlyWaitingForCancellationApprove){
        keyValuePair_free(keyPairQuery_onlyWaitingForCancellationApprove);
        keyPairQuery_onlyWaitingForCancellationApprove = NULL;
    }
    if(keyQuery_onlyEstimatedDelivery){
        free(keyQuery_onlyEstimatedDelivery);
        keyQuery_onlyEstimatedDelivery = NULL;
    }
    if(valueQuery_onlyEstimatedDelivery){
        free(valueQuery_onlyEstimatedDelivery);
        valueQuery_onlyEstimatedDelivery = NULL;
    }
    if(keyPairQuery_onlyEstimatedDelivery){
        keyValuePair_free(keyPairQuery_onlyEstimatedDelivery);
        keyPairQuery_onlyEstimatedDelivery = NULL;
    }
    if(keyQuery_buyerType){
        free(keyQuery_buyerType);
        keyQuery_buyerType = NULL;
    }
    if(keyPairQuery_buyerType){
        keyValuePair_free(keyPairQuery_buyerType);
        keyPairQuery_buyerType = NULL;
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
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Детальная информация по заказам
//
// Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_stats_response_t*
DbsAPI_getOrdersStats(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_orders_stats_request_t *get_orders_stats_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/stats/orders")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/stats/orders");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_orders_stats_request = NULL;
    if (get_orders_stats_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_orders_stats_request = get_orders_stats_request_convertToJSON(get_orders_stats_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_orders_stats_request);
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
    //    printf("%s\n","Информация по заказам.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_orders_stats_response_t *elementToReturn = get_orders_stats_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_orders_stats_request) {
        cJSON_Delete(localVarSingleItemJSON_get_orders_stats_request);
        localVarSingleItemJSON_get_orders_stats_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация об одной точке продаж
//
// Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlet_response_t*
DbsAPI_getOutlet(apiClient_t *apiClient, long campaignId, long outletId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets/{outletId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets/{outletId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(outletId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_outletId = sizeof(campaignId)+3 + sizeof(outletId)+3 + strlen("{ outletId }");
    if(outletId == 0){
        goto end;
    }
    char* localVarToReplace_outletId = malloc(sizeOfPathParams_outletId);
    snprintf(localVarToReplace_outletId, sizeOfPathParams_outletId, "{%s}", "outletId");

    char localVarBuff_outletId[256];
    intToStr(localVarBuff_outletId, outletId);

    localVarPath = strReplace(localVarPath, localVarToReplace_outletId, localVarBuff_outletId);



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
    //    printf("%s\n","Информация о точке продаж.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_outlet_response_t *elementToReturn = get_outlet_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_outletId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о лицензиях для точек продаж
//
// Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlet_licenses_response_t*
DbsAPI_getOutletLicenses(apiClient_t *apiClient, long campaignId, list_t *outletIds, list_t *ids)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets/licenses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets/licenses");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    if (outletIds)
    {
        list_addElement(localVarQueryParameters,outletIds);
    }

    // query parameters
    if (ids)
    {
        list_addElement(localVarQueryParameters,ids);
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
    //    printf("%s\n","Найденные лицензии собственных точек продаж.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_outlet_licenses_response_t *elementToReturn = get_outlet_licenses_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о нескольких точках продаж
//
// Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlets_response_t*
DbsAPI_getOutlets(apiClient_t *apiClient, long campaignId, char *page_token, long region_id, char *shop_outlet_code, long regionId)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_region_id = NULL;
    long valueQuery_region_id ;
    keyValuePair_t *keyPairQuery_region_id = 0;
    if (region_id)
    {
        keyQuery_region_id = strdup("region_id");
        valueQuery_region_id = (region_id);
        keyPairQuery_region_id = keyValuePair_create(keyQuery_region_id, &valueQuery_region_id);
        list_addElement(localVarQueryParameters,keyPairQuery_region_id);
    }

    // query parameters
    char *keyQuery_shop_outlet_code = NULL;
    char * valueQuery_shop_outlet_code = NULL;
    keyValuePair_t *keyPairQuery_shop_outlet_code = 0;
    if (shop_outlet_code)
    {
        keyQuery_shop_outlet_code = strdup("shop_outlet_code");
        valueQuery_shop_outlet_code = strdup((shop_outlet_code));
        keyPairQuery_shop_outlet_code = keyValuePair_create(keyQuery_shop_outlet_code, valueQuery_shop_outlet_code);
        list_addElement(localVarQueryParameters,keyPairQuery_shop_outlet_code);
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
    //    printf("%s\n","Информация о точках продаж.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_outlets_response_t *elementToReturn = get_outlets_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_region_id){
        free(keyQuery_region_id);
        keyQuery_region_id = NULL;
    }
    if(keyPairQuery_region_id){
        keyValuePair_free(keyPairQuery_region_id);
        keyPairQuery_region_id = NULL;
    }
    if(keyQuery_shop_outlet_code){
        free(keyQuery_shop_outlet_code);
        keyQuery_shop_outlet_code = NULL;
    }
    if(valueQuery_shop_outlet_code){
        free(valueQuery_shop_outlet_code);
        valueQuery_shop_outlet_code = NULL;
    }
    if(keyPairQuery_shop_outlet_code){
        keyValuePair_free(keyPairQuery_shop_outlet_code);
        keyPairQuery_shop_outlet_code = NULL;
    }
    if(keyQuery_regionId){
        free(keyQuery_regionId);
        keyQuery_regionId = NULL;
    }
    if(keyPairQuery_regionId){
        keyValuePair_free(keyPairQuery_regionId);
        keyPairQuery_regionId = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список цен
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
//
get_prices_response_t*
DbsAPI_getPrices(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, int *archived)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-prices")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-prices");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_archived = NULL;
    char * valueQuery_archived = NULL;
    keyValuePair_t *keyPairQuery_archived = 0;
    if (archived)
    {
        keyQuery_archived = strdup("archived");
        valueQuery_archived = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_archived, MAX_NUMBER_LENGTH, "%d", *archived);
        keyPairQuery_archived = keyValuePair_create(keyQuery_archived, valueQuery_archived);
        list_addElement(localVarQueryParameters,keyPairQuery_archived);
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
    //    printf("%s\n","Список всех товаров с установленными ценами.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_prices_response_t *elementToReturn = get_prices_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_archived){
        free(keyQuery_archived);
        keyQuery_archived = NULL;
    }
    if(valueQuery_archived){
        free(valueQuery_archived);
        valueQuery_archived = NULL;
    }
    if(keyPairQuery_archived){
        keyValuePair_free(keyPairQuery_archived);
        keyPairQuery_archived = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Просмотр цен на указанные товары в магазине
//
// Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
//
get_prices_by_offer_ids_response_t*
DbsAPI_getPricesByOfferIds(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-prices")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-prices");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_prices_by_offer_ids_request = NULL;
    if (get_prices_by_offer_ids_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_prices_by_offer_ids_request = get_prices_by_offer_ids_request_convertToJSON(get_prices_by_offer_ids_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_prices_by_offer_ids_request);
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
    //    printf("%s\n","Список товаров с установленными для заданного магазина ценами.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_prices_by_offer_ids_response_t *elementToReturn = get_prices_by_offer_ids_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_prices_by_offer_ids_request) {
        cJSON_Delete(localVarSingleItemJSON_get_prices_by_offer_ids_request);
        localVarSingleItemJSON_get_prices_by_offer_ids_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение списка товаров, которые участвуют или могут участвовать в акции
//
// Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_promo_offers_response_t*
DbsAPI_getPromoOffers(apiClient_t *apiClient, long businessId, get_promo_offers_request_t *get_promo_offers_request, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/promos/offers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/promos/offers");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_promo_offers_request = NULL;
    if (get_promo_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_promo_offers_request = get_promo_offers_request_convertToJSON(get_promo_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_promo_offers_request);
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
    //    printf("%s\n","Список товаров, которые участвуют или могут участвовать в акции.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_promo_offers_response_t *elementToReturn = get_promo_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_promo_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_get_promo_offers_request);
        localVarSingleItemJSON_get_promo_offers_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение списка акций
//
// Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_promos_response_t*
DbsAPI_getPromos(apiClient_t *apiClient, long businessId, get_promos_request_t *get_promos_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/promos")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/promos");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_get_promos_request = NULL;
    if (get_promos_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_promos_request = get_promos_request_convertToJSON(get_promos_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_promos_request);
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
    //    printf("%s\n","Список акций Маркета.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_promos_response_t *elementToReturn = get_promos_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_promos_request) {
        cJSON_Delete(localVarSingleItemJSON_get_promos_request);
        localVarSingleItemJSON_get_promos_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Заказы, которые повлияли на индекс качества
//
// Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
//
get_quality_rating_details_response_t*
DbsAPI_getQualityRatingDetails(apiClient_t *apiClient, long campaignId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/ratings/quality/details")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/ratings/quality/details");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Информация о заказах, которые повлияли на индекс качества.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_quality_rating_details_response_t *elementToReturn = get_quality_rating_details_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Индекс качества магазинов
//
// Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_quality_rating_response_t*
DbsAPI_getQualityRatings(apiClient_t *apiClient, long businessId, get_quality_rating_request_t *get_quality_rating_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/ratings/quality")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/ratings/quality");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_get_quality_rating_request = NULL;
    if (get_quality_rating_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_quality_rating_request = get_quality_rating_request_convertToJSON(get_quality_rating_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_quality_rating_request);
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
    //    printf("%s\n","Значение индекса качества магазинов и его составляющие.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_quality_rating_response_t *elementToReturn = get_quality_rating_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_quality_rating_request) {
        cJSON_Delete(localVarSingleItemJSON_get_quality_rating_request);
        localVarSingleItemJSON_get_quality_rating_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение заданного отчета
//
// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_report_info_response_t*
DbsAPI_getReportInfo(apiClient_t *apiClient, char *reportId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/info/{reportId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/info/{reportId}");


    // Path Params
    long sizeOfPathParams_reportId = strlen(reportId)+3 + strlen("{ reportId }");
    if(reportId == NULL) {
        goto end;
    }
    char* localVarToReplace_reportId = malloc(sizeOfPathParams_reportId);
    sprintf(localVarToReplace_reportId, "{%s}", "reportId");

    localVarPath = strReplace(localVarPath, localVarToReplace_reportId, reportId);


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
    //    printf("%s\n","Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_report_info_response_t *elementToReturn = get_report_info_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_reportId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация о невыкупе или возврате
//
// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_return_response_t*
DbsAPI_getReturn(apiClient_t *apiClient, long campaignId, long orderId, long returnId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);



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
    //    printf("%s\n","Детали возврата.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_return_response_t *elementToReturn = get_return_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение заявления на возврат
//
// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
DbsAPI_getReturnApplication(apiClient_t *apiClient, long campaignId, long orderId, long returnId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);



    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //    printf("%s\n","Заявление на возврат.");
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Получение фотографии возврата
//
// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
DbsAPI_getReturnPhoto(apiClient_t *apiClient, long campaignId, long orderId, long returnId, long itemId, char *imageHash)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);


    // Path Params
    long sizeOfPathParams_itemId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ itemId }");
    if(itemId == 0){
        goto end;
    }
    char* localVarToReplace_itemId = malloc(sizeOfPathParams_itemId);
    snprintf(localVarToReplace_itemId, sizeOfPathParams_itemId, "{%s}", "itemId");

    char localVarBuff_itemId[256];
    intToStr(localVarBuff_itemId, itemId);

    localVarPath = strReplace(localVarPath, localVarToReplace_itemId, localVarBuff_itemId);


    // Path Params
    long sizeOfPathParams_imageHash = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + sizeof(itemId)+3 + strlen(imageHash)+3 + strlen("{ imageHash }");
    if(imageHash == NULL) {
        goto end;
    }
    char* localVarToReplace_imageHash = malloc(sizeOfPathParams_imageHash);
    sprintf(localVarToReplace_imageHash, "{%s}", "imageHash");

    localVarPath = strReplace(localVarPath, localVarToReplace_imageHash, imageHash);


    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //    printf("%s\n","Фотография возврата.");
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
    //primitive return type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    free(localVarToReplace_itemId);
    free(localVarToReplace_imageHash);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список невыкупов и возвратов
//
// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_returns_response_t*
DbsAPI_getReturns(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, list_t *orderIds, list_t *statuses, return_type_e type, char fromDate, char toDate, char from_date, char to_date)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/returns")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/returns");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    if (orderIds)
    {
        list_addElement(localVarQueryParameters,orderIds);
    }

    // query parameters
    if (statuses)
    {
        list_addElement(localVarQueryParameters,statuses);
    }

    // query parameters
    char *keyQuery_type = NULL;
    return_type_e valueQuery_type ;
    keyValuePair_t *keyPairQuery_type = 0;
    if (type)
    {
        keyQuery_type = strdup("type");
        valueQuery_type = (type);
        keyPairQuery_type = keyValuePair_create(keyQuery_type, (void *)strdup(getReturns__ToString(
        &valueQuery_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_type);
    }

    // query parameters
    char *keyQuery_fromDate = NULL;
    char valueQuery_fromDate ;
    keyValuePair_t *keyPairQuery_fromDate = 0;
    if (fromDate)
    {
        keyQuery_fromDate = strdup("fromDate");
        valueQuery_fromDate = (fromDate);
        keyPairQuery_fromDate = keyValuePair_create(keyQuery_fromDate, &valueQuery_fromDate);
        list_addElement(localVarQueryParameters,keyPairQuery_fromDate);
    }

    // query parameters
    char *keyQuery_toDate = NULL;
    char valueQuery_toDate ;
    keyValuePair_t *keyPairQuery_toDate = 0;
    if (toDate)
    {
        keyQuery_toDate = strdup("toDate");
        valueQuery_toDate = (toDate);
        keyPairQuery_toDate = keyValuePair_create(keyQuery_toDate, &valueQuery_toDate);
        list_addElement(localVarQueryParameters,keyPairQuery_toDate);
    }

    // query parameters
    char *keyQuery_from_date = NULL;
    char valueQuery_from_date ;
    keyValuePair_t *keyPairQuery_from_date = 0;
    if (from_date)
    {
        keyQuery_from_date = strdup("from_date");
        valueQuery_from_date = (from_date);
        keyPairQuery_from_date = keyValuePair_create(keyQuery_from_date, &valueQuery_from_date);
        list_addElement(localVarQueryParameters,keyPairQuery_from_date);
    }

    // query parameters
    char *keyQuery_to_date = NULL;
    char valueQuery_to_date ;
    keyValuePair_t *keyPairQuery_to_date = 0;
    if (to_date)
    {
        keyQuery_to_date = strdup("to_date");
        valueQuery_to_date = (to_date);
        keyPairQuery_to_date = keyValuePair_create(keyQuery_to_date, &valueQuery_to_date);
        list_addElement(localVarQueryParameters,keyPairQuery_to_date);
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
    //    printf("%s\n","Постраничные возвраты партнера.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_returns_response_t *elementToReturn = get_returns_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_type){
        free(keyQuery_type);
        keyQuery_type = NULL;
    }
    if(keyPairQuery_type){
        keyValuePair_free(keyPairQuery_type);
        keyPairQuery_type = NULL;
    }
    if(keyQuery_fromDate){
        free(keyQuery_fromDate);
        keyQuery_fromDate = NULL;
    }
    if(keyPairQuery_fromDate){
        keyValuePair_free(keyPairQuery_fromDate);
        keyPairQuery_fromDate = NULL;
    }
    if(keyQuery_toDate){
        free(keyQuery_toDate);
        keyQuery_toDate = NULL;
    }
    if(keyPairQuery_toDate){
        keyValuePair_free(keyPairQuery_toDate);
        keyPairQuery_toDate = NULL;
    }
    if(keyQuery_from_date){
        free(keyQuery_from_date);
        keyQuery_from_date = NULL;
    }
    if(keyPairQuery_from_date){
        keyValuePair_free(keyPairQuery_from_date);
        keyPairQuery_from_date = NULL;
    }
    if(keyQuery_to_date){
        free(keyQuery_to_date);
        keyQuery_to_date = NULL;
    }
    if(keyPairQuery_to_date){
        keyValuePair_free(keyPairQuery_to_date);
        keyPairQuery_to_date = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Информация об остатках и оборачиваемости
//
// Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
//
get_warehouse_stocks_response_t*
DbsAPI_getStocks(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_warehouse_stocks_request_t *get_warehouse_stocks_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers/stocks")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers/stocks");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_get_warehouse_stocks_request = NULL;
    if (get_warehouse_stocks_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_warehouse_stocks_request = get_warehouse_stocks_request_convertToJSON(get_warehouse_stocks_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_warehouse_stocks_request);
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
    //    printf("%s\n","Остатки товаров на складах.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_warehouse_stocks_response_t *elementToReturn = get_warehouse_stocks_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_warehouse_stocks_request) {
        cJSON_Delete(localVarSingleItemJSON_get_warehouse_stocks_request);
        localVarSingleItemJSON_get_warehouse_stocks_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Рекомендованные карточки для товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
//
get_suggested_offer_mapping_entries_response_t*
DbsAPI_getSuggestedOfferMappingEntries(apiClient_t *apiClient, long campaignId, get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-mapping-entries/suggestions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-mapping-entries/suggestions");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_get_suggested_offer_mapping_entries_request = NULL;
    if (get_suggested_offer_mapping_entries_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_suggested_offer_mapping_entries_request = get_suggested_offer_mapping_entries_request_convertToJSON(get_suggested_offer_mapping_entries_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_suggested_offer_mapping_entries_request);
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
    //    printf("%s\n","Информация о товарах в каталоге.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_suggested_offer_mapping_entries_response_t *elementToReturn = get_suggested_offer_mapping_entries_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_get_suggested_offer_mapping_entries_request) {
        cJSON_Delete(localVarSingleItemJSON_get_suggested_offer_mapping_entries_request);
        localVarSingleItemJSON_get_suggested_offer_mapping_entries_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Просмотр карточек на Маркете, которые подходят вашим товарам
//
// Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
get_suggested_offer_mappings_response_t*
DbsAPI_getSuggestedOfferMappings(apiClient_t *apiClient, long businessId, get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/suggestions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/suggestions");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_get_suggested_offer_mappings_request = NULL;
    if (get_suggested_offer_mappings_request != NULL)
    {
        //string
        localVarSingleItemJSON_get_suggested_offer_mappings_request = get_suggested_offer_mappings_request_convertToJSON(get_suggested_offer_mappings_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_get_suggested_offer_mappings_request);
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
    //    printf("%s\n","Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_suggested_offer_mappings_response_t *elementToReturn = get_suggested_offer_mappings_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_get_suggested_offer_mappings_request) {
        cJSON_Delete(localVarSingleItemJSON_get_suggested_offer_mappings_request);
        localVarSingleItemJSON_get_suggested_offer_mappings_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Цены для продвижения товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
suggest_prices_response_t*
DbsAPI_getSuggestedPrices(apiClient_t *apiClient, long campaignId, suggest_prices_request_t *suggest_prices_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-prices/suggestions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-prices/suggestions");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_suggest_prices_request = NULL;
    if (suggest_prices_request != NULL)
    {
        //string
        localVarSingleItemJSON_suggest_prices_request = suggest_prices_request_convertToJSON(suggest_prices_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_suggest_prices_request);
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
    //    printf("%s\n","Список цен для продвижения на Маркете.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    suggest_prices_response_t *elementToReturn = suggest_prices_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_suggest_prices_request) {
        cJSON_Delete(localVarSingleItemJSON_suggest_prices_request);
        localVarSingleItemJSON_suggest_prices_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Список складов и групп складов
//
// Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_warehouses_response_t*
DbsAPI_getWarehouses(apiClient_t *apiClient, long businessId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/warehouses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/warehouses");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);



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
    //    printf("%s\n","Список складов и групп складов.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_warehouses_response_t *elementToReturn = get_warehouses_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_businessId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача ключей цифровых товаров
//
// Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус `DELIVERED`.  Ключ нужно передать в течение 30 минут после перехода заказа в статус `PROCESSING`.  Если в один заказ входят несколько ключей, передавайте их все в одном запросе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_provideOrderDigitalCodes(apiClient_t *apiClient, long campaignId, long orderId, provide_order_digital_codes_request_t *provide_order_digital_codes_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_provide_order_digital_codes_request = NULL;
    if (provide_order_digital_codes_request != NULL)
    {
        //string
        localVarSingleItemJSON_provide_order_digital_codes_request = provide_order_digital_codes_request_convertToJSON(provide_order_digital_codes_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_provide_order_digital_codes_request);
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
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_provide_order_digital_codes_request) {
        cJSON_Delete(localVarSingleItemJSON_provide_order_digital_codes_request);
        localVarSingleItemJSON_provide_order_digital_codes_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача кодов маркировки единиц товара
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
provide_order_item_identifiers_response_t*
DbsAPI_provideOrderItemIdentifiers(apiClient_t *apiClient, long campaignId, long orderId, provide_order_item_identifiers_request_t *provide_order_item_identifiers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/identifiers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/identifiers");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_provide_order_item_identifiers_request = NULL;
    if (provide_order_item_identifiers_request != NULL)
    {
        //string
        localVarSingleItemJSON_provide_order_item_identifiers_request = provide_order_item_identifiers_request_convertToJSON(provide_order_item_identifiers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_provide_order_item_identifiers_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Ответ 200 обозначает, что коды успешно записались. Ответ содержит краткие сведения о промаркированных товарах.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    provide_order_item_identifiers_response_t *elementToReturn = provide_order_item_identifiers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_provide_order_item_identifiers_request) {
        cJSON_Delete(localVarSingleItemJSON_provide_order_item_identifiers_request);
        localVarSingleItemJSON_provide_order_item_identifiers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Включение буста продаж и установка ставок
//
// Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
empty_api_response_t*
DbsAPI_putBidsForBusiness(apiClient_t *apiClient, long businessId, put_sku_bids_request_t *put_sku_bids_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/bids")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/bids");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_put_sku_bids_request = NULL;
    if (put_sku_bids_request != NULL)
    {
        //string
        localVarSingleItemJSON_put_sku_bids_request = put_sku_bids_request_convertToJSON(put_sku_bids_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_put_sku_bids_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_put_sku_bids_request) {
        cJSON_Delete(localVarSingleItemJSON_put_sku_bids_request);
        localVarSingleItemJSON_put_sku_bids_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Включение буста продаж и установка ставок для магазина
//
// Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
empty_api_response_t*
DbsAPI_putBidsForCampaign(apiClient_t *apiClient, long campaignId, put_sku_bids_request_t *put_sku_bids_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/bids")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/bids");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_put_sku_bids_request = NULL;
    if (put_sku_bids_request != NULL)
    {
        //string
        localVarSingleItemJSON_put_sku_bids_request = put_sku_bids_request_convertToJSON(put_sku_bids_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_put_sku_bids_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_put_sku_bids_request) {
        cJSON_Delete(localVarSingleItemJSON_put_sku_bids_request);
        localVarSingleItemJSON_put_sku_bids_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Сообщить, что прайс-лист обновился
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
DbsAPI_refreshFeed(apiClient_t *apiClient, long campaignId, long feedId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}/refresh")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}/refresh");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
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
DbsAPI_searchModels(apiClient_t *apiClient, char *query, long regionId, currency_type_e currency, int *page, int *pageSize)
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    search_models_response_t *elementToReturn = search_models_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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

// Информация о дочерних регионах
//
// Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_region_with_children_response_t*
DbsAPI_searchRegionChildren(apiClient_t *apiClient, long regionId, int *page, int *pageSize)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/regions/{regionId}/children")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/regions/{regionId}/children");


    // Path Params
    long sizeOfPathParams_regionId = sizeof(regionId)+3 + strlen("{ regionId }");
    if(regionId == 0){
        goto end;
    }
    char* localVarToReplace_regionId = malloc(sizeOfPathParams_regionId);
    snprintf(localVarToReplace_regionId, sizeOfPathParams_regionId, "{%s}", "regionId");

    char localVarBuff_regionId[256];
    intToStr(localVarBuff_regionId, regionId);

    localVarPath = strReplace(localVarPath, localVarToReplace_regionId, localVarBuff_regionId);




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
    //    printf("%s\n","Регионы, являющиеся дочерними к указанному в запросе.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_region_with_children_response_t *elementToReturn = get_region_with_children_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_regionId);
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

// Информация о регионе
//
// Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_regions_response_t*
DbsAPI_searchRegionsById(apiClient_t *apiClient, long regionId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/regions/{regionId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/regions/{regionId}");


    // Path Params
    long sizeOfPathParams_regionId = sizeof(regionId)+3 + strlen("{ regionId }");
    if(regionId == 0){
        goto end;
    }
    char* localVarToReplace_regionId = malloc(sizeOfPathParams_regionId);
    snprintf(localVarToReplace_regionId, sizeOfPathParams_regionId, "{%s}", "regionId");

    char localVarBuff_regionId[256];
    intToStr(localVarBuff_regionId, regionId);

    localVarPath = strReplace(localVarPath, localVarToReplace_regionId, localVarBuff_regionId);



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
    //    printf("%s\n","Найденный регион.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_regions_response_t *elementToReturn = get_regions_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_regionId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Поиск регионов по их имени
//
// Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_regions_response_t*
DbsAPI_searchRegionsByName(apiClient_t *apiClient, char *name, char *page_token, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/regions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/regions");




    // query parameters
    char *keyQuery_name = NULL;
    char * valueQuery_name = NULL;
    keyValuePair_t *keyPairQuery_name = 0;
    if (name)
    {
        keyQuery_name = strdup("name");
        valueQuery_name = strdup((name));
        keyPairQuery_name = keyValuePair_create(keyQuery_name, valueQuery_name);
        list_addElement(localVarQueryParameters,keyPairQuery_name);
    }

    // query parameters
    char *keyQuery_page_token = NULL;
    char * valueQuery_page_token = NULL;
    keyValuePair_t *keyPairQuery_page_token = 0;
    if (page_token)
    {
        keyQuery_page_token = strdup("page_token");
        valueQuery_page_token = strdup((page_token));
        keyPairQuery_page_token = keyValuePair_create(keyQuery_page_token, valueQuery_page_token);
        list_addElement(localVarQueryParameters,keyPairQuery_page_token);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
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
    //    printf("%s\n","Список найденных регионов.");
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
    //if (apiClient->response_code == 420) {
    //    printf("%s\n","Превышено ограничение на доступ к ресурсу.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_regions_response_t *elementToReturn = get_regions_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    if(keyQuery_name){
        free(keyQuery_name);
        keyQuery_name = NULL;
    }
    if(valueQuery_name){
        free(valueQuery_name);
        valueQuery_name = NULL;
    }
    if(keyPairQuery_name){
        keyValuePair_free(keyPairQuery_name);
        keyPairQuery_name = NULL;
    }
    if(keyQuery_page_token){
        free(keyQuery_page_token);
        keyQuery_page_token = NULL;
    }
    if(valueQuery_page_token){
        free(valueQuery_page_token);
        valueQuery_page_token = NULL;
    }
    if(keyPairQuery_page_token){
        keyValuePair_free(keyPairQuery_page_token);
        keyPairQuery_page_token = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отправка файла в чат
//
// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_sendFileToChat(apiClient_t *apiClient, long businessId, long chatId, binary_t* file)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/file/send")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/file/send");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_chatId = NULL;
    long valueQuery_chatId ;
    keyValuePair_t *keyPairQuery_chatId = 0;
    if (chatId)
    {
        keyQuery_chatId = strdup("chatId");
        valueQuery_chatId = (chatId);
        keyPairQuery_chatId = keyValuePair_create(keyQuery_chatId, &valueQuery_chatId);
        list_addElement(localVarQueryParameters,keyPairQuery_chatId);
    }

    // form parameters
    char *keyForm_file = NULL;
    binary_t* valueForm_file = 0;
    keyValuePair_t *keyPairForm_file = 0;
    if (file != NULL)
    {
        keyForm_file = strdup("file");
        valueForm_file = file;
        keyPairForm_file = keyValuePair_create(keyForm_file, &valueForm_file);
        list_addElement(localVarFormParameters,keyPairForm_file); //file adding
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
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
    //    printf("%s\n","Пустой ответ. Означает, что файл отправлен.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if(keyQuery_chatId){
        free(keyQuery_chatId);
        keyQuery_chatId = NULL;
    }
    if(keyPairQuery_chatId){
        keyValuePair_free(keyPairQuery_chatId);
        keyPairQuery_chatId = NULL;
    }
    if (keyForm_file) {
        free(keyForm_file);
        keyForm_file = NULL;
    }
//    free(fileVar_file->data);
//    free(fileVar_file);
    free(keyPairForm_file);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отправка сообщения в чат
//
// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_sendMessageToChat(apiClient_t *apiClient, long businessId, long chatId, send_message_to_chat_request_t *send_message_to_chat_request)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/chats/message")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/chats/message");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // query parameters
    char *keyQuery_chatId = NULL;
    long valueQuery_chatId ;
    keyValuePair_t *keyPairQuery_chatId = 0;
    if (chatId)
    {
        keyQuery_chatId = strdup("chatId");
        valueQuery_chatId = (chatId);
        keyPairQuery_chatId = keyValuePair_create(keyQuery_chatId, &valueQuery_chatId);
        list_addElement(localVarQueryParameters,keyPairQuery_chatId);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_send_message_to_chat_request = NULL;
    if (send_message_to_chat_request != NULL)
    {
        //string
        localVarSingleItemJSON_send_message_to_chat_request = send_message_to_chat_request_convertToJSON(send_message_to_chat_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_send_message_to_chat_request);
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
    //    printf("%s\n","Пустой ответ. Означает, что сообщение отправлено.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
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
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_send_message_to_chat_request) {
        cJSON_Delete(localVarSingleItemJSON_send_message_to_chat_request);
        localVarSingleItemJSON_send_message_to_chat_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_chatId){
        free(keyQuery_chatId);
        keyQuery_chatId = NULL;
    }
    if(keyPairQuery_chatId){
        keyValuePair_free(keyPairQuery_chatId);
        keyPairQuery_chatId = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение параметров прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
DbsAPI_setFeedParams(apiClient_t *apiClient, long campaignId, long feedId, set_feed_params_request_t *set_feed_params_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/feeds/{feedId}/params")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/feeds/{feedId}/params");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_feedId = sizeof(campaignId)+3 + sizeof(feedId)+3 + strlen("{ feedId }");
    if(feedId == 0){
        goto end;
    }
    char* localVarToReplace_feedId = malloc(sizeOfPathParams_feedId);
    snprintf(localVarToReplace_feedId, sizeOfPathParams_feedId, "{%s}", "feedId");

    char localVarBuff_feedId[256];
    intToStr(localVarBuff_feedId, feedId);

    localVarPath = strReplace(localVarPath, localVarToReplace_feedId, localVarBuff_feedId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_feed_params_request = NULL;
    if (set_feed_params_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_feed_params_request = set_feed_params_request_convertToJSON(set_feed_params_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_feed_params_request);
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
    //    printf("%s\n","Статус выполнения операции.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_feedId);
    if (localVarSingleItemJSON_set_feed_params_request) {
        cJSON_Delete(localVarSingleItemJSON_set_feed_params_request);
        localVarSingleItemJSON_set_feed_params_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Подготовка заказа
//
// {% note tip \"Подходит и для DBS\" %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос `allowRemove: true`. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \"Удаление нельзя отменить\" %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \"Товар умещается в коробку\" %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"fullCount\": 3,                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           },                           {                               \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"                           },                           {                               \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"                           }                       ]                   },                   {                       \"id\": 654321,                       \"fullCount\": 1                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Товар едет в разных коробках\" %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_box_layout_response_t*
DbsAPI_setOrderBoxLayout(apiClient_t *apiClient, long campaignId, long orderId, set_order_box_layout_request_t *set_order_box_layout_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/boxes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/boxes");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_order_box_layout_request = NULL;
    if (set_order_box_layout_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_order_box_layout_request = set_order_box_layout_request_convertToJSON(set_order_box_layout_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_order_box_layout_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","В ответ придет переданная раскладка с идентификаторами коробок — они понадобятся для запроса ярлыков. ");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    set_order_box_layout_response_t *elementToReturn = set_order_box_layout_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_set_order_box_layout_request) {
        cJSON_Delete(localVarSingleItemJSON_set_order_box_layout_request);
        localVarSingleItemJSON_set_order_box_layout_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение даты доставки заказа
//
// Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_setOrderDeliveryDate(apiClient_t *apiClient, long campaignId, long orderId, set_order_delivery_date_request_t *set_order_delivery_date_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/date")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/date");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_order_delivery_date_request = NULL;
    if (set_order_delivery_date_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_order_delivery_date_request = set_order_delivery_date_request_convertToJSON(set_order_delivery_date_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_order_delivery_date_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Успешное изменение даты доставки.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_set_order_delivery_date_request) {
        cJSON_Delete(localVarSingleItemJSON_set_order_delivery_date_request);
        localVarSingleItemJSON_set_order_delivery_date_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача трек‑номера посылки
//
// {% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_setOrderDeliveryTrackCode(apiClient_t *apiClient, long campaignId, long orderId, set_order_delivery_track_code_request_t *set_order_delivery_track_code_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/track")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/track");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_order_delivery_track_code_request = NULL;
    if (set_order_delivery_track_code_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_order_delivery_track_code_request = set_order_delivery_track_code_request_convertToJSON(set_order_delivery_track_code_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_order_delivery_track_code_request);
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
    //    printf("%s\n","Трек‑номер посылки и идентификатор службы доставки были успешно переданы.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_set_order_delivery_track_code_request) {
        cJSON_Delete(localVarSingleItemJSON_set_order_delivery_track_code_request);
        localVarSingleItemJSON_set_order_delivery_track_code_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача количества грузовых мест в заказе
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \"Как было раньше\" %}  Структура тела PUT-запроса:  ``` {   \"boxes\":   [     {       \"fulfilmentId\": \"{string}\",       \"weight\": {int64},       \"width\": {int64},       \"height\": {int64},       \"depth\": {int64},       \"items\":       [         {           \"id\": {int64},           \"count\": {int32}         },         ...       ]     },     ...   ] } ``` | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `boxes`       |           | Список грузовых мест.       |  **Параметры, вложенные в `boxes`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. | | `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | `width`       | Int64   | Ширина грузового места в сантиметрах.       | | `height`       | Int64   | Высота грузового места в сантиметрах.       | | `depth`       | Int64   | Глубина грузового места в сантиметрах.        | | `items`       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в `items`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `id`       | Int64     | Идентификатор товара в рамках заказа.   | | `count`    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_shipment_boxes_response_t*
DbsAPI_setOrderShipmentBoxes(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, set_order_shipment_boxes_request_t *set_order_shipment_boxes_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_shipmentId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(shipmentId)+3 + strlen("{ shipmentId }");
    if(shipmentId == 0){
        goto end;
    }
    char* localVarToReplace_shipmentId = malloc(sizeOfPathParams_shipmentId);
    snprintf(localVarToReplace_shipmentId, sizeOfPathParams_shipmentId, "{%s}", "shipmentId");

    char localVarBuff_shipmentId[256];
    intToStr(localVarBuff_shipmentId, shipmentId);

    localVarPath = strReplace(localVarPath, localVarToReplace_shipmentId, localVarBuff_shipmentId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_order_shipment_boxes_request = NULL;
    if (set_order_shipment_boxes_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_order_shipment_boxes_request = set_order_shipment_boxes_request_convertToJSON(set_order_shipment_boxes_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_order_shipment_boxes_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество грузомест записано.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    set_order_shipment_boxes_response_t *elementToReturn = set_order_shipment_boxes_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_shipmentId);
    if (localVarSingleItemJSON_set_order_shipment_boxes_request) {
        cJSON_Delete(localVarSingleItemJSON_set_order_shipment_boxes_request);
        localVarSingleItemJSON_set_order_shipment_boxes_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Принятие или изменение решения по возврату
//
// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_setReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId, set_return_decision_request_t *set_return_decision_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);




    // Body Param
    cJSON *localVarSingleItemJSON_set_return_decision_request = NULL;
    if (set_return_decision_request != NULL)
    {
        //string
        localVarSingleItemJSON_set_return_decision_request = set_return_decision_request_convertToJSON(set_return_decision_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_set_return_decision_request);
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
    //    printf("%s\n","Детали возврата.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    if (localVarSingleItemJSON_set_return_decision_request) {
        cJSON_Delete(localVarSingleItemJSON_set_return_decision_request);
        localVarSingleItemJSON_set_return_decision_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Отказ от ответа на отзывы
//
// Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_skipGoodsFeedbacksReaction(apiClient_t *apiClient, long businessId, skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/goods-feedback/skip-reaction")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/goods-feedback/skip-reaction");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_skip_goods_feedback_reaction_request = NULL;
    if (skip_goods_feedback_reaction_request != NULL)
    {
        //string
        localVarSingleItemJSON_skip_goods_feedback_reaction_request = skip_goods_feedback_reaction_request_convertToJSON(skip_goods_feedback_reaction_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_skip_goods_feedback_reaction_request);
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
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_skip_goods_feedback_reaction_request) {
        cJSON_Delete(localVarSingleItemJSON_skip_goods_feedback_reaction_request);
        localVarSingleItemJSON_skip_goods_feedback_reaction_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Подтверждение решения по возврату
//
// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_submitReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);


    // Path Params
    long sizeOfPathParams_returnId = sizeof(campaignId)+3 + sizeof(orderId)+3 + sizeof(returnId)+3 + strlen("{ returnId }");
    if(returnId == 0){
        goto end;
    }
    char* localVarToReplace_returnId = malloc(sizeOfPathParams_returnId);
    snprintf(localVarToReplace_returnId, sizeOfPathParams_returnId, "{%s}", "returnId");

    char localVarBuff_returnId[256];
    intToStr(localVarBuff_returnId, returnId);

    localVarPath = strReplace(localVarPath, localVarToReplace_returnId, localVarBuff_returnId);



    list_addElement(localVarHeaderType,"application/json"); //produces
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
    //    printf("%s\n","Статус выполнения операции.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    free(localVarToReplace_returnId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Установка цен на товары во всех магазинах
//
// Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
empty_api_response_t*
DbsAPI_updateBusinessPrices(apiClient_t *apiClient, long businessId, update_business_prices_request_t *update_business_prices_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-prices/updates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-prices/updates");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_business_prices_request = NULL;
    if (update_business_prices_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_business_prices_request = update_business_prices_request_convertToJSON(update_business_prices_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_business_prices_request);
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
    //    printf("%s\n","Маркет принял информацию о новых ценах.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_update_business_prices_request) {
        cJSON_Delete(localVarSingleItemJSON_update_business_prices_request);
        localVarSingleItemJSON_update_business_prices_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение условий продажи товаров в магазине
//
// Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updateCampaignOffers(apiClient_t *apiClient, long campaignId, update_campaign_offers_request_t *update_campaign_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers/update");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_campaign_offers_request = NULL;
    if (update_campaign_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_campaign_offers_request = update_campaign_offers_request_convertToJSON(update_campaign_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_campaign_offers_request);
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
    //    printf("%s\n","Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_update_campaign_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_update_campaign_offers_request);
        localVarSingleItemJSON_update_campaign_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление нового или изменение созданного комментария
//
// Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
update_goods_feedback_comment_response_t*
DbsAPI_updateGoodsFeedbackComment(apiClient_t *apiClient, long businessId, update_goods_feedback_comment_request_t *update_goods_feedback_comment_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/goods-feedback/comments/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/goods-feedback/comments/update");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_goods_feedback_comment_request = NULL;
    if (update_goods_feedback_comment_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_goods_feedback_comment_request = update_goods_feedback_comment_request_convertToJSON(update_goods_feedback_comment_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_goods_feedback_comment_request);
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
    //    printf("%s\n","Информация о добавленном или измененном комментарии.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_goods_feedback_comment_response_t *elementToReturn = update_goods_feedback_comment_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_update_goods_feedback_comment_request) {
        cJSON_Delete(localVarSingleItemJSON_update_goods_feedback_comment_request);
        localVarSingleItemJSON_update_goods_feedback_comment_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Редактирование категорийных характеристик товара
//
// Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
update_offer_content_response_t*
DbsAPI_updateOfferContent(apiClient_t *apiClient, long businessId, update_offer_content_request_t *update_offer_content_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-cards/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-cards/update");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_offer_content_request = NULL;
    if (update_offer_content_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_offer_content_request = update_offer_content_request_convertToJSON(update_offer_content_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_offer_content_request);
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
    //    printf("%s\n","Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. ");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_offer_content_response_t *elementToReturn = update_offer_content_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_update_offer_content_request) {
        cJSON_Delete(localVarSingleItemJSON_update_offer_content_request);
        localVarSingleItemJSON_update_offer_content_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление и редактирование товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updateOfferMappingEntries(apiClient_t *apiClient, long campaignId, update_offer_mapping_entry_request_t *update_offer_mapping_entry_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-mapping-entries/updates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-mapping-entries/updates");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_offer_mapping_entry_request = NULL;
    if (update_offer_mapping_entry_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_offer_mapping_entry_request = update_offer_mapping_entry_request_convertToJSON(update_offer_mapping_entry_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_offer_mapping_entry_request);
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
    //    printf("%s\n","Статус выполнения операции.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_update_offer_mapping_entry_request) {
        cJSON_Delete(localVarSingleItemJSON_update_offer_mapping_entry_request);
        localVarSingleItemJSON_update_offer_mapping_entry_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление товаров в каталог и изменение информации о них
//
// Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
update_offer_mappings_response_t*
DbsAPI_updateOfferMappings(apiClient_t *apiClient, long businessId, update_offer_mappings_request_t *update_offer_mappings_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/offer-mappings/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/offer-mappings/update");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_offer_mappings_request = NULL;
    if (update_offer_mappings_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_offer_mappings_request = update_offer_mappings_request_convertToJSON(update_offer_mappings_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_offer_mappings_request);
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
    //    printf("%s\n","Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_offer_mappings_response_t *elementToReturn = update_offer_mappings_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_update_offer_mappings_request) {
        cJSON_Delete(localVarSingleItemJSON_update_offer_mappings_request);
        localVarSingleItemJSON_update_offer_mappings_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Удаление товара из заказа или уменьшение числа единиц
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.  Чтобы полностью удалить товар из заказа:  * передайте значение `0`; или * не передавайте параметр `item`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
void
DbsAPI_updateOrderItems(apiClient_t *apiClient, long campaignId, long orderId, update_order_item_request_t *update_order_item_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/items")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/items");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_order_item_request = NULL;
    if (update_order_item_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_item_request = update_order_item_request_convertToJSON(update_order_item_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_item_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Маркет успешно обработал ваш запрос. Выходные данные не ожидаются.");
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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_update_order_item_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_item_request);
        localVarSingleItemJSON_update_order_item_request = NULL;
    }
    free(localVarBodyParameters);

}

// Изменение статуса одного заказа
//
// Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_status_response_t*
DbsAPI_updateOrderStatus(apiClient_t *apiClient, long campaignId, long orderId, update_order_status_request_t *update_order_status_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/status")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/status");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_order_status_request = NULL;
    if (update_order_status_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_status_request = update_order_status_request_convertToJSON(update_order_status_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_status_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","В случае успешного изменения статуса заказа возвращается обновленная информация о заказе.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_order_status_response_t *elementToReturn = update_order_status_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_update_order_status_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_status_request);
        localVarSingleItemJSON_update_order_status_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение статусов нескольких заказов
//
// Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_statuses_response_t*
DbsAPI_updateOrderStatuses(apiClient_t *apiClient, long campaignId, update_order_statuses_request_t *update_order_statuses_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/status-update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/status-update");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_order_statuses_request = NULL;
    if (update_order_statuses_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_statuses_request = update_order_statuses_request_convertToJSON(update_order_statuses_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_statuses_request);
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
    //    printf("%s\n","Возвращается информация об обновленных статусах заказов.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_order_statuses_response_t *elementToReturn = update_order_statuses_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_update_order_statuses_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_statuses_request);
        localVarSingleItemJSON_update_order_statuses_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Продление срока хранения заказа
//
// Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_updateOrderStorageLimit(apiClient_t *apiClient, long campaignId, long orderId, update_order_storage_limit_request_t *update_order_storage_limit_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_orderId = sizeof(campaignId)+3 + sizeof(orderId)+3 + strlen("{ orderId }");
    if(orderId == 0){
        goto end;
    }
    char* localVarToReplace_orderId = malloc(sizeOfPathParams_orderId);
    snprintf(localVarToReplace_orderId, sizeOfPathParams_orderId, "{%s}", "orderId");

    char localVarBuff_orderId[256];
    intToStr(localVarBuff_orderId, orderId);

    localVarPath = strReplace(localVarPath, localVarToReplace_orderId, localVarBuff_orderId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_order_storage_limit_request = NULL;
    if (update_order_storage_limit_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_order_storage_limit_request = update_order_storage_limit_request_convertToJSON(update_order_storage_limit_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_order_storage_limit_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_orderId);
    if (localVarSingleItemJSON_update_order_storage_limit_request) {
        cJSON_Delete(localVarSingleItemJSON_update_order_storage_limit_request);
        localVarSingleItemJSON_update_order_storage_limit_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Изменение информации о точке продаж
//
// Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_updateOutlet(apiClient_t *apiClient, long campaignId, long outletId, change_outlet_request_t *change_outlet_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets/{outletId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets/{outletId}");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + sizeof(outletId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);


    // Path Params
    long sizeOfPathParams_outletId = sizeof(campaignId)+3 + sizeof(outletId)+3 + strlen("{ outletId }");
    if(outletId == 0){
        goto end;
    }
    char* localVarToReplace_outletId = malloc(sizeOfPathParams_outletId);
    snprintf(localVarToReplace_outletId, sizeOfPathParams_outletId, "{%s}", "outletId");

    char localVarBuff_outletId[256];
    intToStr(localVarBuff_outletId, outletId);

    localVarPath = strReplace(localVarPath, localVarToReplace_outletId, localVarBuff_outletId);




    // Body Param
    cJSON *localVarSingleItemJSON_change_outlet_request = NULL;
    if (change_outlet_request != NULL)
    {
        //string
        localVarSingleItemJSON_change_outlet_request = change_outlet_request_convertToJSON(change_outlet_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_change_outlet_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    free(localVarToReplace_outletId);
    if (localVarSingleItemJSON_change_outlet_request) {
        cJSON_Delete(localVarSingleItemJSON_change_outlet_request);
        localVarSingleItemJSON_change_outlet_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Создание и изменение лицензий для точек продаж
//
// Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_updateOutletLicenses(apiClient_t *apiClient, long campaignId, update_outlet_license_request_t *update_outlet_license_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/outlets/licenses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/outlets/licenses");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_outlet_license_request = NULL;
    if (update_outlet_license_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_outlet_license_request = update_outlet_license_request_convertToJSON(update_outlet_license_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_outlet_license_request);
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
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_update_outlet_license_request) {
        cJSON_Delete(localVarSingleItemJSON_update_outlet_license_request);
        localVarSingleItemJSON_update_outlet_license_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Установка цен на товары в конкретном магазине
//
// Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updatePrices(apiClient_t *apiClient, long campaignId, update_prices_request_t *update_prices_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offer-prices/updates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offer-prices/updates");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_prices_request = NULL;
    if (update_prices_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_prices_request = update_prices_request_convertToJSON(update_prices_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_prices_request);
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
    //    printf("%s\n","Маркет принял информацию о новых ценах.");
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
    //if (apiClient->response_code == 423) {
    //    printf("%s\n","К ресурсу нельзя применить указанный метод.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Внутренняя ошибка сервера.");
    //}
    //nonprimitive not container
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_update_prices_request) {
        cJSON_Delete(localVarSingleItemJSON_update_prices_request);
        localVarSingleItemJSON_update_prices_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Добавление товаров в акцию или изменение их цен
//
// Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
update_promo_offers_response_t*
DbsAPI_updatePromoOffers(apiClient_t *apiClient, long businessId, update_promo_offers_request_t *update_promo_offers_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{businessId}/promos/offers/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{businessId}/promos/offers/update");


    // Path Params
    long sizeOfPathParams_businessId = sizeof(businessId)+3 + strlen("{ businessId }");
    if(businessId == 0){
        goto end;
    }
    char* localVarToReplace_businessId = malloc(sizeOfPathParams_businessId);
    snprintf(localVarToReplace_businessId, sizeOfPathParams_businessId, "{%s}", "businessId");

    char localVarBuff_businessId[256];
    intToStr(localVarBuff_businessId, businessId);

    localVarPath = strReplace(localVarPath, localVarToReplace_businessId, localVarBuff_businessId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_promo_offers_request = NULL;
    if (update_promo_offers_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_promo_offers_request = update_promo_offers_request_convertToJSON(update_promo_offers_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_promo_offers_request);
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
    //    printf("%s\n","Результат добавления товаров в акцию или обновления их цен.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_promo_offers_response_t *elementToReturn = update_promo_offers_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_businessId);
    if (localVarSingleItemJSON_update_promo_offers_request) {
        cJSON_Delete(localVarSingleItemJSON_update_promo_offers_request);
        localVarSingleItemJSON_update_promo_offers_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Передача информации об остатках
//
// Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updateStocks(apiClient_t *apiClient, long campaignId, update_stocks_request_t *update_stocks_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/campaigns/{campaignId}/offers/stocks")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/campaigns/{campaignId}/offers/stocks");


    // Path Params
    long sizeOfPathParams_campaignId = sizeof(campaignId)+3 + strlen("{ campaignId }");
    if(campaignId == 0){
        goto end;
    }
    char* localVarToReplace_campaignId = malloc(sizeOfPathParams_campaignId);
    snprintf(localVarToReplace_campaignId, sizeOfPathParams_campaignId, "{%s}", "campaignId");

    char localVarBuff_campaignId[256];
    intToStr(localVarBuff_campaignId, campaignId);

    localVarPath = strReplace(localVarPath, localVarToReplace_campaignId, localVarBuff_campaignId);




    // Body Param
    cJSON *localVarSingleItemJSON_update_stocks_request = NULL;
    if (update_stocks_request != NULL)
    {
        //string
        localVarSingleItemJSON_update_stocks_request = update_stocks_request_convertToJSON(update_stocks_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_stocks_request);
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
                    "PUT");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Пустой ответ.");
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
    cJSON *DbsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    empty_api_response_t *elementToReturn = empty_api_response_parseFromJSON(DbsAPIlocalVarJSON);
    cJSON_Delete(DbsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_campaignId);
    if (localVarSingleItemJSON_update_stocks_request) {
        cJSON_Delete(localVarSingleItemJSON_update_stocks_request);
        localVarSingleItemJSON_update_stocks_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

