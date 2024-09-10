#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ReportsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for ReportsAPI_generateBoostConsolidatedReport

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

// Functions for enum  for ReportsAPI_generateCompetitorsPositionReport

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

// Functions for enum  for ReportsAPI_generateGoodsFeedbackReport

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

// Functions for enum  for ReportsAPI_generateGoodsMovementReport

static char* generateGoodsMovementReport__ToString(_api__generateGoodsMovementReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateGoodsMovementReport_format_e generateGoodsMovementReport__FromString(char* ){
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
// Function generateGoodsMovementReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateGoodsMovementReport__convertToJSON(_api__generateGoodsMovementReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateGoodsMovementReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateGoodsMovementReport_format_e generateGoodsMovementReport__parseFromJSON(cJSON* JSON) {
    _api__generateGoodsMovementReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ReportsAPI_generateGoodsRealizationReport

static char* generateGoodsRealizationReport__ToString(_api__generateGoodsRealizationReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateGoodsRealizationReport_format_e generateGoodsRealizationReport__FromString(char* ){
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
// Function generateGoodsRealizationReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateGoodsRealizationReport__convertToJSON(_api__generateGoodsRealizationReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateGoodsRealizationReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateGoodsRealizationReport_format_e generateGoodsRealizationReport__parseFromJSON(cJSON* JSON) {
    _api__generateGoodsRealizationReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ReportsAPI_generateGoodsTurnoverReport

static char* generateGoodsTurnoverReport__ToString(_api__generateGoodsTurnoverReport_format_e ){
    char *Array[] =  { "NULL", "FILE", "CSV" };
    return Array[];
}

static _api__generateGoodsTurnoverReport_format_e generateGoodsTurnoverReport__FromString(char* ){
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
// Function generateGoodsTurnoverReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *generateGoodsTurnoverReport__convertToJSON(_api__generateGoodsTurnoverReport_format_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function generateGoodsTurnoverReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static _api__generateGoodsTurnoverReport_format_e generateGoodsTurnoverReport__parseFromJSON(cJSON* JSON) {
    _api__generateGoodsTurnoverReport_format_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ReportsAPI_generateMassOrderLabelsReport

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

// Functions for enum  for ReportsAPI_generatePricesReport

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

// Functions for enum  for ReportsAPI_generateShelfsStatisticsReport

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

// Functions for enum  for ReportsAPI_generateShowsSalesReport

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

// Functions for enum  for ReportsAPI_generateStocksOnWarehousesReport

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

// Functions for enum  for ReportsAPI_generateUnitedMarketplaceServicesReport

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

// Functions for enum  for ReportsAPI_generateUnitedNettingReport

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

// Functions for enum  for ReportsAPI_generateUnitedOrdersReport

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


// Отчет по бусту продаж
//
// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateBoostConsolidatedReport(apiClient_t *apiClient, generate_boost_consolidated_request_t *generate_boost_consolidated_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateCompetitorsPositionReport(apiClient_t *apiClient, generate_competitors_position_report_request_t *generate_competitors_position_report_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateGoodsFeedbackReport(apiClient_t *apiClient, generate_goods_feedback_request_t *generate_goods_feedback_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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

// Отчет по движению товаров
//
// Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsMovementReport(apiClient_t *apiClient, generate_goods_movement_report_request_t *generate_goods_movement_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/goods-movement/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/goods-movement/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateGoodsMovementReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_goods_movement_report_request = NULL;
    if (generate_goods_movement_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_goods_movement_report_request = generate_goods_movement_report_request_convertToJSON(generate_goods_movement_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_goods_movement_report_request);
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_goods_movement_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_goods_movement_report_request);
        localVarSingleItemJSON_generate_goods_movement_report_request = NULL;
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

// Отчет по реализации
//
// Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsRealizationReport(apiClient_t *apiClient, generate_goods_realization_report_request_t *generate_goods_realization_report_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/goods-realization/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/goods-realization/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateGoodsRealizationReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_goods_realization_report_request = NULL;
    if (generate_goods_realization_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_goods_realization_report_request = generate_goods_realization_report_request_convertToJSON(generate_goods_realization_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_goods_realization_report_request);
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_goods_realization_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_goods_realization_report_request);
        localVarSingleItemJSON_generate_goods_realization_report_request = NULL;
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

// Отчет по оборачиваемости
//
// Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsTurnoverReport(apiClient_t *apiClient, generate_goods_turnover_request_t *generate_goods_turnover_request, report_format_type_e format)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/goods-turnover/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/goods-turnover/generate");




    // query parameters
    char *keyQuery_format = NULL;
    report_format_type_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(generateGoodsTurnoverReport__ToString(
        &valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_generate_goods_turnover_request = NULL;
    if (generate_goods_turnover_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_goods_turnover_request = generate_goods_turnover_request_convertToJSON(generate_goods_turnover_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_goods_turnover_request);
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_goods_turnover_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_goods_turnover_request);
        localVarSingleItemJSON_generate_goods_turnover_request = NULL;
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
ReportsAPI_generateMassOrderLabelsReport(apiClient_t *apiClient, generate_mass_order_labels_request_t *generate_mass_order_labels_request, page_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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

// Отчет «Цены на рынке»
//
// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generatePricesReport(apiClient_t *apiClient, generate_prices_report_request_t *generate_prices_report_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateShelfsStatisticsReport(apiClient_t *apiClient, generate_shelfs_statistics_request_t *generate_shelfs_statistics_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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

// Получение листа сборки
//
// Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateShipmentListDocumentReport(apiClient_t *apiClient, generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/reports/documents/shipment-list/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/reports/documents/shipment-list/generate");




    // Body Param
    cJSON *localVarSingleItemJSON_generate_shipment_list_document_report_request = NULL;
    if (generate_shipment_list_document_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_generate_shipment_list_document_report_request = generate_shipment_list_document_report_request_convertToJSON(generate_shipment_list_document_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_generate_shipment_list_document_report_request);
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
    //    printf("%s\n","В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.");
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_generate_shipment_list_document_report_request) {
        cJSON_Delete(localVarSingleItemJSON_generate_shipment_list_document_report_request);
        localVarSingleItemJSON_generate_shipment_list_document_report_request = NULL;
    }
    free(localVarBodyParameters);
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
ReportsAPI_generateShowsSalesReport(apiClient_t *apiClient, generate_shows_sales_report_request_t *generate_shows_sales_report_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateStocksOnWarehousesReport(apiClient_t *apiClient, generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateUnitedMarketplaceServicesReport(apiClient_t *apiClient, generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateUnitedNettingReport(apiClient_t *apiClient, generate_united_netting_report_request_t *generate_united_netting_report_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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
ReportsAPI_generateUnitedOrdersReport(apiClient_t *apiClient, generate_united_orders_request_t *generate_united_orders_request, report_format_type_e format)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    generate_report_response_t *elementToReturn = generate_report_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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

// Получение заданного отчета
//
// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_report_info_response_t*
ReportsAPI_getReportInfo(apiClient_t *apiClient, char *reportId)
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
    cJSON *ReportsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_report_info_response_t *elementToReturn = get_report_info_response_parseFromJSON(ReportsAPIlocalVarJSON);
    cJSON_Delete(ReportsAPIlocalVarJSON);
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

