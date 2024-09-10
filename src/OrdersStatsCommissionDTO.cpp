#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersStatsCommissionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersStatsCommissionDTO::OrdersStatsCommissionDTO()
{
	//__init();
}

OrdersStatsCommissionDTO::~OrdersStatsCommissionDTO()
{
	//__cleanup();
}

void
OrdersStatsCommissionDTO::__init()
{
	//type = new OrdersStatsCommissionType();
	//actual = double(0);
}

void
OrdersStatsCommissionDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(actual != NULL) {
	//
	//delete actual;
	//actual = NULL;
	//}
	//
}

void
OrdersStatsCommissionDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsCommissionType")) {
			jsonToValue(&type, node, "OrdersStatsCommissionType", "OrdersStatsCommissionType");
		} else {
			
			OrdersStatsCommissionType* obj = static_cast<OrdersStatsCommissionType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *actualKey = "actual";
	node = json_object_get_member(pJsonObject, actualKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&actual, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&actual);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrdersStatsCommissionDTO::OrdersStatsCommissionDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersStatsCommissionDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrdersStatsCommissionType")) {
		OrdersStatsCommissionType obj = getType();
		node = converttoJson(&obj, "OrdersStatsCommissionType", "");
	}
	else {
		
		OrdersStatsCommissionType obj = static_cast<OrdersStatsCommissionType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getActual();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getActual());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *actualKey = "actual";
	json_object_set_member(pJsonObject, actualKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrdersStatsCommissionType
OrdersStatsCommissionDTO::getType()
{
	return type;
}

void
OrdersStatsCommissionDTO::setType(OrdersStatsCommissionType  type)
{
	this->type = type;
}

long long
OrdersStatsCommissionDTO::getActual()
{
	return actual;
}

void
OrdersStatsCommissionDTO::setActual(long long  actual)
{
	this->actual = actual;
}


