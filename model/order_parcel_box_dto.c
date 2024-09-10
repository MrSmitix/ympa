#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_parcel_box_dto.h"



order_parcel_box_dto_t *order_parcel_box_dto_create(
    long id,
    char *fulfilment_id
    ) {
    order_parcel_box_dto_t *order_parcel_box_dto_local_var = malloc(sizeof(order_parcel_box_dto_t));
    if (!order_parcel_box_dto_local_var) {
        return NULL;
    }
    order_parcel_box_dto_local_var->id = id;
    order_parcel_box_dto_local_var->fulfilment_id = fulfilment_id;

    return order_parcel_box_dto_local_var;
}


void order_parcel_box_dto_free(order_parcel_box_dto_t *order_parcel_box_dto) {
    if(NULL == order_parcel_box_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_parcel_box_dto->fulfilment_id) {
        free(order_parcel_box_dto->fulfilment_id);
        order_parcel_box_dto->fulfilment_id = NULL;
    }
    free(order_parcel_box_dto);
}

cJSON *order_parcel_box_dto_convertToJSON(order_parcel_box_dto_t *order_parcel_box_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_parcel_box_dto->id
    if(order_parcel_box_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", order_parcel_box_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_parcel_box_dto->fulfilment_id
    if(order_parcel_box_dto->fulfilment_id) {
    if(cJSON_AddStringToObject(item, "fulfilmentId", order_parcel_box_dto->fulfilment_id) == NULL) {
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

order_parcel_box_dto_t *order_parcel_box_dto_parseFromJSON(cJSON *order_parcel_box_dtoJSON){

    order_parcel_box_dto_t *order_parcel_box_dto_local_var = NULL;

    // order_parcel_box_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_parcel_box_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // order_parcel_box_dto->fulfilment_id
    cJSON *fulfilment_id = cJSON_GetObjectItemCaseSensitive(order_parcel_box_dtoJSON, "fulfilmentId");
    if (fulfilment_id) { 
    if(!cJSON_IsString(fulfilment_id) && !cJSON_IsNull(fulfilment_id))
    {
    goto end; //String
    }
    }


    order_parcel_box_dto_local_var = order_parcel_box_dto_create (
        id ? id->valuedouble : 0,
        fulfilment_id && !cJSON_IsNull(fulfilment_id) ? strdup(fulfilment_id->valuestring) : NULL
        );

    return order_parcel_box_dto_local_var;
end:
    return NULL;

}
