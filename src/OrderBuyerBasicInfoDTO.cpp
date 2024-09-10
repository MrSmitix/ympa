#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderBuyerBasicInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderBuyerBasicInfoDTO::OrderBuyerBasicInfoDTO()
{
	//__init();
}

OrderBuyerBasicInfoDTO::~OrderBuyerBasicInfoDTO()
{
	//__cleanup();
}

void
OrderBuyerBasicInfoDTO::__init()
{
	//id = std::string();
	//lastName = std::string();
	//firstName = std::string();
	//middleName = std::string();
	//type = new OrderBuyerType();
}

void
OrderBuyerBasicInfoDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(lastName != NULL) {
	//
	//delete lastName;
	//lastName = NULL;
	//}
	//if(firstName != NULL) {
	//
	//delete firstName;
	//firstName = NULL;
	//}
	//if(middleName != NULL) {
	//
	//delete middleName;
	//middleName = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
OrderBuyerBasicInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *lastNameKey = "lastName";
	node = json_object_get_member(pJsonObject, lastNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lastName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *firstNameKey = "firstName";
	node = json_object_get_member(pJsonObject, firstNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&firstName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *middleNameKey = "middleName";
	node = json_object_get_member(pJsonObject, middleNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&middleName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderBuyerType")) {
			jsonToValue(&type, node, "OrderBuyerType", "OrderBuyerType");
		} else {
			
			OrderBuyerType* obj = static_cast<OrderBuyerType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderBuyerBasicInfoDTO::OrderBuyerBasicInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderBuyerBasicInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLastName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lastNameKey = "lastName";
	json_object_set_member(pJsonObject, lastNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFirstName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *firstNameKey = "firstName";
	json_object_set_member(pJsonObject, firstNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMiddleName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *middleNameKey = "middleName";
	json_object_set_member(pJsonObject, middleNameKey, node);
	if (isprimitive("OrderBuyerType")) {
		OrderBuyerType obj = getType();
		node = converttoJson(&obj, "OrderBuyerType", "");
	}
	else {
		
		OrderBuyerType obj = static_cast<OrderBuyerType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrderBuyerBasicInfoDTO::getId()
{
	return id;
}

void
OrderBuyerBasicInfoDTO::setId(std::string  id)
{
	this->id = id;
}

std::string
OrderBuyerBasicInfoDTO::getLastName()
{
	return lastName;
}

void
OrderBuyerBasicInfoDTO::setLastName(std::string  lastName)
{
	this->lastName = lastName;
}

std::string
OrderBuyerBasicInfoDTO::getFirstName()
{
	return firstName;
}

void
OrderBuyerBasicInfoDTO::setFirstName(std::string  firstName)
{
	this->firstName = firstName;
}

std::string
OrderBuyerBasicInfoDTO::getMiddleName()
{
	return middleName;
}

void
OrderBuyerBasicInfoDTO::setMiddleName(std::string  middleName)
{
	this->middleName = middleName;
}

OrderBuyerType
OrderBuyerBasicInfoDTO::getType()
{
	return type;
}

void
OrderBuyerBasicInfoDTO::setType(OrderBuyerType  type)
{
	this->type = type;
}


