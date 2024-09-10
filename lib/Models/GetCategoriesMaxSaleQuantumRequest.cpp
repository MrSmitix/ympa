

#include "GetCategoriesMaxSaleQuantumRequest.h"

using namespace Tiny;

GetCategoriesMaxSaleQuantumRequest::GetCategoriesMaxSaleQuantumRequest()
{
	marketCategoryIds = std::list<long>();
}

GetCategoriesMaxSaleQuantumRequest::GetCategoriesMaxSaleQuantumRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCategoriesMaxSaleQuantumRequest::~GetCategoriesMaxSaleQuantumRequest()
{

}

void
GetCategoriesMaxSaleQuantumRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *marketCategoryIdsKey = "marketCategoryIds";

    if(object.has_key(marketCategoryIdsKey))
    {
        bourne::json value = object[marketCategoryIdsKey];


        std::list<long> marketCategoryIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            marketCategoryIds_list.push_back(element);
        }
        marketCategoryIds = marketCategoryIds_list;


    }


}

bourne::json
GetCategoriesMaxSaleQuantumRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> marketCategoryIds_list = getMarketCategoryIds();
    bourne::json marketCategoryIds_arr = bourne::json::array();

    for(auto& var : marketCategoryIds_list)
    {
        marketCategoryIds_arr.append(var);
    }
    object["marketCategoryIds"] = marketCategoryIds_arr;






    return object;

}

Set<long>
GetCategoriesMaxSaleQuantumRequest::getMarketCategoryIds()
{
	return marketCategoryIds;
}

void
GetCategoriesMaxSaleQuantumRequest::setMarketCategoryIds(Set <long> marketCategoryIds)
{
	this->marketCategoryIds = marketCategoryIds;
}



