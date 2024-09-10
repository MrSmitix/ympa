

#include "QualityRatingComponentType.h"

using namespace Tiny;

QualityRatingComponentType::QualityRatingComponentType()
{
}

QualityRatingComponentType::QualityRatingComponentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityRatingComponentType::~QualityRatingComponentType()
{

}

void
QualityRatingComponentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
QualityRatingComponentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



