#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_dto.h"


char* document_dto_status_ToString(_api__document_dto__e status) {
    char* statusArray[] =  { "NULL", "READY", "NOT_READY" };
    return statusArray[status];
}

_api__document_dto__e document_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "READY", "NOT_READY" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

document_dto_t *document_dto_create(
    order_document_status_type_t *status,
    char *number,
    char *date
    ) {
    document_dto_t *document_dto_local_var = malloc(sizeof(document_dto_t));
    if (!document_dto_local_var) {
        return NULL;
    }
    document_dto_local_var->status = status;
    document_dto_local_var->number = number;
    document_dto_local_var->date = date;

    return document_dto_local_var;
}


void document_dto_free(document_dto_t *document_dto) {
    if(NULL == document_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (document_dto->status) {
        order_document_status_type_free(document_dto->status);
        document_dto->status = NULL;
    }
    if (document_dto->number) {
        free(document_dto->number);
        document_dto->number = NULL;
    }
    if (document_dto->date) {
        free(document_dto->date);
        document_dto->date = NULL;
    }
    free(document_dto);
}

cJSON *document_dto_convertToJSON(document_dto_t *document_dto) {
    cJSON *item = cJSON_CreateObject();

    // document_dto->status
    if(document_dto->status != _api__document_dto__NULL) {
    cJSON *status_local_JSON = order_document_status_type_convertToJSON(document_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // document_dto->number
    if(document_dto->number) {
    if(cJSON_AddStringToObject(item, "number", document_dto->number) == NULL) {
    goto fail; //String
    }
    }


    // document_dto->date
    if(document_dto->date) {
    if(cJSON_AddStringToObject(item, "date", document_dto->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

document_dto_t *document_dto_parseFromJSON(cJSON *document_dtoJSON){

    document_dto_t *document_dto_local_var = NULL;

    // define the local variable for document_dto->status
    order_document_status_type_t *status_local_nonprim = NULL;

    // document_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(document_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = order_document_status_type_parseFromJSON(status); //custom
    }

    // document_dto->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(document_dtoJSON, "number");
    if (number) { 
    if(!cJSON_IsString(number) && !cJSON_IsNull(number))
    {
    goto end; //String
    }
    }

    // document_dto->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(document_dtoJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    document_dto_local_var = document_dto_create (
        status ? status_local_nonprim : NULL,
        number && !cJSON_IsNull(number) ? strdup(number->valuestring) : NULL,
        date ? strdup(date->valuestring) : NULL
        );

    return document_dto_local_var;
end:
    if (status_local_nonprim) {
        order_document_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
