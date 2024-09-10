

#include "DeletePromoOffersResultDTO.h"

using namespace Tiny;

DeletePromoOffersResultDTO::DeletePromoOffersResultDTO()
{
	rejectedOffers = std::list<RejectedPromoOfferDeleteDTO>();
}

DeletePromoOffersResultDTO::DeletePromoOffersResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePromoOffersResultDTO::~DeletePromoOffersResultDTO()
{

}

void
DeletePromoOffersResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rejectedOffersKey = "rejectedOffers";

    if(object.has_key(rejectedOffersKey))
    {
        bourne::json value = object[rejectedOffersKey];


        std::list<RejectedPromoOfferDeleteDTO> rejectedOffers_list;
        RejectedPromoOfferDeleteDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            rejectedOffers_list.push_back(element);
        }
        rejectedOffers = rejectedOffers_list;


    }


}

bourne::json
DeletePromoOffersResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<RejectedPromoOfferDeleteDTO> rejectedOffers_list = getRejectedOffers();
    bourne::json rejectedOffers_arr = bourne::json::array();

    for(auto& var : rejectedOffers_list)
    {
        RejectedPromoOfferDeleteDTO obj = var;
        rejectedOffers_arr.append(obj.toJson());
    }
    object["rejectedOffers"] = rejectedOffers_arr;




    return object;

}

std::list<RejectedPromoOfferDeleteDTO>
DeletePromoOffersResultDTO::getRejectedOffers()
{
	return rejectedOffers;
}

void
DeletePromoOffersResultDTO::setRejectedOffers(std::list <RejectedPromoOfferDeleteDTO> rejectedOffers)
{
	this->rejectedOffers = rejectedOffers;
}



