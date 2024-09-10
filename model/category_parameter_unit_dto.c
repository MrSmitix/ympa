#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "category_parameter_unit_dto.h"



category_parameter_unit_dto_t *category_parameter_unit_dto_create(
    long default_unit_id,
    list_t *units
    ) {
    category_parameter_unit_dto_t *category_parameter_unit_dto_local_var = malloc(sizeof(category_parameter_unit_dto_t));
    if (!category_parameter_unit_dto_local_var) {
        return NULL;
    }
    category_parameter_unit_dto_local_var->default_unit_id = default_unit_id;
    category_parameter_unit_dto_local_var->units = units;

    return category_parameter_unit_dto_local_var;
}


void category_parameter_unit_dto_free(category_parameter_unit_dto_t *category_parameter_unit_dto) {
    if(NULL == category_parameter_unit_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (category_parameter_unit_dto->units) {
        list_ForEach(listEntry, category_parameter_unit_dto->units) {
            unit_dto_free(listEntry->data);
        }
        list_freeList(category_parameter_unit_dto->units);
        category_parameter_unit_dto->units = NULL;
    }
    free(category_parameter_unit_dto);
}

cJSON *category_parameter_unit_dto_convertToJSON(category_parameter_unit_dto_t *category_parameter_unit_dto) {
    cJSON *item = cJSON_CreateObject();

    // category_parameter_unit_dto->default_unit_id
    if (!category_parameter_unit_dto->default_unit_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "defaultUnitId", category_parameter_unit_dto->default_unit_id) == NULL) {
    goto fail; //Numeric
    }


    // category_parameter_unit_dto->units
    if (!category_parameter_unit_dto->units) {
        goto fail;
    }
    cJSON *units = cJSON_AddArrayToObject(item, "units");
    if(units == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *unitsListEntry;
    if (category_parameter_unit_dto->units) {
    list_ForEach(unitsListEntry, category_parameter_unit_dto->units) {
    cJSON *itemLocal = unit_dto_convertToJSON(unitsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(units, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

category_parameter_unit_dto_t *category_parameter_unit_dto_parseFromJSON(cJSON *category_parameter_unit_dtoJSON){

    category_parameter_unit_dto_t *category_parameter_unit_dto_local_var = NULL;

    // define the local list for category_parameter_unit_dto->units
    list_t *unitsList = NULL;

    // category_parameter_unit_dto->default_unit_id
    cJSON *default_unit_id = cJSON_GetObjectItemCaseSensitive(category_parameter_unit_dtoJSON, "defaultUnitId");
    if (!default_unit_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(default_unit_id))
    {
    goto end; //Numeric
    }

    // category_parameter_unit_dto->units
    cJSON *units = cJSON_GetObjectItemCaseSensitive(category_parameter_unit_dtoJSON, "units");
    if (!units) {
        goto end;
    }

    
    cJSON *units_local_nonprimitive = NULL;
    if(!cJSON_IsArray(units)){
        goto end; //nonprimitive container
    }

    unitsList = list_createList();

    cJSON_ArrayForEach(units_local_nonprimitive,units )
    {
        if(!cJSON_IsObject(units_local_nonprimitive)){
            goto end;
        }
        unit_dto_t *unitsItem = unit_dto_parseFromJSON(units_local_nonprimitive);

        list_addElement(unitsList, unitsItem);
    }


    category_parameter_unit_dto_local_var = category_parameter_unit_dto_create (
        default_unit_id->valuedouble,
        unitsList
        );

    return category_parameter_unit_dto_local_var;
end:
    if (unitsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, unitsList) {
            unit_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(unitsList);
        unitsList = NULL;
    }
    return NULL;

}
