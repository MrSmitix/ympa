
/*
 * FeedPublicationDTO.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */

#ifndef TINY_CPP_CLIENT_FeedPublicationDTO_H_
#define TINY_CPP_CLIENT_FeedPublicationDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedPublicationFullDTO.h"
#include "FeedPublicationPriceAndStockUpdateDTO.h"
#include "FeedStatusType.h"

namespace Tiny {


/*! \brief Информация о последней публикации предложений из прайс-листа на Маркете.
 *
 *  \ingroup Models
 *
 */

class FeedPublicationDTO{
public:

    /*! \brief Constructor.
	 */
    FeedPublicationDTO();
    FeedPublicationDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedPublicationDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FeedStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedStatusType  status);
	/*! \brief Get 
	 */
	FeedPublicationFullDTO getFull();

	/*! \brief Set 
	 */
	void setFull(FeedPublicationFullDTO  full);
	/*! \brief Get 
	 */
	FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate();

	/*! \brief Set 
	 */
	void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO  priceAndStockUpdate);


    private:
    FeedStatusType status;
    FeedPublicationFullDTO full;
    FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;
};
}

#endif /* TINY_CPP_CLIENT_FeedPublicationDTO_H_ */
