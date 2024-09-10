#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "value_restriction_dto.h"



value_restriction_dto_t *value_restriction_dto_create(
    long limiting_parameter_id,
    list_t *limited_values
    ) {
    value_restriction_dto_t *value_restriction_dto_local_var = malloc(sizeof(value_restriction_dto_t));
    if (!value_restriction_dto_local_var) {
        return NULL;
    }
    value_restriction_dto_local_var->limiting_parameter_id = limiting_parameter_id;
    value_restriction_dto_local_var->limited_values = limited_values;

    return value_restriction_dto_local_var;
}


void value_restriction_dto_free(value_restriction_dto_t *value_restriction_dto) {
    if(NULL == value_restriction_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (value_restriction_dto->limited_values) {
        list_ForEach(listEntry, value_restriction_dto->limited_values) {
            option_values_limited_dto_free(listEntry->data);
        }
        list_freeList(value_restriction_dto->limited_values);
        value_restriction_dto->limited_values = NULL;
    }
    free(value_restriction_dto);
}

cJSON *value_restriction_dto_convertToJSON(value_restriction_dto_t *value_restriction_dto) {
    cJSON *item = cJSON_CreateObject();

    // value_restriction_dto->limiting_parameter_id
    if (!value_restriction_dto->limiting_parameter_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "limitingParameterId", value_restriction_dto->limiting_parameter_id) == NULL) {
    goto fail; //Numeric
    }


    // value_restriction_dto->limited_values
    if (!value_restriction_dto->limited_values) {
        goto fail;
    }
    cJSON *limited_values = cJSON_AddArrayToObject(item, "limitedValues");
    if(limited_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *limited_valuesListEntry;
    if (value_restriction_dto->limited_values) {
    list_ForEach(limited_valuesListEntry, value_restriction_dto->limited_values) {
    cJSON *itemLocal = option_values_limited_dto_convertToJSON(limited_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(limited_values, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

value_restriction_dto_t *value_restriction_dto_parseFromJSON(cJSON *value_restriction_dtoJSON){

    value_restriction_dto_t *value_restriction_dto_local_var = NULL;

    // define the local list for value_restriction_dto->limited_values
    list_t *limited_valuesList = NULL;

    // value_restriction_dto->limiting_parameter_id
    cJSON *limiting_parameter_id = cJSON_GetObjectItemCaseSensitive(value_restriction_dtoJSON, "limitingParameterId");
    if (!limiting_parameter_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(limiting_parameter_id))
    {
    goto end; //Numeric
    }

    // value_restriction_dto->limited_values
    cJSON *limited_values = cJSON_GetObjectItemCaseSensitive(value_restriction_dtoJSON, "limitedValues");
    if (!limited_values) {
        goto end;
    }

    
    cJSON *limited_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(limited_values)){
        goto end; //nonprimitive container
    }

    limited_valuesList = list_createList();

    cJSON_ArrayForEach(limited_values_local_nonprimitive,limited_values )
    {
        if(!cJSON_IsObject(limited_values_local_nonprimitive)){
            goto end;
        }
        option_values_limited_dto_t *limited_valuesItem = option_values_limited_dto_parseFromJSON(limited_values_local_nonprimitive);

        list_addElement(limited_valuesList, limited_valuesItem);
    }


    value_restriction_dto_local_var = value_restriction_dto_create (
        limiting_parameter_id->valuedouble,
        limited_valuesList
        );

    return value_restriction_dto_local_var;
end:
    if (limited_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, limited_valuesList) {
            option_values_limited_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(limited_valuesList);
        limited_valuesList = NULL;
    }
    return NULL;

}
