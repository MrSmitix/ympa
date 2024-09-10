#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BusinessesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Настройки кабинета
//
// Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_business_settings_response_t*
BusinessesAPI_getBusinessSettings(apiClient_t *apiClient, long businessId)
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
    cJSON *BusinessesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_settings_response_t *elementToReturn = get_business_settings_response_parseFromJSON(BusinessesAPIlocalVarJSON);
    cJSON_Delete(BusinessesAPIlocalVarJSON);
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

