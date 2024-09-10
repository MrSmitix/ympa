

#include "GoodsFeedbackCommentDTO.h"

using namespace Tiny;

GoodsFeedbackCommentDTO::GoodsFeedbackCommentDTO()
{
	id = long(0);
	text = std::string();
	canModify = bool(false);
	parentId = long(0);
	author = GoodsFeedbackCommentAuthorDTO();
	status = GoodsFeedbackCommentStatusType();
}

GoodsFeedbackCommentDTO::GoodsFeedbackCommentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackCommentDTO::~GoodsFeedbackCommentDTO()
{

}

void
GoodsFeedbackCommentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *canModifyKey = "canModify";

    if(object.has_key(canModifyKey))
    {
        bourne::json value = object[canModifyKey];



        jsonToValue(&canModify, value, "bool");


    }

    const char *parentIdKey = "parentId";

    if(object.has_key(parentIdKey))
    {
        bourne::json value = object[parentIdKey];



        jsonToValue(&parentId, value, "long");


    }

    const char *authorKey = "author";

    if(object.has_key(authorKey))
    {
        bourne::json value = object[authorKey];




        GoodsFeedbackCommentAuthorDTO* obj = &author;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        GoodsFeedbackCommentStatusType* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoodsFeedbackCommentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["text"] = getText();






    object["canModify"] = isCanModify();






    object["parentId"] = getParentId();







	object["author"] = getAuthor().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

long
GoodsFeedbackCommentDTO::getId()
{
	return id;
}

void
GoodsFeedbackCommentDTO::setId(long  id)
{
	this->id = id;
}

std::string
GoodsFeedbackCommentDTO::getText()
{
	return text;
}

void
GoodsFeedbackCommentDTO::setText(std::string  text)
{
	this->text = text;
}

bool
GoodsFeedbackCommentDTO::isCanModify()
{
	return canModify;
}

void
GoodsFeedbackCommentDTO::setCanModify(bool  canModify)
{
	this->canModify = canModify;
}

long
GoodsFeedbackCommentDTO::getParentId()
{
	return parentId;
}

void
GoodsFeedbackCommentDTO::setParentId(long  parentId)
{
	this->parentId = parentId;
}

GoodsFeedbackCommentAuthorDTO
GoodsFeedbackCommentDTO::getAuthor()
{
	return author;
}

void
GoodsFeedbackCommentDTO::setAuthor(GoodsFeedbackCommentAuthorDTO  author)
{
	this->author = author;
}

GoodsFeedbackCommentStatusType
GoodsFeedbackCommentDTO::getStatus()
{
	return status;
}

void
GoodsFeedbackCommentDTO::setStatus(GoodsFeedbackCommentStatusType  status)
{
	this->status = status;
}



