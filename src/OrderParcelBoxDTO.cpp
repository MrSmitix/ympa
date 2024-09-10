#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderParcelBoxDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderParcelBoxDTO::OrderParcelBoxDTO()
{
	//__init();
}

OrderParcelBoxDTO::~OrderParcelBoxDTO()
{
	//__cleanup();
}

void
OrderParcelBoxDTO::__init()
{
	//id = long(0);
	//fulfilmentId = std::string();
}

void
OrderParcelBoxDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(fulfilmentId != NULL) {
	//
	//delete fulfilmentId;
	//fulfilmentId = NULL;
	//}
	//
}

void
OrderParcelBoxDTO::fromJson(char* jsonStr)
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
	const gchar *fulfilmentIdKey = "fulfilmentId";
	node = json_object_get_member(pJsonObject, fulfilmentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fulfilmentId, node, "std::string", "");
		} else {
			
		}
	}
}

OrderParcelBoxDTO::OrderParcelBoxDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderParcelBoxDTO::toJson()
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
		std::string obj = getFulfilmentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fulfilmentIdKey = "fulfilmentId";
	json_object_set_member(pJsonObject, fulfilmentIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderParcelBoxDTO::getId()
{
	return id;
}

void
OrderParcelBoxDTO::setId(long long  id)
{
	this->id = id;
}

std::string
OrderParcelBoxDTO::getFulfilmentId()
{
	return fulfilmentId;
}

void
OrderParcelBoxDTO::setFulfilmentId(std::string  fulfilmentId)
{
	this->fulfilmentId = fulfilmentId;
}


