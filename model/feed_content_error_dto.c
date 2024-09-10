#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_content_error_dto.h"


char* feed_content_error_dto_type_ToString(_api__feed_content_error_dto__e type) {
    char* typeArray[] =  { "NULL", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS" };
    return typeArray[type];
}

_api__feed_content_error_dto__e feed_content_error_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feed_content_error_dto_t *feed_content_error_dto_create(
    feed_content_error_type_t *type
    ) {
    feed_content_error_dto_t *feed_content_error_dto_local_var = malloc(sizeof(feed_content_error_dto_t));
    if (!feed_content_error_dto_local_var) {
        return NULL;
    }
    feed_content_error_dto_local_var->type = type;

    return feed_content_error_dto_local_var;
}


void feed_content_error_dto_free(feed_content_error_dto_t *feed_content_error_dto) {
    if(NULL == feed_content_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_content_error_dto->type) {
        feed_content_error_type_free(feed_content_error_dto->type);
        feed_content_error_dto->type = NULL;
    }
    free(feed_content_error_dto);
}

cJSON *feed_content_error_dto_convertToJSON(feed_content_error_dto_t *feed_content_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_content_error_dto->type
    if(feed_content_error_dto->type != _api__feed_content_error_dto__NULL) {
    cJSON *type_local_JSON = feed_content_error_type_convertToJSON(feed_content_error_dto->type);
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

feed_content_error_dto_t *feed_content_error_dto_parseFromJSON(cJSON *feed_content_error_dtoJSON){

    feed_content_error_dto_t *feed_content_error_dto_local_var = NULL;

    // define the local variable for feed_content_error_dto->type
    feed_content_error_type_t *type_local_nonprim = NULL;

    // feed_content_error_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(feed_content_error_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = feed_content_error_type_parseFromJSON(type); //custom
    }


    feed_content_error_dto_local_var = feed_content_error_dto_create (
        type ? type_local_nonprim : NULL
        );

    return feed_content_error_dto_local_var;
end:
    if (type_local_nonprim) {
        feed_content_error_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
