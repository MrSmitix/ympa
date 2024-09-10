

#include "WarehouseOffersDTO.h"

using namespace Tiny;

WarehouseOffersDTO::WarehouseOffersDTO()
{
	warehouseId = long(0);
	offers = std::list<WarehouseOfferDTO>();
}

WarehouseOffersDTO::WarehouseOffersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseOffersDTO::~WarehouseOffersDTO()
{

}

void
WarehouseOffersDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *warehouseIdKey = "warehouseId";

    if(object.has_key(warehouseIdKey))
    {
        bourne::json value = object[warehouseIdKey];



        jsonToValue(&warehouseId, value, "long");


    }

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<WarehouseOfferDTO> offers_list;
        WarehouseOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
WarehouseOffersDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["warehouseId"] = getWarehouseId();





    std::list<WarehouseOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        WarehouseOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

long
WarehouseOffersDTO::getWarehouseId()
{
	return warehouseId;
}

void
WarehouseOffersDTO::setWarehouseId(long  warehouseId)
{
	this->warehouseId = warehouseId;
}

std::list<WarehouseOfferDTO>
WarehouseOffersDTO::getOffers()
{
	return offers;
}

void
WarehouseOffersDTO::setOffers(std::list <WarehouseOfferDTO> offers)
{
	this->offers = offers;
}



