#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_cards_content_status_dto.h"



offer_cards_content_status_dto_t *offer_cards_content_status_dto_create(
    list_t *offer_cards,
    forward_scrolling_pager_dto_t *paging
    ) {
    offer_cards_content_status_dto_t *offer_cards_content_status_dto_local_var = malloc(sizeof(offer_cards_content_status_dto_t));
    if (!offer_cards_content_status_dto_local_var) {
        return NULL;
    }
    offer_cards_content_status_dto_local_var->offer_cards = offer_cards;
    offer_cards_content_status_dto_local_var->paging = paging;

    return offer_cards_content_status_dto_local_var;
}


void offer_cards_content_status_dto_free(offer_cards_content_status_dto_t *offer_cards_content_status_dto) {
    if(NULL == offer_cards_content_status_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_cards_content_status_dto->offer_cards) {
        list_ForEach(listEntry, offer_cards_content_status_dto->offer_cards) {
            offer_card_dto_free(listEntry->data);
        }
        list_freeList(offer_cards_content_status_dto->offer_cards);
        offer_cards_content_status_dto->offer_cards = NULL;
    }
    if (offer_cards_content_status_dto->paging) {
        forward_scrolling_pager_dto_free(offer_cards_content_status_dto->paging);
        offer_cards_content_status_dto->paging = NULL;
    }
    free(offer_cards_content_status_dto);
}

cJSON *offer_cards_content_status_dto_convertToJSON(offer_cards_content_status_dto_t *offer_cards_content_status_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_cards_content_status_dto->offer_cards
    if (!offer_cards_content_status_dto->offer_cards) {
        goto fail;
    }
    cJSON *offer_cards = cJSON_AddArrayToObject(item, "offerCards");
    if(offer_cards == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offer_cardsListEntry;
    if (offer_cards_content_status_dto->offer_cards) {
    list_ForEach(offer_cardsListEntry, offer_cards_content_status_dto->offer_cards) {
    cJSON *itemLocal = offer_card_dto_convertToJSON(offer_cardsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offer_cards, itemLocal);
    }
    }


    // offer_cards_content_status_dto->paging
    if(offer_cards_content_status_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(offer_cards_content_status_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
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

offer_cards_content_status_dto_t *offer_cards_content_status_dto_parseFromJSON(cJSON *offer_cards_content_status_dtoJSON){

    offer_cards_content_status_dto_t *offer_cards_content_status_dto_local_var = NULL;

    // define the local list for offer_cards_content_status_dto->offer_cards
    list_t *offer_cardsList = NULL;

    // define the local variable for offer_cards_content_status_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // offer_cards_content_status_dto->offer_cards
    cJSON *offer_cards = cJSON_GetObjectItemCaseSensitive(offer_cards_content_status_dtoJSON, "offerCards");
    if (!offer_cards) {
        goto end;
    }

    
    cJSON *offer_cards_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offer_cards)){
        goto end; //nonprimitive container
    }

    offer_cardsList = list_createList();

    cJSON_ArrayForEach(offer_cards_local_nonprimitive,offer_cards )
    {
        if(!cJSON_IsObject(offer_cards_local_nonprimitive)){
            goto end;
        }
        offer_card_dto_t *offer_cardsItem = offer_card_dto_parseFromJSON(offer_cards_local_nonprimitive);

        list_addElement(offer_cardsList, offer_cardsItem);
    }

    // offer_cards_content_status_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(offer_cards_content_status_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    offer_cards_content_status_dto_local_var = offer_cards_content_status_dto_create (
        offer_cardsList,
        paging ? paging_local_nonprim : NULL
        );

    return offer_cards_content_status_dto_local_var;
end:
    if (offer_cardsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_cardsList) {
            offer_card_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_cardsList);
        offer_cardsList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
