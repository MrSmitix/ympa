

#include "PromoOfferParamsDTO.h"

using namespace Tiny;

PromoOfferParamsDTO::PromoOfferParamsDTO()
{
	discountParams = PromoOfferDiscountParamsDTO();
	promocodeParams = PromoOfferPromocodeParamsDTO();
}

PromoOfferParamsDTO::PromoOfferParamsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferParamsDTO::~PromoOfferParamsDTO()
{

}

void
PromoOfferParamsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *discountParamsKey = "discountParams";

    if(object.has_key(discountParamsKey))
    {
        bourne::json value = object[discountParamsKey];




        PromoOfferDiscountParamsDTO* obj = &discountParams;
		obj->fromJson(value.dump());

    }

    const char *promocodeParamsKey = "promocodeParams";

    if(object.has_key(promocodeParamsKey))
    {
        bourne::json value = object[promocodeParamsKey];




        PromoOfferPromocodeParamsDTO* obj = &promocodeParams;
		obj->fromJson(value.dump());

    }


}

bourne::json
PromoOfferParamsDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["discountParams"] = getDiscountParams().toJson();






	object["promocodeParams"] = getPromocodeParams().toJson();


    return object;

}

PromoOfferDiscountParamsDTO
PromoOfferParamsDTO::getDiscountParams()
{
	return discountParams;
}

void
PromoOfferParamsDTO::setDiscountParams(PromoOfferDiscountParamsDTO  discountParams)
{
	this->discountParams = discountParams;
}

PromoOfferPromocodeParamsDTO
PromoOfferParamsDTO::getPromocodeParams()
{
	return promocodeParams;
}

void
PromoOfferParamsDTO::setPromocodeParams(PromoOfferPromocodeParamsDTO  promocodeParams)
{
	this->promocodeParams = promocodeParams;
}



