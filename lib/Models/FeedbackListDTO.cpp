

#include "FeedbackListDTO.h"

using namespace Tiny;

FeedbackListDTO::FeedbackListDTO()
{
	paging = ScrollingPagerDTO();
	feedbackList = std::list<FeedbackDTO>();
}

FeedbackListDTO::FeedbackListDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackListDTO::~FeedbackListDTO()
{

}

void
FeedbackListDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *feedbackListKey = "feedbackList";

    if(object.has_key(feedbackListKey))
    {
        bourne::json value = object[feedbackListKey];


        std::list<FeedbackDTO> feedbackList_list;
        FeedbackDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            feedbackList_list.push_back(element);
        }
        feedbackList = feedbackList_list;


    }


}

bourne::json
FeedbackListDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<FeedbackDTO> feedbackList_list = getFeedbackList();
    bourne::json feedbackList_arr = bourne::json::array();

    for(auto& var : feedbackList_list)
    {
        FeedbackDTO obj = var;
        feedbackList_arr.append(obj.toJson());
    }
    object["feedbackList"] = feedbackList_arr;




    return object;

}

ScrollingPagerDTO
FeedbackListDTO::getPaging()
{
	return paging;
}

void
FeedbackListDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<FeedbackDTO>
FeedbackListDTO::getFeedbackList()
{
	return feedbackList;
}

void
FeedbackListDTO::setFeedbackList(std::list <FeedbackDTO> feedbackList)
{
	this->feedbackList = feedbackList;
}



