#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_offers_to_archive_error_dto.h"


char* add_offers_to_archive_error_dto_error_ToString(_api__add_offers_to_archive_error_dto__e error) {
    char* errorArray[] =  { "NULL", "OFFER_HAS_STOCKS", "UNKNOWN" };
    return errorArray[error];
}

_api__add_offers_to_archive_error_dto__e add_offers_to_archive_error_dto_error_FromString(char* error){
    int stringToReturn = 0;
    char *errorArray[] =  { "NULL", "OFFER_HAS_STOCKS", "UNKNOWN" };
    size_t sizeofArray = sizeof(errorArray) / sizeof(errorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(error, errorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto_create(
    char *offer_id,
    add_offers_to_archive_error_type_t *error
    ) {
    add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto_local_var = malloc(sizeof(add_offers_to_archive_error_dto_t));
    if (!add_offers_to_archive_error_dto_local_var) {
        return NULL;
    }
    add_offers_to_archive_error_dto_local_var->offer_id = offer_id;
    add_offers_to_archive_error_dto_local_var->error = error;

    return add_offers_to_archive_error_dto_local_var;
}


void add_offers_to_archive_error_dto_free(add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto) {
    if(NULL == add_offers_to_archive_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (add_offers_to_archive_error_dto->offer_id) {
        free(add_offers_to_archive_error_dto->offer_id);
        add_offers_to_archive_error_dto->offer_id = NULL;
    }
    if (add_offers_to_archive_error_dto->error) {
        add_offers_to_archive_error_type_free(add_offers_to_archive_error_dto->error);
        add_offers_to_archive_error_dto->error = NULL;
    }
    free(add_offers_to_archive_error_dto);
}

cJSON *add_offers_to_archive_error_dto_convertToJSON(add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // add_offers_to_archive_error_dto->offer_id
    if (!add_offers_to_archive_error_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", add_offers_to_archive_error_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // add_offers_to_archive_error_dto->error
    if (_api__add_offers_to_archive_error_dto__NULL == add_offers_to_archive_error_dto->error) {
        goto fail;
    }
    cJSON *error_local_JSON = add_offers_to_archive_error_type_convertToJSON(add_offers_to_archive_error_dto->error);
    if(error_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
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

add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto_parseFromJSON(cJSON *add_offers_to_archive_error_dtoJSON){

    add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto_local_var = NULL;

    // define the local variable for add_offers_to_archive_error_dto->error
    add_offers_to_archive_error_type_t *error_local_nonprim = NULL;

    // add_offers_to_archive_error_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_error_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // add_offers_to_archive_error_dto->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_error_dtoJSON, "error");
    if (!error) {
        goto end;
    }

    
    error_local_nonprim = add_offers_to_archive_error_type_parseFromJSON(error); //custom


    add_offers_to_archive_error_dto_local_var = add_offers_to_archive_error_dto_create (
        strdup(offer_id->valuestring),
        error_local_nonprim
        );

    return add_offers_to_archive_error_dto_local_var;
end:
    if (error_local_nonprim) {
        add_offers_to_archive_error_type_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
