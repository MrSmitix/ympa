#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_quality_rating_dto.h"



campaign_quality_rating_dto_t *campaign_quality_rating_dto_create(
    long campaign_id,
    list_t *ratings
    ) {
    campaign_quality_rating_dto_t *campaign_quality_rating_dto_local_var = malloc(sizeof(campaign_quality_rating_dto_t));
    if (!campaign_quality_rating_dto_local_var) {
        return NULL;
    }
    campaign_quality_rating_dto_local_var->campaign_id = campaign_id;
    campaign_quality_rating_dto_local_var->ratings = ratings;

    return campaign_quality_rating_dto_local_var;
}


void campaign_quality_rating_dto_free(campaign_quality_rating_dto_t *campaign_quality_rating_dto) {
    if(NULL == campaign_quality_rating_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_quality_rating_dto->ratings) {
        list_ForEach(listEntry, campaign_quality_rating_dto->ratings) {
            quality_rating_dto_free(listEntry->data);
        }
        list_freeList(campaign_quality_rating_dto->ratings);
        campaign_quality_rating_dto->ratings = NULL;
    }
    free(campaign_quality_rating_dto);
}

cJSON *campaign_quality_rating_dto_convertToJSON(campaign_quality_rating_dto_t *campaign_quality_rating_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_quality_rating_dto->campaign_id
    if (!campaign_quality_rating_dto->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", campaign_quality_rating_dto->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // campaign_quality_rating_dto->ratings
    if (!campaign_quality_rating_dto->ratings) {
        goto fail;
    }
    cJSON *ratings = cJSON_AddArrayToObject(item, "ratings");
    if(ratings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ratingsListEntry;
    if (campaign_quality_rating_dto->ratings) {
    list_ForEach(ratingsListEntry, campaign_quality_rating_dto->ratings) {
    cJSON *itemLocal = quality_rating_dto_convertToJSON(ratingsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ratings, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_quality_rating_dto_t *campaign_quality_rating_dto_parseFromJSON(cJSON *campaign_quality_rating_dtoJSON){

    campaign_quality_rating_dto_t *campaign_quality_rating_dto_local_var = NULL;

    // define the local list for campaign_quality_rating_dto->ratings
    list_t *ratingsList = NULL;

    // campaign_quality_rating_dto->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(campaign_quality_rating_dtoJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // campaign_quality_rating_dto->ratings
    cJSON *ratings = cJSON_GetObjectItemCaseSensitive(campaign_quality_rating_dtoJSON, "ratings");
    if (!ratings) {
        goto end;
    }

    
    cJSON *ratings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ratings)){
        goto end; //nonprimitive container
    }

    ratingsList = list_createList();

    cJSON_ArrayForEach(ratings_local_nonprimitive,ratings )
    {
        if(!cJSON_IsObject(ratings_local_nonprimitive)){
            goto end;
        }
        quality_rating_dto_t *ratingsItem = quality_rating_dto_parseFromJSON(ratings_local_nonprimitive);

        list_addElement(ratingsList, ratingsItem);
    }


    campaign_quality_rating_dto_local_var = campaign_quality_rating_dto_create (
        campaign_id->valuedouble,
        ratingsList
        );

    return campaign_quality_rating_dto_local_var;
end:
    if (ratingsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ratingsList) {
            quality_rating_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ratingsList);
        ratingsList = NULL;
    }
    return NULL;

}
