

#include "SetOrderDeliveryDateRequest.h"

using namespace Tiny;

SetOrderDeliveryDateRequest::SetOrderDeliveryDateRequest()
{
	dates = OrderDeliveryDateDTO();
	reason = OrderDeliveryDateReasonType();
}

SetOrderDeliveryDateRequest::SetOrderDeliveryDateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetOrderDeliveryDateRequest::~SetOrderDeliveryDateRequest()
{

}

void
SetOrderDeliveryDateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *datesKey = "dates";

    if(object.has_key(datesKey))
    {
        bourne::json value = object[datesKey];




        OrderDeliveryDateDTO* obj = &dates;
		obj->fromJson(value.dump());

    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];




        OrderDeliveryDateReasonType* obj = &reason;
		obj->fromJson(value.dump());

    }


}

bourne::json
SetOrderDeliveryDateRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["dates"] = getDates().toJson();






	object["reason"] = getReason().toJson();


    return object;

}

OrderDeliveryDateDTO
SetOrderDeliveryDateRequest::getDates()
{
	return dates;
}

void
SetOrderDeliveryDateRequest::setDates(OrderDeliveryDateDTO  dates)
{
	this->dates = dates;
}

OrderDeliveryDateReasonType
SetOrderDeliveryDateRequest::getReason()
{
	return reason;
}

void
SetOrderDeliveryDateRequest::setReason(OrderDeliveryDateReasonType  reason)
{
	this->reason = reason;
}



