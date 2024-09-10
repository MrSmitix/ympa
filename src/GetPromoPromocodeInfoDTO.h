/*
 * GetPromoPromocodeInfoDTO.h
 *
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 */

#ifndef _GetPromoPromocodeInfoDTO_H_
#define _GetPromoPromocodeInfoDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 *
 *  \ingroup Models
 *
 */

class GetPromoPromocodeInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoPromocodeInfoDTO();
	GetPromoPromocodeInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoPromocodeInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Промокод.
	 */
	std::string getPromocode();

	/*! \brief Set Промокод.
	 */
	void setPromocode(std::string  promocode);
	/*! \brief Get Процент скидки по промокоду.
	 */
	int getDiscount();

	/*! \brief Set Процент скидки по промокоду.
	 */
	void setDiscount(int  discount);

private:
	std::string promocode;
	int discount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoPromocodeInfoDTO_H_ */
