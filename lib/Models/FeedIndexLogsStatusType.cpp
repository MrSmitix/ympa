

#include "FeedIndexLogsStatusType.h"

using namespace Tiny;

FeedIndexLogsStatusType::FeedIndexLogsStatusType()
{
}

FeedIndexLogsStatusType::FeedIndexLogsStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsStatusType::~FeedIndexLogsStatusType()
{

}

void
FeedIndexLogsStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedIndexLogsStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



