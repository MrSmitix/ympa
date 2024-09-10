

#include "PageFormatType.h"

using namespace Tiny;

PageFormatType::PageFormatType()
{
}

PageFormatType::PageFormatType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PageFormatType::~PageFormatType()
{

}

void
PageFormatType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PageFormatType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



