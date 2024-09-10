#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_item_dto.h"



return_item_dto_t *return_item_dto_create(
    long market_sku,
    char *shop_sku,
    long count,
    list_t *decisions,
    list_t *instances,
    list_t *tracks
    ) {
    return_item_dto_t *return_item_dto_local_var = malloc(sizeof(return_item_dto_t));
    if (!return_item_dto_local_var) {
        return NULL;
    }
    return_item_dto_local_var->market_sku = market_sku;
    return_item_dto_local_var->shop_sku = shop_sku;
    return_item_dto_local_var->count = count;
    return_item_dto_local_var->decisions = decisions;
    return_item_dto_local_var->instances = instances;
    return_item_dto_local_var->tracks = tracks;

    return return_item_dto_local_var;
}


void return_item_dto_free(return_item_dto_t *return_item_dto) {
    if(NULL == return_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (return_item_dto->shop_sku) {
        free(return_item_dto->shop_sku);
        return_item_dto->shop_sku = NULL;
    }
    if (return_item_dto->decisions) {
        list_ForEach(listEntry, return_item_dto->decisions) {
            return_decision_dto_free(listEntry->data);
        }
        list_freeList(return_item_dto->decisions);
        return_item_dto->decisions = NULL;
    }
    if (return_item_dto->instances) {
        list_ForEach(listEntry, return_item_dto->instances) {
            return_instance_dto_free(listEntry->data);
        }
        list_freeList(return_item_dto->instances);
        return_item_dto->instances = NULL;
    }
    if (return_item_dto->tracks) {
        list_ForEach(listEntry, return_item_dto->tracks) {
            track_dto_free(listEntry->data);
        }
        list_freeList(return_item_dto->tracks);
        return_item_dto->tracks = NULL;
    }
    free(return_item_dto);
}

cJSON *return_item_dto_convertToJSON(return_item_dto_t *return_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // return_item_dto->market_sku
    if(return_item_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", return_item_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_item_dto->shop_sku
    if (!return_item_dto->shop_sku) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "shopSku", return_item_dto->shop_sku) == NULL) {
    goto fail; //String
    }


    // return_item_dto->count
    if (!return_item_dto->count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "count", return_item_dto->count) == NULL) {
    goto fail; //Numeric
    }


    // return_item_dto->decisions
    if(return_item_dto->decisions) {
    cJSON *decisions = cJSON_AddArrayToObject(item, "decisions");
    if(decisions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *decisionsListEntry;
    if (return_item_dto->decisions) {
    list_ForEach(decisionsListEntry, return_item_dto->decisions) {
    cJSON *itemLocal = return_decision_dto_convertToJSON(decisionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(decisions, itemLocal);
    }
    }
    }


    // return_item_dto->instances
    if(return_item_dto->instances) {
    cJSON *instances = cJSON_AddArrayToObject(item, "instances");
    if(instances == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *instancesListEntry;
    if (return_item_dto->instances) {
    list_ForEach(instancesListEntry, return_item_dto->instances) {
    cJSON *itemLocal = return_instance_dto_convertToJSON(instancesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(instances, itemLocal);
    }
    }
    }


    // return_item_dto->tracks
    if(return_item_dto->tracks) {
    cJSON *tracks = cJSON_AddArrayToObject(item, "tracks");
    if(tracks == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tracksListEntry;
    if (return_item_dto->tracks) {
    list_ForEach(tracksListEntry, return_item_dto->tracks) {
    cJSON *itemLocal = track_dto_convertToJSON(tracksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tracks, itemLocal);
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

return_item_dto_t *return_item_dto_parseFromJSON(cJSON *return_item_dtoJSON){

    return_item_dto_t *return_item_dto_local_var = NULL;

    // define the local list for return_item_dto->decisions
    list_t *decisionsList = NULL;

    // define the local list for return_item_dto->instances
    list_t *instancesList = NULL;

    // define the local list for return_item_dto->tracks
    list_t *tracksList = NULL;

    // return_item_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(return_item_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // return_item_dto->shop_sku
    cJSON *shop_sku = cJSON_GetObjectItemCaseSensitive(return_item_dtoJSON, "shopSku");
    if (!shop_sku) {
        goto end;
    }

    
    if(!cJSON_IsString(shop_sku))
    {
    goto end; //String
    }

    // return_item_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(return_item_dtoJSON, "count");
    if (!count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }

    // return_item_dto->decisions
    cJSON *decisions = cJSON_GetObjectItemCaseSensitive(return_item_dtoJSON, "decisions");
    if (decisions) { 
    cJSON *decisions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(decisions)){
        goto end; //nonprimitive container
    }

    decisionsList = list_createList();

    cJSON_ArrayForEach(decisions_local_nonprimitive,decisions )
    {
        if(!cJSON_IsObject(decisions_local_nonprimitive)){
            goto end;
        }
        return_decision_dto_t *decisionsItem = return_decision_dto_parseFromJSON(decisions_local_nonprimitive);

        list_addElement(decisionsList, decisionsItem);
    }
    }

    // return_item_dto->instances
    cJSON *instances = cJSON_GetObjectItemCaseSensitive(return_item_dtoJSON, "instances");
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
        return_instance_dto_t *instancesItem = return_instance_dto_parseFromJSON(instances_local_nonprimitive);

        list_addElement(instancesList, instancesItem);
    }
    }

    // return_item_dto->tracks
    cJSON *tracks = cJSON_GetObjectItemCaseSensitive(return_item_dtoJSON, "tracks");
    if (tracks) { 
    cJSON *tracks_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tracks)){
        goto end; //nonprimitive container
    }

    tracksList = list_createList();

    cJSON_ArrayForEach(tracks_local_nonprimitive,tracks )
    {
        if(!cJSON_IsObject(tracks_local_nonprimitive)){
            goto end;
        }
        track_dto_t *tracksItem = track_dto_parseFromJSON(tracks_local_nonprimitive);

        list_addElement(tracksList, tracksItem);
    }
    }


    return_item_dto_local_var = return_item_dto_create (
        market_sku ? market_sku->valuedouble : 0,
        strdup(shop_sku->valuestring),
        count->valuedouble,
        decisions ? decisionsList : NULL,
        instances ? instancesList : NULL,
        tracks ? tracksList : NULL
        );

    return return_item_dto_local_var;
end:
    if (decisionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, decisionsList) {
            return_decision_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(decisionsList);
        decisionsList = NULL;
    }
    if (instancesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, instancesList) {
            return_instance_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(instancesList);
        instancesList = NULL;
    }
    if (tracksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tracksList) {
            track_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tracksList);
        tracksList = NULL;
    }
    return NULL;

}
