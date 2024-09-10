#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderCourierDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderCourierDTO::OrderCourierDTO()
{
	//__init();
}

OrderCourierDTO::~OrderCourierDTO()
{
	//__cleanup();
}

void
OrderCourierDTO::__init()
{
	//fullName = std::string();
	//phone = std::string();
	//phoneExtension = std::string();
	//vehicleNumber = std::string();
	//vehicleDescription = std::string();
}

void
OrderCourierDTO::__cleanup()
{
	//if(fullName != NULL) {
	//
	//delete fullName;
	//fullName = NULL;
	//}
	//if(phone != NULL) {
	//
	//delete phone;
	//phone = NULL;
	//}
	//if(phoneExtension != NULL) {
	//
	//delete phoneExtension;
	//phoneExtension = NULL;
	//}
	//if(vehicleNumber != NULL) {
	//
	//delete vehicleNumber;
	//vehicleNumber = NULL;
	//}
	//if(vehicleDescription != NULL) {
	//
	//delete vehicleDescription;
	//vehicleDescription = NULL;
	//}
	//
}

void
OrderCourierDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fullNameKey = "fullName";
	node = json_object_get_member(pJsonObject, fullNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fullName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phoneKey = "phone";
	node = json_object_get_member(pJsonObject, phoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&phone, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phoneExtensionKey = "phoneExtension";
	node = json_object_get_member(pJsonObject, phoneExtensionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&phoneExtension, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleNumberKey = "vehicleNumber";
	node = json_object_get_member(pJsonObject, vehicleNumberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vehicleNumber, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleDescriptionKey = "vehicleDescription";
	node = json_object_get_member(pJsonObject, vehicleDescriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vehicleDescription, node, "std::string", "");
		} else {
			
		}
	}
}

OrderCourierDTO::OrderCourierDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderCourierDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFullName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fullNameKey = "fullName";
	json_object_set_member(pJsonObject, fullNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPhone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *phoneKey = "phone";
	json_object_set_member(pJsonObject, phoneKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPhoneExtension();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *phoneExtensionKey = "phoneExtension";
	json_object_set_member(pJsonObject, phoneExtensionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVehicleNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vehicleNumberKey = "vehicleNumber";
	json_object_set_member(pJsonObject, vehicleNumberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVehicleDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vehicleDescriptionKey = "vehicleDescription";
	json_object_set_member(pJsonObject, vehicleDescriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrderCourierDTO::getFullName()
{
	return fullName;
}

void
OrderCourierDTO::setFullName(std::string  fullName)
{
	this->fullName = fullName;
}

std::string
OrderCourierDTO::getPhone()
{
	return phone;
}

void
OrderCourierDTO::setPhone(std::string  phone)
{
	this->phone = phone;
}

std::string
OrderCourierDTO::getPhoneExtension()
{
	return phoneExtension;
}

void
OrderCourierDTO::setPhoneExtension(std::string  phoneExtension)
{
	this->phoneExtension = phoneExtension;
}

std::string
OrderCourierDTO::getVehicleNumber()
{
	return vehicleNumber;
}

void
OrderCourierDTO::setVehicleNumber(std::string  vehicleNumber)
{
	this->vehicleNumber = vehicleNumber;
}

std::string
OrderCourierDTO::getVehicleDescription()
{
	return vehicleDescription;
}

void
OrderCourierDTO::setVehicleDescription(std::string  vehicleDescription)
{
	this->vehicleDescription = vehicleDescription;
}


