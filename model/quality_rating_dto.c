#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_rating_dto.h"



quality_rating_dto_t *quality_rating_dto_create(
    long rating,
    char *calculation_date,
    list_t *components
    ) {
    quality_rating_dto_t *quality_rating_dto_local_var = malloc(sizeof(quality_rating_dto_t));
    if (!quality_rating_dto_local_var) {
        return NULL;
    }
    quality_rating_dto_local_var->rating = rating;
    quality_rating_dto_local_var->calculation_date = calculation_date;
    quality_rating_dto_local_var->components = components;

    return quality_rating_dto_local_var;
}


void quality_rating_dto_free(quality_rating_dto_t *quality_rating_dto) {
    if(NULL == quality_rating_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (quality_rating_dto->calculation_date) {
        free(quality_rating_dto->calculation_date);
        quality_rating_dto->calculation_date = NULL;
    }
    if (quality_rating_dto->components) {
        list_ForEach(listEntry, quality_rating_dto->components) {
            quality_rating_component_dto_free(listEntry->data);
        }
        list_freeList(quality_rating_dto->components);
        quality_rating_dto->components = NULL;
    }
    free(quality_rating_dto);
}

cJSON *quality_rating_dto_convertToJSON(quality_rating_dto_t *quality_rating_dto) {
    cJSON *item = cJSON_CreateObject();

    // quality_rating_dto->rating
    if (!quality_rating_dto->rating) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rating", quality_rating_dto->rating) == NULL) {
    goto fail; //Numeric
    }


    // quality_rating_dto->calculation_date
    if (!quality_rating_dto->calculation_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "calculationDate", quality_rating_dto->calculation_date) == NULL) {
    goto fail; //Date
    }


    // quality_rating_dto->components
    if (!quality_rating_dto->components) {
        goto fail;
    }
    cJSON *components = cJSON_AddArrayToObject(item, "components");
    if(components == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *componentsListEntry;
    if (quality_rating_dto->components) {
    list_ForEach(componentsListEntry, quality_rating_dto->components) {
    cJSON *itemLocal = quality_rating_component_dto_convertToJSON(componentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(components, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

quality_rating_dto_t *quality_rating_dto_parseFromJSON(cJSON *quality_rating_dtoJSON){

    quality_rating_dto_t *quality_rating_dto_local_var = NULL;

    // define the local list for quality_rating_dto->components
    list_t *componentsList = NULL;

    // quality_rating_dto->rating
    cJSON *rating = cJSON_GetObjectItemCaseSensitive(quality_rating_dtoJSON, "rating");
    if (!rating) {
        goto end;
    }

    
    if(!cJSON_IsNumber(rating))
    {
    goto end; //Numeric
    }

    // quality_rating_dto->calculation_date
    cJSON *calculation_date = cJSON_GetObjectItemCaseSensitive(quality_rating_dtoJSON, "calculationDate");
    if (!calculation_date) {
        goto end;
    }

    
    if(!cJSON_IsString(calculation_date))
    {
    goto end; //Date
    }

    // quality_rating_dto->components
    cJSON *components = cJSON_GetObjectItemCaseSensitive(quality_rating_dtoJSON, "components");
    if (!components) {
        goto end;
    }

    
    cJSON *components_local_nonprimitive = NULL;
    if(!cJSON_IsArray(components)){
        goto end; //nonprimitive container
    }

    componentsList = list_createList();

    cJSON_ArrayForEach(components_local_nonprimitive,components )
    {
        if(!cJSON_IsObject(components_local_nonprimitive)){
            goto end;
        }
        quality_rating_component_dto_t *componentsItem = quality_rating_component_dto_parseFromJSON(components_local_nonprimitive);

        list_addElement(componentsList, componentsItem);
    }


    quality_rating_dto_local_var = quality_rating_dto_create (
        rating->valuedouble,
        strdup(calculation_date->valuestring),
        componentsList
        );

    return quality_rating_dto_local_var;
end:
    if (componentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, componentsList) {
            quality_rating_component_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(componentsList);
        componentsList = NULL;
    }
    return NULL;

}
