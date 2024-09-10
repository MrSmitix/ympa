/*
 * GetPromoOfferDTO.h
 *
 * Товар, который участвует или может участвовать в акции.
 */

#ifndef _GetPromoOfferDTO_H_
#define _GetPromoOfferDTO_H_


#include <string>
#include "PromoOfferAutoParticipatingDetailsDTO.h"
#include "PromoOfferParamsDTO.h"
#include "PromoOfferParticipationStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товар, который участвует или может участвовать в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoOfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoOfferDTO();
	GetPromoOfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoOfferDTO();

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
	PromoOfferParticipationStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(PromoOfferParticipationStatusType  status);
	/*! \brief Get 
	 */
	PromoOfferParamsDTO getParams();

	/*! \brief Set 
	 */
	void setParams(PromoOfferParamsDTO  params);
	/*! \brief Get 
	 */
	PromoOfferAutoParticipatingDetailsDTO getAutoParticipatingDetails();

	/*! \brief Set 
	 */
	void setAutoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO  autoParticipatingDetails);

private:
	std::string offerId;
	PromoOfferParticipationStatusType status;
	PromoOfferParamsDTO params;
	PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoOfferDTO_H_ */
