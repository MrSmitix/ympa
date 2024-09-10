#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedDTO::FeedDTO()
{
	//__init();
}

FeedDTO::~FeedDTO()
{
	//__cleanup();
}

void
FeedDTO::__init()
{
	//id = long(0);
	//login = std::string();
	//name = std::string();
	//password = std::string();
	//uploadDate = null;
	//url = std::string();
	//content = new FeedContentDTO();
	//download = new FeedDownloadDTO();
	//placement = new FeedPlacementDTO();
	//publication = new FeedPublicationDTO();
}

void
FeedDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(login != NULL) {
	//
	//delete login;
	//login = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(password != NULL) {
	//
	//delete password;
	//password = NULL;
	//}
	//if(uploadDate != NULL) {
	//
	//delete uploadDate;
	//uploadDate = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(download != NULL) {
	//
	//delete download;
	//download = NULL;
	//}
	//if(placement != NULL) {
	//
	//delete placement;
	//placement = NULL;
	//}
	//if(publication != NULL) {
	//
	//delete publication;
	//publication = NULL;
	//}
	//
}

void
FeedDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *loginKey = "login";
	node = json_object_get_member(pJsonObject, loginKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&login, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *passwordKey = "password";
	node = json_object_get_member(pJsonObject, passwordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&password, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *uploadDateKey = "uploadDate";
	node = json_object_get_member(pJsonObject, uploadDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&uploadDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedContentDTO")) {
			jsonToValue(&content, node, "FeedContentDTO", "FeedContentDTO");
		} else {
			
			FeedContentDTO* obj = static_cast<FeedContentDTO*> (&content);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *downloadKey = "download";
	node = json_object_get_member(pJsonObject, downloadKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedDownloadDTO")) {
			jsonToValue(&download, node, "FeedDownloadDTO", "FeedDownloadDTO");
		} else {
			
			FeedDownloadDTO* obj = static_cast<FeedDownloadDTO*> (&download);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placementKey = "placement";
	node = json_object_get_member(pJsonObject, placementKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedPlacementDTO")) {
			jsonToValue(&placement, node, "FeedPlacementDTO", "FeedPlacementDTO");
		} else {
			
			FeedPlacementDTO* obj = static_cast<FeedPlacementDTO*> (&placement);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *publicationKey = "publication";
	node = json_object_get_member(pJsonObject, publicationKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedPublicationDTO")) {
			jsonToValue(&publication, node, "FeedPublicationDTO", "FeedPublicationDTO");
		} else {
			
			FeedPublicationDTO* obj = static_cast<FeedPublicationDTO*> (&publication);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedDTO::FeedDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLogin();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *loginKey = "login";
	json_object_set_member(pJsonObject, loginKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPassword();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *passwordKey = "password";
	json_object_set_member(pJsonObject, passwordKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUploadDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *uploadDateKey = "uploadDate";
	json_object_set_member(pJsonObject, uploadDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("FeedContentDTO")) {
		FeedContentDTO obj = getContent();
		node = converttoJson(&obj, "FeedContentDTO", "");
	}
	else {
		
		FeedContentDTO obj = static_cast<FeedContentDTO> (getContent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("FeedDownloadDTO")) {
		FeedDownloadDTO obj = getDownload();
		node = converttoJson(&obj, "FeedDownloadDTO", "");
	}
	else {
		
		FeedDownloadDTO obj = static_cast<FeedDownloadDTO> (getDownload());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *downloadKey = "download";
	json_object_set_member(pJsonObject, downloadKey, node);
	if (isprimitive("FeedPlacementDTO")) {
		FeedPlacementDTO obj = getPlacement();
		node = converttoJson(&obj, "FeedPlacementDTO", "");
	}
	else {
		
		FeedPlacementDTO obj = static_cast<FeedPlacementDTO> (getPlacement());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placementKey = "placement";
	json_object_set_member(pJsonObject, placementKey, node);
	if (isprimitive("FeedPublicationDTO")) {
		FeedPublicationDTO obj = getPublication();
		node = converttoJson(&obj, "FeedPublicationDTO", "");
	}
	else {
		
		FeedPublicationDTO obj = static_cast<FeedPublicationDTO> (getPublication());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *publicationKey = "publication";
	json_object_set_member(pJsonObject, publicationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedDTO::getId()
{
	return id;
}

void
FeedDTO::setId(long long  id)
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


