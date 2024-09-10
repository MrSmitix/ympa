#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_feeds_response.h"



get_feeds_response_t *get_feeds_response_create(
    list_t *feeds
    ) {
    get_feeds_response_t *get_feeds_response_local_var = malloc(sizeof(get_feeds_response_t));
    if (!get_feeds_response_local_var) {
        return NULL;
    }
    get_feeds_response_local_var->feeds = feeds;

    return get_feeds_response_local_var;
}


void get_feeds_response_free(get_feeds_response_t *get_feeds_response) {
    if(NULL == get_feeds_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_feeds_response->feeds) {
        list_ForEach(listEntry, get_feeds_response->feeds) {
            feed_dto_free(listEntry->data);
        }
        list_freeList(get_feeds_response->feeds);
        get_feeds_response->feeds = NULL;
    }
    free(get_feeds_response);
}

cJSON *get_feeds_response_convertToJSON(get_feeds_response_t *get_feeds_response) {
    cJSON *item = cJSON_CreateObject();

    // get_feeds_response->feeds
    if (!get_feeds_response->feeds) {
        goto fail;
    }
    cJSON *feeds = cJSON_AddArrayToObject(item, "feeds");
    if(feeds == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *feedsListEntry;
    if (get_feeds_response->feeds) {
    list_ForEach(feedsListEntry, get_feeds_response->feeds) {
    cJSON *itemLocal = feed_dto_convertToJSON(feedsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(feeds, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_feeds_response_t *get_feeds_response_parseFromJSON(cJSON *get_feeds_responseJSON){

    get_feeds_response_t *get_feeds_response_local_var = NULL;

    // define the local list for get_feeds_response->feeds
    list_t *feedsList = NULL;

    // get_feeds_response->feeds
    cJSON *feeds = cJSON_GetObjectItemCaseSensitive(get_feeds_responseJSON, "feeds");
    if (!feeds) {
        goto end;
    }

    
    cJSON *feeds_local_nonprimitive = NULL;
    if(!cJSON_IsArray(feeds)){
        goto end; //nonprimitive container
    }

    feedsList = list_createList();

    cJSON_ArrayForEach(feeds_local_nonprimitive,feeds )
    {
        if(!cJSON_IsObject(feeds_local_nonprimitive)){
            goto end;
        }
        feed_dto_t *feedsItem = feed_dto_parseFromJSON(feeds_local_nonprimitive);

        list_addElement(feedsList, feedsItem);
    }


    get_feeds_response_local_var = get_feeds_response_create (
        feedsList
        );

    return get_feeds_response_local_var;
end:
    if (feedsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, feedsList) {
            feed_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(feedsList);
        feedsList = NULL;
    }
    return NULL;

}
