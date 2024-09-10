

#include "AffectedOrderQualityRatingComponentType.h"

using namespace Tiny;

AffectedOrderQualityRatingComponentType::AffectedOrderQualityRatingComponentType()
{
}

AffectedOrderQualityRatingComponentType::AffectedOrderQualityRatingComponentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AffectedOrderQualityRatingComponentType::~AffectedOrderQualityRatingComponentType()
{

}

void
AffectedOrderQualityRatingComponentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AffectedOrderQualityRatingComponentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



