#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_recommendation_item_dto.h"



bid_recommendation_item_dto_t *bid_recommendation_item_dto_create(
    int bid,
    long show_percent
    ) {
    bid_recommendation_item_dto_t *bid_recommendation_item_dto_local_var = malloc(sizeof(bid_recommendation_item_dto_t));
    if (!bid_recommendation_item_dto_local_var) {
        return NULL;
    }
    bid_recommendation_item_dto_local_var->bid = bid;
    bid_recommendation_item_dto_local_var->show_percent = show_percent;

    return bid_recommendation_item_dto_local_var;
}


void bid_recommendation_item_dto_free(bid_recommendation_item_dto_t *bid_recommendation_item_dto) {
    if(NULL == bid_recommendation_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(bid_recommendation_item_dto);
}

cJSON *bid_recommendation_item_dto_convertToJSON(bid_recommendation_item_dto_t *bid_recommendation_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // bid_recommendation_item_dto->bid
    if (!bid_recommendation_item_dto->bid) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "bid", bid_recommendation_item_dto->bid) == NULL) {
    goto fail; //Numeric
    }


    // bid_recommendation_item_dto->show_percent
    if (!bid_recommendation_item_dto->show_percent) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "showPercent", bid_recommendation_item_dto->show_percent) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bid_recommendation_item_dto_t *bid_recommendation_item_dto_parseFromJSON(cJSON *bid_recommendation_item_dtoJSON){

    bid_recommendation_item_dto_t *bid_recommendation_item_dto_local_var = NULL;

    // bid_recommendation_item_dto->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(bid_recommendation_item_dtoJSON, "bid");
    if (!bid) {
        goto end;
    }

    
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }

    // bid_recommendation_item_dto->show_percent
    cJSON *show_percent = cJSON_GetObjectItemCaseSensitive(bid_recommendation_item_dtoJSON, "showPercent");
    if (!show_percent) {
        goto end;
    }

    
    if(!cJSON_IsNumber(show_percent))
    {
    goto end; //Numeric
    }


    bid_recommendation_item_dto_local_var = bid_recommendation_item_dto_create (
        bid->valuedouble,
        show_percent->valuedouble
        );

    return bid_recommendation_item_dto_local_var;
end:
    return NULL;

}
