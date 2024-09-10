

#include "OrderCourierDTO.h"

using namespace Tiny;

OrderCourierDTO::OrderCourierDTO()
{
	fullName = std::string();
	phone = std::string();
	phoneExtension = std::string();
	vehicleNumber = std::string();
	vehicleDescription = std::string();
}

OrderCourierDTO::OrderCourierDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderCourierDTO::~OrderCourierDTO()
{

}

void
OrderCourierDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fullNameKey = "fullName";

    if(object.has_key(fullNameKey))
    {
        bourne::json value = object[fullNameKey];



        jsonToValue(&fullName, value, "std::string");


    }

    const char *phoneKey = "phone";

    if(object.has_key(phoneKey))
    {
        bourne::json value = object[phoneKey];



        jsonToValue(&phone, value, "std::string");


    }

    const char *phoneExtensionKey = "phoneExtension";

    if(object.has_key(phoneExtensionKey))
    {
        bourne::json value = object[phoneExtensionKey];



        jsonToValue(&phoneExtension, value, "std::string");


    }

    const char *vehicleNumberKey = "vehicleNumber";

    if(object.has_key(vehicleNumberKey))
    {
        bourne::json value = object[vehicleNumberKey];



        jsonToValue(&vehicleNumber, value, "std::string");


    }

    const char *vehicleDescriptionKey = "vehicleDescription";

    if(object.has_key(vehicleDescriptionKey))
    {
        bourne::json value = object[vehicleDescriptionKey];



        jsonToValue(&vehicleDescription, value, "std::string");


    }


}

bourne::json
OrderCourierDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["fullName"] = getFullName();






    object["phone"] = getPhone();






    object["phoneExtension"] = getPhoneExtension();






    object["vehicleNumber"] = getVehicleNumber();






    object["vehicleDescription"] = getVehicleDescription();



    return object;

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



