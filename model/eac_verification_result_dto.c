#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "eac_verification_result_dto.h"


char* eac_verification_result_dto_verification_result_ToString(_api__eac_verification_result_dto__e verification_result) {
    char* verification_resultArray[] =  { "NULL", "ACCEPTED", "REJECTED", "NEED_UPDATE" };
    return verification_resultArray[verification_result];
}

_api__eac_verification_result_dto__e eac_verification_result_dto_verification_result_FromString(char* verification_result){
    int stringToReturn = 0;
    char *verification_resultArray[] =  { "NULL", "ACCEPTED", "REJECTED", "NEED_UPDATE" };
    size_t sizeofArray = sizeof(verification_resultArray) / sizeof(verification_resultArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(verification_result, verification_resultArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

eac_verification_result_dto_t *eac_verification_result_dto_create(
    eac_verification_status_type_t *verification_result,
    int attempts_left
    ) {
    eac_verification_result_dto_t *eac_verification_result_dto_local_var = malloc(sizeof(eac_verification_result_dto_t));
    if (!eac_verification_result_dto_local_var) {
        return NULL;
    }
    eac_verification_result_dto_local_var->verification_result = verification_result;
    eac_verification_result_dto_local_var->attempts_left = attempts_left;

    return eac_verification_result_dto_local_var;
}


void eac_verification_result_dto_free(eac_verification_result_dto_t *eac_verification_result_dto) {
    if(NULL == eac_verification_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (eac_verification_result_dto->verification_result) {
        eac_verification_status_type_free(eac_verification_result_dto->verification_result);
        eac_verification_result_dto->verification_result = NULL;
    }
    free(eac_verification_result_dto);
}

cJSON *eac_verification_result_dto_convertToJSON(eac_verification_result_dto_t *eac_verification_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // eac_verification_result_dto->verification_result
    if(eac_verification_result_dto->verification_result != _api__eac_verification_result_dto__NULL) {
    cJSON *verification_result_local_JSON = eac_verification_status_type_convertToJSON(eac_verification_result_dto->verification_result);
    if(verification_result_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "verificationResult", verification_result_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // eac_verification_result_dto->attempts_left
    if(eac_verification_result_dto->attempts_left) {
    if(cJSON_AddNumberToObject(item, "attemptsLeft", eac_verification_result_dto->attempts_left) == NULL) {
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

eac_verification_result_dto_t *eac_verification_result_dto_parseFromJSON(cJSON *eac_verification_result_dtoJSON){

    eac_verification_result_dto_t *eac_verification_result_dto_local_var = NULL;

    // define the local variable for eac_verification_result_dto->verification_result
    eac_verification_status_type_t *verification_result_local_nonprim = NULL;

    // eac_verification_result_dto->verification_result
    cJSON *verification_result = cJSON_GetObjectItemCaseSensitive(eac_verification_result_dtoJSON, "verificationResult");
    if (verification_result) { 
    verification_result_local_nonprim = eac_verification_status_type_parseFromJSON(verification_result); //custom
    }

    // eac_verification_result_dto->attempts_left
    cJSON *attempts_left = cJSON_GetObjectItemCaseSensitive(eac_verification_result_dtoJSON, "attemptsLeft");
    if (attempts_left) { 
    if(!cJSON_IsNumber(attempts_left))
    {
    goto end; //Numeric
    }
    }


    eac_verification_result_dto_local_var = eac_verification_result_dto_create (
        verification_result ? verification_result_local_nonprim : NULL,
        attempts_left ? attempts_left->valuedouble : 0
        );

    return eac_verification_result_dto_local_var;
end:
    if (verification_result_local_nonprim) {
        eac_verification_status_type_free(verification_result_local_nonprim);
        verification_result_local_nonprim = NULL;
    }
    return NULL;

}
