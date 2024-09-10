

#include "GoodsFeedbackCommentListDTO.h"

using namespace Tiny;

GoodsFeedbackCommentListDTO::GoodsFeedbackCommentListDTO()
{
	comments = std::list<GoodsFeedbackCommentDTO>();
	paging = ForwardScrollingPagerDTO();
}

GoodsFeedbackCommentListDTO::GoodsFeedbackCommentListDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackCommentListDTO::~GoodsFeedbackCommentListDTO()
{

}

void
GoodsFeedbackCommentListDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *commentsKey = "comments";

    if(object.has_key(commentsKey))
    {
        bourne::json value = object[commentsKey];


        std::list<GoodsFeedbackCommentDTO> comments_list;
        GoodsFeedbackCommentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            comments_list.push_back(element);
        }
        comments = comments_list;


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
GoodsFeedbackCommentListDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<GoodsFeedbackCommentDTO> comments_list = getComments();
    bourne::json comments_arr = bourne::json::array();

    for(auto& var : comments_list)
    {
        GoodsFeedbackCommentDTO obj = var;
        comments_arr.append(obj.toJson());
    }
    object["comments"] = comments_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<GoodsFeedbackCommentDTO>
GoodsFeedbackCommentListDTO::getComments()
{
	return comments;
}

void
GoodsFeedbackCommentListDTO::setComments(std::list <GoodsFeedbackCommentDTO> comments)
{
	this->comments = comments;
}

ForwardScrollingPagerDTO
GoodsFeedbackCommentListDTO::getPaging()
{
	return paging;
}

void
GoodsFeedbackCommentListDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



