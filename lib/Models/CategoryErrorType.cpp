

#include "CategoryErrorType.h"

using namespace Tiny;

CategoryErrorType::CategoryErrorType()
{
}

CategoryErrorType::CategoryErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CategoryErrorType::~CategoryErrorType()
{

}

void
CategoryErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CategoryErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



