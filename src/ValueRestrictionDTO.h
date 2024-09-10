/*
 * ValueRestrictionDTO.h
 *
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
 */

#ifndef _ValueRestrictionDTO_H_
#define _ValueRestrictionDTO_H_


#include <string>
#include "OptionValuesLimitedDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 *
 *  \ingroup Models
 *
 */

class ValueRestrictionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ValueRestrictionDTO();
	ValueRestrictionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ValueRestrictionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор ограничивающей характеристики.
	 */
	long long getLimitingParameterId();

	/*! \brief Set Идентификатор ограничивающей характеристики.
	 */
	void setLimitingParameterId(long long  limitingParameterId);
	/*! \brief Get Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
	 */
	std::list<OptionValuesLimitedDTO> getLimitedValues();

	/*! \brief Set Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
	 */
	void setLimitedValues(std::list <OptionValuesLimitedDTO> limitedValues);

private:
	long long limitingParameterId;
	std::list <OptionValuesLimitedDTO>limitedValues;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ValueRestrictionDTO_H_ */
