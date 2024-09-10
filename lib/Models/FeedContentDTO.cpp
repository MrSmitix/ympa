

#include "FeedContentDTO.h"

using namespace Tiny;

FeedContentDTO::FeedContentDTO()
{
	rejectedOffersCount = long(0);
	status = FeedStatusType();
	totalOffersCount = long(0);
	error = FeedContentErrorDTO();
}

FeedContentDTO::FeedContentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedContentDTO::~FeedContentDTO()
{

}

void
FeedContentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rejectedOffersCountKey = "rejectedOffersCount";

    if(object.has_key(rejectedOffersCountKey))
    {
        bourne::json value = object[rejectedOffersCountKey];



        jsonToValue(&rejectedOffersCount, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        FeedStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *totalOffersCountKey = "totalOffersCount";

    if(object.has_key(totalOffersCountKey))
    {
        bourne::json value = object[totalOffersCountKey];



        jsonToValue(&totalOffersCount, value, "long");


    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        FeedContentErrorDTO* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedContentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["rejectedOffersCount"] = getRejectedOffersCount();







	object["status"] = getStatus().toJson();





    object["totalOffersCount"] = getTotalOffersCount();







	object["error"] = getError().toJson();


    return object;

}

long
FeedContentDTO::getRejectedOffersCount()
{
	return rejectedOffersCount;
}

void
FeedContentDTO::setRejectedOffersCount(long  rejectedOffersCount)
{
	this->rejectedOffersCount = rejectedOffersCount;
}

FeedStatusType
FeedContentDTO::getStatus()
{
	return status;
}

void
FeedContentDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

long
FeedContentDTO::getTotalOffersCount()
{
	return totalOffersCount;
}

void
FeedContentDTO::setTotalOffersCount(long  totalOffersCount)
{
	this->totalOffersCount = totalOffersCount;
}

FeedContentErrorDTO
FeedContentDTO::getError()
{
	return error;
}

void
FeedContentDTO::setError(FeedContentErrorDTO  error)
{
	this->error = error;
}



