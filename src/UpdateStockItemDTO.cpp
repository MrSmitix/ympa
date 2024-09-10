#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateStockItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateStockItemDTO::UpdateStockItemDTO()
{
	//__init();
}

UpdateStockItemDTO::~UpdateStockItemDTO()
{
	//__cleanup();
}

void
UpdateStockItemDTO::__init()
{
	//count = long(0);
	//updatedAt = null;
}

void
UpdateStockItemDTO::__cleanup()
{
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//
}

void
UpdateStockItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&count, node, "long long", "");
		} else {
			
		}
	}
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
}

UpdateStockItemDTO::UpdateStockItemDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateStockItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
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

long long
UpdateStockItemDTO::getCount()
{
	return count;
}

void
UpdateStockItemDTO::setCount(long long  count)
{
	this->count = count;
}

std::string
UpdateStockItemDTO::getUpdatedAt()
{
	return updatedAt;
}

void
UpdateStockItemDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}


