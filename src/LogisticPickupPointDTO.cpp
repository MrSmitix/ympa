#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LogisticPickupPointDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LogisticPickupPointDTO::LogisticPickupPointDTO()
{
	//__init();
}

LogisticPickupPointDTO::~LogisticPickupPointDTO()
{
	//__cleanup();
}

void
LogisticPickupPointDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//address = new PickupAddressDTO();
	//instruction = std::string();
	//type = new LogisticPointType();
	//logisticPartnerId = long(0);
}

void
LogisticPickupPointDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(instruction != NULL) {
	//
	//delete instruction;
	//instruction = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(logisticPartnerId != NULL) {
	//
	//delete logisticPartnerId;
	//logisticPartnerId = NULL;
	//}
	//
}

void
LogisticPickupPointDTO::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("PickupAddressDTO")) {
			jsonToValue(&address, node, "PickupAddressDTO", "PickupAddressDTO");
		} else {
			
			PickupAddressDTO* obj = static_cast<PickupAddressDTO*> (&address);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *instructionKey = "instruction";
	node = json_object_get_member(pJsonObject, instructionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&instruction, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("LogisticPointType")) {
			jsonToValue(&type, node, "LogisticPointType", "LogisticPointType");
		} else {
			
			LogisticPointType* obj = static_cast<LogisticPointType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logisticPartnerIdKey = "logisticPartnerId";
	node = json_object_get_member(pJsonObject, logisticPartnerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&logisticPartnerId, node, "long long", "");
		} else {
			
		}
	}
}

LogisticPickupPointDTO::LogisticPickupPointDTO(char* json)
{
	this->fromJson(json);
}

char*
LogisticPickupPointDTO::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("PickupAddressDTO")) {
		PickupAddressDTO obj = getAddress();
		node = converttoJson(&obj, "PickupAddressDTO", "");
	}
	else {
		
		PickupAddressDTO obj = static_cast<PickupAddressDTO> (getAddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInstruction();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *instructionKey = "instruction";
	json_object_set_member(pJsonObject, instructionKey, node);
	if (isprimitive("LogisticPointType")) {
		LogisticPointType obj = getType();
		node = converttoJson(&obj, "LogisticPointType", "");
	}
	else {
		
		LogisticPointType obj = static_cast<LogisticPointType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getLogisticPartnerId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *logisticPartnerIdKey = "logisticPartnerId";
	json_object_set_member(pJsonObject, logisticPartnerIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
LogisticPickupPointDTO::getId()
{
	return id;
}

void
LogisticPickupPointDTO::setId(long long  id)
{
	this->id = id;
}

std::string
LogisticPickupPointDTO::getName()
{
	return name;
}

void
LogisticPickupPointDTO::setName(std::string  name)
{
	this->name = name;
}

PickupAddressDTO
LogisticPickupPointDTO::getAddress()
{
	return address;
}

void
LogisticPickupPointDTO::setAddress(PickupAddressDTO  address)
{
	this->address = address;
}

std::string
LogisticPickupPointDTO::getInstruction()
{
	return instruction;
}

void
LogisticPickupPointDTO::setInstruction(std::string  instruction)
{
	this->instruction = instruction;
}

LogisticPointType
LogisticPickupPointDTO::getType()
{
	return type;
}

void
LogisticPickupPointDTO::setType(LogisticPointType  type)
{
	this->type = type;
}

long long
LogisticPickupPointDTO::getLogisticPartnerId()
{
	return logisticPartnerId;
}

void
LogisticPickupPointDTO::setLogisticPartnerId(long long  logisticPartnerId)
{
	this->logisticPartnerId = logisticPartnerId;
}


