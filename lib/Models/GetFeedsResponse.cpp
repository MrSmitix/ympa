

#include "GetFeedsResponse.h"

using namespace Tiny;

GetFeedsResponse::GetFeedsResponse()
{
	feeds = std::list<FeedDTO>();
}

GetFeedsResponse::GetFeedsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetFeedsResponse::~GetFeedsResponse()
{

}

void
GetFeedsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedsKey = "feeds";

    if(object.has_key(feedsKey))
    {
        bourne::json value = object[feedsKey];


        std::list<FeedDTO> feeds_list;
        FeedDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            feeds_list.push_back(element);
        }
        feeds = feeds_list;


    }


}

bourne::json
GetFeedsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FeedDTO> feeds_list = getFeeds();
    bourne::json feeds_arr = bourne::json::array();

    for(auto& var : feeds_list)
    {
        FeedDTO obj = var;
        feeds_arr.append(obj.toJson());
    }
    object["feeds"] = feeds_arr;




    return object;

}

std::list<FeedDTO>
GetFeedsResponse::getFeeds()
{
	return feeds;
}

void
GetFeedsResponse::setFeeds(std::list <FeedDTO> feeds)
{
	this->feeds = feeds;
}



