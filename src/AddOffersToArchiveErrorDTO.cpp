#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddOffersToArchiveErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddOffersToArchiveErrorDTO::AddOffersToArchiveErrorDTO()
{
	//__init();
}

AddOffersToArchiveErrorDTO::~AddOffersToArchiveErrorDTO()
{
	//__cleanup();
}

void
AddOffersToArchiveErrorDTO::__init()
{
	//offerId = std::string();
	//error = new AddOffersToArchiveErrorType();
}

void
AddOffersToArchiveErrorDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
AddOffersToArchiveErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("AddOffersToArchiveErrorType")) {
			jsonToValue(&error, node, "AddOffersToArchiveErrorType", "AddOffersToArchiveErrorType");
		} else {
			
			AddOffersToArchiveErrorType* obj = static_cast<AddOffersToArchiveErrorType*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AddOffersToArchiveErrorDTO::AddOffersToArchiveErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
AddOffersToArchiveErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("AddOffersToArchiveErrorType")) {
		AddOffersToArchiveErrorType obj = getError();
		node = converttoJson(&obj, "AddOffersToArchiveErrorType", "");
	}
	else {
		
		AddOffersToArchiveErrorType obj = static_cast<AddOffersToArchiveErrorType> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AddOffersToArchiveErrorDTO::getOfferId()
{
	return offerId;
}

void
AddOffersToArchiveErrorDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

AddOffersToArchiveErrorType
AddOffersToArchiveErrorDTO::getError()
{
	return error;
}

void
AddOffersToArchiveErrorDTO::setError(AddOffersToArchiveErrorType  error)
{
	this->error = error;
}


