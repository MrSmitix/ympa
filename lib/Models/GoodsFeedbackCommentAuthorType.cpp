

#include "GoodsFeedbackCommentAuthorType.h"

using namespace Tiny;

GoodsFeedbackCommentAuthorType::GoodsFeedbackCommentAuthorType()
{
}

GoodsFeedbackCommentAuthorType::GoodsFeedbackCommentAuthorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackCommentAuthorType::~GoodsFeedbackCommentAuthorType()
{

}

void
GoodsFeedbackCommentAuthorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
GoodsFeedbackCommentAuthorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



