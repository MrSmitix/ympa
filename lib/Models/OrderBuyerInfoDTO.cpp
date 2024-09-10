

#include "OrderBuyerInfoDTO.h"

using namespace Tiny;

OrderBuyerInfoDTO::OrderBuyerInfoDTO()
{
	id = std::string();
	lastName = std::string();
	firstName = std::string();
	middleName = std::string();
	type = OrderBuyerType();
	phone = std::string();
}

OrderBuyerInfoDTO::OrderBuyerInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBuyerInfoDTO::~OrderBuyerInfoDTO()
{

}

void
OrderBuyerInfoDTO::fromJson(std::string jsonObj)
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

    const char *phoneKey = "phone";

    if(object.has_key(phoneKey))
    {
        bourne::json value = object[phoneKey];



        jsonToValue(&phone, value, "std::string");


    }


}

bourne::json
OrderBuyerInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["lastName"] = getLastName();






    object["firstName"] = getFirstName();






    object["middleName"] = getMiddleName();







	object["type"] = getType().toJson();





    object["phone"] = getPhone();



    return object;

}

std::string
OrderBuyerInfoDTO::getId()
{
	return id;
}

void
OrderBuyerInfoDTO::setId(std::string  id)
{
	this->id = id;
}

std::string
OrderBuyerInfoDTO::getLastName()
{
	return lastName;
}

void
OrderBuyerInfoDTO::setLastName(std::string  lastName)
{
	this->lastName = lastName;
}

std::string
OrderBuyerInfoDTO::getFirstName()
{
	return firstName;
}

void
OrderBuyerInfoDTO::setFirstName(std::string  firstName)
{
	this->firstName = firstName;
}

std::string
OrderBuyerInfoDTO::getMiddleName()
{
	return middleName;
}

void
OrderBuyerInfoDTO::setMiddleName(std::string  middleName)
{
	this->middleName = middleName;
}

OrderBuyerType
OrderBuyerInfoDTO::getType()
{
	return type;
}

void
OrderBuyerInfoDTO::setType(OrderBuyerType  type)
{
	this->type = type;
}

std::string
OrderBuyerInfoDTO::getPhone()
{
	return phone;
}

void
OrderBuyerInfoDTO::setPhone(std::string  phone)
{
	this->phone = phone;
}



