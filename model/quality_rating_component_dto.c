#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_rating_component_dto.h"


char* quality_rating_component_dto_component_type_ToString(_api__quality_rating_component_dto__e component_type) {
    char* component_typeArray[] =  { "NULL", "DBS_CANCELLATION_RATE", "DBS_LATE_DELIVERY_RATE", "FBS_CANCELLATION_RATE", "FBS_LATE_SHIP_RATE", "FBY_LATE_DELIVERY_RATE", "FBY_CANCELLATION_RATE", "FBY_DELIVERY_DIFF_RATE", "FBY_LATE_EDITING_RATE" };
    return component_typeArray[component_type];
}

_api__quality_rating_component_dto__e quality_rating_component_dto_component_type_FromString(char* component_type){
    int stringToReturn = 0;
    char *component_typeArray[] =  { "NULL", "DBS_CANCELLATION_RATE", "DBS_LATE_DELIVERY_RATE", "FBS_CANCELLATION_RATE", "FBS_LATE_SHIP_RATE", "FBY_LATE_DELIVERY_RATE", "FBY_CANCELLATION_RATE", "FBY_DELIVERY_DIFF_RATE", "FBY_LATE_EDITING_RATE" };
    size_t sizeofArray = sizeof(component_typeArray) / sizeof(component_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(component_type, component_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

quality_rating_component_dto_t *quality_rating_component_dto_create(
    double value,
    quality_rating_component_type_t *component_type
    ) {
    quality_rating_component_dto_t *quality_rating_component_dto_local_var = malloc(sizeof(quality_rating_component_dto_t));
    if (!quality_rating_component_dto_local_var) {
        return NULL;
    }
    quality_rating_component_dto_local_var->value = value;
    quality_rating_component_dto_local_var->component_type = component_type;

    return quality_rating_component_dto_local_var;
}


void quality_rating_component_dto_free(quality_rating_component_dto_t *quality_rating_component_dto) {
    if(NULL == quality_rating_component_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (quality_rating_component_dto->component_type) {
        quality_rating_component_type_free(quality_rating_component_dto->component_type);
        quality_rating_component_dto->component_type = NULL;
    }
    free(quality_rating_component_dto);
}

cJSON *quality_rating_component_dto_convertToJSON(quality_rating_component_dto_t *quality_rating_component_dto) {
    cJSON *item = cJSON_CreateObject();

    // quality_rating_component_dto->value
    if (!quality_rating_component_dto->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", quality_rating_component_dto->value) == NULL) {
    goto fail; //Numeric
    }


    // quality_rating_component_dto->component_type
    if (_api__quality_rating_component_dto__NULL == quality_rating_component_dto->component_type) {
        goto fail;
    }
    cJSON *component_type_local_JSON = quality_rating_component_type_convertToJSON(quality_rating_component_dto->component_type);
    if(component_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "componentType", component_type_local_JSON);
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

quality_rating_component_dto_t *quality_rating_component_dto_parseFromJSON(cJSON *quality_rating_component_dtoJSON){

    quality_rating_component_dto_t *quality_rating_component_dto_local_var = NULL;

    // define the local variable for quality_rating_component_dto->component_type
    quality_rating_component_type_t *component_type_local_nonprim = NULL;

    // quality_rating_component_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(quality_rating_component_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // quality_rating_component_dto->component_type
    cJSON *component_type = cJSON_GetObjectItemCaseSensitive(quality_rating_component_dtoJSON, "componentType");
    if (!component_type) {
        goto end;
    }

    
    component_type_local_nonprim = quality_rating_component_type_parseFromJSON(component_type); //custom


    quality_rating_component_dto_local_var = quality_rating_component_dto_create (
        value->valuedouble,
        component_type_local_nonprim
        );

    return quality_rating_component_dto_local_var;
end:
    if (component_type_local_nonprim) {
        quality_rating_component_type_free(component_type_local_nonprim);
        component_type_local_nonprim = NULL;
    }
    return NULL;

}
