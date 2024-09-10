
/*
 * GetPriceDTO.h
 *
 * Цена с указанием времени последнего обновления.
 */

#ifndef TINY_CPP_CLIENT_GetPriceDTO_H_
#define TINY_CPP_CLIENT_GetPriceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"

namespace Tiny {


/*! \brief Цена с указанием времени последнего обновления.
 *
 *  \ingroup Models
 *
 */

class GetPriceDTO{
public:

    /*! \brief Constructor.
	 */
    GetPriceDTO();
    GetPriceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPriceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Значение.
	 */
	long getValue();

	/*! \brief Set Значение.
	 */
	void setValue(long  value);
	/*! \brief Get 
	 */
	CurrencyType getCurrencyId();

	/*! \brief Set 
	 */
	void setCurrencyId(CurrencyType  currencyId);
	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);


    private:
    long value{};
    CurrencyType currencyId;
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_GetPriceDTO_H_ */
