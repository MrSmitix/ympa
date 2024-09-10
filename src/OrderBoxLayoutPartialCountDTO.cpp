#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderBoxLayoutPartialCountDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderBoxLayoutPartialCountDTO::OrderBoxLayoutPartialCountDTO()
{
	//__init();
}

OrderBoxLayoutPartialCountDTO::~OrderBoxLayoutPartialCountDTO()
{
	//__cleanup();
}

void
OrderBoxLayoutPartialCountDTO::__init()
{
	//current = int(0);
	//total = int(0);
}

void
OrderBoxLayoutPartialCountDTO::__cleanup()
{
	//if(current != NULL) {
	//
	//delete current;
	//current = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//
}

void
OrderBoxLayoutPartialCountDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *currentKey = "current";
	node = json_object_get_member(pJsonObject, currentKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&current, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total, node, "int", "");
		} else {
			
		}
	}
}

OrderBoxLayoutPartialCountDTO::OrderBoxLayoutPartialCountDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderBoxLayoutPartialCountDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCurrent();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *currentKey = "current";
	json_object_set_member(pJsonObject, currentKey, node);
	if (isprimitive("int")) {
		int obj = getTotal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
OrderBoxLayoutPartialCountDTO::getCurrent()
{
	return current;
}

void
OrderBoxLayoutPartialCountDTO::setCurrent(int  current)
{
	this->current = current;
}

int
OrderBoxLayoutPartialCountDTO::getTotal()
{
	return total;
}

void
OrderBoxLayoutPartialCountDTO::setTotal(int  total)
{
	this->total = total;
}


