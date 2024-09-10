#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_feed_response.h"



get_feed_response_t *get_feed_response_create(
    feed_dto_t *feed
    ) {
    get_feed_response_t *get_feed_response_local_var = malloc(sizeof(get_feed_response_t));
    if (!get_feed_response_local_var) {
        return NULL;
    }
    get_feed_response_local_var->feed = feed;

    return get_feed_response_local_var;
}


void get_feed_response_free(get_feed_response_t *get_feed_response) {
    if(NULL == get_feed_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_feed_response->feed) {
        feed_dto_free(get_feed_response->feed);
        get_feed_response->feed = NULL;
    }
    free(get_feed_response);
}

cJSON *get_feed_response_convertToJSON(get_feed_response_t *get_feed_response) {
    cJSON *item = cJSON_CreateObject();

    // get_feed_response->feed
    if(get_feed_response->feed) {
    cJSON *feed_local_JSON = feed_dto_convertToJSON(get_feed_response->feed);
    if(feed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "feed", feed_local_JSON);
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

get_feed_response_t *get_feed_response_parseFromJSON(cJSON *get_feed_responseJSON){

    get_feed_response_t *get_feed_response_local_var = NULL;

    // define the local variable for get_feed_response->feed
    feed_dto_t *feed_local_nonprim = NULL;

    // get_feed_response->feed
    cJSON *feed = cJSON_GetObjectItemCaseSensitive(get_feed_responseJSON, "feed");
    if (feed) { 
    feed_local_nonprim = feed_dto_parseFromJSON(feed); //nonprimitive
    }


    get_feed_response_local_var = get_feed_response_create (
        feed ? feed_local_nonprim : NULL
        );

    return get_feed_response_local_var;
end:
    if (feed_local_nonprim) {
        feed_dto_free(feed_local_nonprim);
        feed_local_nonprim = NULL;
    }
    return NULL;

}
