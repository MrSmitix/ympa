#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_comment_status_type.h"


char* goods_feedback_comment_status_type_goods_feedback_comment_status_type_ToString(_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type) {
    char *goods_feedback_comment_status_typeArray[] =  { "NULL", "PUBLISHED", "UNMODERATED", "BANNED", "DELETED" };
    return goods_feedback_comment_status_typeArray[goods_feedback_comment_status_type];
}

_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type_goods_feedback_comment_status_type_FromString(char* goods_feedback_comment_status_type) {
    int stringToReturn = 0;
    char *goods_feedback_comment_status_typeArray[] =  { "NULL", "PUBLISHED", "UNMODERATED", "BANNED", "DELETED" };
    size_t sizeofArray = sizeof(goods_feedback_comment_status_typeArray) / sizeof(goods_feedback_comment_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(goods_feedback_comment_status_type, goods_feedback_comment_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *goods_feedback_comment_status_type_goods_feedback_comment_status_type_convertToJSON(_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "goods_feedback_comment_status_type", goods_feedback_comment_status_type_goods_feedback_comment_status_type_ToString(goods_feedback_comment_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type_goods_feedback_comment_status_type_parseFromJSON(cJSON *goods_feedback_comment_status_typeJSON) {
    _api__goods_feedback_comment_status_type__e *goods_feedback_comment_status_type = NULL;
    _api__goods_feedback_comment_status_type__e goods_feedback_comment_status_typeVariable;
    cJSON *goods_feedback_comment_status_typeVar = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_status_typeJSON, "goods_feedback_comment_status_type");
    if(!cJSON_IsString(goods_feedback_comment_status_typeVar) || (goods_feedback_comment_status_typeVar->valuestring == NULL)){
        goto end;
    }
    goods_feedback_comment_status_typeVariable = goods_feedback_comment_status_type_goods_feedback_comment_status_type_FromString(goods_feedback_comment_status_typeVar->valuestring);
    return goods_feedback_comment_status_typeVariable;
end:
    return 0;
}
