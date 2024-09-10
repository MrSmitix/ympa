#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brief_order_item_dto.h"


char* brief_order_item_dto_vat_ToString(_api__brief_order_item_dto__e vat) {
    char* vatArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    return vatArray[vat];
}

_api__brief_order_item_dto__e brief_order_item_dto_vat_FromString(char* vat){
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

brief_order_item_dto_t *brief_order_item_dto_create(
    long id,
    order_vat_type_t *vat,
    int count,
    double price,
    char *offer_name,
    char *offer_id,
    list_t *instances
    ) {
    brief_order_item_dto_t *brief_order_item_dto_local_var = malloc(sizeof(brief_order_item_dto_t));
    if (!brief_order_item_dto_local_var) {
        return NULL;
    }
    brief_order_item_dto_local_var->id = id;
    brief_order_item_dto_local_var->vat = vat;
    brief_order_item_dto_local_var->count = count;
    brief_order_item_dto_local_var->price = price;
    brief_order_item_dto_local_var->offer_name = offer_name;
    brief_order_item_dto_local_var->offer_id = offer_id;
    brief_order_item_dto_local_var->instances = instances;

    return brief_order_item_dto_local_var;
}


void brief_order_item_dto_free(brief_order_item_dto_t *brief_order_item_dto) {
    if(NULL == brief_order_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (brief_order_item_dto->vat) {
        order_vat_type_free(brief_order_item_dto->vat);
        brief_order_item_dto->vat = NULL;
    }
    if (brief_order_item_dto->offer_name) {
        free(brief_order_item_dto->offer_name);
        brief_order_item_dto->offer_name = NULL;
    }
    if (brief_order_item_dto->offer_id) {
        free(brief_order_item_dto->offer_id);
        brief_order_item_dto->offer_id = NULL;
    }
    if (brief_order_item_dto->instances) {
        list_ForEach(listEntry, brief_order_item_dto->instances) {
            order_item_instance_dto_free(listEntry->data);
        }
        list_freeList(brief_order_item_dto->instances);
        brief_order_item_dto->instances = NULL;
    }
    free(brief_order_item_dto);
}

cJSON *brief_order_item_dto_convertToJSON(brief_order_item_dto_t *brief_order_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // brief_order_item_dto->id
    if(brief_order_item_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", brief_order_item_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // brief_order_item_dto->vat
    if(brief_order_item_dto->vat != _api__brief_order_item_dto__NULL) {
    cJSON *vat_local_JSON = order_vat_type_convertToJSON(brief_order_item_dto->vat);
    if(vat_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "vat", vat_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // brief_order_item_dto->count
    if(brief_order_item_dto->count) {
    if(cJSON_AddNumberToObject(item, "count", brief_order_item_dto->count) == NULL) {
    goto fail; //Numeric
    }
    }


    // brief_order_item_dto->price
    if(brief_order_item_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", brief_order_item_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // brief_order_item_dto->offer_name
    if(brief_order_item_dto->offer_name) {
    if(cJSON_AddStringToObject(item, "offerName", brief_order_item_dto->offer_name) == NULL) {
    goto fail; //String
    }
    }


    // brief_order_item_dto->offer_id
    if(brief_order_item_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", brief_order_item_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // brief_order_item_dto->instances
    if(brief_order_item_dto->instances) {
    cJSON *instances = cJSON_AddArrayToObject(item, "instances");
    if(instances == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *instancesListEntry;
    if (brief_order_item_dto->instances) {
    list_ForEach(instancesListEntry, brief_order_item_dto->instances) {
    cJSON *itemLocal = order_item_instance_dto_convertToJSON(instancesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(instances, itemLocal);
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

brief_order_item_dto_t *brief_order_item_dto_parseFromJSON(cJSON *brief_order_item_dtoJSON){

    brief_order_item_dto_t *brief_order_item_dto_local_var = NULL;

    // define the local variable for brief_order_item_dto->vat
    order_vat_type_t *vat_local_nonprim = NULL;

    // define the local list for brief_order_item_dto->instances
    list_t *instancesList = NULL;

    // brief_order_item_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // brief_order_item_dto->vat
    cJSON *vat = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "vat");
    if (vat) { 
    vat_local_nonprim = order_vat_type_parseFromJSON(vat); //custom
    }

    // brief_order_item_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "count");
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    }

    // brief_order_item_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // brief_order_item_dto->offer_name
    cJSON *offer_name = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "offerName");
    if (offer_name) { 
    if(!cJSON_IsString(offer_name) && !cJSON_IsNull(offer_name))
    {
    goto end; //String
    }
    }

    // brief_order_item_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // brief_order_item_dto->instances
    cJSON *instances = cJSON_GetObjectItemCaseSensitive(brief_order_item_dtoJSON, "instances");
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


    brief_order_item_dto_local_var = brief_order_item_dto_create (
        id ? id->valuedouble : 0,
        vat ? vat_local_nonprim : NULL,
        count ? count->valuedouble : 0,
        price ? price->valuedouble : 0,
        offer_name && !cJSON_IsNull(offer_name) ? strdup(offer_name->valuestring) : NULL,
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        instances ? instancesList : NULL
        );

    return brief_order_item_dto_local_var;
end:
    if (vat_local_nonprim) {
        order_vat_type_free(vat_local_nonprim);
        vat_local_nonprim = NULL;
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
    return NULL;

}
