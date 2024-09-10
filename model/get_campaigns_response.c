#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaigns_response.h"



get_campaigns_response_t *get_campaigns_response_create(
    list_t *campaigns,
    flipping_pager_dto_t *pager
    ) {
    get_campaigns_response_t *get_campaigns_response_local_var = malloc(sizeof(get_campaigns_response_t));
    if (!get_campaigns_response_local_var) {
        return NULL;
    }
    get_campaigns_response_local_var->campaigns = campaigns;
    get_campaigns_response_local_var->pager = pager;

    return get_campaigns_response_local_var;
}


void get_campaigns_response_free(get_campaigns_response_t *get_campaigns_response) {
    if(NULL == get_campaigns_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaigns_response->campaigns) {
        list_ForEach(listEntry, get_campaigns_response->campaigns) {
            campaign_dto_free(listEntry->data);
        }
        list_freeList(get_campaigns_response->campaigns);
        get_campaigns_response->campaigns = NULL;
    }
    if (get_campaigns_response->pager) {
        flipping_pager_dto_free(get_campaigns_response->pager);
        get_campaigns_response->pager = NULL;
    }
    free(get_campaigns_response);
}

cJSON *get_campaigns_response_convertToJSON(get_campaigns_response_t *get_campaigns_response) {
    cJSON *item = cJSON_CreateObject();

    // get_campaigns_response->campaigns
    if (!get_campaigns_response->campaigns) {
        goto fail;
    }
    cJSON *campaigns = cJSON_AddArrayToObject(item, "campaigns");
    if(campaigns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaignsListEntry;
    if (get_campaigns_response->campaigns) {
    list_ForEach(campaignsListEntry, get_campaigns_response->campaigns) {
    cJSON *itemLocal = campaign_dto_convertToJSON(campaignsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaigns, itemLocal);
    }
    }


    // get_campaigns_response->pager
    if(get_campaigns_response->pager) {
    cJSON *pager_local_JSON = flipping_pager_dto_convertToJSON(get_campaigns_response->pager);
    if(pager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pager", pager_local_JSON);
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

get_campaigns_response_t *get_campaigns_response_parseFromJSON(cJSON *get_campaigns_responseJSON){

    get_campaigns_response_t *get_campaigns_response_local_var = NULL;

    // define the local list for get_campaigns_response->campaigns
    list_t *campaignsList = NULL;

    // define the local variable for get_campaigns_response->pager
    flipping_pager_dto_t *pager_local_nonprim = NULL;

    // get_campaigns_response->campaigns
    cJSON *campaigns = cJSON_GetObjectItemCaseSensitive(get_campaigns_responseJSON, "campaigns");
    if (!campaigns) {
        goto end;
    }

    
    cJSON *campaigns_local_nonprimitive = NULL;
    if(!cJSON_IsArray(campaigns)){
        goto end; //nonprimitive container
    }

    campaignsList = list_createList();

    cJSON_ArrayForEach(campaigns_local_nonprimitive,campaigns )
    {
        if(!cJSON_IsObject(campaigns_local_nonprimitive)){
            goto end;
        }
        campaign_dto_t *campaignsItem = campaign_dto_parseFromJSON(campaigns_local_nonprimitive);

        list_addElement(campaignsList, campaignsItem);
    }

    // get_campaigns_response->pager
    cJSON *pager = cJSON_GetObjectItemCaseSensitive(get_campaigns_responseJSON, "pager");
    if (pager) { 
    pager_local_nonprim = flipping_pager_dto_parseFromJSON(pager); //nonprimitive
    }


    get_campaigns_response_local_var = get_campaigns_response_create (
        campaignsList,
        pager ? pager_local_nonprim : NULL
        );

    return get_campaigns_response_local_var;
end:
    if (campaignsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaignsList) {
            campaign_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaignsList);
        campaignsList = NULL;
    }
    if (pager_local_nonprim) {
        flipping_pager_dto_free(pager_local_nonprim);
        pager_local_nonprim = NULL;
    }
    return NULL;

}
