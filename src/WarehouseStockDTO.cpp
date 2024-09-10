#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarehouseStockDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarehouseStockDTO::WarehouseStockDTO()
{
	//__init();
}

WarehouseStockDTO::~WarehouseStockDTO()
{
	//__cleanup();
}

void
WarehouseStockDTO::__init()
{
	//type = new WarehouseStockType();
	//count = long(0);
}

void
WarehouseStockDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//
}

void
WarehouseStockDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("WarehouseStockType")) {
			jsonToValue(&type, node, "WarehouseStockType", "WarehouseStockType");
		} else {
			
			WarehouseStockType* obj = static_cast<WarehouseStockType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&count, node, "long long", "");
		} else {
			
		}
	}
}

WarehouseStockDTO::WarehouseStockDTO(char* json)
{
	this->fromJson(json);
}

char*
WarehouseStockDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("WarehouseStockType")) {
		WarehouseStockType obj = getType();
		node = converttoJson(&obj, "WarehouseStockType", "");
	}
	else {
		
		WarehouseStockType obj = static_cast<WarehouseStockType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

WarehouseStockType
WarehouseStockDTO::getType()
{
	return type;
}

void
WarehouseStockDTO::setType(WarehouseStockType  type)
{
	this->type = type;
}

long long
WarehouseStockDTO::getCount()
{
	return count;
}

void
WarehouseStockDTO::setCount(long long  count)
{
	this->count = count;
}


