

#include "OrderDeliveryDateDTO.h"

using namespace Tiny;

OrderDeliveryDateDTO::OrderDeliveryDateDTO()
{
	toDate = std::string();
}

OrderDeliveryDateDTO::OrderDeliveryDateDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryDateDTO::~OrderDeliveryDateDTO()
{

}

void
OrderDeliveryDateDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *toDateKey = "toDate";

    if(object.has_key(toDateKey))
    {
        bourne::json value = object[toDateKey];




        Date* obj = &toDate;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderDeliveryDateDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["toDate"] = getToDate().toJson();


    return object;

}

Date
OrderDeliveryDateDTO::getToDate()
{
	return toDate;
}

void
OrderDeliveryDateDTO::setToDate(Date  toDate)
{
	this->toDate = toDate;
}



