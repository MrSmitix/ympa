#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "category_content_parameters_dto.h"



category_content_parameters_dto_t *category_content_parameters_dto_create(
    int category_id,
    list_t *parameters
    ) {
    category_content_parameters_dto_t *category_content_parameters_dto_local_var = malloc(sizeof(category_content_parameters_dto_t));
    if (!category_content_parameters_dto_local_var) {
        return NULL;
    }
    category_content_parameters_dto_local_var->category_id = category_id;
    category_content_parameters_dto_local_var->parameters = parameters;

    return category_content_parameters_dto_local_var;
}


void category_content_parameters_dto_free(category_content_parameters_dto_t *category_content_parameters_dto) {
    if(NULL == category_content_parameters_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (category_content_parameters_dto->parameters) {
        list_ForEach(listEntry, category_content_parameters_dto->parameters) {
            category_parameter_dto_free(listEntry->data);
        }
        list_freeList(category_content_parameters_dto->parameters);
        category_content_parameters_dto->parameters = NULL;
    }
    free(category_content_parameters_dto);
}

cJSON *category_content_parameters_dto_convertToJSON(category_content_parameters_dto_t *category_content_parameters_dto) {
    cJSON *item = cJSON_CreateObject();

    // category_content_parameters_dto->category_id
    if (!category_content_parameters_dto->category_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "categoryId", category_content_parameters_dto->category_id) == NULL) {
    goto fail; //Numeric
    }


    // category_content_parameters_dto->parameters
    if(category_content_parameters_dto->parameters) {
    cJSON *parameters = cJSON_AddArrayToObject(item, "parameters");
    if(parameters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parametersListEntry;
    if (category_content_parameters_dto->parameters) {
    list_ForEach(parametersListEntry, category_content_parameters_dto->parameters) {
    cJSON *itemLocal = category_parameter_dto_convertToJSON(parametersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parameters, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

category_content_parameters_dto_t *category_content_parameters_dto_parseFromJSON(cJSON *category_content_parameters_dtoJSON){

    category_content_parameters_dto_t *category_content_parameters_dto_local_var = NULL;

    // define the local list for category_content_parameters_dto->parameters
    list_t *parametersList = NULL;

    // category_content_parameters_dto->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(category_content_parameters_dtoJSON, "categoryId");
    if (!category_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }

    // category_content_parameters_dto->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(category_content_parameters_dtoJSON, "parameters");
    if (parameters) { 
    cJSON *parameters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parameters)){
        goto end; //nonprimitive container
    }

    parametersList = list_createList();

    cJSON_ArrayForEach(parameters_local_nonprimitive,parameters )
    {
        if(!cJSON_IsObject(parameters_local_nonprimitive)){
            goto end;
        }
        category_parameter_dto_t *parametersItem = category_parameter_dto_parseFromJSON(parameters_local_nonprimitive);

        list_addElement(parametersList, parametersItem);
    }
    }


    category_content_parameters_dto_local_var = category_content_parameters_dto_create (
        category_id->valuedouble,
        parameters ? parametersList : NULL
        );

    return category_content_parameters_dto_local_var;
end:
    if (parametersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parametersList) {
            category_parameter_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parametersList);
        parametersList = NULL;
    }
    return NULL;

}
