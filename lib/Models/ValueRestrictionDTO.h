
/*
 * ValueRestrictionDTO.h
 *
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_ValueRestrictionDTO_H_
#define TINY_CPP_CLIENT_ValueRestrictionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OptionValuesLimitedDTO.h"
#include <list>

namespace Tiny {


/*! \brief Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 *
 *  \ingroup Models
 *
 */

class ValueRestrictionDTO{
public:

    /*! \brief Constructor.
	 */
    ValueRestrictionDTO();
    ValueRestrictionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ValueRestrictionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор ограничивающей характеристики.
	 */
	long getLimitingParameterId();

	/*! \brief Set Идентификатор ограничивающей характеристики.
	 */
	void setLimitingParameterId(long  limitingParameterId);
	/*! \brief Get Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
	 */
	std::list<OptionValuesLimitedDTO> getLimitedValues();

	/*! \brief Set Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
	 */
	void setLimitedValues(std::list <OptionValuesLimitedDTO> limitedValues);


    private:
    long limitingParameterId{};
    std::list<OptionValuesLimitedDTO> limitedValues;
};
}

#endif /* TINY_CPP_CLIENT_ValueRestrictionDTO_H_ */
