

#include "FeedDTO.h"

using namespace Tiny;

FeedDTO::FeedDTO()
{
	id = long(0);
	login = std::string();
	name = std::string();
	password = std::string();
	uploadDate = std::string();
	url = std::string();
	content = FeedContentDTO();
	download = FeedDownloadDTO();
	placement = FeedPlacementDTO();
	publication = FeedPublicationDTO();
}

FeedDTO::FeedDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedDTO::~FeedDTO()
{

}

void
FeedDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *loginKey = "login";

    if(object.has_key(loginKey))
    {
        bourne::json value = object[loginKey];



        jsonToValue(&login, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *passwordKey = "password";

    if(object.has_key(passwordKey))
    {
        bourne::json value = object[passwordKey];



        jsonToValue(&password, value, "std::string");


    }

    const char *uploadDateKey = "uploadDate";

    if(object.has_key(uploadDateKey))
    {
        bourne::json value = object[uploadDateKey];



        jsonToValue(&uploadDate, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        FeedContentDTO* obj = &content;
		obj->fromJson(value.dump());

    }

    const char *downloadKey = "download";

    if(object.has_key(downloadKey))
    {
        bourne::json value = object[downloadKey];




        FeedDownloadDTO* obj = &download;
		obj->fromJson(value.dump());

    }

    const char *placementKey = "placement";

    if(object.has_key(placementKey))
    {
        bourne::json value = object[placementKey];




        FeedPlacementDTO* obj = &placement;
		obj->fromJson(value.dump());

    }

    const char *publicationKey = "publication";

    if(object.has_key(publicationKey))
    {
        bourne::json value = object[publicationKey];




        FeedPublicationDTO* obj = &publication;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["login"] = getLogin();






    object["name"] = getName();






    object["password"] = getPassword();






    object["uploadDate"] = getUploadDate();






    object["url"] = getUrl();







	object["content"] = getContent().toJson();






	object["download"] = getDownload().toJson();






	object["placement"] = getPlacement().toJson();






	object["publication"] = getPublication().toJson();


    return object;

}

long
FeedDTO::getId()
{
	return id;
}

void
FeedDTO::setId(long  id)
{
	this->id = id;
}

std::string
FeedDTO::getLogin()
{
	return login;
}

void
FeedDTO::setLogin(std::string  login)
{
	this->login = login;
}

std::string
FeedDTO::getName()
{
	return name;
}

void
FeedDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
FeedDTO::getPassword()
{
	return password;
}

void
FeedDTO::setPassword(std::string  password)
{
	this->password = password;
}

std::string
FeedDTO::getUploadDate()
{
	return uploadDate;
}

void
FeedDTO::setUploadDate(std::string  uploadDate)
{
	this->uploadDate = uploadDate;
}

std::string
FeedDTO::getUrl()
{
	return url;
}

void
FeedDTO::setUrl(std::string  url)
{
	this->url = url;
}

FeedContentDTO
FeedDTO::getContent()
{
	return content;
}

void
FeedDTO::setContent(FeedContentDTO  content)
{
	this->content = content;
}

FeedDownloadDTO
FeedDTO::getDownload()
{
	return download;
}

void
FeedDTO::setDownload(FeedDownloadDTO  download)
{
	this->download = download;
}

FeedPlacementDTO
FeedDTO::getPlacement()
{
	return placement;
}

void
FeedDTO::setPlacement(FeedPlacementDTO  placement)
{
	this->placement = placement;
}

FeedPublicationDTO
FeedDTO::getPublication()
{
	return publication;
}

void
FeedDTO::setPublication(FeedPublicationDTO  publication)
{
	this->publication = publication;
}



