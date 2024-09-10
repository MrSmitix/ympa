
/*
 * TurnoverType.h
 *
 * Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |&#x60;LOW&#x60;|&#x60;turnoverDays&#x60; ≥ 120|| |&#x60;ALMOST_LOW&#x60;|100 ≤ &#x60;turnoverDays&#x60; &lt; 120|| |&#x60;HIGH&#x60;|45 ≤ &#x60;turnoverDays&#x60; &lt; 100|| |&#x60;VERY_HIGH&#x60;|0 ≤ &#x60;turnoverDays&#x60; &lt; 45|| |&#x60;NO_SALES&#x60;|—|Продаж нет.| |&#x60;FREE_STORE&#x60;|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
 */

#ifndef TINY_CPP_CLIENT_TurnoverType_H_
#define TINY_CPP_CLIENT_TurnoverType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
 *
 *  \ingroup Models
 *
 */

class TurnoverType{
public:

    /*! \brief Constructor.
	 */
    TurnoverType();
    TurnoverType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TurnoverType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TurnoverType_H_ */
