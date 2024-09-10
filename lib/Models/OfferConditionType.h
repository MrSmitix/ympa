
/*
 * OfferConditionType.h
 *
 * Тип уценки:  * &#x60;PREOWNED&#x60; —  бывший в употреблении товар, раньше принадлежал другому человеку. * &#x60;SHOWCASESAMPLE&#x60; — витринный образец. * &#x60;REFURBISHED&#x60; — повторная продажа товара. * &#x60;REDUCTION&#x60; — товар с дефектами. * &#x60;RENOVATED&#x60; — восстановленный товар. * &#x60;NOT_SPECIFIED&#x60; — не выбран.  &#x60;REFURBISHED&#x60; — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 */

#ifndef TINY_CPP_CLIENT_OfferConditionType_H_
#define TINY_CPP_CLIENT_OfferConditionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 *
 *  \ingroup Models
 *
 */

class OfferConditionType{
public:

    /*! \brief Constructor.
	 */
    OfferConditionType();
    OfferConditionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferConditionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferConditionType_H_ */
