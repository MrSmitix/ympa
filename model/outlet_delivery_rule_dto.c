#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_delivery_rule_dto.h"



outlet_delivery_rule_dto_t *outlet_delivery_rule_dto_create(
    int min_delivery_days,
    int max_delivery_days,
    long delivery_service_id,
    int order_before,
    double price_free_pickup,
    int unspecified_delivery_interval
    ) {
    outlet_delivery_rule_dto_t *outlet_delivery_rule_dto_local_var = malloc(sizeof(outlet_delivery_rule_dto_t));
    if (!outlet_delivery_rule_dto_local_var) {
        return NULL;
    }
    outlet_delivery_rule_dto_local_var->min_delivery_days = min_delivery_days;
    outlet_delivery_rule_dto_local_var->max_delivery_days = max_delivery_days;
    outlet_delivery_rule_dto_local_var->delivery_service_id = delivery_service_id;
    outlet_delivery_rule_dto_local_var->order_before = order_before;
    outlet_delivery_rule_dto_local_var->price_free_pickup = price_free_pickup;
    outlet_delivery_rule_dto_local_var->unspecified_delivery_interval = unspecified_delivery_interval;

    return outlet_delivery_rule_dto_local_var;
}


void outlet_delivery_rule_dto_free(outlet_delivery_rule_dto_t *outlet_delivery_rule_dto) {
    if(NULL == outlet_delivery_rule_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(outlet_delivery_rule_dto);
}

cJSON *outlet_delivery_rule_dto_convertToJSON(outlet_delivery_rule_dto_t *outlet_delivery_rule_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_delivery_rule_dto->min_delivery_days
    if(outlet_delivery_rule_dto->min_delivery_days) {
    if(cJSON_AddNumberToObject(item, "minDeliveryDays", outlet_delivery_rule_dto->min_delivery_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_delivery_rule_dto->max_delivery_days
    if(outlet_delivery_rule_dto->max_delivery_days) {
    if(cJSON_AddNumberToObject(item, "maxDeliveryDays", outlet_delivery_rule_dto->max_delivery_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_delivery_rule_dto->delivery_service_id
    if(outlet_delivery_rule_dto->delivery_service_id) {
    if(cJSON_AddNumberToObject(item, "deliveryServiceId", outlet_delivery_rule_dto->delivery_service_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_delivery_rule_dto->order_before
    if(outlet_delivery_rule_dto->order_before) {
    if(cJSON_AddNumberToObject(item, "orderBefore", outlet_delivery_rule_dto->order_before) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_delivery_rule_dto->price_free_pickup
    if(outlet_delivery_rule_dto->price_free_pickup) {
    if(cJSON_AddNumberToObject(item, "priceFreePickup", outlet_delivery_rule_dto->price_free_pickup) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_delivery_rule_dto->unspecified_delivery_interval
    if(outlet_delivery_rule_dto->unspecified_delivery_interval) {
    if(cJSON_AddBoolToObject(item, "unspecifiedDeliveryInterval", outlet_delivery_rule_dto->unspecified_delivery_interval) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

outlet_delivery_rule_dto_t *outlet_delivery_rule_dto_parseFromJSON(cJSON *outlet_delivery_rule_dtoJSON){

    outlet_delivery_rule_dto_t *outlet_delivery_rule_dto_local_var = NULL;

    // outlet_delivery_rule_dto->min_delivery_days
    cJSON *min_delivery_days = cJSON_GetObjectItemCaseSensitive(outlet_delivery_rule_dtoJSON, "minDeliveryDays");
    if (min_delivery_days) { 
    if(!cJSON_IsNumber(min_delivery_days))
    {
    goto end; //Numeric
    }
    }

    // outlet_delivery_rule_dto->max_delivery_days
    cJSON *max_delivery_days = cJSON_GetObjectItemCaseSensitive(outlet_delivery_rule_dtoJSON, "maxDeliveryDays");
    if (max_delivery_days) { 
    if(!cJSON_IsNumber(max_delivery_days))
    {
    goto end; //Numeric
    }
    }

    // outlet_delivery_rule_dto->delivery_service_id
    cJSON *delivery_service_id = cJSON_GetObjectItemCaseSensitive(outlet_delivery_rule_dtoJSON, "deliveryServiceId");
    if (delivery_service_id) { 
    if(!cJSON_IsNumber(delivery_service_id))
    {
    goto end; //Numeric
    }
    }

    // outlet_delivery_rule_dto->order_before
    cJSON *order_before = cJSON_GetObjectItemCaseSensitive(outlet_delivery_rule_dtoJSON, "orderBefore");
    if (order_before) { 
    if(!cJSON_IsNumber(order_before))
    {
    goto end; //Numeric
    }
    }

    // outlet_delivery_rule_dto->price_free_pickup
    cJSON *price_free_pickup = cJSON_GetObjectItemCaseSensitive(outlet_delivery_rule_dtoJSON, "priceFreePickup");
    if (price_free_pickup) { 
    if(!cJSON_IsNumber(price_free_pickup))
    {
    goto end; //Numeric
    }
    }

    // outlet_delivery_rule_dto->unspecified_delivery_interval
    cJSON *unspecified_delivery_interval = cJSON_GetObjectItemCaseSensitive(outlet_delivery_rule_dtoJSON, "unspecifiedDeliveryInterval");
    if (unspecified_delivery_interval) { 
    if(!cJSON_IsBool(unspecified_delivery_interval))
    {
    goto end; //Bool
    }
    }


    outlet_delivery_rule_dto_local_var = outlet_delivery_rule_dto_create (
        min_delivery_days ? min_delivery_days->valuedouble : 0,
        max_delivery_days ? max_delivery_days->valuedouble : 0,
        delivery_service_id ? delivery_service_id->valuedouble : 0,
        order_before ? order_before->valuedouble : 0,
        price_free_pickup ? price_free_pickup->valuedouble : 0,
        unspecified_delivery_interval ? unspecified_delivery_interval->valueint : 0
        );

    return outlet_delivery_rule_dto_local_var;
end:
    return NULL;

}
