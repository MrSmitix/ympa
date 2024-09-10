

#include "LanguageType.h"

using namespace Tiny;

LanguageType::LanguageType()
{
}

LanguageType::LanguageType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LanguageType::~LanguageType()
{

}

void
LanguageType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LanguageType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



