

#include "GoodsFeedbackDescriptionDTO.h"

using namespace Tiny;

GoodsFeedbackDescriptionDTO::GoodsFeedbackDescriptionDTO()
{
	advantages = std::string();
	disadvantages = std::string();
	comment = std::string();
}

GoodsFeedbackDescriptionDTO::GoodsFeedbackDescriptionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackDescriptionDTO::~GoodsFeedbackDescriptionDTO()
{

}

void
GoodsFeedbackDescriptionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *advantagesKey = "advantages";

    if(object.has_key(advantagesKey))
    {
        bourne::json value = object[advantagesKey];



        jsonToValue(&advantages, value, "std::string");


    }

    const char *disadvantagesKey = "disadvantages";

    if(object.has_key(disadvantagesKey))
    {
        bourne::json value = object[disadvantagesKey];



        jsonToValue(&disadvantages, value, "std::string");


    }

    const char *commentKey = "comment";

    if(object.has_key(commentKey))
    {
        bourne::json value = object[commentKey];



        jsonToValue(&comment, value, "std::string");


    }


}

bourne::json
GoodsFeedbackDescriptionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["advantages"] = getAdvantages();






    object["disadvantages"] = getDisadvantages();






    object["comment"] = getComment();



    return object;

}

std::string
GoodsFeedbackDescriptionDTO::getAdvantages()
{
	return advantages;
}

void
GoodsFeedbackDescriptionDTO::setAdvantages(std::string  advantages)
{
	this->advantages = advantages;
}

std::string
GoodsFeedbackDescriptionDTO::getDisadvantages()
{
	return disadvantages;
}

void
GoodsFeedbackDescriptionDTO::setDisadvantages(std::string  disadvantages)
{
	this->disadvantages = disadvantages;
}

std::string
GoodsFeedbackDescriptionDTO::getComment()
{
	return comment;
}

void
GoodsFeedbackDescriptionDTO::setComment(std::string  comment)
{
	this->comment = comment;
}



