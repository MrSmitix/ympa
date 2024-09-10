

#include "ShelfsStatisticsAttributionType.h"

using namespace Tiny;

ShelfsStatisticsAttributionType::ShelfsStatisticsAttributionType()
{
}

ShelfsStatisticsAttributionType::ShelfsStatisticsAttributionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShelfsStatisticsAttributionType::~ShelfsStatisticsAttributionType()
{

}

void
ShelfsStatisticsAttributionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ShelfsStatisticsAttributionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



