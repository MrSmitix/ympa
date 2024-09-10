

#include "FeedIndexLogsOffersDTO.h"

using namespace Tiny;

FeedIndexLogsOffersDTO::FeedIndexLogsOffersDTO()
{
	rejectedCount = long(0);
	totalCount = long(0);
}

FeedIndexLogsOffersDTO::FeedIndexLogsOffersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsOffersDTO::~FeedIndexLogsOffersDTO()
{

}

void
FeedIndexLogsOffersDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rejectedCountKey = "rejectedCount";

    if(object.has_key(rejectedCountKey))
    {
        bourne::json value = object[rejectedCountKey];



        jsonToValue(&rejectedCount, value, "long");


    }

    const char *totalCountKey = "totalCount";

    if(object.has_key(totalCountKey))
    {
        bourne::json value = object[totalCountKey];



        jsonToValue(&totalCount, value, "long");


    }


}

bourne::json
FeedIndexLogsOffersDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["rejectedCount"] = getRejectedCount();






    object["totalCount"] = getTotalCount();



    return object;

}

long
FeedIndexLogsOffersDTO::getRejectedCount()
{
	return rejectedCount;
}

void
FeedIndexLogsOffersDTO::setRejectedCount(long  rejectedCount)
{
	this->rejectedCount = rejectedCount;
}

long
FeedIndexLogsOffersDTO::getTotalCount()
{
	return totalCount;
}

void
FeedIndexLogsOffersDTO::setTotalCount(long  totalCount)
{
	this->totalCount = totalCount;
}



