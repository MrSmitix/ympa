/*
 * OptionValuesLimitedDTO.h
 *
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */

#ifndef _OptionValuesLimitedDTO_H_
#define _OptionValuesLimitedDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 *
 *  \ingroup Models
 *
 */

class OptionValuesLimitedDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OptionValuesLimitedDTO();
	OptionValuesLimitedDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptionValuesLimitedDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор значения ограничивающей характеристики.
	 */
	long long getLimitingOptionValueId();

	/*! \brief Set Идентификатор значения ограничивающей характеристики.
	 */
	void setLimitingOptionValueId(long long  limitingOptionValueId);
	/*! \brief Get Идентификаторы допустимых значений ограничиваемой характеристики. 
	 */
	std::list<long long> getOptionValueIds();

	/*! \brief Set Идентификаторы допустимых значений ограничиваемой характеристики. 
	 */
	void setOptionValueIds(std::list <long long> optionValueIds);

private:
	long long limitingOptionValueId;
	std::list <long long>optionValueIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OptionValuesLimitedDTO_H_ */
