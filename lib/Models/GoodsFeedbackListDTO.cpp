

#include "GoodsFeedbackListDTO.h"

using namespace Tiny;

GoodsFeedbackListDTO::GoodsFeedbackListDTO()
{
	feedbacks = std::list<GoodsFeedbackDTO>();
	paging = ForwardScrollingPagerDTO();
}

GoodsFeedbackListDTO::GoodsFeedbackListDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackListDTO::~GoodsFeedbackListDTO()
{

}

void
GoodsFeedbackListDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedbacksKey = "feedbacks";

    if(object.has_key(feedbacksKey))
    {
        bourne::json value = object[feedbacksKey];


        std::list<GoodsFeedbackDTO> feedbacks_list;
        GoodsFeedbackDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            feedbacks_list.push_back(element);
        }
        feedbacks = feedbacks_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoodsFeedbackListDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<GoodsFeedbackDTO> feedbacks_list = getFeedbacks();
    bourne::json feedbacks_arr = bourne::json::array();

    for(auto& var : feedbacks_list)
    {
        GoodsFeedbackDTO obj = var;
        feedbacks_arr.append(obj.toJson());
    }
    object["feedbacks"] = feedbacks_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<GoodsFeedbackDTO>
GoodsFeedbackListDTO::getFeedbacks()
{
	return feedbacks;
}

void
GoodsFeedbackListDTO::setFeedbacks(std::list <GoodsFeedbackDTO> feedbacks)
{
	this->feedbacks = feedbacks;
}

ForwardScrollingPagerDTO
GoodsFeedbackListDTO::getPaging()
{
	return paging;
}

void
GoodsFeedbackListDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



