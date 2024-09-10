#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculate_tariffs_parameters_dto.h"


char* calculate_tariffs_parameters_dto_selling_program_ToString(_api__calculate_tariffs_parameters_dto__e selling_program) {
    char* selling_programArray[] =  { "NULL", "FBY", "FBS", "DBS", "EXPRESS" };
    return selling_programArray[selling_program];
}

_api__calculate_tariffs_parameters_dto__e calculate_tariffs_parameters_dto_selling_program_FromString(char* selling_program){
    int stringToReturn = 0;
    char *selling_programArray[] =  { "NULL", "FBY", "FBS", "DBS", "EXPRESS" };
    size_t sizeofArray = sizeof(selling_programArray) / sizeof(selling_programArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(selling_program, selling_programArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* calculate_tariffs_parameters_dto_frequency_ToString(_api__calculate_tariffs_parameters_dto__e frequency) {
    char* frequencyArray[] =  { "NULL", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY" };
    return frequencyArray[frequency];
}

_api__calculate_tariffs_parameters_dto__e calculate_tariffs_parameters_dto_frequency_FromString(char* frequency){
    int stringToReturn = 0;
    char *frequencyArray[] =  { "NULL", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY" };
    size_t sizeofArray = sizeof(frequencyArray) / sizeof(frequencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(frequency, frequencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto_create(
    long campaign_id,
    selling_program_type_t *selling_program,
    payment_frequency_type_t *frequency
    ) {
    calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto_local_var = malloc(sizeof(calculate_tariffs_parameters_dto_t));
    if (!calculate_tariffs_parameters_dto_local_var) {
        return NULL;
    }
    calculate_tariffs_parameters_dto_local_var->campaign_id = campaign_id;
    calculate_tariffs_parameters_dto_local_var->selling_program = selling_program;
    calculate_tariffs_parameters_dto_local_var->frequency = frequency;

    return calculate_tariffs_parameters_dto_local_var;
}


void calculate_tariffs_parameters_dto_free(calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto) {
    if(NULL == calculate_tariffs_parameters_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (calculate_tariffs_parameters_dto->selling_program) {
        selling_program_type_free(calculate_tariffs_parameters_dto->selling_program);
        calculate_tariffs_parameters_dto->selling_program = NULL;
    }
    if (calculate_tariffs_parameters_dto->frequency) {
        payment_frequency_type_free(calculate_tariffs_parameters_dto->frequency);
        calculate_tariffs_parameters_dto->frequency = NULL;
    }
    free(calculate_tariffs_parameters_dto);
}

cJSON *calculate_tariffs_parameters_dto_convertToJSON(calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto) {
    cJSON *item = cJSON_CreateObject();

    // calculate_tariffs_parameters_dto->campaign_id
    if(calculate_tariffs_parameters_dto->campaign_id) {
    if(cJSON_AddNumberToObject(item, "campaignId", calculate_tariffs_parameters_dto->campaign_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // calculate_tariffs_parameters_dto->selling_program
    if(calculate_tariffs_parameters_dto->selling_program != _api__calculate_tariffs_parameters_dto__NULL) {
    cJSON *selling_program_local_JSON = selling_program_type_convertToJSON(calculate_tariffs_parameters_dto->selling_program);
    if(selling_program_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sellingProgram", selling_program_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // calculate_tariffs_parameters_dto->frequency
    if(calculate_tariffs_parameters_dto->frequency != _api__calculate_tariffs_parameters_dto__NULL) {
    cJSON *frequency_local_JSON = payment_frequency_type_convertToJSON(calculate_tariffs_parameters_dto->frequency);
    if(frequency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "frequency", frequency_local_JSON);
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

calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto_parseFromJSON(cJSON *calculate_tariffs_parameters_dtoJSON){

    calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto_local_var = NULL;

    // define the local variable for calculate_tariffs_parameters_dto->selling_program
    selling_program_type_t *selling_program_local_nonprim = NULL;

    // define the local variable for calculate_tariffs_parameters_dto->frequency
    payment_frequency_type_t *frequency_local_nonprim = NULL;

    // calculate_tariffs_parameters_dto->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_parameters_dtoJSON, "campaignId");
    if (campaign_id) { 
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }
    }

    // calculate_tariffs_parameters_dto->selling_program
    cJSON *selling_program = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_parameters_dtoJSON, "sellingProgram");
    if (selling_program) { 
    selling_program_local_nonprim = selling_program_type_parseFromJSON(selling_program); //custom
    }

    // calculate_tariffs_parameters_dto->frequency
    cJSON *frequency = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_parameters_dtoJSON, "frequency");
    if (frequency) { 
    frequency_local_nonprim = payment_frequency_type_parseFromJSON(frequency); //custom
    }


    calculate_tariffs_parameters_dto_local_var = calculate_tariffs_parameters_dto_create (
        campaign_id ? campaign_id->valuedouble : 0,
        selling_program ? selling_program_local_nonprim : NULL,
        frequency ? frequency_local_nonprim : NULL
        );

    return calculate_tariffs_parameters_dto_local_var;
end:
    if (selling_program_local_nonprim) {
        selling_program_type_free(selling_program_local_nonprim);
        selling_program_local_nonprim = NULL;
    }
    if (frequency_local_nonprim) {
        payment_frequency_type_free(frequency_local_nonprim);
        frequency_local_nonprim = NULL;
    }
    return NULL;

}
