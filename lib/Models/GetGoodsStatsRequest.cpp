

#include "GetGoodsStatsRequest.h"

using namespace Tiny;

GetGoodsStatsRequest::GetGoodsStatsRequest()
{
	shopSkus = std::list<std::string>();
}

GetGoodsStatsRequest::GetGoodsStatsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetGoodsStatsRequest::~GetGoodsStatsRequest()
{

}

void
GetGoodsStatsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *shopSkusKey = "shopSkus";

    if(object.has_key(shopSkusKey))
    {
        bourne::json value = object[shopSkusKey];


        std::list<std::string> shopSkus_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            shopSkus_list.push_back(element);
        }
        shopSkus = shopSkus_list;


    }


}

bourne::json
GetGoodsStatsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> shopSkus_list = getShopSkus();
    bourne::json shopSkus_arr = bourne::json::array();

    for(auto& var : shopSkus_list)
    {
        shopSkus_arr.append(var);
    }
    object["shopSkus"] = shopSkus_arr;






    return object;

}

Set<std::string>
GetGoodsStatsRequest::getShopSkus()
{
	return shopSkus;
}

void
GetGoodsStatsRequest::setShopSkus(Set <std::string> shopSkus)
{
	this->shopSkus = shopSkus;
}



