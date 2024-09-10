

#include "UpdatePromoOffersResultDTO.h"

using namespace Tiny;

UpdatePromoOffersResultDTO::UpdatePromoOffersResultDTO()
{
	rejectedOffers = std::list<RejectedPromoOfferUpdateDTO>();
	warningOffers = std::list<WarningPromoOfferUpdateDTO>();
}

UpdatePromoOffersResultDTO::UpdatePromoOffersResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePromoOffersResultDTO::~UpdatePromoOffersResultDTO()
{

}

void
UpdatePromoOffersResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rejectedOffersKey = "rejectedOffers";

    if(object.has_key(rejectedOffersKey))
    {
        bourne::json value = object[rejectedOffersKey];


        std::list<RejectedPromoOfferUpdateDTO> rejectedOffers_list;
        RejectedPromoOfferUpdateDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            rejectedOffers_list.push_back(element);
        }
        rejectedOffers = rejectedOffers_list;


    }

    const char *warningOffersKey = "warningOffers";

    if(object.has_key(warningOffersKey))
    {
        bourne::json value = object[warningOffersKey];


        std::list<WarningPromoOfferUpdateDTO> warningOffers_list;
        WarningPromoOfferUpdateDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warningOffers_list.push_back(element);
        }
        warningOffers = warningOffers_list;


    }


}

bourne::json
UpdatePromoOffersResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<RejectedPromoOfferUpdateDTO> rejectedOffers_list = getRejectedOffers();
    bourne::json rejectedOffers_arr = bourne::json::array();

    for(auto& var : rejectedOffers_list)
    {
        RejectedPromoOfferUpdateDTO obj = var;
        rejectedOffers_arr.append(obj.toJson());
    }
    object["rejectedOffers"] = rejectedOffers_arr;






    std::list<WarningPromoOfferUpdateDTO> warningOffers_list = getWarningOffers();
    bourne::json warningOffers_arr = bourne::json::array();

    for(auto& var : warningOffers_list)
    {
        WarningPromoOfferUpdateDTO obj = var;
        warningOffers_arr.append(obj.toJson());
    }
    object["warningOffers"] = warningOffers_arr;




    return object;

}

std::list<RejectedPromoOfferUpdateDTO>
UpdatePromoOffersResultDTO::getRejectedOffers()
{
	return rejectedOffers;
}

void
UpdatePromoOffersResultDTO::setRejectedOffers(std::list <RejectedPromoOfferUpdateDTO> rejectedOffers)
{
	this->rejectedOffers = rejectedOffers;
}

std::list<WarningPromoOfferUpdateDTO>
UpdatePromoOffersResultDTO::getWarningOffers()
{
	return warningOffers;
}

void
UpdatePromoOffersResultDTO::setWarningOffers(std::list <WarningPromoOfferUpdateDTO> warningOffers)
{
	this->warningOffers = warningOffers;
}



