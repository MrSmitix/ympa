

#include "GoodsFeedbackCommentAuthorDTO.h"

using namespace Tiny;

GoodsFeedbackCommentAuthorDTO::GoodsFeedbackCommentAuthorDTO()
{
	type = GoodsFeedbackCommentAuthorType();
	name = std::string();
}

GoodsFeedbackCommentAuthorDTO::GoodsFeedbackCommentAuthorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackCommentAuthorDTO::~GoodsFeedbackCommentAuthorDTO()
{

}

void
GoodsFeedbackCommentAuthorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        GoodsFeedbackCommentAuthorType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
GoodsFeedbackCommentAuthorDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["name"] = getName();



    return object;

}

GoodsFeedbackCommentAuthorType
GoodsFeedbackCommentAuthorDTO::getType()
{
	return type;
}

void
GoodsFeedbackCommentAuthorDTO::setType(GoodsFeedbackCommentAuthorType  type)
{
	this->type = type;
}

std::string
GoodsFeedbackCommentAuthorDTO::getName()
{
	return name;
}

void
GoodsFeedbackCommentAuthorDTO::setName(std::string  name)
{
	this->name = name;
}



