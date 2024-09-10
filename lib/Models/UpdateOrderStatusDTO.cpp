

#include "UpdateOrderStatusDTO.h"

using namespace Tiny;

UpdateOrderStatusDTO::UpdateOrderStatusDTO()
{
	id = long(0);
	status = OrderStatusType();
	substatus = OrderSubstatusType();
	updateStatus = OrderUpdateStatusType();
	errorDetails = std::string();
}

UpdateOrderStatusDTO::UpdateOrderStatusDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStatusDTO::~UpdateOrderStatusDTO()
{

}

void
UpdateOrderStatusDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OrderStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *substatusKey = "substatus";

    if(object.has_key(substatusKey))
    {
        bourne::json value = object[substatusKey];




        OrderSubstatusType* obj = &substatus;
		obj->fromJson(value.dump());

    }

    const char *updateStatusKey = "updateStatus";

    if(object.has_key(updateStatusKey))
    {
        bourne::json value = object[updateStatusKey];




        OrderUpdateStatusType* obj = &updateStatus;
		obj->fromJson(value.dump());

    }

    const char *errorDetailsKey = "errorDetails";

    if(object.has_key(errorDetailsKey))
    {
        bourne::json value = object[errorDetailsKey];



        jsonToValue(&errorDetails, value, "std::string");


    }


}

bourne::json
UpdateOrderStatusDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["status"] = getStatus().toJson();






	object["substatus"] = getSubstatus().toJson();






	object["updateStatus"] = getUpdateStatus().toJson();





    object["errorDetails"] = getErrorDetails();



    return object;

}

long
UpdateOrderStatusDTO::getId()
{
	return id;
}

void
UpdateOrderStatusDTO::setId(long  id)
{
	this->id = id;
}

OrderStatusType
UpdateOrderStatusDTO::getStatus()
{
	return status;
}

void
UpdateOrderStatusDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
UpdateOrderStatusDTO::getSubstatus()
{
	return substatus;
}

void
UpdateOrderStatusDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}

OrderUpdateStatusType
UpdateOrderStatusDTO::getUpdateStatus()
{
	return updateStatus;
}

void
UpdateOrderStatusDTO::setUpdateStatus(OrderUpdateStatusType  updateStatus)
{
	this->updateStatus = updateStatus;
}

std::string
UpdateOrderStatusDTO::getErrorDetails()
{
	return errorDetails;
}

void
UpdateOrderStatusDTO::setErrorDetails(std::string  errorDetails)
{
	this->errorDetails = errorDetails;
}



