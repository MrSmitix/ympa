#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentDTO::DocumentDTO()
{
	//__init();
}

DocumentDTO::~DocumentDTO()
{
	//__cleanup();
}

void
DocumentDTO::__init()
{
	//status = new OrderDocumentStatusType();
	//number = std::string();
	//date = null;
}

void
DocumentDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(number != NULL) {
	//
	//delete number;
	//number = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//
}

void
DocumentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDocumentStatusType")) {
			jsonToValue(&status, node, "OrderDocumentStatusType", "OrderDocumentStatusType");
		} else {
			
			OrderDocumentStatusType* obj = static_cast<OrderDocumentStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *numberKey = "number";
	node = json_object_get_member(pJsonObject, numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&date, node, "Date", "Date");
		} else {
			
		}
	}
}

DocumentDTO::DocumentDTO(char* json)
{
	this->fromJson(json);
}

char*
DocumentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderDocumentStatusType")) {
		OrderDocumentStatusType obj = getStatus();
		node = converttoJson(&obj, "OrderDocumentStatusType", "");
	}
	else {
		
		OrderDocumentStatusType obj = static_cast<OrderDocumentStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *numberKey = "number";
	json_object_set_member(pJsonObject, numberKey, node);
	if (isprimitive("Date")) {
		Date obj = getDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderDocumentStatusType
DocumentDTO::getStatus()
{
	return status;
}

void
DocumentDTO::setStatus(OrderDocumentStatusType  status)
{
	this->status = status;
}

std::string
DocumentDTO::getNumber()
{
	return number;
}

void
DocumentDTO::setNumber(std::string  number)
{
	this->number = number;
}

Date
DocumentDTO::getDate()
{
	return date;
}

void
DocumentDTO::setDate(Date  date)
{
	this->date = date;
}


