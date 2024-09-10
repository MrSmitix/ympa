

#include "FeedbackFactorDTO.h"

using namespace Tiny;

FeedbackFactorDTO::FeedbackFactorDTO()
{
	id = long(0);
	title = std::string();
	description = std::string();
	value = int(0);
}

FeedbackFactorDTO::FeedbackFactorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackFactorDTO::~FeedbackFactorDTO()
{

}

void
FeedbackFactorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "int");


    }


}

bourne::json
FeedbackFactorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["title"] = getTitle();






    object["description"] = getDescription();






    object["value"] = getValue();



    return object;

}

long
FeedbackFactorDTO::getId()
{
	return id;
}

void
FeedbackFactorDTO::setId(long  id)
{
	this->id = id;
}

std::string
FeedbackFactorDTO::getTitle()
{
	return title;
}

void
FeedbackFactorDTO::setTitle(std::string  title)
{
	this->title = title;
}

std::string
FeedbackFactorDTO::getDescription()
{
	return description;
}

void
FeedbackFactorDTO::setDescription(std::string  description)
{
	this->description = description;
}

int
FeedbackFactorDTO::getValue()
{
	return value;
}

void
FeedbackFactorDTO::setValue(int  value)
{
	this->value = value;
}



