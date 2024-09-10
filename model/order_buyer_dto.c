#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_buyer_dto.h"


char* order_buyer_dto_type_ToString(_api__order_buyer_dto__e type) {
    char* typeArray[] =  { "NULL", "PERSON", "BUSINESS" };
    return typeArray[type];
}

_api__order_buyer_dto__e order_buyer_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "PERSON", "BUSINESS" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

order_buyer_dto_t *order_buyer_dto_create(
    char *id,
    char *last_name,
    char *first_name,
    char *middle_name,
    order_buyer_type_t *type
    ) {
    order_buyer_dto_t *order_buyer_dto_local_var = malloc(sizeof(order_buyer_dto_t));
    if (!order_buyer_dto_local_var) {
        return NULL;
    }
    order_buyer_dto_local_var->id = id;
    order_buyer_dto_local_var->last_name = last_name;
    order_buyer_dto_local_var->first_name = first_name;
    order_buyer_dto_local_var->middle_name = middle_name;
    order_buyer_dto_local_var->type = type;

    return order_buyer_dto_local_var;
}


void order_buyer_dto_free(order_buyer_dto_t *order_buyer_dto) {
    if(NULL == order_buyer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_buyer_dto->id) {
        free(order_buyer_dto->id);
        order_buyer_dto->id = NULL;
    }
    if (order_buyer_dto->last_name) {
        free(order_buyer_dto->last_name);
        order_buyer_dto->last_name = NULL;
    }
    if (order_buyer_dto->first_name) {
        free(order_buyer_dto->first_name);
        order_buyer_dto->first_name = NULL;
    }
    if (order_buyer_dto->middle_name) {
        free(order_buyer_dto->middle_name);
        order_buyer_dto->middle_name = NULL;
    }
    if (order_buyer_dto->type) {
        order_buyer_type_free(order_buyer_dto->type);
        order_buyer_dto->type = NULL;
    }
    free(order_buyer_dto);
}

cJSON *order_buyer_dto_convertToJSON(order_buyer_dto_t *order_buyer_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_buyer_dto->id
    if(order_buyer_dto->id) {
    if(cJSON_AddStringToObject(item, "id", order_buyer_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // order_buyer_dto->last_name
    if(order_buyer_dto->last_name) {
    if(cJSON_AddStringToObject(item, "lastName", order_buyer_dto->last_name) == NULL) {
    goto fail; //String
    }
    }


    // order_buyer_dto->first_name
    if(order_buyer_dto->first_name) {
    if(cJSON_AddStringToObject(item, "firstName", order_buyer_dto->first_name) == NULL) {
    goto fail; //String
    }
    }


    // order_buyer_dto->middle_name
    if(order_buyer_dto->middle_name) {
    if(cJSON_AddStringToObject(item, "middleName", order_buyer_dto->middle_name) == NULL) {
    goto fail; //String
    }
    }


    // order_buyer_dto->type
    if(order_buyer_dto->type != _api__order_buyer_dto__NULL) {
    cJSON *type_local_JSON = order_buyer_type_convertToJSON(order_buyer_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
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

order_buyer_dto_t *order_buyer_dto_parseFromJSON(cJSON *order_buyer_dtoJSON){

    order_buyer_dto_t *order_buyer_dto_local_var = NULL;

    // define the local variable for order_buyer_dto->type
    order_buyer_type_t *type_local_nonprim = NULL;

    // order_buyer_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_buyer_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // order_buyer_dto->last_name
    cJSON *last_name = cJSON_GetObjectItemCaseSensitive(order_buyer_dtoJSON, "lastName");
    if (last_name) { 
    if(!cJSON_IsString(last_name) && !cJSON_IsNull(last_name))
    {
    goto end; //String
    }
    }

    // order_buyer_dto->first_name
    cJSON *first_name = cJSON_GetObjectItemCaseSensitive(order_buyer_dtoJSON, "firstName");
    if (first_name) { 
    if(!cJSON_IsString(first_name) && !cJSON_IsNull(first_name))
    {
    goto end; //String
    }
    }

    // order_buyer_dto->middle_name
    cJSON *middle_name = cJSON_GetObjectItemCaseSensitive(order_buyer_dtoJSON, "middleName");
    if (middle_name) { 
    if(!cJSON_IsString(middle_name) && !cJSON_IsNull(middle_name))
    {
    goto end; //String
    }
    }

    // order_buyer_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_buyer_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = order_buyer_type_parseFromJSON(type); //custom
    }


    order_buyer_dto_local_var = order_buyer_dto_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        last_name && !cJSON_IsNull(last_name) ? strdup(last_name->valuestring) : NULL,
        first_name && !cJSON_IsNull(first_name) ? strdup(first_name->valuestring) : NULL,
        middle_name && !cJSON_IsNull(middle_name) ? strdup(middle_name->valuestring) : NULL,
        type ? type_local_nonprim : NULL
        );

    return order_buyer_dto_local_var;
end:
    if (type_local_nonprim) {
        order_buyer_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
