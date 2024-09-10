
/*
 * ModelDTO.h
 *
 * Модель товара.
 */

#ifndef TINY_CPP_CLIENT_ModelDTO_H_
#define TINY_CPP_CLIENT_ModelDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ModelPriceDTO.h"

namespace Tiny {


/*! \brief Модель товара.
 *
 *  \ingroup Models
 *
 */

class ModelDTO{
public:

    /*! \brief Constructor.
	 */
    ModelDTO();
    ModelDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModelDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор модели товара.
	 */
	long getId();

	/*! \brief Set Идентификатор модели товара.
	 */
	void setId(long  id);
	/*! \brief Get Название модели товара.
	 */
	std::string getName();

	/*! \brief Set Название модели товара.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	ModelPriceDTO getPrices();

	/*! \brief Set 
	 */
	void setPrices(ModelPriceDTO  prices);


    private:
    long id{};
    std::string name{};
    ModelPriceDTO prices;
};
}

#endif /* TINY_CPP_CLIENT_ModelDTO_H_ */
