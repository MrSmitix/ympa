

#include "GetFeedResponse.h"

using namespace Tiny;

GetFeedResponse::GetFeedResponse()
{
	feed = FeedDTO();
}

GetFeedResponse::GetFeedResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetFeedResponse::~GetFeedResponse()
{

}

void
GetFeedResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedKey = "feed";

    if(object.has_key(feedKey))
    {
        bourne::json value = object[feedKey];




        FeedDTO* obj = &feed;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetFeedResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["feed"] = getFeed().toJson();


    return object;

}

FeedDTO
GetFeedResponse::getFeed()
{
	return feed;
}

void
GetFeedResponse::setFeed(FeedDTO  feed)
{
	this->feed = feed;
}



