

#include "GoodsStatsDTO.h"

using namespace Tiny;

GoodsStatsDTO::GoodsStatsDTO()
{
	shopSkus = std::list<GoodsStatsGoodsDTO>();
}

GoodsStatsDTO::GoodsStatsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsStatsDTO::~GoodsStatsDTO()
{

}

void
GoodsStatsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *shopSkusKey = "shopSkus";

    if(object.has_key(shopSkusKey))
    {
        bourne::json value = object[shopSkusKey];


        std::list<GoodsStatsGoodsDTO> shopSkus_list;
        GoodsStatsGoodsDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            shopSkus_list.push_back(element);
        }
        shopSkus = shopSkus_list;


    }


}

bourne::json
GoodsStatsDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<GoodsStatsGoodsDTO> shopSkus_list = getShopSkus();
    bourne::json shopSkus_arr = bourne::json::array();

    for(auto& var : shopSkus_list)
    {
        GoodsStatsGoodsDTO obj = var;
        shopSkus_arr.append(obj.toJson());
    }
    object["shopSkus"] = shopSkus_arr;




    return object;

}

std::list<GoodsStatsGoodsDTO>
GoodsStatsDTO::getShopSkus()
{
	return shopSkus;
}

void
GoodsStatsDTO::setShopSkus(std::list <GoodsStatsGoodsDTO> shopSkus)
{
	this->shopSkus = shopSkus;
}



