

#include "FeedbackDeliveryType.h"

using namespace Tiny;

FeedbackDeliveryType::FeedbackDeliveryType()
{
}

FeedbackDeliveryType::FeedbackDeliveryType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackDeliveryType::~FeedbackDeliveryType()
{

}

void
FeedbackDeliveryType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedbackDeliveryType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



