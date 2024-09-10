#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_comment_author_type.h"


char* goods_feedback_comment_author_type_goods_feedback_comment_author_type_ToString(_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type) {
    char *goods_feedback_comment_author_typeArray[] =  { "NULL", "USER", "BUSINESS" };
    return goods_feedback_comment_author_typeArray[goods_feedback_comment_author_type];
}

_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type_goods_feedback_comment_author_type_FromString(char* goods_feedback_comment_author_type) {
    int stringToReturn = 0;
    char *goods_feedback_comment_author_typeArray[] =  { "NULL", "USER", "BUSINESS" };
    size_t sizeofArray = sizeof(goods_feedback_comment_author_typeArray) / sizeof(goods_feedback_comment_author_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(goods_feedback_comment_author_type, goods_feedback_comment_author_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *goods_feedback_comment_author_type_goods_feedback_comment_author_type_convertToJSON(_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "goods_feedback_comment_author_type", goods_feedback_comment_author_type_goods_feedback_comment_author_type_ToString(goods_feedback_comment_author_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type_goods_feedback_comment_author_type_parseFromJSON(cJSON *goods_feedback_comment_author_typeJSON) {
    _api__goods_feedback_comment_author_type__e *goods_feedback_comment_author_type = NULL;
    _api__goods_feedback_comment_author_type__e goods_feedback_comment_author_typeVariable;
    cJSON *goods_feedback_comment_author_typeVar = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_author_typeJSON, "goods_feedback_comment_author_type");
    if(!cJSON_IsString(goods_feedback_comment_author_typeVar) || (goods_feedback_comment_author_typeVar->valuestring == NULL)){
        goto end;
    }
    goods_feedback_comment_author_typeVariable = goods_feedback_comment_author_type_goods_feedback_comment_author_type_FromString(goods_feedback_comment_author_typeVar->valuestring);
    return goods_feedback_comment_author_typeVariable;
end:
    return 0;
}
