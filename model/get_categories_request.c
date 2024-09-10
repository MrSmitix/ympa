#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_categories_request.h"


char* get_categories_request_language_ToString(_api__get_categories_request__e language) {
    char* languageArray[] =  { "NULL", "RU", "EN" };
    return languageArray[language];
}

_api__get_categories_request__e get_categories_request_language_FromString(char* language){
    int stringToReturn = 0;
    char *languageArray[] =  { "NULL", "RU", "EN" };
    size_t sizeofArray = sizeof(languageArray) / sizeof(languageArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(language, languageArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_categories_request_t *get_categories_request_create(
    language_type_t *language
    ) {
    get_categories_request_t *get_categories_request_local_var = malloc(sizeof(get_categories_request_t));
    if (!get_categories_request_local_var) {
        return NULL;
    }
    get_categories_request_local_var->language = language;

    return get_categories_request_local_var;
}


void get_categories_request_free(get_categories_request_t *get_categories_request) {
    if(NULL == get_categories_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_categories_request->language) {
        language_type_free(get_categories_request->language);
        get_categories_request->language = NULL;
    }
    free(get_categories_request);
}

cJSON *get_categories_request_convertToJSON(get_categories_request_t *get_categories_request) {
    cJSON *item = cJSON_CreateObject();

    // get_categories_request->language
    if(get_categories_request->language != _api__get_categories_request__NULL) {
    cJSON *language_local_JSON = language_type_convertToJSON(get_categories_request->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
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

get_categories_request_t *get_categories_request_parseFromJSON(cJSON *get_categories_requestJSON){

    get_categories_request_t *get_categories_request_local_var = NULL;

    // define the local variable for get_categories_request->language
    language_type_t *language_local_nonprim = NULL;

    // get_categories_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(get_categories_requestJSON, "language");
    if (language) { 
    language_local_nonprim = language_type_parseFromJSON(language); //custom
    }


    get_categories_request_local_var = get_categories_request_create (
        language ? language_local_nonprim : NULL
        );

    return get_categories_request_local_var;
end:
    if (language_local_nonprim) {
        language_type_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
