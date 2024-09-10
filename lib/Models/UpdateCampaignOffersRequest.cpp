

#include "UpdateCampaignOffersRequest.h"

using namespace Tiny;

UpdateCampaignOffersRequest::UpdateCampaignOffersRequest()
{
	offers = std::list<UpdateCampaignOfferDTO>();
}

UpdateCampaignOffersRequest::UpdateCampaignOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateCampaignOffersRequest::~UpdateCampaignOffersRequest()
{

}

void
UpdateCampaignOffersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<UpdateCampaignOfferDTO> offers_list;
        UpdateCampaignOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
UpdateCampaignOffersRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateCampaignOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        UpdateCampaignOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<UpdateCampaignOfferDTO>
UpdateCampaignOffersRequest::getOffers()
{
	return offers;
}

void
UpdateCampaignOffersRequest::setOffers(std::list <UpdateCampaignOfferDTO> offers)
{
	this->offers = offers;
}



