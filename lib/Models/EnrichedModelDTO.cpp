

#include "EnrichedModelDTO.h"

using namespace Tiny;

EnrichedModelDTO::EnrichedModelDTO()
{
	id = long(0);
	name = std::string();
	prices = ModelPriceDTO();
	offers = std::list<ModelOfferDTO>();
	offlineOffers = int(0);
	onlineOffers = int(0);
}

EnrichedModelDTO::EnrichedModelDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

EnrichedModelDTO::~EnrichedModelDTO()
{

}

void
EnrichedModelDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *pricesKey = "prices";

    if(object.has_key(pricesKey))
    {
        bourne::json value = object[pricesKey];




        ModelPriceDTO* obj = &prices;
		obj->fromJson(value.dump());

    }

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<ModelOfferDTO> offers_list;
        ModelOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }

    const char *offlineOffersKey = "offlineOffers";

    if(object.has_key(offlineOffersKey))
    {
        bourne::json value = object[offlineOffersKey];



        jsonToValue(&offlineOffers, value, "int");


    }

    const char *onlineOffersKey = "onlineOffers";

    if(object.has_key(onlineOffersKey))
    {
        bourne::json value = object[onlineOffersKey];



        jsonToValue(&onlineOffers, value, "int");


    }


}

bourne::json
EnrichedModelDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["prices"] = getPrices().toJson();




    std::list<ModelOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        ModelOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;







    object["offlineOffers"] = getOfflineOffers();






    object["onlineOffers"] = getOnlineOffers();



    return object;

}

long
EnrichedModelDTO::getId()
{
	return id;
}

void
EnrichedModelDTO::setId(long  id)
{
	this->id = id;
}

std::string
EnrichedModelDTO::getName()
{
	return name;
}

void
EnrichedModelDTO::setName(std::string  name)
{
	this->name = name;
}

ModelPriceDTO
EnrichedModelDTO::getPrices()
{
	return prices;
}

void
EnrichedModelDTO::setPrices(ModelPriceDTO  prices)
{
	this->prices = prices;
}

std::list<ModelOfferDTO>
EnrichedModelDTO::getOffers()
{
	return offers;
}

void
EnrichedModelDTO::setOffers(std::list <ModelOfferDTO> offers)
{
	this->offers = offers;
}

int
EnrichedModelDTO::getOfflineOffers()
{
	return offlineOffers;
}

void
EnrichedModelDTO::setOfflineOffers(int  offlineOffers)
{
	this->offlineOffers = offlineOffers;
}

int
EnrichedModelDTO::getOnlineOffers()
{
	return onlineOffers;
}

void
EnrichedModelDTO::setOnlineOffers(int  onlineOffers)
{
	this->onlineOffers = onlineOffers;
}



