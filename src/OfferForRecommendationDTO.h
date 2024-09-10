/*
 * OfferForRecommendationDTO.h
 *
 * Информация о состоянии цены на товар.
 */

#ifndef _OfferForRecommendationDTO_H_
#define _OfferForRecommendationDTO_H_


#include <string>
#include "BasePriceDTO.h"
#include "GetPriceDTO.h"
#include "PriceCompetitivenessType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о состоянии цены на товар.
 *
 *  \ingroup Models
 *
 */

class OfferForRecommendationDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferForRecommendationDTO();
	OfferForRecommendationDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferForRecommendationDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	long long getShows();

	/*! \brief Set Количество показов карточки товара за последние 7 дней.
	 */
	void setShows(long long  shows);

private:
	std::string offerId;
	BasePriceDTO price;
	GetPriceDTO cofinancePrice;
	PriceCompetitivenessType competitiveness;
	long long shows;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferForRecommendationDTO_H_ */
