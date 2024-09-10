
/*
 * GoodsFeedbackIdentifiersDTO.h
 *
 * Идентификаторы, которые связаны с отзывом.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackIdentifiersDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackIdentifiersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Идентификаторы, которые связаны с отзывом.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackIdentifiersDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackIdentifiersDTO();
    GoodsFeedbackIdentifiersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackIdentifiersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа на Маркете.
	 */
	long getOrderId();

	/*! \brief Set Идентификатор заказа на Маркете.
	 */
	void setOrderId(long  orderId);
	/*! \brief Get Идентификатор модели товара.
	 */
	long getModelId();

	/*! \brief Set Идентификатор модели товара.
	 */
	void setModelId(long  modelId);


    private:
    long orderId{};
    long modelId{};
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackIdentifiersDTO_H_ */
