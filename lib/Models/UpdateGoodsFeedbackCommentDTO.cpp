

#include "UpdateGoodsFeedbackCommentDTO.h"

using namespace Tiny;

UpdateGoodsFeedbackCommentDTO::UpdateGoodsFeedbackCommentDTO()
{
	id = long(0);
	parentId = long(0);
	text = std::string();
}

UpdateGoodsFeedbackCommentDTO::UpdateGoodsFeedbackCommentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateGoodsFeedbackCommentDTO::~UpdateGoodsFeedbackCommentDTO()
{

}

void
UpdateGoodsFeedbackCommentDTO::fromJson(std::string jsonObj)
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

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
UpdateGoodsFeedbackCommentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["parentId"] = getParentId();






    object["text"] = getText();



    return object;

}

long
UpdateGoodsFeedbackCommentDTO::getId()
{
	return id;
}

void
UpdateGoodsFeedbackCommentDTO::setId(long  id)
{
	this->id = id;
}

long
UpdateGoodsFeedbackCommentDTO::getParentId()
{
	return parentId;
}

void
UpdateGoodsFeedbackCommentDTO::setParentId(long  parentId)
{
	this->parentId = parentId;
}

std::string
UpdateGoodsFeedbackCommentDTO::getText()
{
	return text;
}

void
UpdateGoodsFeedbackCommentDTO::setText(std::string  text)
{
	this->text = text;
}



