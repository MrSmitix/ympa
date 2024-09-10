

#include "OfferRecommendationsResultDTO.h"

using namespace Tiny;

OfferRecommendationsResultDTO::OfferRecommendationsResultDTO()
{
	paging = ScrollingPagerDTO();
	offerRecommendations = std::list<OfferRecommendationDTO>();
}

OfferRecommendationsResultDTO::OfferRecommendationsResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferRecommendationsResultDTO::~OfferRecommendationsResultDTO()
{

}

void
OfferRecommendationsResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *offerRecommendationsKey = "offerRecommendations";

    if(object.has_key(offerRecommendationsKey))
    {
        bourne::json value = object[offerRecommendationsKey];


        std::list<OfferRecommendationDTO> offerRecommendations_list;
        OfferRecommendationDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offerRecommendations_list.push_back(element);
        }
        offerRecommendations = offerRecommendations_list;


    }


}

bourne::json
OfferRecommendationsResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<OfferRecommendationDTO> offerRecommendations_list = getOfferRecommendations();
    bourne::json offerRecommendations_arr = bourne::json::array();

    for(auto& var : offerRecommendations_list)
    {
        OfferRecommendationDTO obj = var;
        offerRecommendations_arr.append(obj.toJson());
    }
    object["offerRecommendations"] = offerRecommendations_arr;




    return object;

}

ScrollingPagerDTO
OfferRecommendationsResultDTO::getPaging()
{
	return paging;
}

void
OfferRecommendationsResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<OfferRecommendationDTO>
OfferRecommendationsResultDTO::getOfferRecommendations()
{
	return offerRecommendations;
}

void
OfferRecommendationsResultDTO::setOfferRecommendations(std::list <OfferRecommendationDTO> offerRecommendations)
{
	this->offerRecommendations = offerRecommendations;
}



