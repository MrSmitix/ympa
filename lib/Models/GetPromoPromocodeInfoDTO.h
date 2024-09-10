
/*
 * GetPromoPromocodeInfoDTO.h
 *
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 */

#ifndef TINY_CPP_CLIENT_GetPromoPromocodeInfoDTO_H_
#define TINY_CPP_CLIENT_GetPromoPromocodeInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 *
 *  \ingroup Models
 *
 */

class GetPromoPromocodeInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoPromocodeInfoDTO();
    GetPromoPromocodeInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoPromocodeInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string promocode{};
    int discount{};
};
}

#endif /* TINY_CPP_CLIENT_GetPromoPromocodeInfoDTO_H_ */
