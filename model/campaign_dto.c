#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_dto.h"


char* campaign_dto_placement_type_ToString(_api__campaign_dto__e placement_type) {
    char* placement_typeArray[] =  { "NULL", "FBS", "FBY", "DBS" };
    return placement_typeArray[placement_type];
}

_api__campaign_dto__e campaign_dto_placement_type_FromString(char* placement_type){
    int stringToReturn = 0;
    char *placement_typeArray[] =  { "NULL", "FBS", "FBY", "DBS" };
    size_t sizeofArray = sizeof(placement_typeArray) / sizeof(placement_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_type, placement_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

campaign_dto_t *campaign_dto_create(
    char *domain,
    long id,
    long client_id,
    business_dto_t *business,
    placement_type_t *placement_type
    ) {
    campaign_dto_t *campaign_dto_local_var = malloc(sizeof(campaign_dto_t));
    if (!campaign_dto_local_var) {
        return NULL;
    }
    campaign_dto_local_var->domain = domain;
    campaign_dto_local_var->id = id;
    campaign_dto_local_var->client_id = client_id;
    campaign_dto_local_var->business = business;
    campaign_dto_local_var->placement_type = placement_type;

    return campaign_dto_local_var;
}


void campaign_dto_free(campaign_dto_t *campaign_dto) {
    if(NULL == campaign_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_dto->domain) {
        free(campaign_dto->domain);
        campaign_dto->domain = NULL;
    }
    if (campaign_dto->business) {
        business_dto_free(campaign_dto->business);
        campaign_dto->business = NULL;
    }
    if (campaign_dto->placement_type) {
        placement_type_free(campaign_dto->placement_type);
        campaign_dto->placement_type = NULL;
    }
    free(campaign_dto);
}

cJSON *campaign_dto_convertToJSON(campaign_dto_t *campaign_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_dto->domain
    if(campaign_dto->domain) {
    if(cJSON_AddStringToObject(item, "domain", campaign_dto->domain) == NULL) {
    goto fail; //String
    }
    }


    // campaign_dto->id
    if(campaign_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", campaign_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_dto->client_id
    if(campaign_dto->client_id) {
    if(cJSON_AddNumberToObject(item, "clientId", campaign_dto->client_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_dto->business
    if(campaign_dto->business) {
    cJSON *business_local_JSON = business_dto_convertToJSON(campaign_dto->business);
    if(business_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "business", business_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_dto->placement_type
    if(campaign_dto->placement_type != _api__campaign_dto__NULL) {
    cJSON *placement_type_local_JSON = placement_type_convertToJSON(campaign_dto->placement_type);
    if(placement_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placementType", placement_type_local_JSON);
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

campaign_dto_t *campaign_dto_parseFromJSON(cJSON *campaign_dtoJSON){

    campaign_dto_t *campaign_dto_local_var = NULL;

    // define the local variable for campaign_dto->business
    business_dto_t *business_local_nonprim = NULL;

    // define the local variable for campaign_dto->placement_type
    placement_type_t *placement_type_local_nonprim = NULL;

    // campaign_dto->domain
    cJSON *domain = cJSON_GetObjectItemCaseSensitive(campaign_dtoJSON, "domain");
    if (domain) { 
    if(!cJSON_IsString(domain) && !cJSON_IsNull(domain))
    {
    goto end; //String
    }
    }

    // campaign_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // campaign_dto->client_id
    cJSON *client_id = cJSON_GetObjectItemCaseSensitive(campaign_dtoJSON, "clientId");
    if (client_id) { 
    if(!cJSON_IsNumber(client_id))
    {
    goto end; //Numeric
    }
    }

    // campaign_dto->business
    cJSON *business = cJSON_GetObjectItemCaseSensitive(campaign_dtoJSON, "business");
    if (business) { 
    business_local_nonprim = business_dto_parseFromJSON(business); //nonprimitive
    }

    // campaign_dto->placement_type
    cJSON *placement_type = cJSON_GetObjectItemCaseSensitive(campaign_dtoJSON, "placementType");
    if (placement_type) { 
    placement_type_local_nonprim = placement_type_parseFromJSON(placement_type); //custom
    }


    campaign_dto_local_var = campaign_dto_create (
        domain && !cJSON_IsNull(domain) ? strdup(domain->valuestring) : NULL,
        id ? id->valuedouble : 0,
        client_id ? client_id->valuedouble : 0,
        business ? business_local_nonprim : NULL,
        placement_type ? placement_type_local_nonprim : NULL
        );

    return campaign_dto_local_var;
end:
    if (business_local_nonprim) {
        business_dto_free(business_local_nonprim);
        business_local_nonprim = NULL;
    }
    if (placement_type_local_nonprim) {
        placement_type_free(placement_type_local_nonprim);
        placement_type_local_nonprim = NULL;
    }
    return NULL;

}
