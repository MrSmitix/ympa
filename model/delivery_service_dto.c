#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delivery_service_dto.h"



delivery_service_dto_t *delivery_service_dto_create(
    long id,
    char *name
    ) {
    delivery_service_dto_t *delivery_service_dto_local_var = malloc(sizeof(delivery_service_dto_t));
    if (!delivery_service_dto_local_var) {
        return NULL;
    }
    delivery_service_dto_local_var->id = id;
    delivery_service_dto_local_var->name = name;

    return delivery_service_dto_local_var;
}


void delivery_service_dto_free(delivery_service_dto_t *delivery_service_dto) {
    if(NULL == delivery_service_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (delivery_service_dto->name) {
        free(delivery_service_dto->name);
        delivery_service_dto->name = NULL;
    }
    free(delivery_service_dto);
}

cJSON *delivery_service_dto_convertToJSON(delivery_service_dto_t *delivery_service_dto) {
    cJSON *item = cJSON_CreateObject();

    // delivery_service_dto->id
    if(delivery_service_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", delivery_service_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // delivery_service_dto->name
    if(delivery_service_dto->name) {
    if(cJSON_AddStringToObject(item, "name", delivery_service_dto->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delivery_service_dto_t *delivery_service_dto_parseFromJSON(cJSON *delivery_service_dtoJSON){

    delivery_service_dto_t *delivery_service_dto_local_var = NULL;

    // delivery_service_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delivery_service_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // delivery_service_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(delivery_service_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    delivery_service_dto_local_var = delivery_service_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return delivery_service_dto_local_var;
end:
    return NULL;

}
