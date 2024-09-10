

#include "GenerateMassOrderLabelsRequest.h"

using namespace Tiny;

GenerateMassOrderLabelsRequest::GenerateMassOrderLabelsRequest()
{
	businessId = long(0);
	orderIds = std::list<long>();
}

GenerateMassOrderLabelsRequest::GenerateMassOrderLabelsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateMassOrderLabelsRequest::~GenerateMassOrderLabelsRequest()
{

}

void
GenerateMassOrderLabelsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *businessIdKey = "businessId";

    if(object.has_key(businessIdKey))
    {
        bourne::json value = object[businessIdKey];



        jsonToValue(&businessId, value, "long");


    }

    const char *orderIdsKey = "orderIds";

    if(object.has_key(orderIdsKey))
    {
        bourne::json value = object[orderIdsKey];


        std::list<long> orderIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orderIds_list.push_back(element);
        }
        orderIds = orderIds_list;


    }


}

bourne::json
GenerateMassOrderLabelsRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();





    std::list<long> orderIds_list = getOrderIds();
    bourne::json orderIds_arr = bourne::json::array();

    for(auto& var : orderIds_list)
    {
        orderIds_arr.append(var);
    }
    object["orderIds"] = orderIds_arr;






    return object;

}

long
GenerateMassOrderLabelsRequest::getBusinessId()
{
	return businessId;
}

void
GenerateMassOrderLabelsRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

Set<long>
GenerateMassOrderLabelsRequest::getOrderIds()
{
	return orderIds;
}

void
GenerateMassOrderLabelsRequest::setOrderIds(Set <long> orderIds)
{
	this->orderIds = orderIds;
}



