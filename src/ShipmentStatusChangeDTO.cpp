#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ShipmentStatusChangeDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ShipmentStatusChangeDTO::ShipmentStatusChangeDTO()
{
	//__init();
}

ShipmentStatusChangeDTO::~ShipmentStatusChangeDTO()
{
	//__cleanup();
}

void
ShipmentStatusChangeDTO::__init()
{
	//status = new ShipmentStatusType();
	//description = std::string();
	//updateTime = null;
}

void
ShipmentStatusChangeDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(updateTime != NULL) {
	//
	//delete updateTime;
	//updateTime = NULL;
	//}
	//
}

void
ShipmentStatusChangeDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ShipmentStatusType")) {
			jsonToValue(&status, node, "ShipmentStatusType", "ShipmentStatusType");
		} else {
			
			ShipmentStatusType* obj = static_cast<ShipmentStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updateTimeKey = "updateTime";
	node = json_object_get_member(pJsonObject, updateTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updateTime, node, "std::string", "");
		} else {
			
		}
	}
}

ShipmentStatusChangeDTO::ShipmentStatusChangeDTO(char* json)
{
	this->fromJson(json);
}

char*
ShipmentStatusChangeDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ShipmentStatusType")) {
		ShipmentStatusType obj = getStatus();
		node = converttoJson(&obj, "ShipmentStatusType", "");
	}
	else {
		
		ShipmentStatusType obj = static_cast<ShipmentStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdateTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updateTimeKey = "updateTime";
	json_object_set_member(pJsonObject, updateTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ShipmentStatusType
ShipmentStatusChangeDTO::getStatus()
{
	return status;
}

void
ShipmentStatusChangeDTO::setStatus(ShipmentStatusType  status)
{
	this->status = status;
}

std::string
ShipmentStatusChangeDTO::getDescription()
{
	return description;
}

void
ShipmentStatusChangeDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
ShipmentStatusChangeDTO::getUpdateTime()
{
	return updateTime;
}

void
ShipmentStatusChangeDTO::setUpdateTime(std::string  updateTime)
{
	this->updateTime = updateTime;
}


