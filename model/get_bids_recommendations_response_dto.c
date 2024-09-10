#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_bids_recommendations_response_dto.h"



get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto_create(
    list_t *recommendations
    ) {
    get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto_local_var = malloc(sizeof(get_bids_recommendations_response_dto_t));
    if (!get_bids_recommendations_response_dto_local_var) {
        return NULL;
    }
    get_bids_recommendations_response_dto_local_var->recommendations = recommendations;

    return get_bids_recommendations_response_dto_local_var;
}


void get_bids_recommendations_response_dto_free(get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto) {
    if(NULL == get_bids_recommendations_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_bids_recommendations_response_dto->recommendations) {
        list_ForEach(listEntry, get_bids_recommendations_response_dto->recommendations) {
            sku_bid_recommendation_item_dto_free(listEntry->data);
        }
        list_freeList(get_bids_recommendations_response_dto->recommendations);
        get_bids_recommendations_response_dto->recommendations = NULL;
    }
    free(get_bids_recommendations_response_dto);
}

cJSON *get_bids_recommendations_response_dto_convertToJSON(get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_bids_recommendations_response_dto->recommendations
    if (!get_bids_recommendations_response_dto->recommendations) {
        goto fail;
    }
    cJSON *recommendations = cJSON_AddArrayToObject(item, "recommendations");
    if(recommendations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *recommendationsListEntry;
    if (get_bids_recommendations_response_dto->recommendations) {
    list_ForEach(recommendationsListEntry, get_bids_recommendations_response_dto->recommendations) {
    cJSON *itemLocal = sku_bid_recommendation_item_dto_convertToJSON(recommendationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(recommendations, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto_parseFromJSON(cJSON *get_bids_recommendations_response_dtoJSON){

    get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto_local_var = NULL;

    // define the local list for get_bids_recommendations_response_dto->recommendations
    list_t *recommendationsList = NULL;

    // get_bids_recommendations_response_dto->recommendations
    cJSON *recommendations = cJSON_GetObjectItemCaseSensitive(get_bids_recommendations_response_dtoJSON, "recommendations");
    if (!recommendations) {
        goto end;
    }

    
    cJSON *recommendations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(recommendations)){
        goto end; //nonprimitive container
    }

    recommendationsList = list_createList();

    cJSON_ArrayForEach(recommendations_local_nonprimitive,recommendations )
    {
        if(!cJSON_IsObject(recommendations_local_nonprimitive)){
            goto end;
        }
        sku_bid_recommendation_item_dto_t *recommendationsItem = sku_bid_recommendation_item_dto_parseFromJSON(recommendations_local_nonprimitive);

        list_addElement(recommendationsList, recommendationsItem);
    }


    get_bids_recommendations_response_dto_local_var = get_bids_recommendations_response_dto_create (
        recommendationsList
        );

    return get_bids_recommendations_response_dto_local_var;
end:
    if (recommendationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recommendationsList) {
            sku_bid_recommendation_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recommendationsList);
        recommendationsList = NULL;
    }
    return NULL;

}
