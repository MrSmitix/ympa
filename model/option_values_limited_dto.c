#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "option_values_limited_dto.h"



option_values_limited_dto_t *option_values_limited_dto_create(
    long limiting_option_value_id,
    list_t *option_value_ids
    ) {
    option_values_limited_dto_t *option_values_limited_dto_local_var = malloc(sizeof(option_values_limited_dto_t));
    if (!option_values_limited_dto_local_var) {
        return NULL;
    }
    option_values_limited_dto_local_var->limiting_option_value_id = limiting_option_value_id;
    option_values_limited_dto_local_var->option_value_ids = option_value_ids;

    return option_values_limited_dto_local_var;
}


void option_values_limited_dto_free(option_values_limited_dto_t *option_values_limited_dto) {
    if(NULL == option_values_limited_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (option_values_limited_dto->option_value_ids) {
        list_ForEach(listEntry, option_values_limited_dto->option_value_ids) {
            free(listEntry->data);
        }
        list_freeList(option_values_limited_dto->option_value_ids);
        option_values_limited_dto->option_value_ids = NULL;
    }
    free(option_values_limited_dto);
}

cJSON *option_values_limited_dto_convertToJSON(option_values_limited_dto_t *option_values_limited_dto) {
    cJSON *item = cJSON_CreateObject();

    // option_values_limited_dto->limiting_option_value_id
    if (!option_values_limited_dto->limiting_option_value_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "limitingOptionValueId", option_values_limited_dto->limiting_option_value_id) == NULL) {
    goto fail; //Numeric
    }


    // option_values_limited_dto->option_value_ids
    if (!option_values_limited_dto->option_value_ids) {
        goto fail;
    }
    cJSON *option_value_ids = cJSON_AddArrayToObject(item, "optionValueIds");
    if(option_value_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *option_value_idsListEntry;
    list_ForEach(option_value_idsListEntry, option_values_limited_dto->option_value_ids) {
    if(cJSON_AddNumberToObject(option_value_ids, "", *(double *)option_value_idsListEntry->data) == NULL)
    {
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

option_values_limited_dto_t *option_values_limited_dto_parseFromJSON(cJSON *option_values_limited_dtoJSON){

    option_values_limited_dto_t *option_values_limited_dto_local_var = NULL;

    // define the local list for option_values_limited_dto->option_value_ids
    list_t *option_value_idsList = NULL;

    // option_values_limited_dto->limiting_option_value_id
    cJSON *limiting_option_value_id = cJSON_GetObjectItemCaseSensitive(option_values_limited_dtoJSON, "limitingOptionValueId");
    if (!limiting_option_value_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(limiting_option_value_id))
    {
    goto end; //Numeric
    }

    // option_values_limited_dto->option_value_ids
    cJSON *option_value_ids = cJSON_GetObjectItemCaseSensitive(option_values_limited_dtoJSON, "optionValueIds");
    if (!option_value_ids) {
        goto end;
    }

    
    cJSON *option_value_ids_local = NULL;
    if(!cJSON_IsArray(option_value_ids)) {
        goto end;//primitive container
    }
    option_value_idsList = list_createList();

    cJSON_ArrayForEach(option_value_ids_local, option_value_ids)
    {
        if(!cJSON_IsNumber(option_value_ids_local))
        {
            goto end;
        }
        double *option_value_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!option_value_ids_local_value)
        {
            goto end;
        }
        *option_value_ids_local_value = option_value_ids_local->valuedouble;
        list_addElement(option_value_idsList , option_value_ids_local_value);
    }


    option_values_limited_dto_local_var = option_values_limited_dto_create (
        limiting_option_value_id->valuedouble,
        option_value_idsList
        );

    return option_values_limited_dto_local_var;
end:
    if (option_value_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, option_value_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(option_value_idsList);
        option_value_idsList = NULL;
    }
    return NULL;

}
