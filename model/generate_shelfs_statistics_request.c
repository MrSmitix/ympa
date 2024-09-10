#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_shelfs_statistics_request.h"


char* generate_shelfs_statistics_request_attribution_type_ToString(_api__generate_shelfs_statistics_request__e attribution_type) {
    char* attribution_typeArray[] =  { "NULL", "CLICKS", "SHOWS" };
    return attribution_typeArray[attribution_type];
}

_api__generate_shelfs_statistics_request__e generate_shelfs_statistics_request_attribution_type_FromString(char* attribution_type){
    int stringToReturn = 0;
    char *attribution_typeArray[] =  { "NULL", "CLICKS", "SHOWS" };
    size_t sizeofArray = sizeof(attribution_typeArray) / sizeof(attribution_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_type, attribution_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

generate_shelfs_statistics_request_t *generate_shelfs_statistics_request_create(
    long business_id,
    char *date_from,
    char *date_to,
    shelfs_statistics_attribution_type_t *attribution_type
    ) {
    generate_shelfs_statistics_request_t *generate_shelfs_statistics_request_local_var = malloc(sizeof(generate_shelfs_statistics_request_t));
    if (!generate_shelfs_statistics_request_local_var) {
        return NULL;
    }
    generate_shelfs_statistics_request_local_var->business_id = business_id;
    generate_shelfs_statistics_request_local_var->date_from = date_from;
    generate_shelfs_statistics_request_local_var->date_to = date_to;
    generate_shelfs_statistics_request_local_var->attribution_type = attribution_type;

    return generate_shelfs_statistics_request_local_var;
}


void generate_shelfs_statistics_request_free(generate_shelfs_statistics_request_t *generate_shelfs_statistics_request) {
    if(NULL == generate_shelfs_statistics_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_shelfs_statistics_request->date_from) {
        free(generate_shelfs_statistics_request->date_from);
        generate_shelfs_statistics_request->date_from = NULL;
    }
    if (generate_shelfs_statistics_request->date_to) {
        free(generate_shelfs_statistics_request->date_to);
        generate_shelfs_statistics_request->date_to = NULL;
    }
    if (generate_shelfs_statistics_request->attribution_type) {
        shelfs_statistics_attribution_type_free(generate_shelfs_statistics_request->attribution_type);
        generate_shelfs_statistics_request->attribution_type = NULL;
    }
    free(generate_shelfs_statistics_request);
}

cJSON *generate_shelfs_statistics_request_convertToJSON(generate_shelfs_statistics_request_t *generate_shelfs_statistics_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_shelfs_statistics_request->business_id
    if (!generate_shelfs_statistics_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_shelfs_statistics_request->business_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_shelfs_statistics_request->date_from
    if (!generate_shelfs_statistics_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", generate_shelfs_statistics_request->date_from) == NULL) {
    goto fail; //Date
    }


    // generate_shelfs_statistics_request->date_to
    if (!generate_shelfs_statistics_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", generate_shelfs_statistics_request->date_to) == NULL) {
    goto fail; //Date
    }


    // generate_shelfs_statistics_request->attribution_type
    if (_api__generate_shelfs_statistics_request__NULL == generate_shelfs_statistics_request->attribution_type) {
        goto fail;
    }
    cJSON *attribution_type_local_JSON = shelfs_statistics_attribution_type_convertToJSON(generate_shelfs_statistics_request->attribution_type);
    if(attribution_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "attributionType", attribution_type_local_JSON);
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

generate_shelfs_statistics_request_t *generate_shelfs_statistics_request_parseFromJSON(cJSON *generate_shelfs_statistics_requestJSON){

    generate_shelfs_statistics_request_t *generate_shelfs_statistics_request_local_var = NULL;

    // define the local variable for generate_shelfs_statistics_request->attribution_type
    shelfs_statistics_attribution_type_t *attribution_type_local_nonprim = NULL;

    // generate_shelfs_statistics_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_shelfs_statistics_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }

    // generate_shelfs_statistics_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_shelfs_statistics_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // generate_shelfs_statistics_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_shelfs_statistics_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }

    // generate_shelfs_statistics_request->attribution_type
    cJSON *attribution_type = cJSON_GetObjectItemCaseSensitive(generate_shelfs_statistics_requestJSON, "attributionType");
    if (!attribution_type) {
        goto end;
    }

    
    attribution_type_local_nonprim = shelfs_statistics_attribution_type_parseFromJSON(attribution_type); //custom


    generate_shelfs_statistics_request_local_var = generate_shelfs_statistics_request_create (
        business_id->valuedouble,
        strdup(date_from->valuestring),
        strdup(date_to->valuestring),
        attribution_type_local_nonprim
        );

    return generate_shelfs_statistics_request_local_var;
end:
    if (attribution_type_local_nonprim) {
        shelfs_statistics_attribution_type_free(attribution_type_local_nonprim);
        attribution_type_local_nonprim = NULL;
    }
    return NULL;

}
