#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_processing_state_dto.h"


char* offer_processing_state_dto_status_ToString(_api__offer_processing_state_dto__e status) {
    char* statusArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    return statusArray[status];
}

_api__offer_processing_state_dto__e offer_processing_state_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_processing_state_dto_t *offer_processing_state_dto_create(
    offer_processing_status_type_t *status,
    list_t *notes
    ) {
    offer_processing_state_dto_t *offer_processing_state_dto_local_var = malloc(sizeof(offer_processing_state_dto_t));
    if (!offer_processing_state_dto_local_var) {
        return NULL;
    }
    offer_processing_state_dto_local_var->status = status;
    offer_processing_state_dto_local_var->notes = notes;

    return offer_processing_state_dto_local_var;
}


void offer_processing_state_dto_free(offer_processing_state_dto_t *offer_processing_state_dto) {
    if(NULL == offer_processing_state_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_processing_state_dto->status) {
        offer_processing_status_type_free(offer_processing_state_dto->status);
        offer_processing_state_dto->status = NULL;
    }
    if (offer_processing_state_dto->notes) {
        list_ForEach(listEntry, offer_processing_state_dto->notes) {
            offer_processing_note_dto_free(listEntry->data);
        }
        list_freeList(offer_processing_state_dto->notes);
        offer_processing_state_dto->notes = NULL;
    }
    free(offer_processing_state_dto);
}

cJSON *offer_processing_state_dto_convertToJSON(offer_processing_state_dto_t *offer_processing_state_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_processing_state_dto->status
    if(offer_processing_state_dto->status != _api__offer_processing_state_dto__NULL) {
    cJSON *status_local_JSON = offer_processing_status_type_convertToJSON(offer_processing_state_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_processing_state_dto->notes
    if(offer_processing_state_dto->notes) {
    cJSON *notes = cJSON_AddArrayToObject(item, "notes");
    if(notes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *notesListEntry;
    if (offer_processing_state_dto->notes) {
    list_ForEach(notesListEntry, offer_processing_state_dto->notes) {
    cJSON *itemLocal = offer_processing_note_dto_convertToJSON(notesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(notes, itemLocal);
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

offer_processing_state_dto_t *offer_processing_state_dto_parseFromJSON(cJSON *offer_processing_state_dtoJSON){

    offer_processing_state_dto_t *offer_processing_state_dto_local_var = NULL;

    // define the local variable for offer_processing_state_dto->status
    offer_processing_status_type_t *status_local_nonprim = NULL;

    // define the local list for offer_processing_state_dto->notes
    list_t *notesList = NULL;

    // offer_processing_state_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(offer_processing_state_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = offer_processing_status_type_parseFromJSON(status); //custom
    }

    // offer_processing_state_dto->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(offer_processing_state_dtoJSON, "notes");
    if (notes) { 
    cJSON *notes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(notes)){
        goto end; //nonprimitive container
    }

    notesList = list_createList();

    cJSON_ArrayForEach(notes_local_nonprimitive,notes )
    {
        if(!cJSON_IsObject(notes_local_nonprimitive)){
            goto end;
        }
        offer_processing_note_dto_t *notesItem = offer_processing_note_dto_parseFromJSON(notes_local_nonprimitive);

        list_addElement(notesList, notesItem);
    }
    }


    offer_processing_state_dto_local_var = offer_processing_state_dto_create (
        status ? status_local_nonprim : NULL,
        notes ? notesList : NULL
        );

    return offer_processing_state_dto_local_var;
end:
    if (status_local_nonprim) {
        offer_processing_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (notesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, notesList) {
            offer_processing_note_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(notesList);
        notesList = NULL;
    }
    return NULL;

}
