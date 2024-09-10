#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "turnover_dto.h"


char* turnover_dto_turnover_ToString(_api__turnover_dto__e turnover) {
    char* turnoverArray[] =  { "NULL", "LOW", "ALMOST_LOW", "HIGH", "VERY_HIGH", "NO_SALES", "FREE_STORE" };
    return turnoverArray[turnover];
}

_api__turnover_dto__e turnover_dto_turnover_FromString(char* turnover){
    int stringToReturn = 0;
    char *turnoverArray[] =  { "NULL", "LOW", "ALMOST_LOW", "HIGH", "VERY_HIGH", "NO_SALES", "FREE_STORE" };
    size_t sizeofArray = sizeof(turnoverArray) / sizeof(turnoverArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(turnover, turnoverArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

turnover_dto_t *turnover_dto_create(
    turnover_type_t *turnover,
    double turnover_days
    ) {
    turnover_dto_t *turnover_dto_local_var = malloc(sizeof(turnover_dto_t));
    if (!turnover_dto_local_var) {
        return NULL;
    }
    turnover_dto_local_var->turnover = turnover;
    turnover_dto_local_var->turnover_days = turnover_days;

    return turnover_dto_local_var;
}


void turnover_dto_free(turnover_dto_t *turnover_dto) {
    if(NULL == turnover_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (turnover_dto->turnover) {
        turnover_type_free(turnover_dto->turnover);
        turnover_dto->turnover = NULL;
    }
    free(turnover_dto);
}

cJSON *turnover_dto_convertToJSON(turnover_dto_t *turnover_dto) {
    cJSON *item = cJSON_CreateObject();

    // turnover_dto->turnover
    if (_api__turnover_dto__NULL == turnover_dto->turnover) {
        goto fail;
    }
    cJSON *turnover_local_JSON = turnover_type_convertToJSON(turnover_dto->turnover);
    if(turnover_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "turnover", turnover_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // turnover_dto->turnover_days
    if(turnover_dto->turnover_days) {
    if(cJSON_AddNumberToObject(item, "turnoverDays", turnover_dto->turnover_days) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

turnover_dto_t *turnover_dto_parseFromJSON(cJSON *turnover_dtoJSON){

    turnover_dto_t *turnover_dto_local_var = NULL;

    // define the local variable for turnover_dto->turnover
    turnover_type_t *turnover_local_nonprim = NULL;

    // turnover_dto->turnover
    cJSON *turnover = cJSON_GetObjectItemCaseSensitive(turnover_dtoJSON, "turnover");
    if (!turnover) {
        goto end;
    }

    
    turnover_local_nonprim = turnover_type_parseFromJSON(turnover); //custom

    // turnover_dto->turnover_days
    cJSON *turnover_days = cJSON_GetObjectItemCaseSensitive(turnover_dtoJSON, "turnoverDays");
    if (turnover_days) { 
    if(!cJSON_IsNumber(turnover_days))
    {
    goto end; //Numeric
    }
    }


    turnover_dto_local_var = turnover_dto_create (
        turnover_local_nonprim,
        turnover_days ? turnover_days->valuedouble : 0
        );

    return turnover_dto_local_var;
end:
    if (turnover_local_nonprim) {
        turnover_type_free(turnover_local_nonprim);
        turnover_local_nonprim = NULL;
    }
    return NULL;

}
