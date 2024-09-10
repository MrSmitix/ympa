

#include "OrderBuyerDTO.h"

using namespace Tiny;

OrderBuyerDTO::OrderBuyerDTO()
{
	id = std::string();
	lastName = std::string();
	firstName = std::string();
	middleName = std::string();
	type = OrderBuyerType();
}

OrderBuyerDTO::OrderBuyerDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBuyerDTO::~OrderBuyerDTO()
{

}

void
OrderBuyerDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *lastNameKey = "lastName";

    if(object.has_key(lastNameKey))
    {
        bourne::json value = object[lastNameKey];



        jsonToValue(&lastName, value, "std::string");


    }

    const char *firstNameKey = "firstName";

    if(object.has_key(firstNameKey))
    {
        bourne::json value = object[firstNameKey];



        jsonToValue(&firstName, value, "std::string");


    }

    const char *middleNameKey = "middleName";

    if(object.has_key(middleNameKey))
    {
        bourne::json value = object[middleNameKey];



        jsonToValue(&middleName, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrderBuyerType* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderBuyerDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["lastName"] = getLastName();






    object["firstName"] = getFirstName();






    object["middleName"] = getMiddleName();







	object["type"] = getType().toJson();


    return object;

}

std::string
OrderBuyerDTO::getId()
{
	return id;
}

void
OrderBuyerDTO::setId(std::string  id)
{
	this->id = id;
}

std::string
OrderBuyerDTO::getLastName()
{
	return lastName;
}

void
OrderBuyerDTO::setLastName(std::string  lastName)
{
	this->lastName = lastName;
}

std::string
OrderBuyerDTO::getFirstName()
{
	return firstName;
}

void
OrderBuyerDTO::setFirstName(std::string  firstName)
{
	this->firstName = firstName;
}

std::string
OrderBuyerDTO::getMiddleName()
{
	return middleName;
}

void
OrderBuyerDTO::setMiddleName(std::string  middleName)
{
	this->middleName = middleName;
}

OrderBuyerType
OrderBuyerDTO::getType()
{
	return type;
}

void
OrderBuyerDTO::setType(OrderBuyerType  type)
{
	this->type = type;
}



