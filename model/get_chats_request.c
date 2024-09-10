#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_chats_request.h"


char* get_chats_request_types_ToString(_api__get_chats_request__e types) {
    char *typesArray[] =  { "NULL", "CHAT", "ARBITRAGE" };
    return typesArray[types - 1];
}

_api__get_chats_request__e get_chats_request_types_FromString(char* types) {
    int stringToReturn = 0;
    char *typesArray[] =  { "NULL", "CHAT", "ARBITRAGE" };
    size_t sizeofArray = sizeof(typesArray) / sizeof(typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(types, typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* get_chats_request_statuses_ToString(_api__get_chats_request__e statuses) {
    char *statusesArray[] =  { "NULL", "NEW", "WAITING_FOR_CUSTOMER", "WAITING_FOR_PARTNER", "WAITING_FOR_ARBITER", "WAITING_FOR_MARKET", "FINISHED" };
    return statusesArray[statuses - 1];
}

_api__get_chats_request__e get_chats_request_statuses_FromString(char* statuses) {
    int stringToReturn = 0;
    char *statusesArray[] =  { "NULL", "NEW", "WAITING_FOR_CUSTOMER", "WAITING_FOR_PARTNER", "WAITING_FOR_ARBITER", "WAITING_FOR_MARKET", "FINISHED" };
    size_t sizeofArray = sizeof(statusesArray) / sizeof(statusesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(statuses, statusesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

get_chats_request_t *get_chats_request_create(
    list_t *order_ids,
    list_t *types,
    list_t *statuses
    ) {
    get_chats_request_t *get_chats_request_local_var = malloc(sizeof(get_chats_request_t));
    if (!get_chats_request_local_var) {
        return NULL;
    }
    get_chats_request_local_var->order_ids = order_ids;
    get_chats_request_local_var->types = types;
    get_chats_request_local_var->statuses = statuses;

    return get_chats_request_local_var;
}


void get_chats_request_free(get_chats_request_t *get_chats_request) {
    if(NULL == get_chats_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_chats_request->order_ids) {
        list_ForEach(listEntry, get_chats_request->order_ids) {
            free(listEntry->data);
        }
        list_freeList(get_chats_request->order_ids);
        get_chats_request->order_ids = NULL;
    }
    if (get_chats_request->types) {
        list_ForEach(listEntry, get_chats_request->types) {
            chat_type_free(listEntry->data);
        }
        list_freeList(get_chats_request->types);
        get_chats_request->types = NULL;
    }
    if (get_chats_request->statuses) {
        list_ForEach(listEntry, get_chats_request->statuses) {
            chat_status_type_free(listEntry->data);
        }
        list_freeList(get_chats_request->statuses);
        get_chats_request->statuses = NULL;
    }
    free(get_chats_request);
}

cJSON *get_chats_request_convertToJSON(get_chats_request_t *get_chats_request) {
    cJSON *item = cJSON_CreateObject();

    // get_chats_request->order_ids
    if(get_chats_request->order_ids) {
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, get_chats_request->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_chats_request->types
    if(get_chats_request->types != _api__get_chats_request_TYPES_NULL) {
    cJSON *types = cJSON_AddArrayToObject(item, "types");
    if(types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *typesListEntry;
    if (get_chats_request->types) {
    list_ForEach(typesListEntry, get_chats_request->types) {
    cJSON *itemLocal = chat_type_convertToJSON((_api__get_chats_request__e)typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(types, itemLocal);
    }
    }
    }


    // get_chats_request->statuses
    if(get_chats_request->statuses != _api__get_chats_request_STATUSES_NULL) {
    cJSON *statuses = cJSON_AddArrayToObject(item, "statuses");
    if(statuses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statusesListEntry;
    if (get_chats_request->statuses) {
    list_ForEach(statusesListEntry, get_chats_request->statuses) {
    cJSON *itemLocal = chat_status_type_convertToJSON((_api__get_chats_request__e)statusesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(statuses, itemLocal);
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

get_chats_request_t *get_chats_request_parseFromJSON(cJSON *get_chats_requestJSON){

    get_chats_request_t *get_chats_request_local_var = NULL;

    // define the local list for get_chats_request->order_ids
    list_t *order_idsList = NULL;

    // define the local list for get_chats_request->types
    list_t *typesList = NULL;

    // define the local list for get_chats_request->statuses
    list_t *statusesList = NULL;

    // get_chats_request->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(get_chats_requestJSON, "orderIds");
    if (order_ids) { 
    cJSON *order_ids_local = NULL;
    if(!cJSON_IsArray(order_ids)) {
        goto end;//primitive container
    }
    order_idsList = list_createList();

    cJSON_ArrayForEach(order_ids_local, order_ids)
    {
        if(!cJSON_IsNumber(order_ids_local))
        {
            goto end;
        }
        double *order_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!order_ids_local_value)
        {
            goto end;
        }
        *order_ids_local_value = order_ids_local->valuedouble;
        list_addElement(order_idsList , order_ids_local_value);
    }
    }

    // get_chats_request->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(get_chats_requestJSON, "types");
    if (types) { 
    cJSON *types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(types)){
        goto end; //nonprimitive container
    }

    typesList = list_createList();

    cJSON_ArrayForEach(types_local_nonprimitive,types )
    {
        if(!cJSON_IsObject(types_local_nonprimitive)){
            goto end;
        }
        get_chats_request_chat_type_e typesItem = chat_type_parseFromJSON(types_local_nonprimitive);

        list_addElement(typesList, (void *)typesItem);
    }
    }

    // get_chats_request->statuses
    cJSON *statuses = cJSON_GetObjectItemCaseSensitive(get_chats_requestJSON, "statuses");
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
        get_chats_request_chat_status_type_e statusesItem = chat_status_type_parseFromJSON(statuses_local_nonprimitive);

        list_addElement(statusesList, (void *)statusesItem);
    }
    }


    get_chats_request_local_var = get_chats_request_create (
        order_ids ? order_idsList : NULL,
        types ? typesList : NULL,
        statuses ? statusesList : NULL
        );

    return get_chats_request_local_var;
end:
    if (order_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_idsList);
        order_idsList = NULL;
    }
    if (typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, typesList) {
            chat_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(typesList);
        typesList = NULL;
    }
    if (statusesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, statusesList) {
            chat_status_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(statusesList);
        statusesList = NULL;
    }
    return NULL;

}
