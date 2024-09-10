#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_warehouse_dto.h"



orders_stats_warehouse_dto_t *orders_stats_warehouse_dto_create(
    long id,
    char *name
    ) {
    orders_stats_warehouse_dto_t *orders_stats_warehouse_dto_local_var = malloc(sizeof(orders_stats_warehouse_dto_t));
    if (!orders_stats_warehouse_dto_local_var) {
        return NULL;
    }
    orders_stats_warehouse_dto_local_var->id = id;
    orders_stats_warehouse_dto_local_var->name = name;

    return orders_stats_warehouse_dto_local_var;
}


void orders_stats_warehouse_dto_free(orders_stats_warehouse_dto_t *orders_stats_warehouse_dto) {
    if(NULL == orders_stats_warehouse_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_warehouse_dto->name) {
        free(orders_stats_warehouse_dto->name);
        orders_stats_warehouse_dto->name = NULL;
    }
    free(orders_stats_warehouse_dto);
}

cJSON *orders_stats_warehouse_dto_convertToJSON(orders_stats_warehouse_dto_t *orders_stats_warehouse_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_warehouse_dto->id
    if(orders_stats_warehouse_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", orders_stats_warehouse_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_warehouse_dto->name
    if(orders_stats_warehouse_dto->name) {
    if(cJSON_AddStringToObject(item, "name", orders_stats_warehouse_dto->name) == NULL) {
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

orders_stats_warehouse_dto_t *orders_stats_warehouse_dto_parseFromJSON(cJSON *orders_stats_warehouse_dtoJSON){

    orders_stats_warehouse_dto_t *orders_stats_warehouse_dto_local_var = NULL;

    // orders_stats_warehouse_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(orders_stats_warehouse_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_warehouse_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(orders_stats_warehouse_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    orders_stats_warehouse_dto_local_var = orders_stats_warehouse_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return orders_stats_warehouse_dto_local_var;
end:
    return NULL;

}
