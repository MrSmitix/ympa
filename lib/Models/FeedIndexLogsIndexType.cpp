

#include "FeedIndexLogsIndexType.h"

using namespace Tiny;

FeedIndexLogsIndexType::FeedIndexLogsIndexType()
{
}

FeedIndexLogsIndexType::FeedIndexLogsIndexType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsIndexType::~FeedIndexLogsIndexType()
{

}

void
FeedIndexLogsIndexType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedIndexLogsIndexType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



