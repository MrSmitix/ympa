#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_track_dto.h"



order_track_dto_t *order_track_dto_create(
    char *track_code,
    long delivery_service_id
    ) {
    order_track_dto_t *order_track_dto_local_var = malloc(sizeof(order_track_dto_t));
    if (!order_track_dto_local_var) {
        return NULL;
    }
    order_track_dto_local_var->track_code = track_code;
    order_track_dto_local_var->delivery_service_id = delivery_service_id;

    return order_track_dto_local_var;
}


void order_track_dto_free(order_track_dto_t *order_track_dto) {
    if(NULL == order_track_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_track_dto->track_code) {
        free(order_track_dto->track_code);
        order_track_dto->track_code = NULL;
    }
    free(order_track_dto);
}

cJSON *order_track_dto_convertToJSON(order_track_dto_t *order_track_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_track_dto->track_code
    if(order_track_dto->track_code) {
    if(cJSON_AddStringToObject(item, "trackCode", order_track_dto->track_code) == NULL) {
    goto fail; //String
    }
    }


    // order_track_dto->delivery_service_id
    if(order_track_dto->delivery_service_id) {
    if(cJSON_AddNumberToObject(item, "deliveryServiceId", order_track_dto->delivery_service_id) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_track_dto_t *order_track_dto_parseFromJSON(cJSON *order_track_dtoJSON){

    order_track_dto_t *order_track_dto_local_var = NULL;

    // order_track_dto->track_code
    cJSON *track_code = cJSON_GetObjectItemCaseSensitive(order_track_dtoJSON, "trackCode");
    if (track_code) { 
    if(!cJSON_IsString(track_code) && !cJSON_IsNull(track_code))
    {
    goto end; //String
    }
    }

    // order_track_dto->delivery_service_id
    cJSON *delivery_service_id = cJSON_GetObjectItemCaseSensitive(order_track_dtoJSON, "deliveryServiceId");
    if (delivery_service_id) { 
    if(!cJSON_IsNumber(delivery_service_id))
    {
    goto end; //Numeric
    }
    }


    order_track_dto_local_var = order_track_dto_create (
        track_code && !cJSON_IsNull(track_code) ? strdup(track_code->valuestring) : NULL,
        delivery_service_id ? delivery_service_id->valuedouble : 0
        );

    return order_track_dto_local_var;
end:
    return NULL;

}
