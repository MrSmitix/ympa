

#include "FeedbackReactionStatusType.h"

using namespace Tiny;

FeedbackReactionStatusType::FeedbackReactionStatusType()
{
}

FeedbackReactionStatusType::FeedbackReactionStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackReactionStatusType::~FeedbackReactionStatusType()
{

}

void
FeedbackReactionStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedbackReactionStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



