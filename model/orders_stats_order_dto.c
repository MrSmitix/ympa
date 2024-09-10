#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_order_dto.h"


char* orders_stats_order_dto_status_ToString(_api__orders_stats_order_dto__e status) {
    char* statusArray[] =  { "NULL", "CANCELLED_BEFORE_PROCESSING", "CANCELLED_IN_DELIVERY", "CANCELLED_IN_PROCESSING", "DELIVERY", "DELIVERED", "PARTIALLY_DELIVERED", "PARTIALLY_RETURNED", "PENDING", "PICKUP", "PROCESSING", "RESERVED", "RETURNED", "UNKNOWN", "UNPAID", "LOST" };
    return statusArray[status];
}

_api__orders_stats_order_dto__e orders_stats_order_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "CANCELLED_BEFORE_PROCESSING", "CANCELLED_IN_DELIVERY", "CANCELLED_IN_PROCESSING", "DELIVERY", "DELIVERED", "PARTIALLY_DELIVERED", "PARTIALLY_RETURNED", "PENDING", "PICKUP", "PROCESSING", "RESERVED", "RETURNED", "UNKNOWN", "UNPAID", "LOST" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* orders_stats_order_dto_payment_type_ToString(_api__orders_stats_order_dto__e payment_type) {
    char* payment_typeArray[] =  { "NULL", "CREDIT", "POSTPAID", "PREPAID", "TINKOFF_CREDIT" };
    return payment_typeArray[payment_type];
}

_api__orders_stats_order_dto__e orders_stats_order_dto_payment_type_FromString(char* payment_type){
    int stringToReturn = 0;
    char *payment_typeArray[] =  { "NULL", "CREDIT", "POSTPAID", "PREPAID", "TINKOFF_CREDIT" };
    size_t sizeofArray = sizeof(payment_typeArray) / sizeof(payment_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(payment_type, payment_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

orders_stats_order_dto_t *orders_stats_order_dto_create(
    long id,
    char *creation_date,
    char *status_update_date,
    order_stats_status_type_t *status,
    char *partner_order_id,
    orders_stats_order_payment_type_t *payment_type,
    int fake,
    orders_stats_delivery_region_dto_t *delivery_region,
    list_t *items,
    list_t *initial_items,
    list_t *payments,
    list_t *commissions
    ) {
    orders_stats_order_dto_t *orders_stats_order_dto_local_var = malloc(sizeof(orders_stats_order_dto_t));
    if (!orders_stats_order_dto_local_var) {
        return NULL;
    }
    orders_stats_order_dto_local_var->id = id;
    orders_stats_order_dto_local_var->creation_date = creation_date;
    orders_stats_order_dto_local_var->status_update_date = status_update_date;
    orders_stats_order_dto_local_var->status = status;
    orders_stats_order_dto_local_var->partner_order_id = partner_order_id;
    orders_stats_order_dto_local_var->payment_type = payment_type;
    orders_stats_order_dto_local_var->fake = fake;
    orders_stats_order_dto_local_var->delivery_region = delivery_region;
    orders_stats_order_dto_local_var->items = items;
    orders_stats_order_dto_local_var->initial_items = initial_items;
    orders_stats_order_dto_local_var->payments = payments;
    orders_stats_order_dto_local_var->commissions = commissions;

    return orders_stats_order_dto_local_var;
}


void orders_stats_order_dto_free(orders_stats_order_dto_t *orders_stats_order_dto) {
    if(NULL == orders_stats_order_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_order_dto->creation_date) {
        free(orders_stats_order_dto->creation_date);
        orders_stats_order_dto->creation_date = NULL;
    }
    if (orders_stats_order_dto->status_update_date) {
        free(orders_stats_order_dto->status_update_date);
        orders_stats_order_dto->status_update_date = NULL;
    }
    if (orders_stats_order_dto->status) {
        order_stats_status_type_free(orders_stats_order_dto->status);
        orders_stats_order_dto->status = NULL;
    }
    if (orders_stats_order_dto->partner_order_id) {
        free(orders_stats_order_dto->partner_order_id);
        orders_stats_order_dto->partner_order_id = NULL;
    }
    if (orders_stats_order_dto->payment_type) {
        orders_stats_order_payment_type_free(orders_stats_order_dto->payment_type);
        orders_stats_order_dto->payment_type = NULL;
    }
    if (orders_stats_order_dto->delivery_region) {
        orders_stats_delivery_region_dto_free(orders_stats_order_dto->delivery_region);
        orders_stats_order_dto->delivery_region = NULL;
    }
    if (orders_stats_order_dto->items) {
        list_ForEach(listEntry, orders_stats_order_dto->items) {
            orders_stats_item_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_order_dto->items);
        orders_stats_order_dto->items = NULL;
    }
    if (orders_stats_order_dto->initial_items) {
        list_ForEach(listEntry, orders_stats_order_dto->initial_items) {
            orders_stats_item_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_order_dto->initial_items);
        orders_stats_order_dto->initial_items = NULL;
    }
    if (orders_stats_order_dto->payments) {
        list_ForEach(listEntry, orders_stats_order_dto->payments) {
            orders_stats_payment_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_order_dto->payments);
        orders_stats_order_dto->payments = NULL;
    }
    if (orders_stats_order_dto->commissions) {
        list_ForEach(listEntry, orders_stats_order_dto->commissions) {
            orders_stats_commission_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_order_dto->commissions);
        orders_stats_order_dto->commissions = NULL;
    }
    free(orders_stats_order_dto);
}

cJSON *orders_stats_order_dto_convertToJSON(orders_stats_order_dto_t *orders_stats_order_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_order_dto->id
    if(orders_stats_order_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", orders_stats_order_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_order_dto->creation_date
    if(orders_stats_order_dto->creation_date) {
    if(cJSON_AddStringToObject(item, "creationDate", orders_stats_order_dto->creation_date) == NULL) {
    goto fail; //Date
    }
    }


    // orders_stats_order_dto->status_update_date
    if(orders_stats_order_dto->status_update_date) {
    if(cJSON_AddStringToObject(item, "statusUpdateDate", orders_stats_order_dto->status_update_date) == NULL) {
    goto fail; //Date-Time
    }
    }


    // orders_stats_order_dto->status
    if(orders_stats_order_dto->status != _api__orders_stats_order_dto__NULL) {
    cJSON *status_local_JSON = order_stats_status_type_convertToJSON(orders_stats_order_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_order_dto->partner_order_id
    if(orders_stats_order_dto->partner_order_id) {
    if(cJSON_AddStringToObject(item, "partnerOrderId", orders_stats_order_dto->partner_order_id) == NULL) {
    goto fail; //String
    }
    }


    // orders_stats_order_dto->payment_type
    if(orders_stats_order_dto->payment_type != _api__orders_stats_order_dto__NULL) {
    cJSON *payment_type_local_JSON = orders_stats_order_payment_type_convertToJSON(orders_stats_order_dto->payment_type);
    if(payment_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "paymentType", payment_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_order_dto->fake
    if(orders_stats_order_dto->fake) {
    if(cJSON_AddBoolToObject(item, "fake", orders_stats_order_dto->fake) == NULL) {
    goto fail; //Bool
    }
    }


    // orders_stats_order_dto->delivery_region
    if(orders_stats_order_dto->delivery_region) {
    cJSON *delivery_region_local_JSON = orders_stats_delivery_region_dto_convertToJSON(orders_stats_order_dto->delivery_region);
    if(delivery_region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "deliveryRegion", delivery_region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // orders_stats_order_dto->items
    if (!orders_stats_order_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (orders_stats_order_dto->items) {
    list_ForEach(itemsListEntry, orders_stats_order_dto->items) {
    cJSON *itemLocal = orders_stats_item_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // orders_stats_order_dto->initial_items
    if(orders_stats_order_dto->initial_items) {
    cJSON *initial_items = cJSON_AddArrayToObject(item, "initialItems");
    if(initial_items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *initial_itemsListEntry;
    if (orders_stats_order_dto->initial_items) {
    list_ForEach(initial_itemsListEntry, orders_stats_order_dto->initial_items) {
    cJSON *itemLocal = orders_stats_item_dto_convertToJSON(initial_itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(initial_items, itemLocal);
    }
    }
    }


    // orders_stats_order_dto->payments
    if (!orders_stats_order_dto->payments) {
        goto fail;
    }
    cJSON *payments = cJSON_AddArrayToObject(item, "payments");
    if(payments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *paymentsListEntry;
    if (orders_stats_order_dto->payments) {
    list_ForEach(paymentsListEntry, orders_stats_order_dto->payments) {
    cJSON *itemLocal = orders_stats_payment_dto_convertToJSON(paymentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(payments, itemLocal);
    }
    }


    // orders_stats_order_dto->commissions
    if (!orders_stats_order_dto->commissions) {
        goto fail;
    }
    cJSON *commissions = cJSON_AddArrayToObject(item, "commissions");
    if(commissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *commissionsListEntry;
    if (orders_stats_order_dto->commissions) {
    list_ForEach(commissionsListEntry, orders_stats_order_dto->commissions) {
    cJSON *itemLocal = orders_stats_commission_dto_convertToJSON(commissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(commissions, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

orders_stats_order_dto_t *orders_stats_order_dto_parseFromJSON(cJSON *orders_stats_order_dtoJSON){

    orders_stats_order_dto_t *orders_stats_order_dto_local_var = NULL;

    // define the local variable for orders_stats_order_dto->status
    order_stats_status_type_t *status_local_nonprim = NULL;

    // define the local variable for orders_stats_order_dto->payment_type
    orders_stats_order_payment_type_t *payment_type_local_nonprim = NULL;

    // define the local variable for orders_stats_order_dto->delivery_region
    orders_stats_delivery_region_dto_t *delivery_region_local_nonprim = NULL;

    // define the local list for orders_stats_order_dto->items
    list_t *itemsList = NULL;

    // define the local list for orders_stats_order_dto->initial_items
    list_t *initial_itemsList = NULL;

    // define the local list for orders_stats_order_dto->payments
    list_t *paymentsList = NULL;

    // define the local list for orders_stats_order_dto->commissions
    list_t *commissionsList = NULL;

    // orders_stats_order_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_order_dto->creation_date
    cJSON *creation_date = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "creationDate");
    if (creation_date) { 
    if(!cJSON_IsString(creation_date))
    {
    goto end; //Date
    }
    }

    // orders_stats_order_dto->status_update_date
    cJSON *status_update_date = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "statusUpdateDate");
    if (status_update_date) { 
    if(!cJSON_IsString(status_update_date) && !cJSON_IsNull(status_update_date))
    {
    goto end; //DateTime
    }
    }

    // orders_stats_order_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = order_stats_status_type_parseFromJSON(status); //custom
    }

    // orders_stats_order_dto->partner_order_id
    cJSON *partner_order_id = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "partnerOrderId");
    if (partner_order_id) { 
    if(!cJSON_IsString(partner_order_id) && !cJSON_IsNull(partner_order_id))
    {
    goto end; //String
    }
    }

    // orders_stats_order_dto->payment_type
    cJSON *payment_type = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "paymentType");
    if (payment_type) { 
    payment_type_local_nonprim = orders_stats_order_payment_type_parseFromJSON(payment_type); //custom
    }

    // orders_stats_order_dto->fake
    cJSON *fake = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "fake");
    if (fake) { 
    if(!cJSON_IsBool(fake))
    {
    goto end; //Bool
    }
    }

    // orders_stats_order_dto->delivery_region
    cJSON *delivery_region = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "deliveryRegion");
    if (delivery_region) { 
    delivery_region_local_nonprim = orders_stats_delivery_region_dto_parseFromJSON(delivery_region); //nonprimitive
    }

    // orders_stats_order_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "items");
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        orders_stats_item_dto_t *itemsItem = orders_stats_item_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // orders_stats_order_dto->initial_items
    cJSON *initial_items = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "initialItems");
    if (initial_items) { 
    cJSON *initial_items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(initial_items)){
        goto end; //nonprimitive container
    }

    initial_itemsList = list_createList();

    cJSON_ArrayForEach(initial_items_local_nonprimitive,initial_items )
    {
        if(!cJSON_IsObject(initial_items_local_nonprimitive)){
            goto end;
        }
        orders_stats_item_dto_t *initial_itemsItem = orders_stats_item_dto_parseFromJSON(initial_items_local_nonprimitive);

        list_addElement(initial_itemsList, initial_itemsItem);
    }
    }

    // orders_stats_order_dto->payments
    cJSON *payments = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "payments");
    if (!payments) {
        goto end;
    }

    
    cJSON *payments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(payments)){
        goto end; //nonprimitive container
    }

    paymentsList = list_createList();

    cJSON_ArrayForEach(payments_local_nonprimitive,payments )
    {
        if(!cJSON_IsObject(payments_local_nonprimitive)){
            goto end;
        }
        orders_stats_payment_dto_t *paymentsItem = orders_stats_payment_dto_parseFromJSON(payments_local_nonprimitive);

        list_addElement(paymentsList, paymentsItem);
    }

    // orders_stats_order_dto->commissions
    cJSON *commissions = cJSON_GetObjectItemCaseSensitive(orders_stats_order_dtoJSON, "commissions");
    if (!commissions) {
        goto end;
    }

    
    cJSON *commissions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(commissions)){
        goto end; //nonprimitive container
    }

    commissionsList = list_createList();

    cJSON_ArrayForEach(commissions_local_nonprimitive,commissions )
    {
        if(!cJSON_IsObject(commissions_local_nonprimitive)){
            goto end;
        }
        orders_stats_commission_dto_t *commissionsItem = orders_stats_commission_dto_parseFromJSON(commissions_local_nonprimitive);

        list_addElement(commissionsList, commissionsItem);
    }


    orders_stats_order_dto_local_var = orders_stats_order_dto_create (
        id ? id->valuedouble : 0,
        creation_date ? strdup(creation_date->valuestring) : NULL,
        status_update_date && !cJSON_IsNull(status_update_date) ? strdup(status_update_date->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        partner_order_id && !cJSON_IsNull(partner_order_id) ? strdup(partner_order_id->valuestring) : NULL,
        payment_type ? payment_type_local_nonprim : NULL,
        fake ? fake->valueint : 0,
        delivery_region ? delivery_region_local_nonprim : NULL,
        itemsList,
        initial_items ? initial_itemsList : NULL,
        paymentsList,
        commissionsList
        );

    return orders_stats_order_dto_local_var;
end:
    if (status_local_nonprim) {
        order_stats_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (payment_type_local_nonprim) {
        orders_stats_order_payment_type_free(payment_type_local_nonprim);
        payment_type_local_nonprim = NULL;
    }
    if (delivery_region_local_nonprim) {
        orders_stats_delivery_region_dto_free(delivery_region_local_nonprim);
        delivery_region_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            orders_stats_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (initial_itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, initial_itemsList) {
            orders_stats_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(initial_itemsList);
        initial_itemsList = NULL;
    }
    if (paymentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, paymentsList) {
            orders_stats_payment_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(paymentsList);
        paymentsList = NULL;
    }
    if (commissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, commissionsList) {
            orders_stats_commission_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(commissionsList);
        commissionsList = NULL;
    }
    return NULL;

}
