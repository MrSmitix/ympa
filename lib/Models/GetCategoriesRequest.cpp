

#include "GetCategoriesRequest.h"

using namespace Tiny;

GetCategoriesRequest::GetCategoriesRequest()
{
	language = LanguageType();
}

GetCategoriesRequest::GetCategoriesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCategoriesRequest::~GetCategoriesRequest()
{

}

void
GetCategoriesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        LanguageType* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCategoriesRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["language"] = getLanguage().toJson();


    return object;

}

LanguageType
GetCategoriesRequest::getLanguage()
{
	return language;
}

void
GetCategoriesRequest::setLanguage(LanguageType  language)
{
	this->language = language;
}



