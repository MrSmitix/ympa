

#include "OrderItemSubsidyDTO.h"

using namespace Tiny;

OrderItemSubsidyDTO::OrderItemSubsidyDTO()
{
	type = OrderItemSubsidyType();
	amount = float(0);
}

OrderItemSubsidyDTO::OrderItemSubsidyDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemSubsidyDTO::~OrderItemSubsidyDTO()
{

}

void
OrderItemSubsidyDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrderItemSubsidyType* obj = &type;
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
OrderItemSubsidyDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["amount"] = getAmount();



    return object;

}

OrderItemSubsidyType
OrderItemSubsidyDTO::getType()
{
	return type;
}

void
OrderItemSubsidyDTO::setType(OrderItemSubsidyType  type)
{
	this->type = type;
}

long
OrderItemSubsidyDTO::getAmount()
{
	return amount;
}

void
OrderItemSubsidyDTO::setAmount(long  amount)
{
	this->amount = amount;
}



