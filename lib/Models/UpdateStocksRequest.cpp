

#include "UpdateStocksRequest.h"

using namespace Tiny;

UpdateStocksRequest::UpdateStocksRequest()
{
	skus = std::list<UpdateStockDTO>();
}

UpdateStocksRequest::UpdateStocksRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateStocksRequest::~UpdateStocksRequest()
{

}

void
UpdateStocksRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *skusKey = "skus";

    if(object.has_key(skusKey))
    {
        bourne::json value = object[skusKey];


        std::list<UpdateStockDTO> skus_list;
        UpdateStockDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            skus_list.push_back(element);
        }
        skus = skus_list;


    }


}

bourne::json
UpdateStocksRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateStockDTO> skus_list = getSkus();
    bourne::json skus_arr = bourne::json::array();

    for(auto& var : skus_list)
    {
        UpdateStockDTO obj = var;
        skus_arr.append(obj.toJson());
    }
    object["skus"] = skus_arr;




    return object;

}

Set<UpdateStockDTO>
UpdateStocksRequest::getSkus()
{
	return skus;
}

void
UpdateStocksRequest::setSkus(Set <UpdateStockDTO> skus)
{
	this->skus = skus;
}



