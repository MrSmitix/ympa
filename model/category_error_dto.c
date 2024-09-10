#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "category_error_dto.h"


char* category_error_dto_type_ToString(_api__category_error_dto__e type) {
    char* typeArray[] =  { "NULL", "UNKNOWN_CATEGORY", "CATEGORY_IS_NOT_LEAF" };
    return typeArray[type];
}

_api__category_error_dto__e category_error_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "UNKNOWN_CATEGORY", "CATEGORY_IS_NOT_LEAF" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

category_error_dto_t *category_error_dto_create(
    long category_id,
    category_error_type_t *type
    ) {
    category_error_dto_t *category_error_dto_local_var = malloc(sizeof(category_error_dto_t));
    if (!category_error_dto_local_var) {
        return NULL;
    }
    category_error_dto_local_var->category_id = category_id;
    category_error_dto_local_var->type = type;

    return category_error_dto_local_var;
}


void category_error_dto_free(category_error_dto_t *category_error_dto) {
    if(NULL == category_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (category_error_dto->type) {
        category_error_type_free(category_error_dto->type);
        category_error_dto->type = NULL;
    }
    free(category_error_dto);
}

cJSON *category_error_dto_convertToJSON(category_error_dto_t *category_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // category_error_dto->category_id
    if(category_error_dto->category_id) {
    if(cJSON_AddNumberToObject(item, "categoryId", category_error_dto->category_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // category_error_dto->type
    if(category_error_dto->type != _api__category_error_dto__NULL) {
    cJSON *type_local_JSON = category_error_type_convertToJSON(category_error_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
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

category_error_dto_t *category_error_dto_parseFromJSON(cJSON *category_error_dtoJSON){

    category_error_dto_t *category_error_dto_local_var = NULL;

    // define the local variable for category_error_dto->type
    category_error_type_t *type_local_nonprim = NULL;

    // category_error_dto->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(category_error_dtoJSON, "categoryId");
    if (category_id) { 
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }
    }

    // category_error_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(category_error_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = category_error_type_parseFromJSON(type); //custom
    }


    category_error_dto_local_var = category_error_dto_create (
        category_id ? category_id->valuedouble : 0,
        type ? type_local_nonprim : NULL
        );

    return category_error_dto_local_var;
end:
    if (type_local_nonprim) {
        category_error_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
