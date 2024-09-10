#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_offers_request.h"


char* get_campaign_offers_request_statuses_ToString(_api__get_campaign_offers_request__e statuses) {
    char *statusesArray[] =  { "NULL", "PUBLISHED", "CHECKING", "DISABLED_BY_PARTNER", "DISABLED_AUTOMATICALLY", "REJECTED_BY_MARKET", "CREATING_CARD", "NO_CARD", "NO_STOCKS", "ARCHIVED" };
    return statusesArray[statuses - 1];
}

_api__get_campaign_offers_request__e get_campaign_offers_request_statuses_FromString(char* statuses) {
    int stringToReturn = 0;
    char *statusesArray[] =  { "NULL", "PUBLISHED", "CHECKING", "DISABLED_BY_PARTNER", "DISABLED_AUTOMATICALLY", "REJECTED_BY_MARKET", "CREATING_CARD", "NO_CARD", "NO_STOCKS", "ARCHIVED" };
    size_t sizeofArray = sizeof(statusesArray) / sizeof(statusesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(statuses, statusesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

get_campaign_offers_request_t *get_campaign_offers_request_create(
    list_t *offer_ids,
    list_t *statuses,
    list_t *category_ids,
    list_t *vendor_names,
    list_t *tags
    ) {
    get_campaign_offers_request_t *get_campaign_offers_request_local_var = malloc(sizeof(get_campaign_offers_request_t));
    if (!get_campaign_offers_request_local_var) {
        return NULL;
    }
    get_campaign_offers_request_local_var->offer_ids = offer_ids;
    get_campaign_offers_request_local_var->statuses = statuses;
    get_campaign_offers_request_local_var->category_ids = category_ids;
    get_campaign_offers_request_local_var->vendor_names = vendor_names;
    get_campaign_offers_request_local_var->tags = tags;

    return get_campaign_offers_request_local_var;
}


void get_campaign_offers_request_free(get_campaign_offers_request_t *get_campaign_offers_request) {
    if(NULL == get_campaign_offers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_offers_request->offer_ids) {
        list_ForEach(listEntry, get_campaign_offers_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(get_campaign_offers_request->offer_ids);
        get_campaign_offers_request->offer_ids = NULL;
    }
    if (get_campaign_offers_request->statuses) {
        list_ForEach(listEntry, get_campaign_offers_request->statuses) {
            offer_campaign_status_type_free(listEntry->data);
        }
        list_freeList(get_campaign_offers_request->statuses);
        get_campaign_offers_request->statuses = NULL;
    }
    if (get_campaign_offers_request->category_ids) {
        list_ForEach(listEntry, get_campaign_offers_request->category_ids) {
            free(listEntry->data);
        }
        list_freeList(get_campaign_offers_request->category_ids);
        get_campaign_offers_request->category_ids = NULL;
    }
    if (get_campaign_offers_request->vendor_names) {
        list_ForEach(listEntry, get_campaign_offers_request->vendor_names) {
            free(listEntry->data);
        }
        list_freeList(get_campaign_offers_request->vendor_names);
        get_campaign_offers_request->vendor_names = NULL;
    }
    if (get_campaign_offers_request->tags) {
        list_ForEach(listEntry, get_campaign_offers_request->tags) {
            free(listEntry->data);
        }
        list_freeList(get_campaign_offers_request->tags);
        get_campaign_offers_request->tags = NULL;
    }
    free(get_campaign_offers_request);
}

cJSON *get_campaign_offers_request_convertToJSON(get_campaign_offers_request_t *get_campaign_offers_request) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_offers_request->offer_ids
    if(get_campaign_offers_request->offer_ids) {
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, get_campaign_offers_request->offer_ids) {
    if(cJSON_AddStringToObject(offer_ids, "", (char*)offer_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_campaign_offers_request->statuses
    if(get_campaign_offers_request->statuses != _api__get_campaign_offers_request_STATUSES_NULL) {
    cJSON *statuses = cJSON_AddArrayToObject(item, "statuses");
    if(statuses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statusesListEntry;
    if (get_campaign_offers_request->statuses) {
    list_ForEach(statusesListEntry, get_campaign_offers_request->statuses) {
    cJSON *itemLocal = offer_campaign_status_type_convertToJSON((_api__get_campaign_offers_request__e)statusesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(statuses, itemLocal);
    }
    }
    }


    // get_campaign_offers_request->category_ids
    if(get_campaign_offers_request->category_ids) {
    cJSON *category_ids = cJSON_AddArrayToObject(item, "categoryIds");
    if(category_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *category_idsListEntry;
    list_ForEach(category_idsListEntry, get_campaign_offers_request->category_ids) {
    if(cJSON_AddNumberToObject(category_ids, "", *(double *)category_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_campaign_offers_request->vendor_names
    if(get_campaign_offers_request->vendor_names) {
    cJSON *vendor_names = cJSON_AddArrayToObject(item, "vendorNames");
    if(vendor_names == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *vendor_namesListEntry;
    list_ForEach(vendor_namesListEntry, get_campaign_offers_request->vendor_names) {
    if(cJSON_AddStringToObject(vendor_names, "", (char*)vendor_namesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_campaign_offers_request->tags
    if(get_campaign_offers_request->tags) {
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
    if(tags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tagsListEntry;
    list_ForEach(tagsListEntry, get_campaign_offers_request->tags) {
    if(cJSON_AddStringToObject(tags, "", (char*)tagsListEntry->data) == NULL)
    {
        goto fail;
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

get_campaign_offers_request_t *get_campaign_offers_request_parseFromJSON(cJSON *get_campaign_offers_requestJSON){

    get_campaign_offers_request_t *get_campaign_offers_request_local_var = NULL;

    // define the local list for get_campaign_offers_request->offer_ids
    list_t *offer_idsList = NULL;

    // define the local list for get_campaign_offers_request->statuses
    list_t *statusesList = NULL;

    // define the local list for get_campaign_offers_request->category_ids
    list_t *category_idsList = NULL;

    // define the local list for get_campaign_offers_request->vendor_names
    list_t *vendor_namesList = NULL;

    // define the local list for get_campaign_offers_request->tags
    list_t *tagsList = NULL;

    // get_campaign_offers_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_requestJSON, "offerIds");
    if (offer_ids) { 
    cJSON *offer_ids_local = NULL;
    if(!cJSON_IsArray(offer_ids)) {
        goto end;//primitive container
    }
    offer_idsList = list_createList();

    cJSON_ArrayForEach(offer_ids_local, offer_ids)
    {
        if(!cJSON_IsString(offer_ids_local))
        {
            goto end;
        }
        list_addElement(offer_idsList , strdup(offer_ids_local->valuestring));
    }
    }

    // get_campaign_offers_request->statuses
    cJSON *statuses = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_requestJSON, "statuses");
    if (statuses) { 
    cJSON *statuses_local_nonprimitive = NULL;
    if(!cJSON_IsArray(statuses)){
        goto end; //nonprimitive container
    }

    statusesList = list_createList();

    cJSON_ArrayForEach(statuses_local_nonprimitive,statuses )
    {
        if(!cJSON_IsObject(statuses_local_nonprimitive)){
            goto end;
        }
        get_campaign_offers_request_offer_campaign_status_type_e statusesItem = offer_campaign_status_type_parseFromJSON(statuses_local_nonprimitive);

        list_addElement(statusesList, (void *)statusesItem);
    }
    }

    // get_campaign_offers_request->category_ids
    cJSON *category_ids = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_requestJSON, "categoryIds");
    if (category_ids) { 
    cJSON *category_ids_local = NULL;
    if(!cJSON_IsArray(category_ids)) {
        goto end;//primitive container
    }
    category_idsList = list_createList();

    cJSON_ArrayForEach(category_ids_local, category_ids)
    {
        if(!cJSON_IsNumber(category_ids_local))
        {
            goto end;
        }
        double *category_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!category_ids_local_value)
        {
            goto end;
        }
        *category_ids_local_value = category_ids_local->valuedouble;
        list_addElement(category_idsList , category_ids_local_value);
    }
    }

    // get_campaign_offers_request->vendor_names
    cJSON *vendor_names = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_requestJSON, "vendorNames");
    if (vendor_names) { 
    cJSON *vendor_names_local = NULL;
    if(!cJSON_IsArray(vendor_names)) {
        goto end;//primitive container
    }
    vendor_namesList = list_createList();

    cJSON_ArrayForEach(vendor_names_local, vendor_names)
    {
        if(!cJSON_IsString(vendor_names_local))
        {
            goto end;
        }
        list_addElement(vendor_namesList , strdup(vendor_names_local->valuestring));
    }
    }

    // get_campaign_offers_request->tags
    cJSON *tags = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_requestJSON, "tags");
    if (tags) { 
    cJSON *tags_local = NULL;
    if(!cJSON_IsArray(tags)) {
        goto end;//primitive container
    }
    tagsList = list_createList();

    cJSON_ArrayForEach(tags_local, tags)
    {
        if(!cJSON_IsString(tags_local))
        {
            goto end;
        }
        list_addElement(tagsList , strdup(tags_local->valuestring));
    }
    }


    get_campaign_offers_request_local_var = get_campaign_offers_request_create (
        offer_ids ? offer_idsList : NULL,
        statuses ? statusesList : NULL,
        category_ids ? category_idsList : NULL,
        vendor_names ? vendor_namesList : NULL,
        tags ? tagsList : NULL
        );

    return get_campaign_offers_request_local_var;
end:
    if (offer_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_idsList);
        offer_idsList = NULL;
    }
    if (statusesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, statusesList) {
            offer_campaign_status_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(statusesList);
        statusesList = NULL;
    }
    if (category_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, category_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(category_idsList);
        category_idsList = NULL;
    }
    if (vendor_namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, vendor_namesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(vendor_namesList);
        vendor_namesList = NULL;
    }
    if (tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tagsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tagsList);
        tagsList = NULL;
    }
    return NULL;

}
