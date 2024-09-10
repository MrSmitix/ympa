#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_condition_dto.h"


char* offer_condition_dto_type_ToString(_api__offer_condition_dto__e type) {
    char* typeArray[] =  { "NULL", "PREOWNED", "SHOWCASESAMPLE", "REFURBISHED", "REDUCTION", "RENOVATED", "NOT_SPECIFIED" };
    return typeArray[type];
}

_api__offer_condition_dto__e offer_condition_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "PREOWNED", "SHOWCASESAMPLE", "REFURBISHED", "REDUCTION", "RENOVATED", "NOT_SPECIFIED" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* offer_condition_dto_quality_ToString(_api__offer_condition_dto__e quality) {
    char* qualityArray[] =  { "NULL", "PERFECT", "EXCELLENT", "GOOD", "NOT_SPECIFIED" };
    return qualityArray[quality];
}

_api__offer_condition_dto__e offer_condition_dto_quality_FromString(char* quality){
    int stringToReturn = 0;
    char *qualityArray[] =  { "NULL", "PERFECT", "EXCELLENT", "GOOD", "NOT_SPECIFIED" };
    size_t sizeofArray = sizeof(qualityArray) / sizeof(qualityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(quality, qualityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_condition_dto_t *offer_condition_dto_create(
    offer_condition_type_t *type,
    offer_condition_quality_type_t *quality,
    char *reason
    ) {
    offer_condition_dto_t *offer_condition_dto_local_var = malloc(sizeof(offer_condition_dto_t));
    if (!offer_condition_dto_local_var) {
        return NULL;
    }
    offer_condition_dto_local_var->type = type;
    offer_condition_dto_local_var->quality = quality;
    offer_condition_dto_local_var->reason = reason;

    return offer_condition_dto_local_var;
}


void offer_condition_dto_free(offer_condition_dto_t *offer_condition_dto) {
    if(NULL == offer_condition_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_condition_dto->type) {
        offer_condition_type_free(offer_condition_dto->type);
        offer_condition_dto->type = NULL;
    }
    if (offer_condition_dto->quality) {
        offer_condition_quality_type_free(offer_condition_dto->quality);
        offer_condition_dto->quality = NULL;
    }
    if (offer_condition_dto->reason) {
        free(offer_condition_dto->reason);
        offer_condition_dto->reason = NULL;
    }
    free(offer_condition_dto);
}

cJSON *offer_condition_dto_convertToJSON(offer_condition_dto_t *offer_condition_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_condition_dto->type
    if(offer_condition_dto->type != _api__offer_condition_dto__NULL) {
    cJSON *type_local_JSON = offer_condition_type_convertToJSON(offer_condition_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_condition_dto->quality
    if(offer_condition_dto->quality != _api__offer_condition_dto__NULL) {
    cJSON *quality_local_JSON = offer_condition_quality_type_convertToJSON(offer_condition_dto->quality);
    if(quality_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "quality", quality_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_condition_dto->reason
    if(offer_condition_dto->reason) {
    if(cJSON_AddStringToObject(item, "reason", offer_condition_dto->reason) == NULL) {
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

offer_condition_dto_t *offer_condition_dto_parseFromJSON(cJSON *offer_condition_dtoJSON){

    offer_condition_dto_t *offer_condition_dto_local_var = NULL;

    // define the local variable for offer_condition_dto->type
    offer_condition_type_t *type_local_nonprim = NULL;

    // define the local variable for offer_condition_dto->quality
    offer_condition_quality_type_t *quality_local_nonprim = NULL;

    // offer_condition_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(offer_condition_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = offer_condition_type_parseFromJSON(type); //custom
    }

    // offer_condition_dto->quality
    cJSON *quality = cJSON_GetObjectItemCaseSensitive(offer_condition_dtoJSON, "quality");
    if (quality) { 
    quality_local_nonprim = offer_condition_quality_type_parseFromJSON(quality); //custom
    }

    // offer_condition_dto->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(offer_condition_dtoJSON, "reason");
    if (reason) { 
    if(!cJSON_IsString(reason) && !cJSON_IsNull(reason))
    {
    goto end; //String
    }
    }


    offer_condition_dto_local_var = offer_condition_dto_create (
        type ? type_local_nonprim : NULL,
        quality ? quality_local_nonprim : NULL,
        reason && !cJSON_IsNull(reason) ? strdup(reason->valuestring) : NULL
        );

    return offer_condition_dto_local_var;
end:
    if (type_local_nonprim) {
        offer_condition_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (quality_local_nonprim) {
        offer_condition_quality_type_free(quality_local_nonprim);
        quality_local_nonprim = NULL;
    }
    return NULL;

}
