
/*
 * ModelPriceDTO.h
 *
 * Информация о ценах на модель товара.
 */

#ifndef TINY_CPP_CLIENT_ModelPriceDTO_H_
#define TINY_CPP_CLIENT_ModelPriceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о ценах на модель товара.
 *
 *  \ingroup Models
 *
 */

class ModelPriceDTO{
public:

    /*! \brief Constructor.
	 */
    ModelPriceDTO();
    ModelPriceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModelPriceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Средняя цена предложения для модели в регионе.
	 */
	long getAvg();

	/*! \brief Set Средняя цена предложения для модели в регионе.
	 */
	void setAvg(long  avg);
	/*! \brief Get Максимальная цена предложения для модели в регионе.
	 */
	long getMax();

	/*! \brief Set Максимальная цена предложения для модели в регионе.
	 */
	void setMax(long  max);
	/*! \brief Get Минимальная цена предложения для модели в регионе.
	 */
	long getMin();

	/*! \brief Set Минимальная цена предложения для модели в регионе.
	 */
	void setMin(long  min);


    private:
    long avg{};
    long max{};
    long min{};
};
}

#endif /* TINY_CPP_CLIENT_ModelPriceDTO_H_ */
