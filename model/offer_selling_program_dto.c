#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_selling_program_dto.h"


char* offer_selling_program_dto_selling_program_ToString(_api__offer_selling_program_dto__e selling_program) {
    char* selling_programArray[] =  { "NULL", "FBY", "FBS", "DBS", "EXPRESS" };
    return selling_programArray[selling_program];
}

_api__offer_selling_program_dto__e offer_selling_program_dto_selling_program_FromString(char* selling_program){
    int stringToReturn = 0;
    char *selling_programArray[] =  { "NULL", "FBY", "FBS", "DBS", "EXPRESS" };
    size_t sizeofArray = sizeof(selling_programArray) / sizeof(selling_programArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(selling_program, selling_programArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* offer_selling_program_dto_status_ToString(_api__offer_selling_program_dto__e status) {
    char* statusArray[] =  { "NULL", "FINE", "REJECT" };
    return statusArray[status];
}

_api__offer_selling_program_dto__e offer_selling_program_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "FINE", "REJECT" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_selling_program_dto_t *offer_selling_program_dto_create(
    selling_program_type_t *selling_program,
    offer_selling_program_status_type_t *status
    ) {
    offer_selling_program_dto_t *offer_selling_program_dto_local_var = malloc(sizeof(offer_selling_program_dto_t));
    if (!offer_selling_program_dto_local_var) {
        return NULL;
    }
    offer_selling_program_dto_local_var->selling_program = selling_program;
    offer_selling_program_dto_local_var->status = status;

    return offer_selling_program_dto_local_var;
}


void offer_selling_program_dto_free(offer_selling_program_dto_t *offer_selling_program_dto) {
    if(NULL == offer_selling_program_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_selling_program_dto->selling_program) {
        selling_program_type_free(offer_selling_program_dto->selling_program);
        offer_selling_program_dto->selling_program = NULL;
    }
    if (offer_selling_program_dto->status) {
        offer_selling_program_status_type_free(offer_selling_program_dto->status);
        offer_selling_program_dto->status = NULL;
    }
    free(offer_selling_program_dto);
}

cJSON *offer_selling_program_dto_convertToJSON(offer_selling_program_dto_t *offer_selling_program_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_selling_program_dto->selling_program
    if (_api__offer_selling_program_dto__NULL == offer_selling_program_dto->selling_program) {
        goto fail;
    }
    cJSON *selling_program_local_JSON = selling_program_type_convertToJSON(offer_selling_program_dto->selling_program);
    if(selling_program_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sellingProgram", selling_program_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // offer_selling_program_dto->status
    if (_api__offer_selling_program_dto__NULL == offer_selling_program_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = offer_selling_program_status_type_convertToJSON(offer_selling_program_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_selling_program_dto_t *offer_selling_program_dto_parseFromJSON(cJSON *offer_selling_program_dtoJSON){

    offer_selling_program_dto_t *offer_selling_program_dto_local_var = NULL;

    // define the local variable for offer_selling_program_dto->selling_program
    selling_program_type_t *selling_program_local_nonprim = NULL;

    // define the local variable for offer_selling_program_dto->status
    offer_selling_program_status_type_t *status_local_nonprim = NULL;

    // offer_selling_program_dto->selling_program
    cJSON *selling_program = cJSON_GetObjectItemCaseSensitive(offer_selling_program_dtoJSON, "sellingProgram");
    if (!selling_program) {
        goto end;
    }

    
    selling_program_local_nonprim = selling_program_type_parseFromJSON(selling_program); //custom

    // offer_selling_program_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(offer_selling_program_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = offer_selling_program_status_type_parseFromJSON(status); //custom


    offer_selling_program_dto_local_var = offer_selling_program_dto_create (
        selling_program_local_nonprim,
        status_local_nonprim
        );

    return offer_selling_program_dto_local_var;
end:
    if (selling_program_local_nonprim) {
        selling_program_type_free(selling_program_local_nonprim);
        selling_program_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        offer_selling_program_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
