#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_offers_to_archive_dto.h"



add_offers_to_archive_dto_t *add_offers_to_archive_dto_create(
    list_t *not_archived_offers
    ) {
    add_offers_to_archive_dto_t *add_offers_to_archive_dto_local_var = malloc(sizeof(add_offers_to_archive_dto_t));
    if (!add_offers_to_archive_dto_local_var) {
        return NULL;
    }
    add_offers_to_archive_dto_local_var->not_archived_offers = not_archived_offers;

    return add_offers_to_archive_dto_local_var;
}


void add_offers_to_archive_dto_free(add_offers_to_archive_dto_t *add_offers_to_archive_dto) {
    if(NULL == add_offers_to_archive_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (add_offers_to_archive_dto->not_archived_offers) {
        list_ForEach(listEntry, add_offers_to_archive_dto->not_archived_offers) {
            add_offers_to_archive_error_dto_free(listEntry->data);
        }
        list_freeList(add_offers_to_archive_dto->not_archived_offers);
        add_offers_to_archive_dto->not_archived_offers = NULL;
    }
    free(add_offers_to_archive_dto);
}

cJSON *add_offers_to_archive_dto_convertToJSON(add_offers_to_archive_dto_t *add_offers_to_archive_dto) {
    cJSON *item = cJSON_CreateObject();

    // add_offers_to_archive_dto->not_archived_offers
    if(add_offers_to_archive_dto->not_archived_offers) {
    cJSON *not_archived_offers = cJSON_AddArrayToObject(item, "notArchivedOffers");
    if(not_archived_offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *not_archived_offersListEntry;
    if (add_offers_to_archive_dto->not_archived_offers) {
    list_ForEach(not_archived_offersListEntry, add_offers_to_archive_dto->not_archived_offers) {
    cJSON *itemLocal = add_offers_to_archive_error_dto_convertToJSON(not_archived_offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(not_archived_offers, itemLocal);
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

add_offers_to_archive_dto_t *add_offers_to_archive_dto_parseFromJSON(cJSON *add_offers_to_archive_dtoJSON){

    add_offers_to_archive_dto_t *add_offers_to_archive_dto_local_var = NULL;

    // define the local list for add_offers_to_archive_dto->not_archived_offers
    list_t *not_archived_offersList = NULL;

    // add_offers_to_archive_dto->not_archived_offers
    cJSON *not_archived_offers = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_dtoJSON, "notArchivedOffers");
    if (not_archived_offers) { 
    cJSON *not_archived_offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(not_archived_offers)){
        goto end; //nonprimitive container
    }

    not_archived_offersList = list_createList();

    cJSON_ArrayForEach(not_archived_offers_local_nonprimitive,not_archived_offers )
    {
        if(!cJSON_IsObject(not_archived_offers_local_nonprimitive)){
            goto end;
        }
        add_offers_to_archive_error_dto_t *not_archived_offersItem = add_offers_to_archive_error_dto_parseFromJSON(not_archived_offers_local_nonprimitive);

        list_addElement(not_archived_offersList, not_archived_offersItem);
    }
    }


    add_offers_to_archive_dto_local_var = add_offers_to_archive_dto_create (
        not_archived_offers ? not_archived_offersList : NULL
        );

    return add_offers_to_archive_dto_local_var;
end:
    if (not_archived_offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, not_archived_offersList) {
            add_offers_to_archive_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(not_archived_offersList);
        not_archived_offersList = NULL;
    }
    return NULL;

}
