#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "age_dto.h"


char* age_dto_age_unit_ToString(_api__age_dto__e age_unit) {
    char* age_unitArray[] =  { "NULL", "YEAR", "MONTH" };
    return age_unitArray[age_unit];
}

_api__age_dto__e age_dto_age_unit_FromString(char* age_unit){
    int stringToReturn = 0;
    char *age_unitArray[] =  { "NULL", "YEAR", "MONTH" };
    size_t sizeofArray = sizeof(age_unitArray) / sizeof(age_unitArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(age_unit, age_unitArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

age_dto_t *age_dto_create(
    double value,
    age_unit_type_t *age_unit
    ) {
    age_dto_t *age_dto_local_var = malloc(sizeof(age_dto_t));
    if (!age_dto_local_var) {
        return NULL;
    }
    age_dto_local_var->value = value;
    age_dto_local_var->age_unit = age_unit;

    return age_dto_local_var;
}


void age_dto_free(age_dto_t *age_dto) {
    if(NULL == age_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (age_dto->age_unit) {
        age_unit_type_free(age_dto->age_unit);
        age_dto->age_unit = NULL;
    }
    free(age_dto);
}

cJSON *age_dto_convertToJSON(age_dto_t *age_dto) {
    cJSON *item = cJSON_CreateObject();

    // age_dto->value
    if (!age_dto->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", age_dto->value) == NULL) {
    goto fail; //Numeric
    }


    // age_dto->age_unit
    if (_api__age_dto__NULL == age_dto->age_unit) {
        goto fail;
    }
    cJSON *age_unit_local_JSON = age_unit_type_convertToJSON(age_dto->age_unit);
    if(age_unit_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "ageUnit", age_unit_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

age_dto_t *age_dto_parseFromJSON(cJSON *age_dtoJSON){

    age_dto_t *age_dto_local_var = NULL;

    // define the local variable for age_dto->age_unit
    age_unit_type_t *age_unit_local_nonprim = NULL;

    // age_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(age_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // age_dto->age_unit
    cJSON *age_unit = cJSON_GetObjectItemCaseSensitive(age_dtoJSON, "ageUnit");
    if (!age_unit) {
        goto end;
    }

    
    age_unit_local_nonprim = age_unit_type_parseFromJSON(age_unit); //custom


    age_dto_local_var = age_dto_create (
        value->valuedouble,
        age_unit_local_nonprim
        );

    return age_dto_local_var;
end:
    if (age_unit_local_nonprim) {
        age_unit_type_free(age_unit_local_nonprim);
        age_unit_local_nonprim = NULL;
    }
    return NULL;

}
