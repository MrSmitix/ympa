

#include "GoodsFeedbackCommentStatusType.h"

using namespace Tiny;

GoodsFeedbackCommentStatusType::GoodsFeedbackCommentStatusType()
{
}

GoodsFeedbackCommentStatusType::GoodsFeedbackCommentStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackCommentStatusType::~GoodsFeedbackCommentStatusType()
{

}

void
GoodsFeedbackCommentStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
GoodsFeedbackCommentStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



