

#include "FeedIndexLogsErrorType.h"

using namespace Tiny;

FeedIndexLogsErrorType::FeedIndexLogsErrorType()
{
}

FeedIndexLogsErrorType::FeedIndexLogsErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsErrorType::~FeedIndexLogsErrorType()
{

}

void
FeedIndexLogsErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedIndexLogsErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



