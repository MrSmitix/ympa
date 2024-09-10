#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_stats_dto.h"



goods_stats_dto_t *goods_stats_dto_create(
    list_t *shop_skus
    ) {
    goods_stats_dto_t *goods_stats_dto_local_var = malloc(sizeof(goods_stats_dto_t));
    if (!goods_stats_dto_local_var) {
        return NULL;
    }
    goods_stats_dto_local_var->shop_skus = shop_skus;

    return goods_stats_dto_local_var;
}


void goods_stats_dto_free(goods_stats_dto_t *goods_stats_dto) {
    if(NULL == goods_stats_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_stats_dto->shop_skus) {
        list_ForEach(listEntry, goods_stats_dto->shop_skus) {
            goods_stats_goods_dto_free(listEntry->data);
        }
        list_freeList(goods_stats_dto->shop_skus);
        goods_stats_dto->shop_skus = NULL;
    }
    free(goods_stats_dto);
}

cJSON *goods_stats_dto_convertToJSON(goods_stats_dto_t *goods_stats_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_stats_dto->shop_skus
    if (!goods_stats_dto->shop_skus) {
        goto fail;
    }
    cJSON *shop_skus = cJSON_AddArrayToObject(item, "shopSkus");
    if(shop_skus == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *shop_skusListEntry;
    if (goods_stats_dto->shop_skus) {
    list_ForEach(shop_skusListEntry, goods_stats_dto->shop_skus) {
    cJSON *itemLocal = goods_stats_goods_dto_convertToJSON(shop_skusListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(shop_skus, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_stats_dto_t *goods_stats_dto_parseFromJSON(cJSON *goods_stats_dtoJSON){

    goods_stats_dto_t *goods_stats_dto_local_var = NULL;

    // define the local list for goods_stats_dto->shop_skus
    list_t *shop_skusList = NULL;

    // goods_stats_dto->shop_skus
    cJSON *shop_skus = cJSON_GetObjectItemCaseSensitive(goods_stats_dtoJSON, "shopSkus");
    if (!shop_skus) {
        goto end;
    }

    
    cJSON *shop_skus_local_nonprimitive = NULL;
    if(!cJSON_IsArray(shop_skus)){
        goto end; //nonprimitive container
    }

    shop_skusList = list_createList();

    cJSON_ArrayForEach(shop_skus_local_nonprimitive,shop_skus )
    {
        if(!cJSON_IsObject(shop_skus_local_nonprimitive)){
            goto end;
        }
        goods_stats_goods_dto_t *shop_skusItem = goods_stats_goods_dto_parseFromJSON(shop_skus_local_nonprimitive);

        list_addElement(shop_skusList, shop_skusItem);
    }


    goods_stats_dto_local_var = goods_stats_dto_create (
        shop_skusList
        );

    return goods_stats_dto_local_var;
end:
    if (shop_skusList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, shop_skusList) {
            goods_stats_goods_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(shop_skusList);
        shop_skusList = NULL;
    }
    return NULL;

}
