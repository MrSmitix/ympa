

#include "GetPromoPromocodeInfoDTO.h"

using namespace Tiny;

GetPromoPromocodeInfoDTO::GetPromoPromocodeInfoDTO()
{
	promocode = std::string();
	discount = int(0);
}

GetPromoPromocodeInfoDTO::GetPromoPromocodeInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoPromocodeInfoDTO::~GetPromoPromocodeInfoDTO()
{

}

void
GetPromoPromocodeInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promocodeKey = "promocode";

    if(object.has_key(promocodeKey))
    {
        bourne::json value = object[promocodeKey];



        jsonToValue(&promocode, value, "std::string");


    }

    const char *discountKey = "discount";

    if(object.has_key(discountKey))
    {
        bourne::json value = object[discountKey];



        jsonToValue(&discount, value, "int");


    }


}

bourne::json
GetPromoPromocodeInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["promocode"] = getPromocode();






    object["discount"] = getDiscount();



    return object;

}

std::string
GetPromoPromocodeInfoDTO::getPromocode()
{
	return promocode;
}

void
GetPromoPromocodeInfoDTO::setPromocode(std::string  promocode)
{
	this->promocode = promocode;
}

int
GetPromoPromocodeInfoDTO::getDiscount()
{
	return discount;
}

void
GetPromoPromocodeInfoDTO::setDiscount(int  discount)
{
	this->discount = discount;
}



