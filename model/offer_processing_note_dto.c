#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_processing_note_dto.h"


char* offer_processing_note_dto_type_ToString(_api__offer_processing_note_dto__e type) {
    char* typeArray[] =  { "NULL", "ASSORTMENT", "CANCELLED", "CONFLICTING_INFORMATION", "OTHER", "DEPARTMENT_FROZEN", "INCORRECT_INFORMATION", "LEGAL_CONFLICT", "NEED_CLASSIFICATION_INFORMATION", "NEED_INFORMATION", "NEED_PICTURES", "NEED_VENDOR", "NO_CATEGORY", "NO_KNOWLEDGE", "NO_PARAMETERS_IN_SHOP_TITLE", "NO_SIZE_MEASURE", "SAMPLE_LINE" };
    return typeArray[type];
}

_api__offer_processing_note_dto__e offer_processing_note_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "ASSORTMENT", "CANCELLED", "CONFLICTING_INFORMATION", "OTHER", "DEPARTMENT_FROZEN", "INCORRECT_INFORMATION", "LEGAL_CONFLICT", "NEED_CLASSIFICATION_INFORMATION", "NEED_INFORMATION", "NEED_PICTURES", "NEED_VENDOR", "NO_CATEGORY", "NO_KNOWLEDGE", "NO_PARAMETERS_IN_SHOP_TITLE", "NO_SIZE_MEASURE", "SAMPLE_LINE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_processing_note_dto_t *offer_processing_note_dto_create(
    offer_processing_note_type_t *type,
    char *payload
    ) {
    offer_processing_note_dto_t *offer_processing_note_dto_local_var = malloc(sizeof(offer_processing_note_dto_t));
    if (!offer_processing_note_dto_local_var) {
        return NULL;
    }
    offer_processing_note_dto_local_var->type = type;
    offer_processing_note_dto_local_var->payload = payload;

    return offer_processing_note_dto_local_var;
}


void offer_processing_note_dto_free(offer_processing_note_dto_t *offer_processing_note_dto) {
    if(NULL == offer_processing_note_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_processing_note_dto->type) {
        offer_processing_note_type_free(offer_processing_note_dto->type);
        offer_processing_note_dto->type = NULL;
    }
    if (offer_processing_note_dto->payload) {
        free(offer_processing_note_dto->payload);
        offer_processing_note_dto->payload = NULL;
    }
    free(offer_processing_note_dto);
}

cJSON *offer_processing_note_dto_convertToJSON(offer_processing_note_dto_t *offer_processing_note_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_processing_note_dto->type
    if(offer_processing_note_dto->type != _api__offer_processing_note_dto__NULL) {
    cJSON *type_local_JSON = offer_processing_note_type_convertToJSON(offer_processing_note_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_processing_note_dto->payload
    if(offer_processing_note_dto->payload) {
    if(cJSON_AddStringToObject(item, "payload", offer_processing_note_dto->payload) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_processing_note_dto_t *offer_processing_note_dto_parseFromJSON(cJSON *offer_processing_note_dtoJSON){

    offer_processing_note_dto_t *offer_processing_note_dto_local_var = NULL;

    // define the local variable for offer_processing_note_dto->type
    offer_processing_note_type_t *type_local_nonprim = NULL;

    // offer_processing_note_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(offer_processing_note_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = offer_processing_note_type_parseFromJSON(type); //custom
    }

    // offer_processing_note_dto->payload
    cJSON *payload = cJSON_GetObjectItemCaseSensitive(offer_processing_note_dtoJSON, "payload");
    if (payload) { 
    if(!cJSON_IsString(payload) && !cJSON_IsNull(payload))
    {
    goto end; //String
    }
    }


    offer_processing_note_dto_local_var = offer_processing_note_dto_create (
        type ? type_local_nonprim : NULL,
        payload && !cJSON_IsNull(payload) ? strdup(payload->valuestring) : NULL
        );

    return offer_processing_note_dto_local_var;
end:
    if (type_local_nonprim) {
        offer_processing_note_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
