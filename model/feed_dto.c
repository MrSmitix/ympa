#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_dto.h"



feed_dto_t *feed_dto_create(
    long id,
    char *login,
    char *name,
    char *password,
    char *upload_date,
    char *url,
    feed_content_dto_t *content,
    feed_download_dto_t *download,
    feed_placement_dto_t *placement,
    feed_publication_dto_t *publication
    ) {
    feed_dto_t *feed_dto_local_var = malloc(sizeof(feed_dto_t));
    if (!feed_dto_local_var) {
        return NULL;
    }
    feed_dto_local_var->id = id;
    feed_dto_local_var->login = login;
    feed_dto_local_var->name = name;
    feed_dto_local_var->password = password;
    feed_dto_local_var->upload_date = upload_date;
    feed_dto_local_var->url = url;
    feed_dto_local_var->content = content;
    feed_dto_local_var->download = download;
    feed_dto_local_var->placement = placement;
    feed_dto_local_var->publication = publication;

    return feed_dto_local_var;
}


void feed_dto_free(feed_dto_t *feed_dto) {
    if(NULL == feed_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_dto->login) {
        free(feed_dto->login);
        feed_dto->login = NULL;
    }
    if (feed_dto->name) {
        free(feed_dto->name);
        feed_dto->name = NULL;
    }
    if (feed_dto->password) {
        free(feed_dto->password);
        feed_dto->password = NULL;
    }
    if (feed_dto->upload_date) {
        free(feed_dto->upload_date);
        feed_dto->upload_date = NULL;
    }
    if (feed_dto->url) {
        free(feed_dto->url);
        feed_dto->url = NULL;
    }
    if (feed_dto->content) {
        feed_content_dto_free(feed_dto->content);
        feed_dto->content = NULL;
    }
    if (feed_dto->download) {
        feed_download_dto_free(feed_dto->download);
        feed_dto->download = NULL;
    }
    if (feed_dto->placement) {
        feed_placement_dto_free(feed_dto->placement);
        feed_dto->placement = NULL;
    }
    if (feed_dto->publication) {
        feed_publication_dto_free(feed_dto->publication);
        feed_dto->publication = NULL;
    }
    free(feed_dto);
}

cJSON *feed_dto_convertToJSON(feed_dto_t *feed_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_dto->id
    if(feed_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", feed_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // feed_dto->login
    if(feed_dto->login) {
    if(cJSON_AddStringToObject(item, "login", feed_dto->login) == NULL) {
    goto fail; //String
    }
    }


    // feed_dto->name
    if(feed_dto->name) {
    if(cJSON_AddStringToObject(item, "name", feed_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // feed_dto->password
    if(feed_dto->password) {
    if(cJSON_AddStringToObject(item, "password", feed_dto->password) == NULL) {
    goto fail; //String
    }
    }


    // feed_dto->upload_date
    if(feed_dto->upload_date) {
    if(cJSON_AddStringToObject(item, "uploadDate", feed_dto->upload_date) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feed_dto->url
    if(feed_dto->url) {
    if(cJSON_AddStringToObject(item, "url", feed_dto->url) == NULL) {
    goto fail; //String
    }
    }


    // feed_dto->content
    if(feed_dto->content) {
    cJSON *content_local_JSON = feed_content_dto_convertToJSON(feed_dto->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feed_dto->download
    if(feed_dto->download) {
    cJSON *download_local_JSON = feed_download_dto_convertToJSON(feed_dto->download);
    if(download_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "download", download_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feed_dto->placement
    if(feed_dto->placement) {
    cJSON *placement_local_JSON = feed_placement_dto_convertToJSON(feed_dto->placement);
    if(placement_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "placement", placement_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feed_dto->publication
    if(feed_dto->publication) {
    cJSON *publication_local_JSON = feed_publication_dto_convertToJSON(feed_dto->publication);
    if(publication_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "publication", publication_local_JSON);
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

feed_dto_t *feed_dto_parseFromJSON(cJSON *feed_dtoJSON){

    feed_dto_t *feed_dto_local_var = NULL;

    // define the local variable for feed_dto->content
    feed_content_dto_t *content_local_nonprim = NULL;

    // define the local variable for feed_dto->download
    feed_download_dto_t *download_local_nonprim = NULL;

    // define the local variable for feed_dto->placement
    feed_placement_dto_t *placement_local_nonprim = NULL;

    // define the local variable for feed_dto->publication
    feed_publication_dto_t *publication_local_nonprim = NULL;

    // feed_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // feed_dto->login
    cJSON *login = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "login");
    if (login) { 
    if(!cJSON_IsString(login) && !cJSON_IsNull(login))
    {
    goto end; //String
    }
    }

    // feed_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // feed_dto->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "password");
    if (password) { 
    if(!cJSON_IsString(password) && !cJSON_IsNull(password))
    {
    goto end; //String
    }
    }

    // feed_dto->upload_date
    cJSON *upload_date = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "uploadDate");
    if (upload_date) { 
    if(!cJSON_IsString(upload_date) && !cJSON_IsNull(upload_date))
    {
    goto end; //DateTime
    }
    }

    // feed_dto->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // feed_dto->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "content");
    if (content) { 
    content_local_nonprim = feed_content_dto_parseFromJSON(content); //nonprimitive
    }

    // feed_dto->download
    cJSON *download = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "download");
    if (download) { 
    download_local_nonprim = feed_download_dto_parseFromJSON(download); //nonprimitive
    }

    // feed_dto->placement
    cJSON *placement = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "placement");
    if (placement) { 
    placement_local_nonprim = feed_placement_dto_parseFromJSON(placement); //nonprimitive
    }

    // feed_dto->publication
    cJSON *publication = cJSON_GetObjectItemCaseSensitive(feed_dtoJSON, "publication");
    if (publication) { 
    publication_local_nonprim = feed_publication_dto_parseFromJSON(publication); //nonprimitive
    }


    feed_dto_local_var = feed_dto_create (
        id ? id->valuedouble : 0,
        login && !cJSON_IsNull(login) ? strdup(login->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        password && !cJSON_IsNull(password) ? strdup(password->valuestring) : NULL,
        upload_date && !cJSON_IsNull(upload_date) ? strdup(upload_date->valuestring) : NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        content ? content_local_nonprim : NULL,
        download ? download_local_nonprim : NULL,
        placement ? placement_local_nonprim : NULL,
        publication ? publication_local_nonprim : NULL
        );

    return feed_dto_local_var;
end:
    if (content_local_nonprim) {
        feed_content_dto_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    if (download_local_nonprim) {
        feed_download_dto_free(download_local_nonprim);
        download_local_nonprim = NULL;
    }
    if (placement_local_nonprim) {
        feed_placement_dto_free(placement_local_nonprim);
        placement_local_nonprim = NULL;
    }
    if (publication_local_nonprim) {
        feed_publication_dto_free(publication_local_nonprim);
        publication_local_nonprim = NULL;
    }
    return NULL;

}
