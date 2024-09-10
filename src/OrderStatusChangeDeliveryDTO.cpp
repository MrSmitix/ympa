#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderStatusChangeDeliveryDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderStatusChangeDeliveryDTO::OrderStatusChangeDeliveryDTO()
{
	//__init();
}

OrderStatusChangeDeliveryDTO::~OrderStatusChangeDeliveryDTO()
{
	//__cleanup();
}

void
OrderStatusChangeDeliveryDTO::__init()
{
	//dates = new OrderStatusChangeDeliveryDatesDTO();
}

void
OrderStatusChangeDeliveryDTO::__cleanup()
{
	//if(dates != NULL) {
	//
	//delete dates;
	//dates = NULL;
	//}
	//
}

void
OrderStatusChangeDeliveryDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *datesKey = "dates";
	node = json_object_get_member(pJsonObject, datesKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderStatusChangeDeliveryDatesDTO")) {
			jsonToValue(&dates, node, "OrderStatusChangeDeliveryDatesDTO", "OrderStatusChangeDeliveryDatesDTO");
		} else {
			
			OrderStatusChangeDeliveryDatesDTO* obj = static_cast<OrderStatusChangeDeliveryDatesDTO*> (&dates);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderStatusChangeDeliveryDTO::OrderStatusChangeDeliveryDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderStatusChangeDeliveryDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderStatusChangeDeliveryDatesDTO")) {
		OrderStatusChangeDeliveryDatesDTO obj = getDates();
		node = converttoJson(&obj, "OrderStatusChangeDeliveryDatesDTO", "");
	}
	else {
		
		OrderStatusChangeDeliveryDatesDTO obj = static_cast<OrderStatusChangeDeliveryDatesDTO> (getDates());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datesKey = "dates";
	json_object_set_member(pJsonObject, datesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderStatusChangeDeliveryDatesDTO
OrderStatusChangeDeliveryDTO::getDates()
{
	return dates;
}

void
OrderStatusChangeDeliveryDTO::setDates(OrderStatusChangeDeliveryDatesDTO  dates)
{
	this->dates = dates;
}


