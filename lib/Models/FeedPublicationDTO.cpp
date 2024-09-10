

#include "FeedPublicationDTO.h"

using namespace Tiny;

FeedPublicationDTO::FeedPublicationDTO()
{
	status = FeedStatusType();
	full = FeedPublicationFullDTO();
	priceAndStockUpdate = FeedPublicationPriceAndStockUpdateDTO();
}

FeedPublicationDTO::FeedPublicationDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedPublicationDTO::~FeedPublicationDTO()
{

}

void
FeedPublicationDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        FeedStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *fullKey = "full";

    if(object.has_key(fullKey))
    {
        bourne::json value = object[fullKey];




        FeedPublicationFullDTO* obj = &full;
		obj->fromJson(value.dump());

    }

    const char *priceAndStockUpdateKey = "priceAndStockUpdate";

    if(object.has_key(priceAndStockUpdateKey))
    {
        bourne::json value = object[priceAndStockUpdateKey];




        FeedPublicationPriceAndStockUpdateDTO* obj = &priceAndStockUpdate;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedPublicationDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["full"] = getFull().toJson();






	object["priceAndStockUpdate"] = getPriceAndStockUpdate().toJson();


    return object;

}

FeedStatusType
FeedPublicationDTO::getStatus()
{
	return status;
}

void
FeedPublicationDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

FeedPublicationFullDTO
FeedPublicationDTO::getFull()
{
	return full;
}

void
FeedPublicationDTO::setFull(FeedPublicationFullDTO  full)
{
	this->full = full;
}

FeedPublicationPriceAndStockUpdateDTO
FeedPublicationDTO::getPriceAndStockUpdate()
{
	return priceAndStockUpdate;
}

void
FeedPublicationDTO::setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO  priceAndStockUpdate)
{
	this->priceAndStockUpdate = priceAndStockUpdate;
}



