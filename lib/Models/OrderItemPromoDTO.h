
/*
 * OrderItemPromoDTO.h
 *
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */

#ifndef TINY_CPP_CLIENT_OrderItemPromoDTO_H_
#define TINY_CPP_CLIENT_OrderItemPromoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderPromoType.h"

namespace Tiny {


/*! \brief Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 *
 *  \ingroup Models
 *
 */

class OrderItemPromoDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemPromoDTO();
    OrderItemPromoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemPromoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderPromoType getType();

	/*! \brief Set 
	 */
	void setType(OrderPromoType  type);
	/*! \brief Get Размер пользовательской скидки в валюте покупателя. 
	 */
	long getDiscount();

	/*! \brief Set Размер пользовательской скидки в валюте покупателя. 
	 */
	void setDiscount(long  discount);
	/*! \brief Get Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
	 */
	long getSubsidy();

	/*! \brief Set Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
	 */
	void setSubsidy(long  subsidy);
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
    long discount{};
    long subsidy{};
    std::string shopPromoId{};
    std::string marketPromoId{};
};
}

#endif /* TINY_CPP_CLIENT_OrderItemPromoDTO_H_ */
