

#include "PriceCompetitivenessType.h"

using namespace Tiny;

PriceCompetitivenessType::PriceCompetitivenessType()
{
}

PriceCompetitivenessType::PriceCompetitivenessType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceCompetitivenessType::~PriceCompetitivenessType()
{

}

void
PriceCompetitivenessType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PriceCompetitivenessType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



