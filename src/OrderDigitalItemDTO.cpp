#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderDigitalItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderDigitalItemDTO::OrderDigitalItemDTO()
{
	//__init();
}

OrderDigitalItemDTO::~OrderDigitalItemDTO()
{
	//__cleanup();
}

void
OrderDigitalItemDTO::__init()
{
	//id = long(0);
	//code = std::string();
	//slip = std::string();
	//activate_till = null;
}

void
OrderDigitalItemDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(slip != NULL) {
	//
	//delete slip;
	//slip = NULL;
	//}
	//if(activate_till != NULL) {
	//
	//delete activate_till;
	//activate_till = NULL;
	//}
	//
}

void
OrderDigitalItemDTO::fromJson(char* jsonStr)
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
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *slipKey = "slip";
	node = json_object_get_member(pJsonObject, slipKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&slip, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *activate_tillKey = "activate_till";
	node = json_object_get_member(pJsonObject, activate_tillKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&activate_till, node, "Date", "Date");
		} else {
			
		}
	}
}

OrderDigitalItemDTO::OrderDigitalItemDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderDigitalItemDTO::toJson()
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
		std::string obj = getCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSlip();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *slipKey = "slip";
	json_object_set_member(pJsonObject, slipKey, node);
	if (isprimitive("Date")) {
		Date obj = getActivateTill();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *activate_tillKey = "activate_till";
	json_object_set_member(pJsonObject, activate_tillKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderDigitalItemDTO::getId()
{
	return id;
}

void
OrderDigitalItemDTO::setId(long long  id)
{
	this->id = id;
}

std::string
OrderDigitalItemDTO::getCode()
{
	return code;
}

void
OrderDigitalItemDTO::setCode(std::string  code)
{
	this->code = code;
}

std::string
OrderDigitalItemDTO::getSlip()
{
	return slip;
}

void
OrderDigitalItemDTO::setSlip(std::string  slip)
{
	this->slip = slip;
}

Date
OrderDigitalItemDTO::getActivateTill()
{
	return activate_till;
}

void
OrderDigitalItemDTO::setActivateTill(Date  activate_till)
{
	this->activate_till = activate_till;
}


