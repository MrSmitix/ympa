#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderDeliveryDatesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderDeliveryDatesDTO::OrderDeliveryDatesDTO()
{
	//__init();
}

OrderDeliveryDatesDTO::~OrderDeliveryDatesDTO()
{
	//__cleanup();
}

void
OrderDeliveryDatesDTO::__init()
{
	//fromDate = std::string();
	//toDate = std::string();
	//fromTime = std::string();
	//toTime = std::string();
	//realDeliveryDate = std::string();
}

void
OrderDeliveryDatesDTO::__cleanup()
{
	//if(fromDate != NULL) {
	//
	//delete fromDate;
	//fromDate = NULL;
	//}
	//if(toDate != NULL) {
	//
	//delete toDate;
	//toDate = NULL;
	//}
	//if(fromTime != NULL) {
	//
	//delete fromTime;
	//fromTime = NULL;
	//}
	//if(toTime != NULL) {
	//
	//delete toTime;
	//toTime = NULL;
	//}
	//if(realDeliveryDate != NULL) {
	//
	//delete realDeliveryDate;
	//realDeliveryDate = NULL;
	//}
	//
}

void
OrderDeliveryDatesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fromDateKey = "fromDate";
	node = json_object_get_member(pJsonObject, fromDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fromDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toDateKey = "toDate";
	node = json_object_get_member(pJsonObject, toDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&toDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fromTimeKey = "fromTime";
	node = json_object_get_member(pJsonObject, fromTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fromTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toTimeKey = "toTime";
	node = json_object_get_member(pJsonObject, toTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&toTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *realDeliveryDateKey = "realDeliveryDate";
	node = json_object_get_member(pJsonObject, realDeliveryDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&realDeliveryDate, node, "std::string", "");
		} else {
			
		}
	}
}

OrderDeliveryDatesDTO::OrderDeliveryDatesDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderDeliveryDatesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFromDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fromDateKey = "fromDate";
	json_object_set_member(pJsonObject, fromDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *toDateKey = "toDate";
	json_object_set_member(pJsonObject, toDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFromTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fromTimeKey = "fromTime";
	json_object_set_member(pJsonObject, fromTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *toTimeKey = "toTime";
	json_object_set_member(pJsonObject, toTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRealDeliveryDate();
		node = converttoJson(&obj, "std::string", "");
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

std::string
OrderDeliveryDatesDTO::getFromDate()
{
	return fromDate;
}

void
OrderDeliveryDatesDTO::setFromDate(std::string  fromDate)
{
	this->fromDate = fromDate;
}

std::string
OrderDeliveryDatesDTO::getToDate()
{
	return toDate;
}

void
OrderDeliveryDatesDTO::setToDate(std::string  toDate)
{
	this->toDate = toDate;
}

std::string
OrderDeliveryDatesDTO::getFromTime()
{
	return fromTime;
}

void
OrderDeliveryDatesDTO::setFromTime(std::string  fromTime)
{
	this->fromTime = fromTime;
}

std::string
OrderDeliveryDatesDTO::getToTime()
{
	return toTime;
}

void
OrderDeliveryDatesDTO::setToTime(std::string  toTime)
{
	this->toTime = toTime;
}

std::string
OrderDeliveryDatesDTO::getRealDeliveryDate()
{
	return realDeliveryDate;
}

void
OrderDeliveryDatesDTO::setRealDeliveryDate(std::string  realDeliveryDate)
{
	this->realDeliveryDate = realDeliveryDate;
}


