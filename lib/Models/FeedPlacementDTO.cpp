

#include "FeedPlacementDTO.h"

using namespace Tiny;

FeedPlacementDTO::FeedPlacementDTO()
{
	status = FeedStatusType();
	totalOffersCount = int(0);
}

FeedPlacementDTO::FeedPlacementDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedPlacementDTO::~FeedPlacementDTO()
{

}

void
FeedPlacementDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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



        jsonToValue(&totalOffersCount, value, "int");


    }


}

bourne::json
FeedPlacementDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();





    object["totalOffersCount"] = getTotalOffersCount();



    return object;

}

FeedStatusType
FeedPlacementDTO::getStatus()
{
	return status;
}

void
FeedPlacementDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

int
FeedPlacementDTO::getTotalOffersCount()
{
	return totalOffersCount;
}

void
FeedPlacementDTO::setTotalOffersCount(int  totalOffersCount)
{
	this->totalOffersCount = totalOffersCount;
}



