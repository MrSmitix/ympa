
/*
 * MaxSaleQuantumDTO.h
 *
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */

#ifndef TINY_CPP_CLIENT_MaxSaleQuantumDTO_H_
#define TINY_CPP_CLIENT_MaxSaleQuantumDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Лимит на установку кванта и минимального количества товаров по категориям. 
 *
 *  \ingroup Models
 *
 */

class MaxSaleQuantumDTO{
public:

    /*! \brief Constructor.
	 */
    MaxSaleQuantumDTO();
    MaxSaleQuantumDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MaxSaleQuantumDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор категории.
	 */
	long getId();

	/*! \brief Set Идентификатор категории.
	 */
	void setId(long  id);
	/*! \brief Get Название категории.
	 */
	std::string getName();

	/*! \brief Set Название категории.
	 */
	void setName(std::string  name);
	/*! \brief Get Лимит на установку кванта и минимального количества товаров.
	 */
	int getMaxSaleQuantum();

	/*! \brief Set Лимит на установку кванта и минимального количества товаров.
	 */
	void setMaxSaleQuantum(int  maxSaleQuantum);


    private:
    long id{};
    std::string name{};
    int maxSaleQuantum{};
};
}

#endif /* TINY_CPP_CLIENT_MaxSaleQuantumDTO_H_ */
