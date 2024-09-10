

#include "FeedbackCommentDTO.h"

using namespace Tiny;

FeedbackCommentDTO::FeedbackCommentDTO()
{
	id = long(0);
	parentId = long(0);
	body = std::string();
	createdAt = std::string();
	updatedAt = std::string();
	author = FeedbackCommentAuthorDTO();
	children = std::list<FeedbackCommentDTO>();
}

FeedbackCommentDTO::FeedbackCommentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackCommentDTO::~FeedbackCommentDTO()
{

}

void
FeedbackCommentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *parentIdKey = "parentId";

    if(object.has_key(parentIdKey))
    {
        bourne::json value = object[parentIdKey];



        jsonToValue(&parentId, value, "long");


    }

    const char *bodyKey = "body";

    if(object.has_key(bodyKey))
    {
        bourne::json value = object[bodyKey];



        jsonToValue(&body, value, "std::string");


    }

    const char *createdAtKey = "createdAt";

    if(object.has_key(createdAtKey))
    {
        bourne::json value = object[createdAtKey];



        jsonToValue(&createdAt, value, "std::string");


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }

    const char *authorKey = "author";

    if(object.has_key(authorKey))
    {
        bourne::json value = object[authorKey];




        FeedbackCommentAuthorDTO* obj = &author;
		obj->fromJson(value.dump());

    }

    const char *childrenKey = "children";

    if(object.has_key(childrenKey))
    {
        bourne::json value = object[childrenKey];


        std::list<FeedbackCommentDTO> children_list;
        FeedbackCommentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            children_list.push_back(element);
        }
        children = children_list;


    }


}

bourne::json
FeedbackCommentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["parentId"] = getParentId();






    object["body"] = getBody();






    object["createdAt"] = getCreatedAt();






    object["updatedAt"] = getUpdatedAt();







	object["author"] = getAuthor().toJson();




    std::list<FeedbackCommentDTO> children_list = getChildren();
    bourne::json children_arr = bourne::json::array();

    for(auto& var : children_list)
    {
        FeedbackCommentDTO obj = var;
        children_arr.append(obj.toJson());
    }
    object["children"] = children_arr;




    return object;

}

long
FeedbackCommentDTO::getId()
{
	return id;
}

void
FeedbackCommentDTO::setId(long  id)
{
	this->id = id;
}

long
FeedbackCommentDTO::getParentId()
{
	return parentId;
}

void
FeedbackCommentDTO::setParentId(long  parentId)
{
	this->parentId = parentId;
}

std::string
FeedbackCommentDTO::getBody()
{
	return body;
}

void
FeedbackCommentDTO::setBody(std::string  body)
{
	this->body = body;
}

std::string
FeedbackCommentDTO::getCreatedAt()
{
	return createdAt;
}

void
FeedbackCommentDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
FeedbackCommentDTO::getUpdatedAt()
{
	return updatedAt;
}

void
FeedbackCommentDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}

FeedbackCommentAuthorDTO
FeedbackCommentDTO::getAuthor()
{
	return author;
}

void
FeedbackCommentDTO::setAuthor(FeedbackCommentAuthorDTO  author)
{
	this->author = author;
}

std::list<FeedbackCommentDTO>
FeedbackCommentDTO::getChildren()
{
	return children;
}

void
FeedbackCommentDTO::setChildren(std::list <FeedbackCommentDTO> children)
{
	this->children = children;
}



