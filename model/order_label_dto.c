#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_label_dto.h"



order_label_dto_t *order_label_dto_create(
    long order_id,
    int places_number,
    char *url,
    list_t *parcel_box_labels
    ) {
    order_label_dto_t *order_label_dto_local_var = malloc(sizeof(order_label_dto_t));
    if (!order_label_dto_local_var) {
        return NULL;
    }
    order_label_dto_local_var->order_id = order_id;
    order_label_dto_local_var->places_number = places_number;
    order_label_dto_local_var->url = url;
    order_label_dto_local_var->parcel_box_labels = parcel_box_labels;

    return order_label_dto_local_var;
}


void order_label_dto_free(order_label_dto_t *order_label_dto) {
    if(NULL == order_label_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_label_dto->url) {
        free(order_label_dto->url);
        order_label_dto->url = NULL;
    }
    if (order_label_dto->parcel_box_labels) {
        list_ForEach(listEntry, order_label_dto->parcel_box_labels) {
            parcel_box_label_dto_free(listEntry->data);
        }
        list_freeList(order_label_dto->parcel_box_labels);
        order_label_dto->parcel_box_labels = NULL;
    }
    free(order_label_dto);
}

cJSON *order_label_dto_convertToJSON(order_label_dto_t *order_label_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_label_dto->order_id
    if (!order_label_dto->order_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "orderId", order_label_dto->order_id) == NULL) {
    goto fail; //Numeric
    }


    // order_label_dto->places_number
    if (!order_label_dto->places_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "placesNumber", order_label_dto->places_number) == NULL) {
    goto fail; //Numeric
    }


    // order_label_dto->url
    if (!order_label_dto->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", order_label_dto->url) == NULL) {
    goto fail; //String
    }


    // order_label_dto->parcel_box_labels
    if (!order_label_dto->parcel_box_labels) {
        goto fail;
    }
    cJSON *parcel_box_labels = cJSON_AddArrayToObject(item, "parcelBoxLabels");
    if(parcel_box_labels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parcel_box_labelsListEntry;
    if (order_label_dto->parcel_box_labels) {
    list_ForEach(parcel_box_labelsListEntry, order_label_dto->parcel_box_labels) {
    cJSON *itemLocal = parcel_box_label_dto_convertToJSON(parcel_box_labelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parcel_box_labels, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_label_dto_t *order_label_dto_parseFromJSON(cJSON *order_label_dtoJSON){

    order_label_dto_t *order_label_dto_local_var = NULL;

    // define the local list for order_label_dto->parcel_box_labels
    list_t *parcel_box_labelsList = NULL;

    // order_label_dto->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(order_label_dtoJSON, "orderId");
    if (!order_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }

    // order_label_dto->places_number
    cJSON *places_number = cJSON_GetObjectItemCaseSensitive(order_label_dtoJSON, "placesNumber");
    if (!places_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(places_number))
    {
    goto end; //Numeric
    }

    // order_label_dto->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(order_label_dtoJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // order_label_dto->parcel_box_labels
    cJSON *parcel_box_labels = cJSON_GetObjectItemCaseSensitive(order_label_dtoJSON, "parcelBoxLabels");
    if (!parcel_box_labels) {
        goto end;
    }

    
    cJSON *parcel_box_labels_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parcel_box_labels)){
        goto end; //nonprimitive container
    }

    parcel_box_labelsList = list_createList();

    cJSON_ArrayForEach(parcel_box_labels_local_nonprimitive,parcel_box_labels )
    {
        if(!cJSON_IsObject(parcel_box_labels_local_nonprimitive)){
            goto end;
        }
        parcel_box_label_dto_t *parcel_box_labelsItem = parcel_box_label_dto_parseFromJSON(parcel_box_labels_local_nonprimitive);

        list_addElement(parcel_box_labelsList, parcel_box_labelsItem);
    }


    order_label_dto_local_var = order_label_dto_create (
        order_id->valuedouble,
        places_number->valuedouble,
        strdup(url->valuestring),
        parcel_box_labelsList
        );

    return order_label_dto_local_var;
end:
    if (parcel_box_labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parcel_box_labelsList) {
            parcel_box_label_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parcel_box_labelsList);
        parcel_box_labelsList = NULL;
    }
    return NULL;

}
