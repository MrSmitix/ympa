

#include "FeedStatusType.h"

using namespace Tiny;

FeedStatusType::FeedStatusType()
{
}

FeedStatusType::FeedStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedStatusType::~FeedStatusType()
{

}

void
FeedStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



