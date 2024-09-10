

#include "GetBidsRecommendationsRequest.h"

using namespace Tiny;

GetBidsRecommendationsRequest::GetBidsRecommendationsRequest()
{
	skus = std::list<std::string>();
}

GetBidsRecommendationsRequest::GetBidsRecommendationsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBidsRecommendationsRequest::~GetBidsRecommendationsRequest()
{

}

void
GetBidsRecommendationsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *skusKey = "skus";

    if(object.has_key(skusKey))
    {
        bourne::json value = object[skusKey];


        std::list<std::string> skus_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            skus_list.push_back(element);
        }
        skus = skus_list;


    }


}

bourne::json
GetBidsRecommendationsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> skus_list = getSkus();
    bourne::json skus_arr = bourne::json::array();

    for(auto& var : skus_list)
    {
        skus_arr.append(var);
    }
    object["skus"] = skus_arr;






    return object;

}

std::list<std::string>
GetBidsRecommendationsRequest::getSkus()
{
	return skus;
}

void
GetBidsRecommendationsRequest::setSkus(std::list <std::string> skus)
{
	this->skus = skus;
}



