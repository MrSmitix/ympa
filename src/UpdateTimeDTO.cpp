#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateTimeDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateTimeDTO::UpdateTimeDTO()
{
	//__init();
}

UpdateTimeDTO::~UpdateTimeDTO()
{
	//__cleanup();
}

void
UpdateTimeDTO::__init()
{
	//updatedAt = null;
}

void
UpdateTimeDTO::__cleanup()
{
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//
}

void
UpdateTimeDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
}

UpdateTimeDTO::UpdateTimeDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateTimeDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdateTimeDTO::getUpdatedAt()
{
	return updatedAt;
}

void
UpdateTimeDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}


