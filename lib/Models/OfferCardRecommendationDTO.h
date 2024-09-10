
/*
 * OfferCardRecommendationDTO.h
 *
 * Рекомендация по заполнению карточки товара.
 */

#ifndef TINY_CPP_CLIENT_OfferCardRecommendationDTO_H_
#define TINY_CPP_CLIENT_OfferCardRecommendationDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferCardRecommendationType.h"

namespace Tiny {


/*! \brief Рекомендация по заполнению карточки товара.
 *
 *  \ingroup Models
 *
 */

class OfferCardRecommendationDTO{
public:

    /*! \brief Constructor.
	 */
    OfferCardRecommendationDTO();
    OfferCardRecommendationDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferCardRecommendationDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OfferCardRecommendationType getType();

	/*! \brief Set 
	 */
	void setType(OfferCardRecommendationType  type);
	/*! \brief Get Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
	 */
	int getPercent();

	/*! \brief Set Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
	 */
	void setPercent(int  percent);


    private:
    OfferCardRecommendationType type;
    int percent{};
};
}

#endif /* TINY_CPP_CLIENT_OfferCardRecommendationDTO_H_ */
