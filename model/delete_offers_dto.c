#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_offers_dto.h"



delete_offers_dto_t *delete_offers_dto_create(
    list_t *not_deleted_offer_ids
    ) {
    delete_offers_dto_t *delete_offers_dto_local_var = malloc(sizeof(delete_offers_dto_t));
    if (!delete_offers_dto_local_var) {
        return NULL;
    }
    delete_offers_dto_local_var->not_deleted_offer_ids = not_deleted_offer_ids;

    return delete_offers_dto_local_var;
}


void delete_offers_dto_free(delete_offers_dto_t *delete_offers_dto) {
    if(NULL == delete_offers_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_offers_dto->not_deleted_offer_ids) {
        list_ForEach(listEntry, delete_offers_dto->not_deleted_offer_ids) {
            free(listEntry->data);
        }
        list_freeList(delete_offers_dto->not_deleted_offer_ids);
        delete_offers_dto->not_deleted_offer_ids = NULL;
    }
    free(delete_offers_dto);
}

cJSON *delete_offers_dto_convertToJSON(delete_offers_dto_t *delete_offers_dto) {
    cJSON *item = cJSON_CreateObject();

    // delete_offers_dto->not_deleted_offer_ids
    if(delete_offers_dto->not_deleted_offer_ids) {
    cJSON *not_deleted_offer_ids = cJSON_AddArrayToObject(item, "notDeletedOfferIds");
    if(not_deleted_offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *not_deleted_offer_idsListEntry;
    list_ForEach(not_deleted_offer_idsListEntry, delete_offers_dto->not_deleted_offer_ids) {
    if(cJSON_AddStringToObject(not_deleted_offer_ids, "", (char*)not_deleted_offer_idsListEntry->data) == NULL)
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

delete_offers_dto_t *delete_offers_dto_parseFromJSON(cJSON *delete_offers_dtoJSON){

    delete_offers_dto_t *delete_offers_dto_local_var = NULL;

    // define the local list for delete_offers_dto->not_deleted_offer_ids
    list_t *not_deleted_offer_idsList = NULL;

    // delete_offers_dto->not_deleted_offer_ids
    cJSON *not_deleted_offer_ids = cJSON_GetObjectItemCaseSensitive(delete_offers_dtoJSON, "notDeletedOfferIds");
    if (not_deleted_offer_ids) { 
    cJSON *not_deleted_offer_ids_local = NULL;
    if(!cJSON_IsArray(not_deleted_offer_ids)) {
        goto end;//primitive container
    }
    not_deleted_offer_idsList = list_createList();

    cJSON_ArrayForEach(not_deleted_offer_ids_local, not_deleted_offer_ids)
    {
        if(!cJSON_IsString(not_deleted_offer_ids_local))
        {
            goto end;
        }
        list_addElement(not_deleted_offer_idsList , strdup(not_deleted_offer_ids_local->valuestring));
    }
    }


    delete_offers_dto_local_var = delete_offers_dto_create (
        not_deleted_offer_ids ? not_deleted_offer_idsList : NULL
        );

    return delete_offers_dto_local_var;
end:
    if (not_deleted_offer_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, not_deleted_offer_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(not_deleted_offer_idsList);
        not_deleted_offer_idsList = NULL;
    }
    return NULL;

}
