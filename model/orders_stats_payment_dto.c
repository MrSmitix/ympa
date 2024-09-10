#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_payment_dto.h"


char* orders_stats_payment_dto_type_ToString(_api__orders_stats_payment_dto__e type) {
    char* typeArray[] =  { "NULL", "PAYMENT", "REFUND", "UNKNOWN" };
    return typeArray[type];
}

_api__orders_stats_payment_dto__e orders_stats_payment_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "PAYMENT", "REFUND", "UNKNOWN" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* orders_stats_payment_dto_source_ToString(_api__orders_stats_payment_dto__e source) {
    char* sourceArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE", "SPLIT" };
    return sourceArray[source];
}

_api__orders_stats_payment_dto__e orders_stats_payment_dto_source_FromString(char* source){
    int stringToReturn = 0;
    char *sourceArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE", "SPLIT" };
    size_t sizeofArray = sizeof(sourceArray) / sizeof(sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source, sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

orders_stats_payment_dto_t *orders_stats_payment_dto_create(
    char *id,
    char *date,
    orders_stats_payment_type_t *type,
    orders_stats_payment_source_type_t *source,
    double total,
    orders_stats_payment_order_dto_t *payment_order
    ) {
    orders_stats_payment_dto_t *orders_stats_payment_dto_local_var = malloc(sizeof(orders_stats_payment_dto_t));
    if (!orders_stats_payment_dto_local_var) {
        return NULL;
    }
    orders_stats_payment_dto_local_var->id = id;
    orders_stats_payment_dto_local_var->date = date;
    orders_stats_payment_dto_local_var->type = type;
    orders_stats_payment_dto_local_var->source = source;
    orders_stats_payment_dto_local_var->total = total;
    orders_stats_payment_dto_local_var->payment_order = payment_order;

    return orders_stats_payment_dto_local_var;
}


void orders_stats_payment_dto_free(orders_stats_payment_dto_t *orders_stats_payment_dto) {
    if(NULL == orders_stats_payment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_payment_dto->id) {
        free(orders_stats_payment_dto->id);
        orders_stats_payment_dto->id = NULL;
    }
    if (orders_stats_payment_dto->date) {
        free(orders_stats_payment_dto->date);
        orders_stats_payment_dto->date = NULL;
    }
    if (orders_stats_payment_dto->type) {
        orders_stats_payment_type_free(orders_stats_payment_dto->type);
        orders_stats_payment_dto->type = NULL;
    }
    if (orders_stats_payment_dto->source) {
        orders_stats_payment_source_type_free(orders_stats_payment_dto->source);
        orders_stats_payment_dto->source = NULL;
    }
    if (orders_stats_payment_dto->payment_order) {
        orders_stats_payment_order_dto_free(orders_stats_payment_dto->payment_order);
        orders_stats_payment_dto->payment_order = NULL;
    }
    free(orders_stats_payment_dto);
}

cJSON *orders_stats_payment_dto_convertToJSON(orders_stats_payment_dto_t *orders_stats_payment_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_payment_dto->id
    if(orders_stats_payment_dto->id) {
    if(cJSON_AddStringToObject(item, "id", orders_stats_payment_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // orders_stats_payment_dto->date
    if(orders_stats_payment_dto->date) {
    if(cJSON_AddStringToObject(item, "date", orders_stats_payment_dto->date) == NULL) {
    goto fail; //Date
    }
    }


    // orders_stats_payment_dto->type
    if(orders_stats_payment_dto->type != _api__orders_stats_payment_dto__NULL) {
    cJSON *type_local_JSON = orders_stats_payment_type_convertToJSON(orders_stats_payment_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_payment_dto->source
    if(orders_stats_payment_dto->source != _api__orders_stats_payment_dto__NULL) {
    cJSON *source_local_JSON = orders_stats_payment_source_type_convertToJSON(orders_stats_payment_dto->source);
    if(source_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "source", source_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_payment_dto->total
    if(orders_stats_payment_dto->total) {
    if(cJSON_AddNumberToObject(item, "total", orders_stats_payment_dto->total) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_payment_dto->payment_order
    if(orders_stats_payment_dto->payment_order) {
    cJSON *payment_order_local_JSON = orders_stats_payment_order_dto_convertToJSON(orders_stats_payment_dto->payment_order);
    if(payment_order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paymentOrder", payment_order_local_JSON);
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

orders_stats_payment_dto_t *orders_stats_payment_dto_parseFromJSON(cJSON *orders_stats_payment_dtoJSON){

    orders_stats_payment_dto_t *orders_stats_payment_dto_local_var = NULL;

    // define the local variable for orders_stats_payment_dto->type
    orders_stats_payment_type_t *type_local_nonprim = NULL;

    // define the local variable for orders_stats_payment_dto->source
    orders_stats_payment_source_type_t *source_local_nonprim = NULL;

    // define the local variable for orders_stats_payment_dto->payment_order
    orders_stats_payment_order_dto_t *payment_order_local_nonprim = NULL;

    // orders_stats_payment_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // orders_stats_payment_dto->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_dtoJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }

    // orders_stats_payment_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = orders_stats_payment_type_parseFromJSON(type); //custom
    }

    // orders_stats_payment_dto->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_dtoJSON, "source");
    if (source) { 
    source_local_nonprim = orders_stats_payment_source_type_parseFromJSON(source); //custom
    }

    // orders_stats_payment_dto->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_dtoJSON, "total");
    if (total) { 
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_payment_dto->payment_order
    cJSON *payment_order = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_dtoJSON, "paymentOrder");
    if (payment_order) { 
    payment_order_local_nonprim = orders_stats_payment_order_dto_parseFromJSON(payment_order); //nonprimitive
    }


    orders_stats_payment_dto_local_var = orders_stats_payment_dto_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        date ? strdup(date->valuestring) : NULL,
        type ? type_local_nonprim : NULL,
        source ? source_local_nonprim : NULL,
        total ? total->valuedouble : 0,
        payment_order ? payment_order_local_nonprim : NULL
        );

    return orders_stats_payment_dto_local_var;
end:
    if (type_local_nonprim) {
        orders_stats_payment_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (source_local_nonprim) {
        orders_stats_payment_source_type_free(source_local_nonprim);
        source_local_nonprim = NULL;
    }
    if (payment_order_local_nonprim) {
        orders_stats_payment_order_dto_free(payment_order_local_nonprim);
        payment_order_local_nonprim = NULL;
    }
    return NULL;

}
