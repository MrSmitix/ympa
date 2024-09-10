

#include "PriceCompetitivenessThresholdsDTO.h"

using namespace Tiny;

PriceCompetitivenessThresholdsDTO::PriceCompetitivenessThresholdsDTO()
{
	optimalPrice = BasePriceDTO();
	averagePrice = BasePriceDTO();
}

PriceCompetitivenessThresholdsDTO::PriceCompetitivenessThresholdsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceCompetitivenessThresholdsDTO::~PriceCompetitivenessThresholdsDTO()
{

}

void
PriceCompetitivenessThresholdsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *optimalPriceKey = "optimalPrice";

    if(object.has_key(optimalPriceKey))
    {
        bourne::json value = object[optimalPriceKey];




        BasePriceDTO* obj = &optimalPrice;
		obj->fromJson(value.dump());

    }

    const char *averagePriceKey = "averagePrice";

    if(object.has_key(averagePriceKey))
    {
        bourne::json value = object[averagePriceKey];




        BasePriceDTO* obj = &averagePrice;
		obj->fromJson(value.dump());

    }


}

bourne::json
PriceCompetitivenessThresholdsDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["optimalPrice"] = getOptimalPrice().toJson();






	object["averagePrice"] = getAveragePrice().toJson();


    return object;

}

BasePriceDTO
PriceCompetitivenessThresholdsDTO::getOptimalPrice()
{
	return optimalPrice;
}

void
PriceCompetitivenessThresholdsDTO::setOptimalPrice(BasePriceDTO  optimalPrice)
{
	this->optimalPrice = optimalPrice;
}

BasePriceDTO
PriceCompetitivenessThresholdsDTO::getAveragePrice()
{
	return averagePrice;
}

void
PriceCompetitivenessThresholdsDTO::setAveragePrice(BasePriceDTO  averagePrice)
{
	this->averagePrice = averagePrice;
}



