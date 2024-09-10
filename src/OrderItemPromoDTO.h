/*
 * OrderItemPromoDTO.h
 *
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */

#ifndef _OrderItemPromoDTO_H_
#define _OrderItemPromoDTO_H_


#include <string>
#include "OrderPromoType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 *
 *  \ingroup Models
 *
 */

class OrderItemPromoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemPromoDTO();
	OrderItemPromoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemPromoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderPromoType getType();

	/*! \brief Set 
	 */
	void setType(OrderPromoType  type);
	/*! \brief Get Размер пользовательской скидки в валюте покупателя. 
	 */
	long long getDiscount();

	/*! \brief Set Размер пользовательской скидки в валюте покупателя. 
	 */
	void setDiscount(long long  discount);
	/*! \brief Get Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
	 */
	long long getSubsidy();

	/*! \brief Set Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
	 */
	void setSubsidy(long long  subsidy);
	/*! \brief Get Идентификатор акции поставщика. 
	 */
	std::string getShopPromoId();

	/*! \brief Set Идентификатор акции поставщика. 
	 */
	void setShopPromoId(std::string  shopPromoId);
	/*! \brief Get Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
	 */
	std::string getMarketPromoId();

	/*! \brief Set Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
	 */
	void setMarketPromoId(std::string  marketPromoId);

private:
	OrderPromoType type;
	long long discount;
	long long subsidy;
	std::string shopPromoId;
	std::string marketPromoId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemPromoDTO_H_ */
