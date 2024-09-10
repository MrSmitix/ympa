
/*
 * RejectedPromoOfferUpdateReasonType.h
 *
 * Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены. 
 */

#ifndef TINY_CPP_CLIENT_RejectedPromoOfferUpdateReasonType_H_
#define TINY_CPP_CLIENT_RejectedPromoOfferUpdateReasonType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
 *
 *  \ingroup Models
 *
 */

class RejectedPromoOfferUpdateReasonType{
public:

    /*! \brief Constructor.
	 */
    RejectedPromoOfferUpdateReasonType();
    RejectedPromoOfferUpdateReasonType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RejectedPromoOfferUpdateReasonType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_RejectedPromoOfferUpdateReasonType_H_ */
