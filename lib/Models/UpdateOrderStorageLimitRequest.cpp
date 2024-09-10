

#include "UpdateOrderStorageLimitRequest.h"

using namespace Tiny;

UpdateOrderStorageLimitRequest::UpdateOrderStorageLimitRequest()
{
	newDate = std::string();
}

UpdateOrderStorageLimitRequest::UpdateOrderStorageLimitRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOrderStorageLimitRequest::~UpdateOrderStorageLimitRequest()
{

}

void
UpdateOrderStorageLimitRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *newDateKey = "newDate";

    if(object.has_key(newDateKey))
    {
        bourne::json value = object[newDateKey];




        Date* obj = &newDate;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOrderStorageLimitRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["newDate"] = getNewDate().toJson();


    return object;

}

Date
UpdateOrderStorageLimitRequest::getNewDate()
{
	return newDate;
}

void
UpdateOrderStorageLimitRequest::setNewDate(Date  newDate)
{
	this->newDate = newDate;
}



