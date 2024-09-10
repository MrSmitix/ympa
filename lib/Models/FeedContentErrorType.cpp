

#include "FeedContentErrorType.h"

using namespace Tiny;

FeedContentErrorType::FeedContentErrorType()
{
}

FeedContentErrorType::FeedContentErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedContentErrorType::~FeedContentErrorType()
{

}

void
FeedContentErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedContentErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



