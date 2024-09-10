#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_report_response.h"


char* generate_report_response_status_ToString(_api__generate_report_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__generate_report_response__e generate_report_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "OK", "ERROR" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

generate_report_response_t *generate_report_response_create(
    api_response_status_type_t *status,
    generate_report_dto_t *result
    ) {
    generate_report_response_t *generate_report_response_local_var = malloc(sizeof(generate_report_response_t));
    if (!generate_report_response_local_var) {
        return NULL;
    }
    generate_report_response_local_var->status = status;
    generate_report_response_local_var->result = result;

    return generate_report_response_local_var;
}


void generate_report_response_free(generate_report_response_t *generate_report_response) {
    if(NULL == generate_report_response){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_report_response->status) {
        api_response_status_type_free(generate_report_response->status);
        generate_report_response->status = NULL;
    }
    if (generate_report_response->result) {
        generate_report_dto_free(generate_report_response->result);
        generate_report_response->result = NULL;
    }
    free(generate_report_response);
}

cJSON *generate_report_response_convertToJSON(generate_report_response_t *generate_report_response) {
    cJSON *item = cJSON_CreateObject();

    // generate_report_response->status
    if(generate_report_response->status != _api__generate_report_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(generate_report_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // generate_report_response->result
    if(generate_report_response->result) {
    cJSON *result_local_JSON = generate_report_dto_convertToJSON(generate_report_response->result);
    if(result_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "result", result_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_report_response_t *generate_report_response_parseFromJSON(cJSON *generate_report_responseJSON){

    generate_report_response_t *generate_report_response_local_var = NULL;

    // define the local variable for generate_report_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for generate_report_response->result
    generate_report_dto_t *result_local_nonprim = NULL;

    // generate_report_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(generate_report_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // generate_report_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(generate_report_responseJSON, "result");
    if (result) { 
    result_local_nonprim = generate_report_dto_parseFromJSON(result); //nonprimitive
    }


    generate_report_response_local_var = generate_report_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return generate_report_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        generate_report_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
