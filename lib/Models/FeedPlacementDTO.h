
/*
 * FeedPlacementDTO.h
 *
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */

#ifndef TINY_CPP_CLIENT_FeedPlacementDTO_H_
#define TINY_CPP_CLIENT_FeedPlacementDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedStatusType.h"

namespace Tiny {


/*! \brief Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 *
 *  \ingroup Models
 *
 */

class FeedPlacementDTO{
public:

    /*! \brief Constructor.
	 */
    FeedPlacementDTO();
    FeedPlacementDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedPlacementDTO();


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
	/*! \brief Get Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
	 */
	int getTotalOffersCount();

	/*! \brief Set Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
	 */
	void setTotalOffersCount(int  totalOffersCount);


    private:
    FeedStatusType status;
    int totalOffersCount{};
};
}

#endif /* TINY_CPP_CLIENT_FeedPlacementDTO_H_ */
