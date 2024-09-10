

#include "UpdateGoodsFeedbackCommentRequest.h"

using namespace Tiny;

UpdateGoodsFeedbackCommentRequest::UpdateGoodsFeedbackCommentRequest()
{
	feedbackId = long(0);
	comment = UpdateGoodsFeedbackCommentDTO();
}

UpdateGoodsFeedbackCommentRequest::UpdateGoodsFeedbackCommentRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateGoodsFeedbackCommentRequest::~UpdateGoodsFeedbackCommentRequest()
{

}

void
UpdateGoodsFeedbackCommentRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedbackIdKey = "feedbackId";

    if(object.has_key(feedbackIdKey))
    {
        bourne::json value = object[feedbackIdKey];



        jsonToValue(&feedbackId, value, "long");


    }

    const char *commentKey = "comment";

    if(object.has_key(commentKey))
    {
        bourne::json value = object[commentKey];




        UpdateGoodsFeedbackCommentDTO* obj = &comment;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateGoodsFeedbackCommentRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["feedbackId"] = getFeedbackId();







	object["comment"] = getComment().toJson();


    return object;

}

long
UpdateGoodsFeedbackCommentRequest::getFeedbackId()
{
	return feedbackId;
}

void
UpdateGoodsFeedbackCommentRequest::setFeedbackId(long  feedbackId)
{
	this->feedbackId = feedbackId;
}

UpdateGoodsFeedbackCommentDTO
UpdateGoodsFeedbackCommentRequest::getComment()
{
	return comment;
}

void
UpdateGoodsFeedbackCommentRequest::setComment(UpdateGoodsFeedbackCommentDTO  comment)
{
	this->comment = comment;
}



