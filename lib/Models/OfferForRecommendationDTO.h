
/*
 * OfferForRecommendationDTO.h
 *
 * Информация о состоянии цены на товар.
 */

#ifndef TINY_CPP_CLIENT_OfferForRecommendationDTO_H_
#define TINY_CPP_CLIENT_OfferForRecommendationDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BasePriceDTO.h"
#include "GetPriceDTO.h"
#include "PriceCompetitivenessType.h"

namespace Tiny {


/*! \brief Информация о состоянии цены на товар.
 *
 *  \ingroup Models
 *
 */

class OfferForRecommendationDTO{
public:

    /*! \brief Constructor.
	 */
    OfferForRecommendationDTO();
    OfferForRecommendationDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferForRecommendationDTO();


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
	BasePriceDTO getPrice();

	/*! \brief Set 
	 */
	void setPrice(BasePriceDTO  price);
	/*! \brief Get 
	 */
	GetPriceDTO getCofinancePrice();

	/*! \brief Set 
	 */
	void setCofinancePrice(GetPriceDTO  cofinancePrice);
	/*! \brief Get 
	 */
	PriceCompetitivenessType getCompetitiveness();

	/*! \brief Set 
	 */
	void setCompetitiveness(PriceCompetitivenessType  competitiveness);
	/*! \brief Get Количество показов карточки товара за последние 7 дней.
	 */
	long getShows();

	/*! \brief Set Количество показов карточки товара за последние 7 дней.
	 */
	void setShows(long  shows);


    private:
    std::string offerId{};
    BasePriceDTO price;
    GetPriceDTO cofinancePrice;
    PriceCompetitivenessType competitiveness;
    long shows{};
};
}

#endif /* TINY_CPP_CLIENT_OfferForRecommendationDTO_H_ */
