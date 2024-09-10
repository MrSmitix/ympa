#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderStatusChangeDeliveryDatesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderStatusChangeDeliveryDatesDTO::OrderStatusChangeDeliveryDatesDTO()
{
	//__init();
}

OrderStatusChangeDeliveryDatesDTO::~OrderStatusChangeDeliveryDatesDTO()
{
	//__cleanup();
}

void
OrderStatusChangeDeliveryDatesDTO::__init()
{
	//realDeliveryDate = null;
}

void
OrderStatusChangeDeliveryDatesDTO::__cleanup()
{
	//if(realDeliveryDate != NULL) {
	//
	//delete realDeliveryDate;
	//realDeliveryDate = NULL;
	//}
	//
}

void
OrderStatusChangeDeliveryDatesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *realDeliveryDateKey = "realDeliveryDate";
	node = json_object_get_member(pJsonObject, realDeliveryDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&realDeliveryDate, node, "Date", "Date");
		} else {
			
		}
	}
}

OrderStatusChangeDeliveryDatesDTO::OrderStatusChangeDeliveryDatesDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderStatusChangeDeliveryDatesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getRealDeliveryDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *realDeliveryDateKey = "realDeliveryDate";
	json_object_set_member(pJsonObject, realDeliveryDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
OrderStatusChangeDeliveryDatesDTO::getRealDeliveryDate()
{
	return realDeliveryDate;
}

void
OrderStatusChangeDeliveryDatesDTO::setRealDeliveryDate(Date  realDeliveryDate)
{
	this->realDeliveryDate = realDeliveryDate;
}


