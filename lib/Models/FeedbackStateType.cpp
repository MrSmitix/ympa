

#include "FeedbackStateType.h"

using namespace Tiny;

FeedbackStateType::FeedbackStateType()
{
}

FeedbackStateType::FeedbackStateType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackStateType::~FeedbackStateType()
{

}

void
FeedbackStateType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedbackStateType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



