

#include "OrderDigitalItemDTO.h"

using namespace Tiny;

OrderDigitalItemDTO::OrderDigitalItemDTO()
{
	id = long(0);
	code = std::string();
	slip = std::string();
	activate_till = std::string();
}

OrderDigitalItemDTO::OrderDigitalItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDigitalItemDTO::~OrderDigitalItemDTO()
{

}

void
OrderDigitalItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }

    const char *slipKey = "slip";

    if(object.has_key(slipKey))
    {
        bourne::json value = object[slipKey];



        jsonToValue(&slip, value, "std::string");


    }

    const char *activate_tillKey = "activate_till";

    if(object.has_key(activate_tillKey))
    {
        bourne::json value = object[activate_tillKey];




        Date* obj = &activate_till;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderDigitalItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["code"] = getCode();






    object["slip"] = getSlip();







	object["activate_till"] = getActivateTill().toJson();


    return object;

}

long
OrderDigitalItemDTO::getId()
{
	return id;
}

void
OrderDigitalItemDTO::setId(long  id)
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



