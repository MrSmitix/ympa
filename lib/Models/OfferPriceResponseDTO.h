
/*
 * OfferPriceResponseDTO.h
 *
 * Информация об установленной цене на товар.
 */

#ifndef TINY_CPP_CLIENT_OfferPriceResponseDTO_H_
#define TINY_CPP_CLIENT_OfferPriceResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceDTO.h"

namespace Tiny {


/*! \brief Информация об установленной цене на товар.
 *
 *  \ingroup Models
 *
 */

class OfferPriceResponseDTO{
public:

    /*! \brief Constructor.
	 */
    OfferPriceResponseDTO();
    OfferPriceResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferPriceResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор предложения из прайс-листа.
	 */
	std::string getId();

	/*! \brief Set Идентификатор предложения из прайс-листа.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	PriceDTO getPrice();

	/*! \brief Set 
	 */
	void setPrice(PriceDTO  price);
	/*! \brief Get SKU на Маркете.
	 */
	long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long  marketSku);
	/*! \brief Get Дата и время последнего обновления цены на товар.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время последнего обновления цены на товар.
	 */
	void setUpdatedAt(std::string  updatedAt);


    private:
    std::string id{};
    PriceDTO price;
    long marketSku{};
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_OfferPriceResponseDTO_H_ */
