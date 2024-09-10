/*
 * PriceSuggestDTO.h
 *
 * Тип цены.
 */

#ifndef _PriceSuggestDTO_H_
#define _PriceSuggestDTO_H_


#include <string>
#include "PriceSuggestType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип цены.
 *
 *  \ingroup Models
 *
 */

class PriceSuggestDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceSuggestDTO();
	PriceSuggestDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceSuggestDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PriceSuggestType getType();

	/*! \brief Set 
	 */
	void setType(PriceSuggestType  type);
	/*! \brief Get Цена в рублях.
	 */
	long long getPrice();

	/*! \brief Set Цена в рублях.
	 */
	void setPrice(long long  price);

private:
	PriceSuggestType type;
	long long price;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceSuggestDTO_H_ */
