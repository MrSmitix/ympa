

#include "QuarantineOfferDTO.h"

using namespace Tiny;

QuarantineOfferDTO::QuarantineOfferDTO()
{
	offerId = std::string();
	currentPrice = BasePriceDTO();
	lastValidPrice = BasePriceDTO();
	verdicts = std::list<PriceQuarantineVerdictDTO>();
}

QuarantineOfferDTO::QuarantineOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuarantineOfferDTO::~QuarantineOfferDTO()
{

}

void
QuarantineOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *currentPriceKey = "currentPrice";

    if(object.has_key(currentPriceKey))
    {
        bourne::json value = object[currentPriceKey];




        BasePriceDTO* obj = &currentPrice;
		obj->fromJson(value.dump());

    }

    const char *lastValidPriceKey = "lastValidPrice";

    if(object.has_key(lastValidPriceKey))
    {
        bourne::json value = object[lastValidPriceKey];




        BasePriceDTO* obj = &lastValidPrice;
		obj->fromJson(value.dump());

    }

    const char *verdictsKey = "verdicts";

    if(object.has_key(verdictsKey))
    {
        bourne::json value = object[verdictsKey];


        std::list<PriceQuarantineVerdictDTO> verdicts_list;
        PriceQuarantineVerdictDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            verdicts_list.push_back(element);
        }
        verdicts = verdicts_list;


    }


}

bourne::json
QuarantineOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["currentPrice"] = getCurrentPrice().toJson();






	object["lastValidPrice"] = getLastValidPrice().toJson();




    std::list<PriceQuarantineVerdictDTO> verdicts_list = getVerdicts();
    bourne::json verdicts_arr = bourne::json::array();

    for(auto& var : verdicts_list)
    {
        PriceQuarantineVerdictDTO obj = var;
        verdicts_arr.append(obj.toJson());
    }
    object["verdicts"] = verdicts_arr;




    return object;

}

std::string
QuarantineOfferDTO::getOfferId()
{
	return offerId;
}

void
QuarantineOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

BasePriceDTO
QuarantineOfferDTO::getCurrentPrice()
{
	return currentPrice;
}

void
QuarantineOfferDTO::setCurrentPrice(BasePriceDTO  currentPrice)
{
	this->currentPrice = currentPrice;
}

BasePriceDTO
QuarantineOfferDTO::getLastValidPrice()
{
	return lastValidPrice;
}

void
QuarantineOfferDTO::setLastValidPrice(BasePriceDTO  lastValidPrice)
{
	this->lastValidPrice = lastValidPrice;
}

std::list<PriceQuarantineVerdictDTO>
QuarantineOfferDTO::getVerdicts()
{
	return verdicts;
}

void
QuarantineOfferDTO::setVerdicts(std::list <PriceQuarantineVerdictDTO> verdicts)
{
	this->verdicts = verdicts;
}



