

#include "GenerateGoodsFeedbackRequest.h"

using namespace Tiny;

GenerateGoodsFeedbackRequest::GenerateGoodsFeedbackRequest()
{
	businessId = long(0);
}

GenerateGoodsFeedbackRequest::GenerateGoodsFeedbackRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateGoodsFeedbackRequest::~GenerateGoodsFeedbackRequest()
{

}

void
GenerateGoodsFeedbackRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *businessIdKey = "businessId";

    if(object.has_key(businessIdKey))
    {
        bourne::json value = object[businessIdKey];



        jsonToValue(&businessId, value, "long");


    }


}

bourne::json
GenerateGoodsFeedbackRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();



    return object;

}

long
GenerateGoodsFeedbackRequest::getBusinessId()
{
	return businessId;
}

void
GenerateGoodsFeedbackRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}



