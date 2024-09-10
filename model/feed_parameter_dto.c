#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_parameter_dto.h"



feed_parameter_dto_t *feed_parameter_dto_create(
    int deleted,
    char *name,
    list_t *values
    ) {
    feed_parameter_dto_t *feed_parameter_dto_local_var = malloc(sizeof(feed_parameter_dto_t));
    if (!feed_parameter_dto_local_var) {
        return NULL;
    }
    feed_parameter_dto_local_var->deleted = deleted;
    feed_parameter_dto_local_var->name = name;
    feed_parameter_dto_local_var->values = values;

    return feed_parameter_dto_local_var;
}


void feed_parameter_dto_free(feed_parameter_dto_t *feed_parameter_dto) {
    if(NULL == feed_parameter_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_parameter_dto->name) {
        free(feed_parameter_dto->name);
        feed_parameter_dto->name = NULL;
    }
    if (feed_parameter_dto->values) {
        list_ForEach(listEntry, feed_parameter_dto->values) {
            free(listEntry->data);
        }
        list_freeList(feed_parameter_dto->values);
        feed_parameter_dto->values = NULL;
    }
    free(feed_parameter_dto);
}

cJSON *feed_parameter_dto_convertToJSON(feed_parameter_dto_t *feed_parameter_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_parameter_dto->deleted
    if(feed_parameter_dto->deleted) {
    if(cJSON_AddBoolToObject(item, "deleted", feed_parameter_dto->deleted) == NULL) {
    goto fail; //Bool
    }
    }


    // feed_parameter_dto->name
    if (!feed_parameter_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", feed_parameter_dto->name) == NULL) {
    goto fail; //String
    }


    // feed_parameter_dto->values
    if(feed_parameter_dto->values) {
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, feed_parameter_dto->values) {
    if(cJSON_AddNumberToObject(values, "", *(double *)valuesListEntry->data) == NULL)
    {
        goto fail;
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

feed_parameter_dto_t *feed_parameter_dto_parseFromJSON(cJSON *feed_parameter_dtoJSON){

    feed_parameter_dto_t *feed_parameter_dto_local_var = NULL;

    // define the local list for feed_parameter_dto->values
    list_t *valuesList = NULL;

    // feed_parameter_dto->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(feed_parameter_dtoJSON, "deleted");
    if (deleted) { 
    if(!cJSON_IsBool(deleted))
    {
    goto end; //Bool
    }
    }

    // feed_parameter_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feed_parameter_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // feed_parameter_dto->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(feed_parameter_dtoJSON, "values");
    if (values) { 
    cJSON *values_local = NULL;
    if(!cJSON_IsArray(values)) {
        goto end;//primitive container
    }
    valuesList = list_createList();

    cJSON_ArrayForEach(values_local, values)
    {
        if(!cJSON_IsNumber(values_local))
        {
            goto end;
        }
        double *values_local_value = (double *)calloc(1, sizeof(double));
        if(!values_local_value)
        {
            goto end;
        }
        *values_local_value = values_local->valuedouble;
        list_addElement(valuesList , values_local_value);
    }
    }


    feed_parameter_dto_local_var = feed_parameter_dto_create (
        deleted ? deleted->valueint : 0,
        strdup(name->valuestring),
        values ? valuesList : NULL
        );

    return feed_parameter_dto_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
