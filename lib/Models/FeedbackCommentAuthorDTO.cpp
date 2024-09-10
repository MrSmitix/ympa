

#include "FeedbackCommentAuthorDTO.h"

using namespace Tiny;

FeedbackCommentAuthorDTO::FeedbackCommentAuthorDTO()
{
	type = FeedbackCommentAuthorType();
	name = std::string();
}

FeedbackCommentAuthorDTO::FeedbackCommentAuthorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackCommentAuthorDTO::~FeedbackCommentAuthorDTO()
{

}

void
FeedbackCommentAuthorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        FeedbackCommentAuthorType* obj = &type;
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
FeedbackCommentAuthorDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["name"] = getName();



    return object;

}

FeedbackCommentAuthorType
FeedbackCommentAuthorDTO::getType()
{
	return type;
}

void
FeedbackCommentAuthorDTO::setType(FeedbackCommentAuthorType  type)
{
	this->type = type;
}

std::string
FeedbackCommentAuthorDTO::getName()
{
	return name;
}

void
FeedbackCommentAuthorDTO::setName(std::string  name)
{
	this->name = name;
}



