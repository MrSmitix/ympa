

#include "LogisticPickupPointDTO.h"

using namespace Tiny;

LogisticPickupPointDTO::LogisticPickupPointDTO()
{
	id = long(0);
	name = std::string();
	address = PickupAddressDTO();
	instruction = std::string();
	type = LogisticPointType();
	logisticPartnerId = long(0);
}

LogisticPickupPointDTO::LogisticPickupPointDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

LogisticPickupPointDTO::~LogisticPickupPointDTO()
{

}

void
LogisticPickupPointDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *addressKey = "address";

    if(object.has_key(addressKey))
    {
        bourne::json value = object[addressKey];




        PickupAddressDTO* obj = &address;
		obj->fromJson(value.dump());

    }

    const char *instructionKey = "instruction";

    if(object.has_key(instructionKey))
    {
        bourne::json value = object[instructionKey];



        jsonToValue(&instruction, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        LogisticPointType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *logisticPartnerIdKey = "logisticPartnerId";

    if(object.has_key(logisticPartnerIdKey))
    {
        bourne::json value = object[logisticPartnerIdKey];



        jsonToValue(&logisticPartnerId, value, "long");


    }


}

bourne::json
LogisticPickupPointDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["address"] = getAddress().toJson();





    object["instruction"] = getInstruction();







	object["type"] = getType().toJson();





    object["logisticPartnerId"] = getLogisticPartnerId();



    return object;

}

long
LogisticPickupPointDTO::getId()
{
	return id;
}

void
LogisticPickupPointDTO::setId(long  id)
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

long
LogisticPickupPointDTO::getLogisticPartnerId()
{
	return logisticPartnerId;
}

void
LogisticPickupPointDTO::setLogisticPartnerId(long  logisticPartnerId)
{
	this->logisticPartnerId = logisticPartnerId;
}



