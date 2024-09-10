#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_card_recommendation_dto.h"


char* offer_card_recommendation_dto_type_ToString(_api__offer_card_recommendation_dto__e type) {
    char* typeArray[] =  { "NULL", "HAS_VIDEO", "RECOGNIZED_VENDOR", "MAIN", "ADDITIONAL", "DISTINCTIVE", "FILTERABLE", "PICTURE_COUNT", "HAS_DESCRIPTION", "HAS_BARCODE", "FIRST_PICTURE_SIZE", "TITLE_LENGTH", "DESCRIPTION_LENGTH", "AVERAGE_PICTURE_SIZE", "FIRST_VIDEO_SIZE", "FIRST_VIDEO_LENGTH", "AVERAGE_VIDEO_SIZE", "VIDEO_COUNT" };
    return typeArray[type];
}

_api__offer_card_recommendation_dto__e offer_card_recommendation_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "HAS_VIDEO", "RECOGNIZED_VENDOR", "MAIN", "ADDITIONAL", "DISTINCTIVE", "FILTERABLE", "PICTURE_COUNT", "HAS_DESCRIPTION", "HAS_BARCODE", "FIRST_PICTURE_SIZE", "TITLE_LENGTH", "DESCRIPTION_LENGTH", "AVERAGE_PICTURE_SIZE", "FIRST_VIDEO_SIZE", "FIRST_VIDEO_LENGTH", "AVERAGE_VIDEO_SIZE", "VIDEO_COUNT" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_card_recommendation_dto_t *offer_card_recommendation_dto_create(
    offer_card_recommendation_type_t *type,
    int percent
    ) {
    offer_card_recommendation_dto_t *offer_card_recommendation_dto_local_var = malloc(sizeof(offer_card_recommendation_dto_t));
    if (!offer_card_recommendation_dto_local_var) {
        return NULL;
    }
    offer_card_recommendation_dto_local_var->type = type;
    offer_card_recommendation_dto_local_var->percent = percent;

    return offer_card_recommendation_dto_local_var;
}


void offer_card_recommendation_dto_free(offer_card_recommendation_dto_t *offer_card_recommendation_dto) {
    if(NULL == offer_card_recommendation_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_card_recommendation_dto->type) {
        offer_card_recommendation_type_free(offer_card_recommendation_dto->type);
        offer_card_recommendation_dto->type = NULL;
    }
    free(offer_card_recommendation_dto);
}

cJSON *offer_card_recommendation_dto_convertToJSON(offer_card_recommendation_dto_t *offer_card_recommendation_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_card_recommendation_dto->type
    if (_api__offer_card_recommendation_dto__NULL == offer_card_recommendation_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = offer_card_recommendation_type_convertToJSON(offer_card_recommendation_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // offer_card_recommendation_dto->percent
    if(offer_card_recommendation_dto->percent) {
    if(cJSON_AddNumberToObject(item, "percent", offer_card_recommendation_dto->percent) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_card_recommendation_dto_t *offer_card_recommendation_dto_parseFromJSON(cJSON *offer_card_recommendation_dtoJSON){

    offer_card_recommendation_dto_t *offer_card_recommendation_dto_local_var = NULL;

    // define the local variable for offer_card_recommendation_dto->type
    offer_card_recommendation_type_t *type_local_nonprim = NULL;

    // offer_card_recommendation_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(offer_card_recommendation_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = offer_card_recommendation_type_parseFromJSON(type); //custom

    // offer_card_recommendation_dto->percent
    cJSON *percent = cJSON_GetObjectItemCaseSensitive(offer_card_recommendation_dtoJSON, "percent");
    if (percent) { 
    if(!cJSON_IsNumber(percent))
    {
    goto end; //Numeric
    }
    }


    offer_card_recommendation_dto_local_var = offer_card_recommendation_dto_create (
        type_local_nonprim,
        percent ? percent->valuedouble : 0
        );

    return offer_card_recommendation_dto_local_var;
end:
    if (type_local_nonprim) {
        offer_card_recommendation_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
