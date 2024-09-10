#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_logins_response.h"



get_campaign_logins_response_t *get_campaign_logins_response_create(
    list_t *logins
    ) {
    get_campaign_logins_response_t *get_campaign_logins_response_local_var = malloc(sizeof(get_campaign_logins_response_t));
    if (!get_campaign_logins_response_local_var) {
        return NULL;
    }
    get_campaign_logins_response_local_var->logins = logins;

    return get_campaign_logins_response_local_var;
}


void get_campaign_logins_response_free(get_campaign_logins_response_t *get_campaign_logins_response) {
    if(NULL == get_campaign_logins_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_logins_response->logins) {
        list_ForEach(listEntry, get_campaign_logins_response->logins) {
            free(listEntry->data);
        }
        list_freeList(get_campaign_logins_response->logins);
        get_campaign_logins_response->logins = NULL;
    }
    free(get_campaign_logins_response);
}

cJSON *get_campaign_logins_response_convertToJSON(get_campaign_logins_response_t *get_campaign_logins_response) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_logins_response->logins
    if (!get_campaign_logins_response->logins) {
        goto fail;
    }
    cJSON *logins = cJSON_AddArrayToObject(item, "logins");
    if(logins == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *loginsListEntry;
    list_ForEach(loginsListEntry, get_campaign_logins_response->logins) {
    if(cJSON_AddStringToObject(logins, "", (char*)loginsListEntry->data) == NULL)
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

get_campaign_logins_response_t *get_campaign_logins_response_parseFromJSON(cJSON *get_campaign_logins_responseJSON){

    get_campaign_logins_response_t *get_campaign_logins_response_local_var = NULL;

    // define the local list for get_campaign_logins_response->logins
    list_t *loginsList = NULL;

    // get_campaign_logins_response->logins
    cJSON *logins = cJSON_GetObjectItemCaseSensitive(get_campaign_logins_responseJSON, "logins");
    if (!logins) {
        goto end;
    }

    
    cJSON *logins_local = NULL;
    if(!cJSON_IsArray(logins)) {
        goto end;//primitive container
    }
    loginsList = list_createList();

    cJSON_ArrayForEach(logins_local, logins)
    {
        if(!cJSON_IsString(logins_local))
        {
            goto end;
        }
        list_addElement(loginsList , strdup(logins_local->valuestring));
    }


    get_campaign_logins_response_local_var = get_campaign_logins_response_create (
        loginsList
        );

    return get_campaign_logins_response_local_var;
end:
    if (loginsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, loginsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(loginsList);
        loginsList = NULL;
    }
    return NULL;

}
