#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_goods_stats_request.h"



get_goods_stats_request_t *get_goods_stats_request_create(
    list_t *shop_skus
    ) {
    get_goods_stats_request_t *get_goods_stats_request_local_var = malloc(sizeof(get_goods_stats_request_t));
    if (!get_goods_stats_request_local_var) {
        return NULL;
    }
    get_goods_stats_request_local_var->shop_skus = shop_skus;

    return get_goods_stats_request_local_var;
}


void get_goods_stats_request_free(get_goods_stats_request_t *get_goods_stats_request) {
    if(NULL == get_goods_stats_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_goods_stats_request->shop_skus) {
        list_ForEach(listEntry, get_goods_stats_request->shop_skus) {
            free(listEntry->data);
        }
        list_freeList(get_goods_stats_request->shop_skus);
        get_goods_stats_request->shop_skus = NULL;
    }
    free(get_goods_stats_request);
}

cJSON *get_goods_stats_request_convertToJSON(get_goods_stats_request_t *get_goods_stats_request) {
    cJSON *item = cJSON_CreateObject();

    // get_goods_stats_request->shop_skus
    if (!get_goods_stats_request->shop_skus) {
        goto fail;
    }
    cJSON *shop_skus = cJSON_AddArrayToObject(item, "shopSkus");
    if(shop_skus == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *shop_skusListEntry;
    list_ForEach(shop_skusListEntry, get_goods_stats_request->shop_skus) {
    if(cJSON_AddStringToObject(shop_skus, "", (char*)shop_skusListEntry->data) == NULL)
    {
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

get_goods_stats_request_t *get_goods_stats_request_parseFromJSON(cJSON *get_goods_stats_requestJSON){

    get_goods_stats_request_t *get_goods_stats_request_local_var = NULL;

    // define the local list for get_goods_stats_request->shop_skus
    list_t *shop_skusList = NULL;

    // get_goods_stats_request->shop_skus
    cJSON *shop_skus = cJSON_GetObjectItemCaseSensitive(get_goods_stats_requestJSON, "shopSkus");
    if (!shop_skus) {
        goto end;
    }

    
    cJSON *shop_skus_local = NULL;
    if(!cJSON_IsArray(shop_skus)) {
        goto end;//primitive container
    }
    shop_skusList = list_createList();

    cJSON_ArrayForEach(shop_skus_local, shop_skus)
    {
        if(!cJSON_IsString(shop_skus_local))
        {
            goto end;
        }
        list_addElement(shop_skusList , strdup(shop_skus_local->valuestring));
    }


    get_goods_stats_request_local_var = get_goods_stats_request_create (
        shop_skusList
        );

    return get_goods_stats_request_local_var;
end:
    if (shop_skusList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, shop_skusList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(shop_skusList);
        shop_skusList = NULL;
    }
    return NULL;

}
