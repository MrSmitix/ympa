

#include "GetPromosResultDTO.h"

using namespace Tiny;

GetPromosResultDTO::GetPromosResultDTO()
{
	promos = std::list<GetPromoDTO>();
}

GetPromosResultDTO::GetPromosResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromosResultDTO::~GetPromosResultDTO()
{

}

void
GetPromosResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promosKey = "promos";

    if(object.has_key(promosKey))
    {
        bourne::json value = object[promosKey];


        std::list<GetPromoDTO> promos_list;
        GetPromoDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            promos_list.push_back(element);
        }
        promos = promos_list;


    }


}

bourne::json
GetPromosResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<GetPromoDTO> promos_list = getPromos();
    bourne::json promos_arr = bourne::json::array();

    for(auto& var : promos_list)
    {
        GetPromoDTO obj = var;
        promos_arr.append(obj.toJson());
    }
    object["promos"] = promos_arr;




    return object;

}

std::list<GetPromoDTO>
GetPromosResultDTO::getPromos()
{
	return promos;
}

void
GetPromosResultDTO::setPromos(std::list <GetPromoDTO> promos)
{
	this->promos = promos;
}



