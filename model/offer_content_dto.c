#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_content_dto.h"



offer_content_dto_t *offer_content_dto_create(
    char *offer_id,
    int category_id,
    list_t *parameter_values
    ) {
    offer_content_dto_t *offer_content_dto_local_var = malloc(sizeof(offer_content_dto_t));
    if (!offer_content_dto_local_var) {
        return NULL;
    }
    offer_content_dto_local_var->offer_id = offer_id;
    offer_content_dto_local_var->category_id = category_id;
    offer_content_dto_local_var->parameter_values = parameter_values;

    return offer_content_dto_local_var;
}


void offer_content_dto_free(offer_content_dto_t *offer_content_dto) {
    if(NULL == offer_content_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_content_dto->offer_id) {
        free(offer_content_dto->offer_id);
        offer_content_dto->offer_id = NULL;
    }
    if (offer_content_dto->parameter_values) {
        list_ForEach(listEntry, offer_content_dto->parameter_values) {
            parameter_value_dto_free(listEntry->data);
        }
        list_freeList(offer_content_dto->parameter_values);
        offer_content_dto->parameter_values = NULL;
    }
    free(offer_content_dto);
}

cJSON *offer_content_dto_convertToJSON(offer_content_dto_t *offer_content_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_content_dto->offer_id
    if (!offer_content_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", offer_content_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // offer_content_dto->category_id
    if (!offer_content_dto->category_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "categoryId", offer_content_dto->category_id) == NULL) {
    goto fail; //Numeric
    }


    // offer_content_dto->parameter_values
    if (!offer_content_dto->parameter_values) {
        goto fail;
    }
    cJSON *parameter_values = cJSON_AddArrayToObject(item, "parameterValues");
    if(parameter_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parameter_valuesListEntry;
    if (offer_content_dto->parameter_values) {
    list_ForEach(parameter_valuesListEntry, offer_content_dto->parameter_values) {
    cJSON *itemLocal = parameter_value_dto_convertToJSON(parameter_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parameter_values, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_content_dto_t *offer_content_dto_parseFromJSON(cJSON *offer_content_dtoJSON){

    offer_content_dto_t *offer_content_dto_local_var = NULL;

    // define the local list for offer_content_dto->parameter_values
    list_t *parameter_valuesList = NULL;

    // offer_content_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(offer_content_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // offer_content_dto->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(offer_content_dtoJSON, "categoryId");
    if (!category_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }

    // offer_content_dto->parameter_values
    cJSON *parameter_values = cJSON_GetObjectItemCaseSensitive(offer_content_dtoJSON, "parameterValues");
    if (!parameter_values) {
        goto end;
    }

    
    cJSON *parameter_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parameter_values)){
        goto end; //nonprimitive container
    }

    parameter_valuesList = list_createList();

    cJSON_ArrayForEach(parameter_values_local_nonprimitive,parameter_values )
    {
        if(!cJSON_IsObject(parameter_values_local_nonprimitive)){
            goto end;
        }
        parameter_value_dto_t *parameter_valuesItem = parameter_value_dto_parseFromJSON(parameter_values_local_nonprimitive);

        list_addElement(parameter_valuesList, parameter_valuesItem);
    }


    offer_content_dto_local_var = offer_content_dto_create (
        strdup(offer_id->valuestring),
        category_id->valuedouble,
        parameter_valuesList
        );

    return offer_content_dto_local_var;
end:
    if (parameter_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parameter_valuesList) {
            parameter_value_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parameter_valuesList);
        parameter_valuesList = NULL;
    }
    return NULL;

}
