

#include "GoodsFeedbackIdentifiersDTO.h"

using namespace Tiny;

GoodsFeedbackIdentifiersDTO::GoodsFeedbackIdentifiersDTO()
{
	orderId = long(0);
	modelId = long(0);
}

GoodsFeedbackIdentifiersDTO::GoodsFeedbackIdentifiersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackIdentifiersDTO::~GoodsFeedbackIdentifiersDTO()
{

}

void
GoodsFeedbackIdentifiersDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *modelIdKey = "modelId";

    if(object.has_key(modelIdKey))
    {
        bourne::json value = object[modelIdKey];



        jsonToValue(&modelId, value, "long");


    }


}

bourne::json
GoodsFeedbackIdentifiersDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["orderId"] = getOrderId();






    object["modelId"] = getModelId();



    return object;

}

long
GoodsFeedbackIdentifiersDTO::getOrderId()
{
	return orderId;
}

void
GoodsFeedbackIdentifiersDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

long
GoodsFeedbackIdentifiersDTO::getModelId()
{
	return modelId;
}

void
GoodsFeedbackIdentifiersDTO::setModelId(long  modelId)
{
	this->modelId = modelId;
}



