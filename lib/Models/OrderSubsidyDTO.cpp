

#include "OrderSubsidyDTO.h"

using namespace Tiny;

OrderSubsidyDTO::OrderSubsidyDTO()
{
	type = OrderSubsidyType();
	amount = float(0);
}

OrderSubsidyDTO::OrderSubsidyDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderSubsidyDTO::~OrderSubsidyDTO()
{

}

void
OrderSubsidyDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrderSubsidyType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *amountKey = "amount";

    if(object.has_key(amountKey))
    {
        bourne::json value = object[amountKey];



        jsonToValue(&amount, value, "long");


    }


}

bourne::json
OrderSubsidyDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["amount"] = getAmount();



    return object;

}

OrderSubsidyType
OrderSubsidyDTO::getType()
{
	return type;
}

void
OrderSubsidyDTO::setType(OrderSubsidyType  type)
{
	this->type = type;
}

long
OrderSubsidyDTO::getAmount()
{
	return amount;
}

void
OrderSubsidyDTO::setAmount(long  amount)
{
	this->amount = amount;
}



