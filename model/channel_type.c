#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "channel_type.h"



channel_type_t *channel_type_create(
    ) {
    channel_type_t *channel_type_local_var = malloc(sizeof(channel_type_t));
    if (!channel_type_local_var) {
        return NULL;
    }

    return channel_type_local_var;
}


void channel_type_free(channel_type_t *channel_type) {
    if(NULL == channel_type){
        return ;
    }
    listEntry_t *listEntry;
    free(channel_type);
}

cJSON *channel_type_convertToJSON(channel_type_t *channel_type) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

channel_type_t *channel_type_parseFromJSON(cJSON *channel_typeJSON){

    channel_type_t *channel_type_local_var = NULL;


    channel_type_local_var = channel_type_create (
        );

    return channel_type_local_var;
end:
    return NULL;

}
