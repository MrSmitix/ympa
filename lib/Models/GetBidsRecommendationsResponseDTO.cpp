

#include "GetBidsRecommendationsResponseDTO.h"

using namespace Tiny;

GetBidsRecommendationsResponseDTO::GetBidsRecommendationsResponseDTO()
{
	recommendations = std::list<SkuBidRecommendationItemDTO>();
}

GetBidsRecommendationsResponseDTO::GetBidsRecommendationsResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBidsRecommendationsResponseDTO::~GetBidsRecommendationsResponseDTO()
{

}

void
GetBidsRecommendationsResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *recommendationsKey = "recommendations";

    if(object.has_key(recommendationsKey))
    {
        bourne::json value = object[recommendationsKey];


        std::list<SkuBidRecommendationItemDTO> recommendations_list;
        SkuBidRecommendationItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            recommendations_list.push_back(element);
        }
        recommendations = recommendations_list;


    }


}

bourne::json
GetBidsRecommendationsResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SkuBidRecommendationItemDTO> recommendations_list = getRecommendations();
    bourne::json recommendations_arr = bourne::json::array();

    for(auto& var : recommendations_list)
    {
        SkuBidRecommendationItemDTO obj = var;
        recommendations_arr.append(obj.toJson());
    }
    object["recommendations"] = recommendations_arr;




    return object;

}

std::list<SkuBidRecommendationItemDTO>
GetBidsRecommendationsResponseDTO::getRecommendations()
{
	return recommendations;
}

void
GetBidsRecommendationsResponseDTO::setRecommendations(std::list <SkuBidRecommendationItemDTO> recommendations)
{
	this->recommendations = recommendations;
}



