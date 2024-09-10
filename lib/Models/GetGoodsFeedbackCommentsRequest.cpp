

#include "GetGoodsFeedbackCommentsRequest.h"

using namespace Tiny;

GetGoodsFeedbackCommentsRequest::GetGoodsFeedbackCommentsRequest()
{
	feedbackId = long(0);
}

GetGoodsFeedbackCommentsRequest::GetGoodsFeedbackCommentsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetGoodsFeedbackCommentsRequest::~GetGoodsFeedbackCommentsRequest()
{

}

void
GetGoodsFeedbackCommentsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedbackIdKey = "feedbackId";

    if(object.has_key(feedbackIdKey))
    {
        bourne::json value = object[feedbackIdKey];



        jsonToValue(&feedbackId, value, "long");


    }


}

bourne::json
GetGoodsFeedbackCommentsRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["feedbackId"] = getFeedbackId();



    return object;

}

long
GetGoodsFeedbackCommentsRequest::getFeedbackId()
{
	return feedbackId;
}

void
GetGoodsFeedbackCommentsRequest::setFeedbackId(long  feedbackId)
{
	this->feedbackId = feedbackId;
}



