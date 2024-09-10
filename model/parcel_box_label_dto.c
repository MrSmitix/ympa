#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parcel_box_label_dto.h"



parcel_box_label_dto_t *parcel_box_label_dto_create(
    char *url,
    char *supplier_name,
    char *delivery_service_name,
    long order_id,
    char *order_num,
    char *recipient_name,
    long box_id,
    char *fulfilment_id,
    char *place,
    char *weight,
    char *delivery_service_id,
    char *delivery_address,
    char *shipment_date
    ) {
    parcel_box_label_dto_t *parcel_box_label_dto_local_var = malloc(sizeof(parcel_box_label_dto_t));
    if (!parcel_box_label_dto_local_var) {
        return NULL;
    }
    parcel_box_label_dto_local_var->url = url;
    parcel_box_label_dto_local_var->supplier_name = supplier_name;
    parcel_box_label_dto_local_var->delivery_service_name = delivery_service_name;
    parcel_box_label_dto_local_var->order_id = order_id;
    parcel_box_label_dto_local_var->order_num = order_num;
    parcel_box_label_dto_local_var->recipient_name = recipient_name;
    parcel_box_label_dto_local_var->box_id = box_id;
    parcel_box_label_dto_local_var->fulfilment_id = fulfilment_id;
    parcel_box_label_dto_local_var->place = place;
    parcel_box_label_dto_local_var->weight = weight;
    parcel_box_label_dto_local_var->delivery_service_id = delivery_service_id;
    parcel_box_label_dto_local_var->delivery_address = delivery_address;
    parcel_box_label_dto_local_var->shipment_date = shipment_date;

    return parcel_box_label_dto_local_var;
}


void parcel_box_label_dto_free(parcel_box_label_dto_t *parcel_box_label_dto) {
    if(NULL == parcel_box_label_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (parcel_box_label_dto->url) {
        free(parcel_box_label_dto->url);
        parcel_box_label_dto->url = NULL;
    }
    if (parcel_box_label_dto->supplier_name) {
        free(parcel_box_label_dto->supplier_name);
        parcel_box_label_dto->supplier_name = NULL;
    }
    if (parcel_box_label_dto->delivery_service_name) {
        free(parcel_box_label_dto->delivery_service_name);
        parcel_box_label_dto->delivery_service_name = NULL;
    }
    if (parcel_box_label_dto->order_num) {
        free(parcel_box_label_dto->order_num);
        parcel_box_label_dto->order_num = NULL;
    }
    if (parcel_box_label_dto->recipient_name) {
        free(parcel_box_label_dto->recipient_name);
        parcel_box_label_dto->recipient_name = NULL;
    }
    if (parcel_box_label_dto->fulfilment_id) {
        free(parcel_box_label_dto->fulfilment_id);
        parcel_box_label_dto->fulfilment_id = NULL;
    }
    if (parcel_box_label_dto->place) {
        free(parcel_box_label_dto->place);
        parcel_box_label_dto->place = NULL;
    }
    if (parcel_box_label_dto->weight) {
        free(parcel_box_label_dto->weight);
        parcel_box_label_dto->weight = NULL;
    }
    if (parcel_box_label_dto->delivery_service_id) {
        free(parcel_box_label_dto->delivery_service_id);
        parcel_box_label_dto->delivery_service_id = NULL;
    }
    if (parcel_box_label_dto->delivery_address) {
        free(parcel_box_label_dto->delivery_address);
        parcel_box_label_dto->delivery_address = NULL;
    }
    if (parcel_box_label_dto->shipment_date) {
        free(parcel_box_label_dto->shipment_date);
        parcel_box_label_dto->shipment_date = NULL;
    }
    free(parcel_box_label_dto);
}

cJSON *parcel_box_label_dto_convertToJSON(parcel_box_label_dto_t *parcel_box_label_dto) {
    cJSON *item = cJSON_CreateObject();

    // parcel_box_label_dto->url
    if (!parcel_box_label_dto->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", parcel_box_label_dto->url) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->supplier_name
    if (!parcel_box_label_dto->supplier_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "supplierName", parcel_box_label_dto->supplier_name) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->delivery_service_name
    if (!parcel_box_label_dto->delivery_service_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "deliveryServiceName", parcel_box_label_dto->delivery_service_name) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->order_id
    if (!parcel_box_label_dto->order_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "orderId", parcel_box_label_dto->order_id) == NULL) {
    goto fail; //Numeric
    }


    // parcel_box_label_dto->order_num
    if (!parcel_box_label_dto->order_num) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "orderNum", parcel_box_label_dto->order_num) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->recipient_name
    if (!parcel_box_label_dto->recipient_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "recipientName", parcel_box_label_dto->recipient_name) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->box_id
    if (!parcel_box_label_dto->box_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "boxId", parcel_box_label_dto->box_id) == NULL) {
    goto fail; //Numeric
    }


    // parcel_box_label_dto->fulfilment_id
    if (!parcel_box_label_dto->fulfilment_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "fulfilmentId", parcel_box_label_dto->fulfilment_id) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->place
    if (!parcel_box_label_dto->place) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "place", parcel_box_label_dto->place) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->weight
    if (!parcel_box_label_dto->weight) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "weight", parcel_box_label_dto->weight) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->delivery_service_id
    if (!parcel_box_label_dto->delivery_service_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "deliveryServiceId", parcel_box_label_dto->delivery_service_id) == NULL) {
    goto fail; //String
    }


    // parcel_box_label_dto->delivery_address
    if(parcel_box_label_dto->delivery_address) {
    if(cJSON_AddStringToObject(item, "deliveryAddress", parcel_box_label_dto->delivery_address) == NULL) {
    goto fail; //String
    }
    }


    // parcel_box_label_dto->shipment_date
    if(parcel_box_label_dto->shipment_date) {
    if(cJSON_AddStringToObject(item, "shipmentDate", parcel_box_label_dto->shipment_date) == NULL) {
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

parcel_box_label_dto_t *parcel_box_label_dto_parseFromJSON(cJSON *parcel_box_label_dtoJSON){

    parcel_box_label_dto_t *parcel_box_label_dto_local_var = NULL;

    // parcel_box_label_dto->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // parcel_box_label_dto->supplier_name
    cJSON *supplier_name = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "supplierName");
    if (!supplier_name) {
        goto end;
    }

    
    if(!cJSON_IsString(supplier_name))
    {
    goto end; //String
    }

    // parcel_box_label_dto->delivery_service_name
    cJSON *delivery_service_name = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "deliveryServiceName");
    if (!delivery_service_name) {
        goto end;
    }

    
    if(!cJSON_IsString(delivery_service_name))
    {
    goto end; //String
    }

    // parcel_box_label_dto->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "orderId");
    if (!order_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }

    // parcel_box_label_dto->order_num
    cJSON *order_num = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "orderNum");
    if (!order_num) {
        goto end;
    }

    
    if(!cJSON_IsString(order_num))
    {
    goto end; //String
    }

    // parcel_box_label_dto->recipient_name
    cJSON *recipient_name = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "recipientName");
    if (!recipient_name) {
        goto end;
    }

    
    if(!cJSON_IsString(recipient_name))
    {
    goto end; //String
    }

    // parcel_box_label_dto->box_id
    cJSON *box_id = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "boxId");
    if (!box_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(box_id))
    {
    goto end; //Numeric
    }

    // parcel_box_label_dto->fulfilment_id
    cJSON *fulfilment_id = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "fulfilmentId");
    if (!fulfilment_id) {
        goto end;
    }

    
    if(!cJSON_IsString(fulfilment_id))
    {
    goto end; //String
    }

    // parcel_box_label_dto->place
    cJSON *place = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "place");
    if (!place) {
        goto end;
    }

    
    if(!cJSON_IsString(place))
    {
    goto end; //String
    }

    // parcel_box_label_dto->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "weight");
    if (!weight) {
        goto end;
    }

    
    if(!cJSON_IsString(weight))
    {
    goto end; //String
    }

    // parcel_box_label_dto->delivery_service_id
    cJSON *delivery_service_id = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "deliveryServiceId");
    if (!delivery_service_id) {
        goto end;
    }

    
    if(!cJSON_IsString(delivery_service_id))
    {
    goto end; //String
    }

    // parcel_box_label_dto->delivery_address
    cJSON *delivery_address = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "deliveryAddress");
    if (delivery_address) { 
    if(!cJSON_IsString(delivery_address) && !cJSON_IsNull(delivery_address))
    {
    goto end; //String
    }
    }

    // parcel_box_label_dto->shipment_date
    cJSON *shipment_date = cJSON_GetObjectItemCaseSensitive(parcel_box_label_dtoJSON, "shipmentDate");
    if (shipment_date) { 
    if(!cJSON_IsString(shipment_date) && !cJSON_IsNull(shipment_date))
    {
    goto end; //String
    }
    }


    parcel_box_label_dto_local_var = parcel_box_label_dto_create (
        strdup(url->valuestring),
        strdup(supplier_name->valuestring),
        strdup(delivery_service_name->valuestring),
        order_id->valuedouble,
        strdup(order_num->valuestring),
        strdup(recipient_name->valuestring),
        box_id->valuedouble,
        strdup(fulfilment_id->valuestring),
        strdup(place->valuestring),
        strdup(weight->valuestring),
        strdup(delivery_service_id->valuestring),
        delivery_address && !cJSON_IsNull(delivery_address) ? strdup(delivery_address->valuestring) : NULL,
        shipment_date && !cJSON_IsNull(shipment_date) ? strdup(shipment_date->valuestring) : NULL
        );

    return parcel_box_label_dto_local_var;
end:
    return NULL;

}
