
/*
 * QualityRatingAffectedOrderDTO.h
 *
 * Информация о заказе, который повлиял на индекс качества.
 */

#ifndef TINY_CPP_CLIENT_QualityRatingAffectedOrderDTO_H_
#define TINY_CPP_CLIENT_QualityRatingAffectedOrderDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AffectedOrderQualityRatingComponentType.h"

namespace Tiny {


/*! \brief Информация о заказе, который повлиял на индекс качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingAffectedOrderDTO{
public:

    /*! \brief Constructor.
	 */
    QualityRatingAffectedOrderDTO();
    QualityRatingAffectedOrderDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityRatingAffectedOrderDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа.
	 */
	long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long  orderId);
	/*! \brief Get Описание проблемы.
	 */
	std::string getDescription();

	/*! \brief Set Описание проблемы.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	AffectedOrderQualityRatingComponentType getComponentType();

	/*! \brief Set 
	 */
	void setComponentType(AffectedOrderQualityRatingComponentType  componentType);


    private:
    long orderId{};
    std::string description{};
    AffectedOrderQualityRatingComponentType componentType;
};
}

#endif /* TINY_CPP_CLIENT_QualityRatingAffectedOrderDTO_H_ */
