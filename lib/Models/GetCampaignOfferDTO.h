
/*
 * GetCampaignOfferDTO.h
 *
 * Параметры размещения товара в магазине.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignOfferDTO_H_
#define TINY_CPP_CLIENT_GetCampaignOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetPriceWithDiscountDTO.h"
#include "GetPriceWithVatDTO.h"
#include "OfferCampaignStatusType.h"
#include "OfferErrorDTO.h"
#include "QuantumDTO.h"
#include <list>

namespace Tiny {


/*! \brief Параметры размещения товара в магазине.
 *
 *  \ingroup Models
 *
 */

class GetCampaignOfferDTO{
public:

    /*! \brief Constructor.
	 */
    GetCampaignOfferDTO();
    GetCampaignOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignOfferDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get 
	 */
	QuantumDTO getQuantum();

	/*! \brief Set 
	 */
	void setQuantum(QuantumDTO  quantum);
	/*! \brief Get Есть ли товар в продаже. 
	 */
	bool isAvailable();

	/*! \brief Set Есть ли товар в продаже. 
	 */
	void setAvailable(bool  available);
	/*! \brief Get 
	 */
	GetPriceWithDiscountDTO getBasicPrice();

	/*! \brief Set 
	 */
	void setBasicPrice(GetPriceWithDiscountDTO  basicPrice);
	/*! \brief Get 
	 */
	GetPriceWithVatDTO getCampaignPrice();

	/*! \brief Set 
	 */
	void setCampaignPrice(GetPriceWithVatDTO  campaignPrice);
	/*! \brief Get 
	 */
	OfferCampaignStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OfferCampaignStatusType  status);
	/*! \brief Get Ошибки, препятствующие размещению товара на витрине. 
	 */
	std::list<OfferErrorDTO> getErrors();

	/*! \brief Set Ошибки, препятствующие размещению товара на витрине. 
	 */
	void setErrors(std::list <OfferErrorDTO> errors);
	/*! \brief Get Предупреждения, не препятствующие размещению товара на витрине. 
	 */
	std::list<OfferErrorDTO> getWarnings();

	/*! \brief Set Предупреждения, не препятствующие размещению товара на витрине. 
	 */
	void setWarnings(std::list <OfferErrorDTO> warnings);


    private:
    std::string offerId{};
    QuantumDTO quantum;
    bool available{};
    GetPriceWithDiscountDTO basicPrice;
    GetPriceWithVatDTO campaignPrice;
    OfferCampaignStatusType status;
    std::list<OfferErrorDTO> errors;
    std::list<OfferErrorDTO> warnings;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignOfferDTO_H_ */
