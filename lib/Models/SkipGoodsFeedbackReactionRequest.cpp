

#include "SkipGoodsFeedbackReactionRequest.h"

using namespace Tiny;

SkipGoodsFeedbackReactionRequest::SkipGoodsFeedbackReactionRequest()
{
	feedbackIds = std::list<long>();
}

SkipGoodsFeedbackReactionRequest::SkipGoodsFeedbackReactionRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SkipGoodsFeedbackReactionRequest::~SkipGoodsFeedbackReactionRequest()
{

}

void
SkipGoodsFeedbackReactionRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedbackIdsKey = "feedbackIds";

    if(object.has_key(feedbackIdsKey))
    {
        bourne::json value = object[feedbackIdsKey];


        std::list<long> feedbackIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            feedbackIds_list.push_back(element);
        }
        feedbackIds = feedbackIds_list;


    }


}

bourne::json
SkipGoodsFeedbackReactionRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> feedbackIds_list = getFeedbackIds();
    bourne::json feedbackIds_arr = bourne::json::array();

    for(auto& var : feedbackIds_list)
    {
        feedbackIds_arr.append(var);
    }
    object["feedbackIds"] = feedbackIds_arr;






    return object;

}

Set<long>
SkipGoodsFeedbackReactionRequest::getFeedbackIds()
{
	return feedbackIds;
}

void
SkipGoodsFeedbackReactionRequest::setFeedbackIds(Set <long> feedbackIds)
{
	this->feedbackIds = feedbackIds;
}



