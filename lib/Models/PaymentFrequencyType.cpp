

#include "PaymentFrequencyType.h"

using namespace Tiny;

PaymentFrequencyType::PaymentFrequencyType()
{
}

PaymentFrequencyType::PaymentFrequencyType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaymentFrequencyType::~PaymentFrequencyType()
{

}

void
PaymentFrequencyType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PaymentFrequencyType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



