#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_order_dto.h"


char* feedback_order_dto_delivery_ToString(_api__feedback_order_dto__e delivery) {
    char* deliveryArray[] =  { "NULL", "DELIVERY", "PICKUP", "INSTORE" };
    return deliveryArray[delivery];
}

_api__feedback_order_dto__e feedback_order_dto_delivery_FromString(char* delivery){
    int stringToReturn = 0;
    char *deliveryArray[] =  { "NULL", "DELIVERY", "PICKUP", "INSTORE" };
    size_t sizeofArray = sizeof(deliveryArray) / sizeof(deliveryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(delivery, deliveryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feedback_order_dto_t *feedback_order_dto_create(
    char *shop_order_id,
    feedback_delivery_type_t *delivery
    ) {
    feedback_order_dto_t *feedback_order_dto_local_var = malloc(sizeof(feedback_order_dto_t));
    if (!feedback_order_dto_local_var) {
        return NULL;
    }
    feedback_order_dto_local_var->shop_order_id = shop_order_id;
    feedback_order_dto_local_var->delivery = delivery;

    return feedback_order_dto_local_var;
}


void feedback_order_dto_free(feedback_order_dto_t *feedback_order_dto) {
    if(NULL == feedback_order_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_order_dto->shop_order_id) {
        free(feedback_order_dto->shop_order_id);
        feedback_order_dto->shop_order_id = NULL;
    }
    if (feedback_order_dto->delivery) {
        feedback_delivery_type_free(feedback_order_dto->delivery);
        feedback_order_dto->delivery = NULL;
    }
    free(feedback_order_dto);
}

cJSON *feedback_order_dto_convertToJSON(feedback_order_dto_t *feedback_order_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_order_dto->shop_order_id
    if(feedback_order_dto->shop_order_id) {
    if(cJSON_AddStringToObject(item, "shopOrderId", feedback_order_dto->shop_order_id) == NULL) {
    goto fail; //String
    }
    }


    // feedback_order_dto->delivery
    if(feedback_order_dto->delivery != _api__feedback_order_dto__NULL) {
    cJSON *delivery_local_JSON = feedback_delivery_type_convertToJSON(feedback_order_dto->delivery);
    if(delivery_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "delivery", delivery_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feedback_order_dto_t *feedback_order_dto_parseFromJSON(cJSON *feedback_order_dtoJSON){

    feedback_order_dto_t *feedback_order_dto_local_var = NULL;

    // define the local variable for feedback_order_dto->delivery
    feedback_delivery_type_t *delivery_local_nonprim = NULL;

    // feedback_order_dto->shop_order_id
    cJSON *shop_order_id = cJSON_GetObjectItemCaseSensitive(feedback_order_dtoJSON, "shopOrderId");
    if (shop_order_id) { 
    if(!cJSON_IsString(shop_order_id) && !cJSON_IsNull(shop_order_id))
    {
    goto end; //String
    }
    }

    // feedback_order_dto->delivery
    cJSON *delivery = cJSON_GetObjectItemCaseSensitive(feedback_order_dtoJSON, "delivery");
    if (delivery) { 
    delivery_local_nonprim = feedback_delivery_type_parseFromJSON(delivery); //custom
    }


    feedback_order_dto_local_var = feedback_order_dto_create (
        shop_order_id && !cJSON_IsNull(shop_order_id) ? strdup(shop_order_id->valuestring) : NULL,
        delivery ? delivery_local_nonprim : NULL
        );

    return feedback_order_dto_local_var;
end:
    if (delivery_local_nonprim) {
        feedback_delivery_type_free(delivery_local_nonprim);
        delivery_local_nonprim = NULL;
    }
    return NULL;

}
