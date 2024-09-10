#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_period_dto.h"



promo_period_dto_t *promo_period_dto_create(
    char *date_time_from,
    char *date_time_to
    ) {
    promo_period_dto_t *promo_period_dto_local_var = malloc(sizeof(promo_period_dto_t));
    if (!promo_period_dto_local_var) {
        return NULL;
    }
    promo_period_dto_local_var->date_time_from = date_time_from;
    promo_period_dto_local_var->date_time_to = date_time_to;

    return promo_period_dto_local_var;
}


void promo_period_dto_free(promo_period_dto_t *promo_period_dto) {
    if(NULL == promo_period_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (promo_period_dto->date_time_from) {
        free(promo_period_dto->date_time_from);
        promo_period_dto->date_time_from = NULL;
    }
    if (promo_period_dto->date_time_to) {
        free(promo_period_dto->date_time_to);
        promo_period_dto->date_time_to = NULL;
    }
    free(promo_period_dto);
}

cJSON *promo_period_dto_convertToJSON(promo_period_dto_t *promo_period_dto) {
    cJSON *item = cJSON_CreateObject();

    // promo_period_dto->date_time_from
    if (!promo_period_dto->date_time_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTimeFrom", promo_period_dto->date_time_from) == NULL) {
    goto fail; //Date-Time
    }


    // promo_period_dto->date_time_to
    if (!promo_period_dto->date_time_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTimeTo", promo_period_dto->date_time_to) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promo_period_dto_t *promo_period_dto_parseFromJSON(cJSON *promo_period_dtoJSON){

    promo_period_dto_t *promo_period_dto_local_var = NULL;

    // promo_period_dto->date_time_from
    cJSON *date_time_from = cJSON_GetObjectItemCaseSensitive(promo_period_dtoJSON, "dateTimeFrom");
    if (!date_time_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_time_from) && !cJSON_IsNull(date_time_from))
    {
    goto end; //DateTime
    }

    // promo_period_dto->date_time_to
    cJSON *date_time_to = cJSON_GetObjectItemCaseSensitive(promo_period_dtoJSON, "dateTimeTo");
    if (!date_time_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_time_to) && !cJSON_IsNull(date_time_to))
    {
    goto end; //DateTime
    }


    promo_period_dto_local_var = promo_period_dto_create (
        strdup(date_time_from->valuestring),
        strdup(date_time_to->valuestring)
        );

    return promo_period_dto_local_var;
end:
    return NULL;

}
