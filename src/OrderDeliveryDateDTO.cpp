#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderDeliveryDateDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderDeliveryDateDTO::OrderDeliveryDateDTO()
{
	//__init();
}

OrderDeliveryDateDTO::~OrderDeliveryDateDTO()
{
	//__cleanup();
}

void
OrderDeliveryDateDTO::__init()
{
	//toDate = null;
}

void
OrderDeliveryDateDTO::__cleanup()
{
	//if(toDate != NULL) {
	//
	//delete toDate;
	//toDate = NULL;
	//}
	//
}

void
OrderDeliveryDateDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *toDateKey = "toDate";
	node = json_object_get_member(pJsonObject, toDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&toDate, node, "Date", "Date");
		} else {
			
		}
	}
}

OrderDeliveryDateDTO::OrderDeliveryDateDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderDeliveryDateDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getToDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *toDateKey = "toDate";
	json_object_set_member(pJsonObject, toDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
OrderDeliveryDateDTO::getToDate()
{
	return toDate;
}

void
OrderDeliveryDateDTO::setToDate(Date  toDate)
{
	this->toDate = toDate;
}


