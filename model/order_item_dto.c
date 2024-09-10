#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_dto.h"


char* order_item_dto_vat_ToString(_api__order_item_dto__e vat) {
    char* vatArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    return vatArray[vat];
}

_api__order_item_dto__e order_item_dto_vat_FromString(char* vat){
    int stringToReturn = 0;
    char *vatArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    size_t sizeofArray = sizeof(vatArray) / sizeof(vatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(vat, vatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_item_dto_required_instance_types_ToString(_api__order_item_dto__e required_instance_types) {
    char *required_instance_typesArray[] =  { "NULL", "CIS", "UIN", "RNPT", "GTD" };
    return required_instance_typesArray[required_instance_types - 1];
}

_api__order_item_dto__e order_item_dto_required_instance_types_FromString(char* required_instance_types) {
    int stringToReturn = 0;
    char *required_instance_typesArray[] =  { "NULL", "CIS", "UIN", "RNPT", "GTD" };
    size_t sizeofArray = sizeof(required_instance_typesArray) / sizeof(required_instance_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(required_instance_types, required_instance_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

order_item_dto_t *order_item_dto_create(
    long id,
    char *offer_id,
    char *offer_name,
    double price,
    double buyer_price,
    double buyer_price_before_discount,
    double price_before_discount,
    int count,
    order_vat_type_t *vat,
    char *shop_sku,
    double subsidy,
    char *partner_warehouse_id,
    list_t *promos,
    list_t *instances,
    list_t *details,
    list_t *subsidies,
    list_t *required_instance_types
    ) {
    order_item_dto_t *order_item_dto_local_var = malloc(sizeof(order_item_dto_t));
    if (!order_item_dto_local_var) {
        return NULL;
    }
    order_item_dto_local_var->id = id;
    order_item_dto_local_var->offer_id = offer_id;
    order_item_dto_local_var->offer_name = offer_name;
    order_item_dto_local_var->price = price;
    order_item_dto_local_var->buyer_price = buyer_price;
    order_item_dto_local_var->buyer_price_before_discount = buyer_price_before_discount;
    order_item_dto_local_var->price_before_discount = price_before_discount;
    order_item_dto_local_var->count = count;
    order_item_dto_local_var->vat = vat;
    order_item_dto_local_var->shop_sku = shop_sku;
    order_item_dto_local_var->subsidy = subsidy;
    order_item_dto_local_var->partner_warehouse_id = partner_warehouse_id;
    order_item_dto_local_var->promos = promos;
    order_item_dto_local_var->instances = instances;
    order_item_dto_local_var->details = details;
    order_item_dto_local_var->subsidies = subsidies;
    order_item_dto_local_var->required_instance_types = required_instance_types;

    return order_item_dto_local_var;
}


void order_item_dto_free(order_item_dto_t *order_item_dto) {
    if(NULL == order_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_item_dto->offer_id) {
        free(order_item_dto->offer_id);
        order_item_dto->offer_id = NULL;
    }
    if (order_item_dto->offer_name) {
        free(order_item_dto->offer_name);
        order_item_dto->offer_name = NULL;
    }
    if (order_item_dto->vat) {
        order_vat_type_free(order_item_dto->vat);
        order_item_dto->vat = NULL;
    }
    if (order_item_dto->shop_sku) {
        free(order_item_dto->shop_sku);
        order_item_dto->shop_sku = NULL;
    }
    if (order_item_dto->partner_warehouse_id) {
        free(order_item_dto->partner_warehouse_id);
        order_item_dto->partner_warehouse_id = NULL;
    }
    if (order_item_dto->promos) {
        list_ForEach(listEntry, order_item_dto->promos) {
            order_item_promo_dto_free(listEntry->data);
        }
        list_freeList(order_item_dto->promos);
        order_item_dto->promos = NULL;
    }
    if (order_item_dto->instances) {
        list_ForEach(listEntry, order_item_dto->instances) {
            order_item_instance_dto_free(listEntry->data);
        }
        list_freeList(order_item_dto->instances);
        order_item_dto->instances = NULL;
    }
    if (order_item_dto->details) {
        list_ForEach(listEntry, order_item_dto->details) {
            order_item_detail_dto_free(listEntry->data);
        }
        list_freeList(order_item_dto->details);
        order_item_dto->details = NULL;
    }
    if (order_item_dto->subsidies) {
        list_ForEach(listEntry, order_item_dto->subsidies) {
            order_item_subsidy_dto_free(listEntry->data);
        }
        list_freeList(order_item_dto->subsidies);
        order_item_dto->subsidies = NULL;
    }
    if (order_item_dto->required_instance_types) {
        list_ForEach(listEntry, order_item_dto->required_instance_types) {
            order_item_instance_type_free(listEntry->data);
        }
        list_freeList(order_item_dto->required_instance_types);
        order_item_dto->required_instance_types = NULL;
    }
    free(order_item_dto);
}

cJSON *order_item_dto_convertToJSON(order_item_dto_t *order_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_item_dto->id
    if(order_item_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", order_item_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->offer_id
    if(order_item_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", order_item_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // order_item_dto->offer_name
    if(order_item_dto->offer_name) {
    if(cJSON_AddStringToObject(item, "offerName", order_item_dto->offer_name) == NULL) {
    goto fail; //String
    }
    }


    // order_item_dto->price
    if(order_item_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", order_item_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->buyer_price
    if(order_item_dto->buyer_price) {
    if(cJSON_AddNumberToObject(item, "buyerPrice", order_item_dto->buyer_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->buyer_price_before_discount
    if(order_item_dto->buyer_price_before_discount) {
    if(cJSON_AddNumberToObject(item, "buyerPriceBeforeDiscount", order_item_dto->buyer_price_before_discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->price_before_discount
    if(order_item_dto->price_before_discount) {
    if(cJSON_AddNumberToObject(item, "priceBeforeDiscount", order_item_dto->price_before_discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->count
    if(order_item_dto->count) {
    if(cJSON_AddNumberToObject(item, "count", order_item_dto->count) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->vat
    if(order_item_dto->vat != _api__order_item_dto__NULL) {
    cJSON *vat_local_JSON = order_vat_type_convertToJSON(order_item_dto->vat);
    if(vat_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "vat", vat_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_item_dto->shop_sku
    if(order_item_dto->shop_sku) {
    if(cJSON_AddStringToObject(item, "shopSku", order_item_dto->shop_sku) == NULL) {
    goto fail; //String
    }
    }


    // order_item_dto->subsidy
    if(order_item_dto->subsidy) {
    if(cJSON_AddNumberToObject(item, "subsidy", order_item_dto->subsidy) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_dto->partner_warehouse_id
    if(order_item_dto->partner_warehouse_id) {
    if(cJSON_AddStringToObject(item, "partnerWarehouseId", order_item_dto->partner_warehouse_id) == NULL) {
    goto fail; //String
    }
    }


    // order_item_dto->promos
    if(order_item_dto->promos) {
    cJSON *promos = cJSON_AddArrayToObject(item, "promos");
    if(promos == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *promosListEntry;
    if (order_item_dto->promos) {
    list_ForEach(promosListEntry, order_item_dto->promos) {
    cJSON *itemLocal = order_item_promo_dto_convertToJSON(promosListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(promos, itemLocal);
    }
    }
    }


    // order_item_dto->instances
    if(order_item_dto->instances) {
    cJSON *instances = cJSON_AddArrayToObject(item, "instances");
    if(instances == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *instancesListEntry;
    if (order_item_dto->instances) {
    list_ForEach(instancesListEntry, order_item_dto->instances) {
    cJSON *itemLocal = order_item_instance_dto_convertToJSON(instancesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(instances, itemLocal);
    }
    }
    }


    // order_item_dto->details
    if(order_item_dto->details) {
    cJSON *details = cJSON_AddArrayToObject(item, "details");
    if(details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *detailsListEntry;
    if (order_item_dto->details) {
    list_ForEach(detailsListEntry, order_item_dto->details) {
    cJSON *itemLocal = order_item_detail_dto_convertToJSON(detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(details, itemLocal);
    }
    }
    }


    // order_item_dto->subsidies
    if(order_item_dto->subsidies) {
    cJSON *subsidies = cJSON_AddArrayToObject(item, "subsidies");
    if(subsidies == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *subsidiesListEntry;
    if (order_item_dto->subsidies) {
    list_ForEach(subsidiesListEntry, order_item_dto->subsidies) {
    cJSON *itemLocal = order_item_subsidy_dto_convertToJSON(subsidiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(subsidies, itemLocal);
    }
    }
    }


    // order_item_dto->required_instance_types
    if(order_item_dto->required_instance_types != _api__order_item_dto_REQUIREDINSTANCETYPES_NULL) {
    cJSON *required_instance_types = cJSON_AddArrayToObject(item, "requiredInstanceTypes");
    if(required_instance_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *required_instance_typesListEntry;
    if (order_item_dto->required_instance_types) {
    list_ForEach(required_instance_typesListEntry, order_item_dto->required_instance_types) {
    cJSON *itemLocal = order_item_instance_type_convertToJSON((_api__order_item_dto__e)required_instance_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(required_instance_types, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_item_dto_t *order_item_dto_parseFromJSON(cJSON *order_item_dtoJSON){

    order_item_dto_t *order_item_dto_local_var = NULL;

    // define the local variable for order_item_dto->vat
    order_vat_type_t *vat_local_nonprim = NULL;

    // define the local list for order_item_dto->promos
    list_t *promosList = NULL;

    // define the local list for order_item_dto->instances
    list_t *instancesList = NULL;

    // define the local list for order_item_dto->details
    list_t *detailsList = NULL;

    // define the local list for order_item_dto->subsidies
    list_t *subsidiesList = NULL;

    // define the local list for order_item_dto->required_instance_types
    list_t *required_instance_typesList = NULL;

    // order_item_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // order_item_dto->offer_name
    cJSON *offer_name = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "offerName");
    if (offer_name) { 
    if(!cJSON_IsString(offer_name) && !cJSON_IsNull(offer_name))
    {
    goto end; //String
    }
    }

    // order_item_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->buyer_price
    cJSON *buyer_price = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "buyerPrice");
    if (buyer_price) { 
    if(!cJSON_IsNumber(buyer_price))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->buyer_price_before_discount
    cJSON *buyer_price_before_discount = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "buyerPriceBeforeDiscount");
    if (buyer_price_before_discount) { 
    if(!cJSON_IsNumber(buyer_price_before_discount))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->price_before_discount
    cJSON *price_before_discount = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "priceBeforeDiscount");
    if (price_before_discount) { 
    if(!cJSON_IsNumber(price_before_discount))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "count");
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->vat
    cJSON *vat = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "vat");
    if (vat) { 
    vat_local_nonprim = order_vat_type_parseFromJSON(vat); //custom
    }

    // order_item_dto->shop_sku
    cJSON *shop_sku = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "shopSku");
    if (shop_sku) { 
    if(!cJSON_IsString(shop_sku) && !cJSON_IsNull(shop_sku))
    {
    goto end; //String
    }
    }

    // order_item_dto->subsidy
    cJSON *subsidy = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "subsidy");
    if (subsidy) { 
    if(!cJSON_IsNumber(subsidy))
    {
    goto end; //Numeric
    }
    }

    // order_item_dto->partner_warehouse_id
    cJSON *partner_warehouse_id = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "partnerWarehouseId");
    if (partner_warehouse_id) { 
    if(!cJSON_IsString(partner_warehouse_id) && !cJSON_IsNull(partner_warehouse_id))
    {
    goto end; //String
    }
    }

    // order_item_dto->promos
    cJSON *promos = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "promos");
    if (promos) { 
    cJSON *promos_local_nonprimitive = NULL;
    if(!cJSON_IsArray(promos)){
        goto end; //nonprimitive container
    }

    promosList = list_createList();

    cJSON_ArrayForEach(promos_local_nonprimitive,promos )
    {
        if(!cJSON_IsObject(promos_local_nonprimitive)){
            goto end;
        }
        order_item_promo_dto_t *promosItem = order_item_promo_dto_parseFromJSON(promos_local_nonprimitive);

        list_addElement(promosList, promosItem);
    }
    }

    // order_item_dto->instances
    cJSON *instances = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "instances");
    if (instances) { 
    cJSON *instances_local_nonprimitive = NULL;
    if(!cJSON_IsArray(instances)){
        goto end; //nonprimitive container
    }

    instancesList = list_createList();

    cJSON_ArrayForEach(instances_local_nonprimitive,instances )
    {
        if(!cJSON_IsObject(instances_local_nonprimitive)){
            goto end;
        }
        order_item_instance_dto_t *instancesItem = order_item_instance_dto_parseFromJSON(instances_local_nonprimitive);

        list_addElement(instancesList, instancesItem);
    }
    }

    // order_item_dto->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "details");
    if (details) { 
    cJSON *details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(details)){
        goto end; //nonprimitive container
    }

    detailsList = list_createList();

    cJSON_ArrayForEach(details_local_nonprimitive,details )
    {
        if(!cJSON_IsObject(details_local_nonprimitive)){
            goto end;
        }
        order_item_detail_dto_t *detailsItem = order_item_detail_dto_parseFromJSON(details_local_nonprimitive);

        list_addElement(detailsList, detailsItem);
    }
    }

    // order_item_dto->subsidies
    cJSON *subsidies = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "subsidies");
    if (subsidies) { 
    cJSON *subsidies_local_nonprimitive = NULL;
    if(!cJSON_IsArray(subsidies)){
        goto end; //nonprimitive container
    }

    subsidiesList = list_createList();

    cJSON_ArrayForEach(subsidies_local_nonprimitive,subsidies )
    {
        if(!cJSON_IsObject(subsidies_local_nonprimitive)){
            goto end;
        }
        order_item_subsidy_dto_t *subsidiesItem = order_item_subsidy_dto_parseFromJSON(subsidies_local_nonprimitive);

        list_addElement(subsidiesList, subsidiesItem);
    }
    }

    // order_item_dto->required_instance_types
    cJSON *required_instance_types = cJSON_GetObjectItemCaseSensitive(order_item_dtoJSON, "requiredInstanceTypes");
    if (required_instance_types) { 
    cJSON *required_instance_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(required_instance_types)){
        goto end; //nonprimitive container
    }

    required_instance_typesList = list_createList();

    cJSON_ArrayForEach(required_instance_types_local_nonprimitive,required_instance_types )
    {
        if(!cJSON_IsObject(required_instance_types_local_nonprimitive)){
            goto end;
        }
        order_item_dto_order_item_instance_type_e required_instance_typesItem = order_item_instance_type_parseFromJSON(required_instance_types_local_nonprimitive);

        list_addElement(required_instance_typesList, (void *)required_instance_typesItem);
    }
    }


    order_item_dto_local_var = order_item_dto_create (
        id ? id->valuedouble : 0,
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        offer_name && !cJSON_IsNull(offer_name) ? strdup(offer_name->valuestring) : NULL,
        price ? price->valuedouble : 0,
        buyer_price ? buyer_price->valuedouble : 0,
        buyer_price_before_discount ? buyer_price_before_discount->valuedouble : 0,
        price_before_discount ? price_before_discount->valuedouble : 0,
        count ? count->valuedouble : 0,
        vat ? vat_local_nonprim : NULL,
        shop_sku && !cJSON_IsNull(shop_sku) ? strdup(shop_sku->valuestring) : NULL,
        subsidy ? subsidy->valuedouble : 0,
        partner_warehouse_id && !cJSON_IsNull(partner_warehouse_id) ? strdup(partner_warehouse_id->valuestring) : NULL,
        promos ? promosList : NULL,
        instances ? instancesList : NULL,
        details ? detailsList : NULL,
        subsidies ? subsidiesList : NULL,
        required_instance_types ? required_instance_typesList : NULL
        );

    return order_item_dto_local_var;
end:
    if (vat_local_nonprim) {
        order_vat_type_free(vat_local_nonprim);
        vat_local_nonprim = NULL;
    }
    if (promosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, promosList) {
            order_item_promo_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(promosList);
        promosList = NULL;
    }
    if (instancesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, instancesList) {
            order_item_instance_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(instancesList);
        instancesList = NULL;
    }
    if (detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, detailsList) {
            order_item_detail_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(detailsList);
        detailsList = NULL;
    }
    if (subsidiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, subsidiesList) {
            order_item_subsidy_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(subsidiesList);
        subsidiesList = NULL;
    }
    if (required_instance_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, required_instance_typesList) {
            order_item_instance_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(required_instance_typesList);
        required_instance_typesList = NULL;
    }
    return NULL;

}
