

#include "FeedbackCommentAuthorType.h"

using namespace Tiny;

FeedbackCommentAuthorType::FeedbackCommentAuthorType()
{
}

FeedbackCommentAuthorType::FeedbackCommentAuthorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackCommentAuthorType::~FeedbackCommentAuthorType()
{

}

void
FeedbackCommentAuthorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedbackCommentAuthorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



