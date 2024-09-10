

#include "AcceptOrderCancellationRequest.h"

using namespace Tiny;

AcceptOrderCancellationRequest::AcceptOrderCancellationRequest()
{
	accepted = bool(false);
	reason = OrderCancellationReasonType();
}

AcceptOrderCancellationRequest::AcceptOrderCancellationRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AcceptOrderCancellationRequest::~AcceptOrderCancellationRequest()
{

}

void
AcceptOrderCancellationRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *acceptedKey = "accepted";

    if(object.has_key(acceptedKey))
    {
        bourne::json value = object[acceptedKey];



        jsonToValue(&accepted, value, "bool");


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];




        OrderCancellationReasonType* obj = &reason;
		obj->fromJson(value.dump());

    }


}

bourne::json
AcceptOrderCancellationRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["accepted"] = isAccepted();







	object["reason"] = getReason().toJson();


    return object;

}

bool
AcceptOrderCancellationRequest::isAccepted()
{
	return accepted;
}

void
AcceptOrderCancellationRequest::setAccepted(bool  accepted)
{
	this->accepted = accepted;
}

OrderCancellationReasonType
AcceptOrderCancellationRequest::getReason()
{
	return reason;
}

void
AcceptOrderCancellationRequest::setReason(OrderCancellationReasonType  reason)
{
	this->reason = reason;
}



